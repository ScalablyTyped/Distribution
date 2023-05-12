package typings.reactGeosuggest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lat extends StObject {
    
    var lat: Double
    
    var lng: Double
  }
  object Lat {
    
    inline def apply(lat: Double, lng: Double): Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofgeometry extends StObject {
    
    val encoding: Any
    
    val poly: Any
    
    val spherical: Any
  }
  object Typeofgeometry {
    
    inline def apply(encoding: Any, poly: Any, spherical: Any): Typeofgeometry = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofgeometry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofgeometry] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setPoly(value: Any): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      inline def setSpherical(value: Any): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofmaps extends StObject {
    
    val Data: Any
    
    val drawing: Any
    
    val geometry: Typeofgeometry
    
    val journeySharing: Any
    
    val localContext: Any
    
    val marker: Any
    
    val places: Any
    
    val visualization: Any
  }
  object Typeofmaps {
    
    inline def apply(
      Data: Any,
      drawing: Any,
      geometry: Typeofgeometry,
      journeySharing: Any,
      localContext: Any,
      marker: Any,
      places: Any,
      visualization: Any
    ): Typeofmaps = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], journeySharing = journeySharing.asInstanceOf[js.Any], localContext = localContext.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofmaps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofmaps] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDrawing(value: Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setJourneySharing(value: Any): Self = StObject.set(x, "journeySharing", value.asInstanceOf[js.Any])
      
      inline def setLocalContext(value: Any): Self = StObject.set(x, "localContext", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setPlaces(value: Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      inline def setVisualization(value: Any): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
    }
  }
}

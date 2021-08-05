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
    
    extension [Self <: Lat](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofgeometry extends StObject {
    
    val encoding: js.Any
    
    val poly: js.Any
    
    /**
      * Utility functions for computing geodesic angles, distances and areas.
      * The default radius is Earth's radius of 6378137 meters.
      */
    val spherical: js.Any
  }
  object Typeofgeometry {
    
    inline def apply(encoding: js.Any, poly: js.Any, spherical: js.Any): Typeofgeometry = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofgeometry]
    }
    
    extension [Self <: Typeofgeometry](x: Self) {
      
      inline def setEncoding(value: js.Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setPoly(value: js.Any): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      inline def setSpherical(value: js.Any): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofmaps extends StObject {
    
    val Data: js.Any
    
    val Marker: js.Any
    
    val OverlayView: js.Any
    
    // TODO find source documentation
    val adsense: js.Any
    
    val drawing: js.Any
    
    val event: js.Any
    
    val geometry: Typeofgeometry
    
    val places: js.Any
    
    val visualization: js.Any
  }
  object Typeofmaps {
    
    inline def apply(
      Data: js.Any,
      Marker: js.Any,
      OverlayView: js.Any,
      adsense: js.Any,
      drawing: js.Any,
      event: js.Any,
      geometry: Typeofgeometry,
      places: js.Any,
      visualization: js.Any
    ): Typeofmaps = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofmaps]
    }
    
    extension [Self <: Typeofmaps](x: Self) {
      
      inline def setAdsense(value: js.Any): Self = StObject.set(x, "adsense", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDrawing(value: js.Any): Self = StObject.set(x, "drawing", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: Typeofgeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: js.Any): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setOverlayView(value: js.Any): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
      
      inline def setPlaces(value: js.Any): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      inline def setVisualization(value: js.Any): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
    }
  }
}

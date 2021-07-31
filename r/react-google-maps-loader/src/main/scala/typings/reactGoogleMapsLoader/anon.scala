package typings.reactGoogleMapsLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    @scala.inline
    def apply(encoding: js.Any, poly: js.Any, spherical: js.Any): Typeofgeometry = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], spherical = spherical.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofgeometry]
    }
    
    @scala.inline
    implicit class TypeofgeometryMutableBuilder[Self <: Typeofgeometry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: js.Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoly(value: js.Any): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpherical(value: js.Any): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
    }
  }
}

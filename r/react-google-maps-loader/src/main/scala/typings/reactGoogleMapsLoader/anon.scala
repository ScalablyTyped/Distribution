package typings.reactGoogleMapsLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    extension [Self <: Typeofgeometry](x: Self) {
      
      inline def setEncoding(value: Any): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setPoly(value: Any): Self = StObject.set(x, "poly", value.asInstanceOf[js.Any])
      
      inline def setSpherical(value: Any): Self = StObject.set(x, "spherical", value.asInstanceOf[js.Any])
    }
  }
}

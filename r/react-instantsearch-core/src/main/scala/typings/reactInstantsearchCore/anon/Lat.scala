package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat extends StObject {
  
  var lat: Double
  
  var lng: Double
}
object Lat {
  
  @scala.inline
  def apply(lat: Double, lng: Double): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit class LatMutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}

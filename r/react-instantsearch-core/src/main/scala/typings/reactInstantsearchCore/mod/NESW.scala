package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NESW extends StObject {
  
  var northEast: Lat
  
  var southWest: Lat
}
object NESW {
  
  inline def apply(northEast: Lat, southWest: Lat): NESW = {
    val __obj = js.Dynamic.literal(northEast = northEast.asInstanceOf[js.Any], southWest = southWest.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESW]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NESW] (val x: Self) extends AnyVal {
    
    inline def setNorthEast(value: Lat): Self = StObject.set(x, "northEast", value.asInstanceOf[js.Any])
    
    inline def setSouthWest(value: Lat): Self = StObject.set(x, "southWest", value.asInstanceOf[js.Any])
  }
}

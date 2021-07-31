package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var placeId: String
}
object Name {
  
  @scala.inline
  def apply(name: String, placeId: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
  }
}

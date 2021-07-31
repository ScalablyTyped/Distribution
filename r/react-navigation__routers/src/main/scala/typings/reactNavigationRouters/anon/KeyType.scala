package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersStrings.route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyType extends StObject {
  
  var key: String
  
  var `type`: route
}
object KeyType {
  
  @scala.inline
  def apply(key: String): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("route")
    __obj.asInstanceOf[KeyType]
  }
  
  @scala.inline
  implicit class KeyTypeMutableBuilder[Self <: KeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: route): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

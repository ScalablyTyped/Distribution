package typings.storybookUi.anon

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var render: ComponentType[js.Object]
  
  var route: FunctionComponent[js.Object]
}
object Key {
  
  inline def apply(key: String, render: ComponentType[js.Object], route: FunctionComponent[js.Object]): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRender(value: ComponentType[js.Object]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: FunctionComponent[js.Object]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}

package typings.reactNavigationCore.anon

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * React component to render for this screen.
    */
  var component: ComponentType[js.Any]
  
  var getComponent: js.UndefOr[scala.Nothing] = js.undefined
}
object Children {
  
  inline def apply(component: ComponentType[js.Any]): Children = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}

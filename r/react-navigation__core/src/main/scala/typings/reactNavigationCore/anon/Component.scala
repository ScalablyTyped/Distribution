package typings.reactNavigationCore.anon

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var children: js.UndefOr[scala.Nothing] = js.undefined
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Lazily get a React component to render for this screen.
    */
  def getComponent(): ComponentType[js.Any]
}
object Component {
  
  inline def apply(getComponent: () => ComponentType[js.Any]): Component = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent))
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setGetComponent(value: () => ComponentType[js.Any]): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
  }
}

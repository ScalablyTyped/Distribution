package typings.reactRouter.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithRouterStatics[C /* <: ComponentType[js.Any] */] extends StObject {
  
  var WrappedComponent: C
}
object WithRouterStatics {
  
  @scala.inline
  def apply[C /* <: ComponentType[js.Any] */](WrappedComponent: C): WithRouterStatics[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRouterStatics[C]]
  }
  
  @scala.inline
  implicit class WithRouterStaticsMutableBuilder[Self <: WithRouterStatics[?], C /* <: ComponentType[js.Any] */] (val x: Self & WithRouterStatics[C]) extends AnyVal {
    
    @scala.inline
    def setWrappedComponent(value: C): Self = StObject.set(x, "WrappedComponent", value.asInstanceOf[js.Any])
  }
}

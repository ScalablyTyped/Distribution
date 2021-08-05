package typings.reactLifecycleComponent

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentLifecycle
import typings.react.mod.ComponentState
import typings.reactRedux.mod.Connect_
import typings.reactRedux.mod.DefaultRootState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lifecycle-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-lifecycle-component", "LifecycleComponent")
  @js.native
  class LifecycleComponent protected ()
    extends Component[Props[js.Any, js.Any], js.Any, js.Any] {
    def this(props: Props[js.Any, js.Any]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[js.Any, js.Any], context: js.Any) = this()
  }
  
  inline def applyLifecycle[P, S](component: ComponentClass[P, S]): ComponentClass[P & (LifecycleDispatchProps[P, S]), ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyLifecycle")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P & (LifecycleDispatchProps[P, S]), ComponentState]]
  
  @JSImport("react-lifecycle-component", "connectWithLifecycle")
  @js.native
  val connectWithLifecycle: Connect_[DefaultRootState] = js.native
  
  type LifecycleDispatchProps[P, S] = ComponentLifecycle[P, S, js.Any]
  
  trait LifecycleStateProps[P, S] extends StObject {
    
    var component: ComponentClass[P, S]
  }
  object LifecycleStateProps {
    
    inline def apply[P, S](component: ComponentClass[P, S]): LifecycleStateProps[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleStateProps[P, S]]
    }
    
    extension [Self <: LifecycleStateProps[?, ?], P, S](x: Self & (LifecycleStateProps[P, S])) {
      
      inline def setComponent(value: ComponentClass[P, S]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props[P, S]
    extends StObject
       with LifecycleStateProps[P, S]
       with ComponentLifecycle[P, S, js.Any]
  object Props {
    
    inline def apply[P, S](component: ComponentClass[P, S]): Props[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[P, S]]
    }
  }
}

package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typings.reactNativeNavigation.libDistSrcEventsComponentEventsObserverMod.ComponentEventsObserver
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcComponentsComponentWrapperMod {
  
  @JSImport("react-native-navigation/lib/dist/src/components/ComponentWrapper", "ComponentWrapper")
  @js.native
  open class ComponentWrapper () extends StObject {
    
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentClass[Any, ComponentState] = js.native
    
    def wrapWithRedux(WrappedComponent: ComponentClass[Any, ComponentState], ReduxProvider: Any, reduxStore: Any): ComponentClass[Any, ComponentState] = js.native
  }
  
  @js.native
  trait IWrappedComponent
    extends Component[js.Object, js.Object, Any] {
    
    var isMounted: Boolean = js.native
    
    def setProps(newProps: Record[String, Any]): Unit = js.native
    def setProps(newProps: Record[String, Any], callback: js.Function0[Unit]): Unit = js.native
  }
}

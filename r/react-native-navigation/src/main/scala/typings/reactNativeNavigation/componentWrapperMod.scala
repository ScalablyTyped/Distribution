package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.storeMod.Store
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentWrapperMod {
  
  @JSImport("react-native-navigation/lib/dist/components/ComponentWrapper", "ComponentWrapper")
  @js.native
  class ComponentWrapper () extends StObject {
    
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
    
    def wrapWithRedux(
      WrappedComponent: ComponentClass[js.Any, ComponentState],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[js.Any, ComponentState] = js.native
  }
  
  @js.native
  trait IWrappedComponent
    extends Component[js.Object, js.Object, js.Any] {
    
    def setProps(newProps: Record[String, js.Any]): Unit = js.native
  }
}

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
import scala.scalajs.js.`|`
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
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: String,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    def wrap(
      componentName: Double,
      OriginalComponentGenerator: ComponentProvider,
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentClass[_, ComponentState] = js.native
    
    def wrapWithRedux(WrappedComponent: ComponentClass[_, ComponentState], ReduxProvider: js.Any, reduxStore: js.Any): ComponentClass[_, ComponentState] = js.native
  }
  
  @js.native
  trait IWrappedComponent
    extends Component[js.Object, js.Object, js.Any] {
    
    def setProps(newProps: Record[String, _]): Unit = js.native
  }
}

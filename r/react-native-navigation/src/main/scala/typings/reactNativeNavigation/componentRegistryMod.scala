package typings.reactNativeNavigation

import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.appRegistryServiceMod.AppRegistryService
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.componentWrapperMod.ComponentWrapper
import typings.reactNativeNavigation.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/components/ComponentRegistry", JSImport.Namespace)
@js.native
object componentRegistryMod extends js.Object {
  
  @js.native
  class ComponentRegistry protected () extends js.Object {
    def this(
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      componentWrapper: ComponentWrapper,
      appRegistryService: AppRegistryService
    ) = this()
    
    var appRegistryService: js.Any = js.native
    
    var componentEventsObserver: js.Any = js.native
    
    var componentWrapper: js.Any = js.native
    
    def registerComponent(componentName: String, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(componentName: Double, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: js.UndefOr[scala.Nothing],
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.UndefOr[scala.Nothing],
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    
    var store: js.Any = js.native
  }
}

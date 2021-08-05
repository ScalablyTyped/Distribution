package typings.reactNativeNavigation

import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.appRegistryServiceMod.AppRegistryService
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.componentWrapperMod.ComponentWrapper
import typings.reactNativeNavigation.storeMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentRegistryMod {
  
  @JSImport("react-native-navigation/lib/dist/components/ComponentRegistry", "ComponentRegistry")
  @js.native
  class ComponentRegistry protected () extends StObject {
    def this(
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      componentWrapper: ComponentWrapper,
      appRegistryService: AppRegistryService
    ) = this()
    
    /* private */ var appRegistryService: js.Any = js.native
    
    /* private */ var componentEventsObserver: js.Any = js.native
    
    /* private */ var componentWrapper: js.Any = js.native
    
    def registerComponent(componentName: String, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
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
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(componentName: Double, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
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
      ReduxProvider: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: js.Any,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: js.Any
    ): ComponentProvider = js.native
    
    /* private */ var store: js.Any = js.native
  }
}

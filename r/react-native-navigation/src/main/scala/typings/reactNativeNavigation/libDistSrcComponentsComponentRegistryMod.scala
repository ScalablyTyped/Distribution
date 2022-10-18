package typings.reactNativeNavigation

import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.libDistSrcAdaptersAppRegistryServiceMod.AppRegistryService
import typings.reactNativeNavigation.libDistSrcComponentsComponentWrapperMod.ComponentWrapper
import typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typings.reactNativeNavigation.libDistSrcEventsComponentEventsObserverMod.ComponentEventsObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcComponentsComponentRegistryMod {
  
  @JSImport("react-native-navigation/lib/dist/src/components/ComponentRegistry", "ComponentRegistry")
  @js.native
  open class ComponentRegistry protected () extends StObject {
    def this(
      store: Store,
      componentEventsObserver: ComponentEventsObserver,
      componentWrapper: ComponentWrapper,
      appRegistryService: AppRegistryService
    ) = this()
    
    /* private */ var appRegistryService: Any = js.native
    
    /* private */ var componentEventsObserver: Any = js.native
    
    /* private */ var componentWrapper: Any = js.native
    
    def registerComponent(componentName: String, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: Any
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
      ReduxProvider: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentProvider = js.native
    def registerComponent(componentName: Double, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: Unit,
      ReduxProvider: Unit,
      reduxStore: Any
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
      ReduxProvider: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider,
      ReduxProvider: Unit,
      reduxStore: Any
    ): ComponentProvider = js.native
    
    /* private */ var store: Any = js.native
  }
}

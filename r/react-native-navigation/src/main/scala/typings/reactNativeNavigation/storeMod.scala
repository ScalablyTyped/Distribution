package typings.reactNativeNavigation

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.componentWrapperMod.IWrappedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  @JSImport("react-native-navigation/lib/dist/components/Store", "Store")
  @js.native
  class Store () extends StObject {
    
    def clearComponent(componentId: String): Unit = js.native
    
    var componentsByName: js.Any = js.native
    
    var componentsInstancesById: js.Any = js.native
    
    def ensureClassForName(componentName: String): Unit = js.native
    def ensureClassForName(componentName: Double): Unit = js.native
    
    def getComponentClassForName(componentName: String): js.UndefOr[ComponentProvider] = js.native
    def getComponentClassForName(componentName: Double): js.UndefOr[ComponentProvider] = js.native
    
    def getComponentInstance(id: String): IWrappedComponent = js.native
    
    def getPropsForId(componentId: String): js.Any = js.native
    
    def getWrappedComponent(componentName: String): ComponentClass[js.Any, ComponentState] = js.native
    def getWrappedComponent(componentName: Double): ComponentClass[js.Any, ComponentState] = js.native
    
    def hasRegisteredWrappedComponent(componentName: String): Boolean = js.native
    def hasRegisteredWrappedComponent(componentName: Double): Boolean = js.native
    
    var lazyRegistratorFn: js.Any = js.native
    
    def mergeNewPropsForId(componentId: String, newProps: js.Any): Unit = js.native
    
    var propsById: js.Any = js.native
    
    def setComponentClassForName(componentName: String, ComponentClass: ComponentProvider): Unit = js.native
    def setComponentClassForName(componentName: Double, ComponentClass: ComponentProvider): Unit = js.native
    
    def setComponentInstance(id: String, component: IWrappedComponent): Unit = js.native
    
    def setLazyComponentRegistrator(lazyRegistratorFn: js.Function1[/* lazyComponentRequest */ String | Double, Unit]): Unit = js.native
    
    def setWrappedComponent(componentName: String, wrappedComponent: ComponentClass[js.Any, ComponentState]): Unit = js.native
    def setWrappedComponent(componentName: Double, wrappedComponent: ComponentClass[js.Any, ComponentState]): Unit = js.native
    
    def updateProps(componentId: String, props: js.Any): Unit = js.native
    
    var wrappedComponents: js.Any = js.native
  }
}

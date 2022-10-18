package typings.reactNativeNavigation

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.libDistSrcComponentsComponentWrapperMod.IWrappedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcComponentsStoreMod {
  
  @JSImport("react-native-navigation/lib/dist/src/components/Store", "Store")
  @js.native
  open class Store () extends StObject {
    
    def clearComponent(componentId: String): Unit = js.native
    
    /* private */ var componentsByName: Any = js.native
    
    /* private */ var componentsInstancesById: Any = js.native
    
    def ensureClassForName(componentName: String): Unit = js.native
    def ensureClassForName(componentName: Double): Unit = js.native
    
    def getComponentClassForName(componentName: String): js.UndefOr[ComponentProvider] = js.native
    def getComponentClassForName(componentName: Double): js.UndefOr[ComponentProvider] = js.native
    
    def getComponentInstance(id: String): js.UndefOr[IWrappedComponent] = js.native
    
    def getPropsForId(componentId: String): Any = js.native
    
    def getWrappedComponent(componentName: String): ComponentClass[Any, ComponentState] = js.native
    def getWrappedComponent(componentName: Double): ComponentClass[Any, ComponentState] = js.native
    
    def hasRegisteredWrappedComponent(componentName: String): Boolean = js.native
    def hasRegisteredWrappedComponent(componentName: Double): Boolean = js.native
    
    /* private */ var lazyRegistratorFn: Any = js.native
    
    def mergeNewPropsForId(componentId: String, newProps: Any): Unit = js.native
    
    /* private */ var pendingPropsById: Any = js.native
    
    /* private */ var propsById: Any = js.native
    
    def setComponentClassForName(componentName: String, ComponentClass: ComponentProvider): Unit = js.native
    def setComponentClassForName(componentName: Double, ComponentClass: ComponentProvider): Unit = js.native
    
    def setComponentInstance(id: String, component: IWrappedComponent): Unit = js.native
    
    def setLazyComponentRegistrator(lazyRegistratorFn: js.Function1[/* lazyComponentRequest */ String | Double, Unit]): Unit = js.native
    
    def setPendingProps(componentId: String, newProps: Any): Unit = js.native
    
    def setWrappedComponent(componentName: String, wrappedComponent: ComponentClass[Any, ComponentState]): Unit = js.native
    def setWrappedComponent(componentName: Double, wrappedComponent: ComponentClass[Any, ComponentState]): Unit = js.native
    
    def updateProps(componentId: String, props: Any): Unit = js.native
    def updateProps(componentId: String, props: Any, callback: js.Function0[Unit]): Unit = js.native
    
    /* private */ var wrappedComponents: Any = js.native
  }
}

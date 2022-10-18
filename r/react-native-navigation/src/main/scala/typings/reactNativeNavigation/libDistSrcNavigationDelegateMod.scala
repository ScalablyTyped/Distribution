package typings.reactNativeNavigation

import typings.reactNative.mod.ComponentProvider
import typings.reactNativeNavigation.anon.Store
import typings.reactNativeNavigation.anon.TypeofTouchablePreview
import typings.reactNativeNavigation.libDistSrcAdaptersAppRegistryServiceMod.AppRegistryService
import typings.reactNativeNavigation.libDistSrcAdaptersConstantsMod.NavigationConstants
import typings.reactNativeNavigation.libDistSrcAdaptersNativeCommandsSenderMod.NativeCommandsSender
import typings.reactNativeNavigation.libDistSrcAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.libDistSrcEventsEventsRegistryMod.EventsRegistry
import typings.reactNativeNavigation.libDistSrcInterfacesCommandNameMod.CommandName
import typings.reactNativeNavigation.libDistSrcInterfacesLayoutMod.Layout
import typings.reactNativeNavigation.libDistSrcInterfacesLayoutMod.LayoutRoot
import typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Options
import typings.reactNativeNavigation.libDistSrcInterfacesProcessorSubscriptionMod.ProcessorSubscription
import typings.reactNativeNavigation.libDistSrcInterfacesProcessorsMod.OptionsProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcNavigationDelegateMod {
  
  @JSImport("react-native-navigation/lib/dist/src/NavigationDelegate", "NavigationDelegate")
  @js.native
  open class NavigationDelegate () extends StObject {
    
    def TouchablePreview: TypeofTouchablePreview = js.native
    
    /**
      * Method to be invoked when a layout is processed and is about to be created. This can be used to change layout options or even inject props to components.
      */
    def addLayoutProcessor(
      processor: js.Function2[/* layout */ Layout[js.Object], /* commandName */ CommandName, Layout[js.Object]]
    ): ProcessorSubscription = js.native
    
    /**
      * Adds an option processor which allows option interpolation by optionPath.
      */
    def addOptionProcessor[T, S](optionPath: String, processor: OptionsProcessor[T, S]): ProcessorSubscription = js.native
    
    /* private */ var concreteNavigation: Any = js.native
    
    /**
      * Constants coming from native
      */
    def constants(): js.Promise[NavigationConstants] = js.native
    
    def constantsSync(): NavigationConstants = js.native
    
    /* private */ var createConcreteNavigation: Any = js.native
    
    /**
      * Dismiss all Modals
      */
    def dismissAllModals(): js.Promise[String] = js.native
    def dismissAllModals(mergeOptions: Options): js.Promise[String] = js.native
    
    /**
      * dismiss all overlays
      */
    def dismissAllOverlays(): js.Promise[String] = js.native
    
    /**
      * Dismiss a modal by componentId. The dismissed modal can be anywhere in the stack.
      */
    def dismissModal(componentId: String): js.Promise[String] = js.native
    def dismissModal(componentId: String, mergeOptions: Options): js.Promise[String] = js.native
    
    /**
      * dismiss overlay by componentId
      */
    def dismissOverlay(componentId: String): js.Promise[String] = js.native
    
    /**
      * Obtain the events registry instance
      */
    def events(): EventsRegistry = js.native
    
    /**
      * Resolves arguments passed on launch
      */
    def getLaunchArgs(): js.Promise[Any] = js.native
    
    /**
      * Change a component's navigation options
      */
    def mergeOptions(componentId: String, options: Options): Unit = js.native
    
    def mock: Store = js.native
    
    def mockNativeComponents(
      mockedNativeCommandsSender: NativeCommandsSender,
      mockedNativeEventsReceiver: NativeEventsReceiver,
      mockedAppRegistryService: AppRegistryService
    ): Unit = js.native
    
    /**
      * Pop a component from the stack, regardless of it's position.
      */
    def pop(componentId: String): js.Promise[String] = js.native
    def pop(componentId: String, mergeOptions: Options): js.Promise[String] = js.native
    
    /**
      * Pop the stack to a given component
      */
    def popTo(componentId: String): js.Promise[String] = js.native
    def popTo(componentId: String, mergeOptions: Options): js.Promise[String] = js.native
    
    /**
      * Pop the component's stack to root.
      */
    def popToRoot(componentId: String): js.Promise[String] = js.native
    def popToRoot(componentId: String, mergeOptions: Options): js.Promise[String] = js.native
    
    /**
      * Push a new layout into this screen's navigation stack.
      */
    def push[P](componentId: String, layout: Layout[P]): js.Promise[String] = js.native
    
    /**
      * Every navigation component in your app must be registered with a unique name.
      * The component itself is a traditional React component extending React.Component.
      */
    def registerComponent(componentName: String, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: String,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    def registerComponent(componentName: Double, componentProvider: ComponentProvider): ComponentProvider = js.native
    def registerComponent(
      componentName: Double,
      componentProvider: ComponentProvider,
      concreteComponentProvider: ComponentProvider
    ): ComponentProvider = js.native
    
    /**
      * Utility helper function like registerComponent,
      * wraps the provided component with a react-redux Provider with the passed redux store
      * @deprecated
      */
    def registerComponentWithRedux(
      componentName: String,
      getComponentClassFunc: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentProvider = js.native
    def registerComponentWithRedux(
      componentName: Double,
      getComponentClassFunc: ComponentProvider,
      ReduxProvider: Any,
      reduxStore: Any
    ): ComponentProvider = js.native
    
    /**
      * Set default options to all screens. Useful for declaring a consistent style across the app.
      */
    def setDefaultOptions(options: Options): Unit = js.native
    
    def setLazyComponentRegistrator(lazyRegistratorFn: js.Function1[/* lazyComponentRequest */ String | Double, Unit]): Unit = js.native
    
    /**
      * Reset the app to a new layout
      */
    def setRoot(layout: LayoutRoot): js.Promise[String] = js.native
    
    def setStackRoot[P](componentId: String, layout: js.Array[Layout[P]]): js.Promise[String] = js.native
    /**
      * Sets new root component to stack.
      */
    def setStackRoot[P](componentId: String, layout: Layout[P]): js.Promise[String] = js.native
    
    /**
      * Show a screen as a modal.
      */
    def showModal[P](layout: Layout[P]): js.Promise[String] = js.native
    
    /**
      * Show overlay on top of the entire app
      */
    def showOverlay[P](layout: Layout[P]): js.Promise[String] = js.native
    
    /**
      * Update a mounted component's props
      */
    def updateProps(componentId: String, props: js.Object): Unit = js.native
    def updateProps(componentId: String, props: js.Object, callback: js.Function0[Unit]): Unit = js.native
  }
}

package typings
package reactDashNativeDashNavigationLib.libDistNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/Navigation", "NavigationRoot")
@js.native
class NavigationRoot () extends js.Object {
  val Element: reactLib.reactMod.ReactNs.ComponentType[reactDashNativeDashNavigationLib.Anon_ElementId] = js.native
  val TouchablePreview: reactLib.reactMod.ReactNs.ComponentType[_] = js.native
  val commands: js.Any = js.native
  val commandsObserver: js.Any = js.native
  val componentEventsObserver: js.Any = js.native
  val componentRegistry: js.Any = js.native
  val componentWrapper: js.Any = js.native
  val eventsRegistry: js.Any = js.native
  val layoutTreeCrawler: js.Any = js.native
  val layoutTreeParser: js.Any = js.native
  val nativeCommandsSender: js.Any = js.native
  val nativeEventsReceiver: js.Any = js.native
  val store: reactDashNativeDashNavigationLib.libDistComponentsStoreMod.Store = js.native
  val uniqueIdProvider: js.Any = js.native
  /**
    * Constants coming from native
    */
  def constants(): js.Promise[_] = js.native
  /**
    * Dismiss all Modals
    */
  def dismissAllModals(): js.Promise[_] = js.native
  def dismissAllModals(mergeOptions: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options): js.Promise[_] = js.native
  /**
    * Dismiss a modal by componentId. The dismissed modal can be anywhere in the stack.
    */
  def dismissModal(componentId: java.lang.String): js.Promise[_] = js.native
  def dismissModal(
    componentId: java.lang.String,
    mergeOptions: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options
  ): js.Promise[_] = js.native
  /**
    * dismiss overlay by componentId
    */
  def dismissOverlay(componentId: java.lang.String): js.Promise[_] = js.native
  /**
    * Obtain the events registry instance
    */
  def events(): reactDashNativeDashNavigationLib.libDistEventsEventsRegistryMod.EventsRegistry = js.native
  /**
    * Resolves arguments passed on launch
    */
  def getLaunchArgs(): js.Promise[_] = js.native
  /**
    * Change a component's navigation options
    */
  def mergeOptions(
    componentId: java.lang.String,
    options: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options
  ): scala.Unit = js.native
  /**
    * Pop a component from the stack, regardless of it's position.
    */
  def pop(componentId: java.lang.String): js.Promise[_] = js.native
  def pop(
    componentId: java.lang.String,
    mergeOptions: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options
  ): js.Promise[_] = js.native
  /**
    * Pop the stack to a given component
    */
  def popTo(componentId: java.lang.String): js.Promise[_] = js.native
  def popTo(
    componentId: java.lang.String,
    mergeOptions: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options
  ): js.Promise[_] = js.native
  /**
    * Pop the component's stack to root.
    */
  def popToRoot(componentId: java.lang.String): js.Promise[_] = js.native
  def popToRoot(
    componentId: java.lang.String,
    mergeOptions: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options
  ): js.Promise[_] = js.native
  /**
    * Push a new layout into this screen's navigation stack.
    */
  def push[P](
    componentId: java.lang.String,
    layout: reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod.Layout[P]
  ): js.Promise[_] = js.native
  /**
    * Every navigation component in your app must be registered with a unique name.
    * The component itself is a traditional React component extending React.Component.
    */
  def registerComponent(
    componentName: java.lang.String,
    componentProvider: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): reactDashNativeLib.reactDashNativeMod.ComponentProvider = js.native
  def registerComponent(
    componentName: java.lang.String,
    componentProvider: reactDashNativeLib.reactDashNativeMod.ComponentProvider,
    concreteComponentProvider: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): reactDashNativeLib.reactDashNativeMod.ComponentProvider = js.native
  def registerComponent(
    componentName: scala.Double,
    componentProvider: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): reactDashNativeLib.reactDashNativeMod.ComponentProvider = js.native
  def registerComponent(
    componentName: scala.Double,
    componentProvider: reactDashNativeLib.reactDashNativeMod.ComponentProvider,
    concreteComponentProvider: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): reactDashNativeLib.reactDashNativeMod.ComponentProvider = js.native
  /**
    * Utility helper function like registerComponent,
    * wraps the provided component with a react-redux Provider with the passed redux store
    */
  def registerComponentWithRedux(
    componentName: java.lang.String,
    getComponentClassFunc: reactDashNativeLib.reactDashNativeMod.ComponentProvider,
    ReduxProvider: js.Any,
    reduxStore: js.Any
  ): reactDashNativeLib.reactDashNativeMod.ComponentProvider = js.native
  def registerComponentWithRedux(
    componentName: scala.Double,
    getComponentClassFunc: reactDashNativeLib.reactDashNativeMod.ComponentProvider,
    ReduxProvider: js.Any,
    reduxStore: js.Any
  ): reactDashNativeLib.reactDashNativeMod.ComponentProvider = js.native
  /**
    * Set default options to all screens. Useful for declaring a consistent style across the app.
    */
  def setDefaultOptions(options: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options): scala.Unit = js.native
  /**
    * Reset the app to a new layout
    */
  def setRoot(layout: reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod.LayoutRoot): js.Promise[_] = js.native
  def setStackRoot(
    componentId: java.lang.String,
    layout: js.Array[reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod.Layout[js.Object]]
  ): js.Promise[_] = js.native
  /**
    * Sets new root component to stack.
    */
  def setStackRoot(
    componentId: java.lang.String,
    layout: reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod.Layout[js.Object]
  ): js.Promise[_] = js.native
  /**
    * Show a screen as a modal.
    */
  def showModal(layout: reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod.Layout[js.Object]): js.Promise[_] = js.native
  /**
    * Show overlay on top of the entire app
    */
  def showOverlay(layout: reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod.Layout[js.Object]): js.Promise[_] = js.native
}


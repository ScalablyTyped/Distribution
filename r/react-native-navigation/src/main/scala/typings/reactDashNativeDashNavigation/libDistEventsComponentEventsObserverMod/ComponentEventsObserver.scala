package typings.reactDashNativeDashNavigation.libDistEventsComponentEventsObserverMod

import typings.react.reactMod.Component
import typings.reactDashNativeDashNavigation.libDistAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typings.reactDashNativeDashNavigation.libDistComponentsStoreMod.Store
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ComponentDidAppearEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ModalDismissedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.PreviewCompletedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesEventSubscriptionMod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/ComponentEventsObserver", "ComponentEventsObserver")
@js.native
class ComponentEventsObserver protected () extends js.Object {
  def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
  var alreadyRegistered: js.Any = js.native
  var listeners: js.Any = js.native
  val nativeEventsReceiver: js.Any = js.native
  val store: js.Any = js.native
  var triggerOnAllListenersByComponentId: js.Any = js.native
  def bindComponent(component: Component[_, js.Object, _]): EventSubscription = js.native
  def bindComponent(component: Component[_, js.Object, _], componentId: String): EventSubscription = js.native
  def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
  def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
  def notifyModalDismissed(event: ModalDismissedEvent): Unit = js.native
  def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
  def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
  def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
  def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
  def registerOnceForAllComponentEvents(): Unit = js.native
  def unmounted(componentId: String): Unit = js.native
}


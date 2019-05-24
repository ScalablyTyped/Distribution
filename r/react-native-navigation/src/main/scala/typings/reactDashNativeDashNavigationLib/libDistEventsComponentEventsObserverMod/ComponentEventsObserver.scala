package typings
package reactDashNativeDashNavigationLib.libDistEventsComponentEventsObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/ComponentEventsObserver", "ComponentEventsObserver")
@js.native
class ComponentEventsObserver protected () extends js.Object {
  def this(nativeEventsReceiver: reactDashNativeDashNavigationLib.libDistAdaptersNativeEventsReceiverMod.NativeEventsReceiver, store: reactDashNativeDashNavigationLib.libDistComponentsStoreMod.Store) = this()
  var alreadyRegistered: js.Any = js.native
  var listeners: js.Any = js.native
  val nativeEventsReceiver: js.Any = js.native
  val store: js.Any = js.native
  var triggerOnAllListenersByComponentId: js.Any = js.native
  def bindComponent(component: reactLib.reactMod.Component[_, js.Object, _]): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
  def bindComponent(component: reactLib.reactMod.Component[_, js.Object, _], componentId: java.lang.String): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
  def notifyComponentDidAppear(
    event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.ComponentDidAppearEvent
  ): scala.Unit = js.native
  def notifyComponentDidDisappear(
    event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.ComponentDidDisappearEvent
  ): scala.Unit = js.native
  def notifyModalDismissed(event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.ModalDismissedEvent): scala.Unit = js.native
  def notifyNavigationButtonPressed(
    event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.NavigationButtonPressedEvent
  ): scala.Unit = js.native
  def notifyPreviewCompleted(event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.PreviewCompletedEvent): scala.Unit = js.native
  def notifySearchBarCancelPressed(
    event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.SearchBarCancelPressedEvent
  ): scala.Unit = js.native
  def notifySearchBarUpdated(event: reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.SearchBarUpdatedEvent): scala.Unit = js.native
  def registerOnceForAllComponentEvents(): scala.Unit = js.native
  def unmounted(componentId: java.lang.String): scala.Unit = js.native
}


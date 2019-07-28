package typings.reactDashNativeDashNavigation.libDistEventsEventsRegistryMod

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.EmitterSubscription
import typings.reactDashNativeDashNavigation.libDistAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typings.reactDashNativeDashNavigation.libDistEventsCommandsObserverMod.CommandsObserver
import typings.reactDashNativeDashNavigation.libDistEventsComponentEventsObserverMod.ComponentEventsObserver
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ComponentDidAppearEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.ModalDismissedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.PreviewCompletedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesEventSubscriptionMod.EventSubscription
import typings.reactDashNativeDashNavigation.libDistInterfacesEventsMod.BottomTabSelectedEvent
import typings.reactDashNativeDashNavigation.libDistInterfacesEventsMod.CommandCompletedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/EventsRegistry", "EventsRegistry")
@js.native
class EventsRegistry protected () extends js.Object {
  def this(
    nativeEventsReceiver: NativeEventsReceiver,
    commandsObserver: CommandsObserver,
    componentEventsObserver: ComponentEventsObserver
  ) = this()
  var commandsObserver: js.Any = js.native
  var componentEventsObserver: js.Any = js.native
  var nativeEventsReceiver: js.Any = js.native
  def bindComponent(component: Component[_, js.Object, _]): EventSubscription = js.native
  def bindComponent(component: Component[_, js.Object, _], componentId: String): EventSubscription = js.native
  def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
  def registerBottomTabSelectedListener(callback: js.Function1[/* event */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
  def registerCommandCompletedListener(callback: js.Function1[/* event */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
  def registerCommandListener(callback: js.Function2[/* name */ String, /* params */ js.Any, Unit]): EventSubscription = js.native
  def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
  def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
  def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
  def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
  def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
  def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
  def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
}


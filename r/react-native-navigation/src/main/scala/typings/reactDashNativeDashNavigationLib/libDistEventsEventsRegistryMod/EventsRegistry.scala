package typings
package reactDashNativeDashNavigationLib.libDistEventsEventsRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/EventsRegistry", "EventsRegistry")
@js.native
class EventsRegistry protected () extends js.Object {
  def this(nativeEventsReceiver: reactDashNativeDashNavigationLib.libDistAdaptersNativeEventsReceiverMod.NativeEventsReceiver, commandsObserver: reactDashNativeDashNavigationLib.libDistEventsCommandsObserverMod.CommandsObserver, componentEventsObserver: reactDashNativeDashNavigationLib.libDistEventsComponentEventsObserverMod.ComponentEventsObserver) = this()
  var commandsObserver: js.Any = js.native
  var componentEventsObserver: js.Any = js.native
  var nativeEventsReceiver: js.Any = js.native
  def bindComponent(component: reactLib.reactMod.Component[_, js.Object, _]): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
  def bindComponent(component: reactLib.reactMod.Component[_, js.Object, _], componentId: java.lang.String): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
  def registerAppLaunchedListener(callback: js.Function0[scala.Unit]): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerBottomTabSelectedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesEventsMod.BottomTabSelectedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerCommandCompletedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesEventsMod.CommandCompletedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerCommandListener(callback: js.Function2[/* name */ java.lang.String, /* params */ js.Any, scala.Unit]): reactDashNativeDashNavigationLib.libDistInterfacesEventSubscriptionMod.EventSubscription = js.native
  def registerComponentDidAppearListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.ComponentDidAppearEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerComponentDidDisappearListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.ComponentDidDisappearEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerModalDismissedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.ModalDismissedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerNavigationButtonPressedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.NavigationButtonPressedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerPreviewCompletedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.PreviewCompletedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerSearchBarCancelPressedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.SearchBarCancelPressedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerSearchBarUpdatedListener(
    callback: js.Function1[
      /* event */ reactDashNativeDashNavigationLib.libDistInterfacesComponentEventsMod.SearchBarUpdatedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
}


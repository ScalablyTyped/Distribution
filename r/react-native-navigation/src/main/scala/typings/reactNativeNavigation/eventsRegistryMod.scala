package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.reactNative.mod.EmitterSubscription
import typings.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typings.reactNativeNavigation.eventsMod.BottomTabSelectedEvent
import typings.reactNativeNavigation.eventsMod.CommandCompletedEvent
import typings.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/EventsRegistry", JSImport.Namespace)
@js.native
object eventsRegistryMod extends js.Object {
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
  
}


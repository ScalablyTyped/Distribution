package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.reactNative.mod.EmitterSubscription
import typings.reactNativeNavigation.libDistSrcAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.libDistSrcEventsCommandsObserverMod.CommandsObserver
import typings.reactNativeNavigation.libDistSrcEventsComponentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentWillAppearEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ModalAttemptedToDismissEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventSubscriptionMod.EventSubscription
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabLongPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabSelectedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.CommandCompletedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesNavigationComponentListenerMod.NavigationComponentListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcEventsEventsRegistryMod {
  
  @JSImport("react-native-navigation/lib/dist/src/events/EventsRegistry", "EventsRegistry")
  @js.native
  open class EventsRegistry protected () extends StObject {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
    
    def bindComponent(component: Component[Any, js.Object, Any]): EventSubscription = js.native
    def bindComponent(component: Component[Any, js.Object, Any], componentId: String): EventSubscription = js.native
    
    /* private */ var commandsObserver: Any = js.native
    
    /* private */ var componentEventsObserver: Any = js.native
    
    /* private */ var nativeEventsReceiver: Any = js.native
    
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    
    def registerBottomTabLongPressedListener(callback: js.Function1[/* event */ BottomTabLongPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabPressedListener(callback: js.Function1[/* event */ BottomTabPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabSelectedListener(callback: js.Function1[/* event */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandCompletedListener(callback: js.Function1[/* event */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandListener(callback: js.Function2[/* name */ String, /* params */ Any, Unit]): EventSubscription = js.native
    
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentListener(listener: NavigationComponentListener, componentId: String): EventSubscription = js.native
    
    def registerComponentWillAppearListener(callback: js.Function1[/* event */ ComponentWillAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalAttemptedToDismissListener(callback: js.Function1[/* event */ ModalAttemptedToDismissEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
    
    def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerScreenPoppedListener(callback: js.Function1[/* event */ ScreenPoppedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
  }
}

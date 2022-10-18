package typings.reactNativeNavigation

import typings.reactNative.mod.EmitterSubscription
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
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabLongPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.BottomTabSelectedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventsMod.CommandCompletedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcAdaptersNativeEventsReceiverMod {
  
  @JSImport("react-native-navigation/lib/dist/src/adapters/NativeEventsReceiver", "NativeEventsReceiver")
  @js.native
  open class NativeEventsReceiver () extends StObject {
    
    /* private */ var emitter: Any = js.native
    
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    
    def registerBottomTabLongPressedListener(callback: js.Function1[/* data */ BottomTabLongPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabPressedListener(callback: js.Function1[/* data */ BottomTabPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabSelectedListener(callback: js.Function1[/* data */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandCompletedListener(callback: js.Function1[/* data */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    
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

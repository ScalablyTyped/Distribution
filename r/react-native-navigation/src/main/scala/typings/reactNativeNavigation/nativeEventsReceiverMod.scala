package typings.reactNativeNavigation

import typings.reactNative.mod.EmitterSubscription
import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typings.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.eventsMod.BottomTabLongPressedEvent
import typings.reactNativeNavigation.eventsMod.BottomTabPressedEvent
import typings.reactNativeNavigation.eventsMod.BottomTabSelectedEvent
import typings.reactNativeNavigation.eventsMod.CommandCompletedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeEventsReceiverMod {
  
  @JSImport("react-native-navigation/lib/dist/adapters/NativeEventsReceiver", "NativeEventsReceiver")
  @js.native
  class NativeEventsReceiver () extends StObject {
    
    var emitter: js.Any = js.native
    
    def registerAppLaunchedListener(callback: js.Function0[Unit]): EmitterSubscription = js.native
    
    def registerBottomTabLongPressedListener(callback: js.Function1[/* data */ BottomTabLongPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabPressedListener(callback: js.Function1[/* data */ BottomTabPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerBottomTabSelectedListener(callback: js.Function1[/* data */ BottomTabSelectedEvent, Unit]): EmitterSubscription = js.native
    
    def registerCommandCompletedListener(callback: js.Function1[/* data */ CommandCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidAppearListener(callback: js.Function1[/* event */ ComponentDidAppearEvent, Unit]): EmitterSubscription = js.native
    
    def registerComponentDidDisappearListener(callback: js.Function1[/* event */ ComponentDidDisappearEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalAttemptedToDismissListener(callback: js.Function1[/* event */ ModalAttemptedToDismissEvent, Unit]): EmitterSubscription = js.native
    
    def registerModalDismissedListener(callback: js.Function1[/* event */ ModalDismissedEvent, Unit]): EmitterSubscription = js.native
    
    def registerNavigationButtonPressedListener(callback: js.Function1[/* event */ NavigationButtonPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerPreviewCompletedListener(callback: js.Function1[/* event */ PreviewCompletedEvent, Unit]): EmitterSubscription = js.native
    
    def registerScreenPoppedListener(callback: js.Function1[/* event */ ScreenPoppedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarCancelPressedListener(callback: js.Function1[/* event */ SearchBarCancelPressedEvent, Unit]): EmitterSubscription = js.native
    
    def registerSearchBarUpdatedListener(callback: js.Function1[/* event */ SearchBarUpdatedEvent, Unit]): EmitterSubscription = js.native
  }
}

package typings
package reactDashNativeDashNavigationLib.libDistAdaptersNativeEventsReceiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/adapters/NativeEventsReceiver", "NativeEventsReceiver")
@js.native
class NativeEventsReceiver () extends js.Object {
  var emitter: js.Any = js.native
  def registerAppLaunchedListener(callback: js.Function0[scala.Unit]): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerBottomTabSelectedListener(
    callback: js.Function1[
      /* data */ reactDashNativeDashNavigationLib.libDistInterfacesEventsMod.BottomTabSelectedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def registerCommandCompletedListener(
    callback: js.Function1[
      /* data */ reactDashNativeDashNavigationLib.libDistInterfacesEventsMod.CommandCompletedEvent, 
      scala.Unit
    ]
  ): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
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


package typings.reactDashNativeDashSafeDashArea.reactDashNativeDashSafeDashAreaMod

import typings.reactDashNative.reactDashNativeMod.EmitterSubscription
import typings.reactDashNativeDashSafeDashArea.Anon_SafeAreaInsets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// from `SafeArea.[ios|android].js`
@JSImport("react-native-safe-area", JSImport.Default)
@js.native
object default extends js.Object {
  def addEventListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _]): EmitterSubscription = js.native
  def addEventListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _], context: js.Any): EmitterSubscription = js.native
  def getSafeAreaInsetsForRootView(): js.Promise[Anon_SafeAreaInsets] = js.native
  def removeEventListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}


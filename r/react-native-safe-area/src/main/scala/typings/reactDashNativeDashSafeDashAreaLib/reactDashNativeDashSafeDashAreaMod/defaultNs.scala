package typings
package reactDashNativeDashSafeDashAreaLib.reactDashNativeDashSafeDashAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// from `SafeArea.[ios|android].js`
@JSImport("react-native-safe-area", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  def addEventListener(eventType: java.lang.String, listener: js.Function1[/* repeated */ js.Any, _]): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def addEventListener(eventType: java.lang.String, listener: js.Function1[/* repeated */ js.Any, _], context: js.Any): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  def getSafeAreaInsetsForRootView(): js.Promise[reactDashNativeDashSafeDashAreaLib.Anon_SafeAreaInsets] = js.native
  def removeEventListener(eventType: java.lang.String, listener: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
}


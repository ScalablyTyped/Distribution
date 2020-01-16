package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.platforminPlatformOSTypeT
import typings.reactDashNative.platforminPlatformOSTypeTAndroid
import typings.reactDashNative.platforminPlatformOSTypeTdefaultT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformStatic extends js.Object {
  var Version: Double | String = js.native
  var isTV: Boolean = js.native
  def select[T](specifics: platforminPlatformOSTypeT[T]): T = js.native
  def select[T](specifics: platforminPlatformOSTypeTAndroid[T]): js.UndefOr[T] = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  def select[T](specifics: platforminPlatformOSTypeTdefaultT[T]): T = js.native
}


package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ platform in react-native.react-native.PlatformOSType ]:? T} & {  default  :T} */
trait platforminPlatformOSTypeTdefaultT[T] extends js.Object {
  var android: js.UndefOr[T] = js.undefined
  var default: T
  var ios: js.UndefOr[T] = js.undefined
  var macos: js.UndefOr[T] = js.undefined
  var web: js.UndefOr[T] = js.undefined
  var windows: js.UndefOr[T] = js.undefined
}

object platforminPlatformOSTypeTdefaultT {
  @scala.inline
  def apply[T](default: T, android: T = null, ios: T = null, macos: T = null, web: T = null, windows: T = null): platforminPlatformOSTypeTdefaultT[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (macos != null) __obj.updateDynamic("macos")(macos.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[platforminPlatformOSTypeTdefaultT[T]]
  }
}


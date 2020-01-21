package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ platform in react-native.react-native.PlatformOSType ]:? T} */
trait platforminPlatformOSTypeTAndroid[T] extends js.Object {
  var android: js.UndefOr[T] = js.undefined
  var ios: js.UndefOr[T] = js.undefined
  var macos: js.UndefOr[T] = js.undefined
  var web: js.UndefOr[T] = js.undefined
  var windows: js.UndefOr[T] = js.undefined
}

object platforminPlatformOSTypeTAndroid {
  @scala.inline
  def apply[T](android: T = null, ios: T = null, macos: T = null, web: T = null, windows: T = null): platforminPlatformOSTypeTAndroid[T] = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (macos != null) __obj.updateDynamic("macos")(macos.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[platforminPlatformOSTypeTAndroid[T]]
  }
}


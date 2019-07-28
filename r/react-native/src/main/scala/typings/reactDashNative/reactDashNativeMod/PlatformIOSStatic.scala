package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.ios
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformIOSStatic extends PlatformStatic {
  var OS: ios
  var isPad: Boolean
  var isTVOS: Boolean
}

object PlatformIOSStatic {
  @scala.inline
  def apply(
    OS: ios,
    Version: Double | String,
    isPad: Boolean,
    isTV: Boolean,
    isTVOS: Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => js.Any
  ): PlatformIOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isPad = isPad, isTV = isTV, isTVOS = isTVOS)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformIOSStatic]
  }
}


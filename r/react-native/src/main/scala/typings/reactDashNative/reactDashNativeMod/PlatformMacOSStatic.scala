package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.macos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformMacOSStatic extends PlatformStatic {
  var OS: macos
}

object PlatformMacOSStatic {
  @scala.inline
  def apply(
    OS: macos,
    Version: Double | String,
    isTV: Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => js.Any
  ): PlatformMacOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isTV = isTV)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformMacOSStatic]
  }
}


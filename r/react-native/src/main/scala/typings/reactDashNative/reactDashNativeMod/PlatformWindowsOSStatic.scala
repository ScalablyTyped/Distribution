package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformWindowsOSStatic extends PlatformStatic {
  var OS: windows
}

object PlatformWindowsOSStatic {
  @scala.inline
  def apply(
    OS: windows,
    Version: Double | String,
    isTV: Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => js.Any
  ): PlatformWindowsOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isTV = isTV)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformWindowsOSStatic]
  }
}


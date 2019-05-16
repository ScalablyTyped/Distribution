package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformAndroidStatic extends PlatformStatic {
  var OS: reactDashNativeLib.reactDashNativeLibStrings.android
}

object PlatformAndroidStatic {
  @scala.inline
  def apply(
    OS: reactDashNativeLib.reactDashNativeLibStrings.android,
    Version: scala.Double | java.lang.String,
    isTV: scala.Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any => js.Any
  ): PlatformAndroidStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isTV = isTV)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformAndroidStatic]
  }
}


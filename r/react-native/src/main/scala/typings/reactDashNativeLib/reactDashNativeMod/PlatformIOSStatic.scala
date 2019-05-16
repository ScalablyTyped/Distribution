package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformIOSStatic extends PlatformStatic {
  var OS: reactDashNativeLib.reactDashNativeLibStrings.ios
  var isPad: scala.Boolean
  var isTVOS: scala.Boolean
}

object PlatformIOSStatic {
  @scala.inline
  def apply(
    OS: reactDashNativeLib.reactDashNativeLibStrings.ios,
    Version: scala.Double | java.lang.String,
    isPad: scala.Boolean,
    isTV: scala.Boolean,
    isTVOS: scala.Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any => js.Any
  ): PlatformIOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isPad = isPad, isTV = isTV, isTVOS = isTVOS)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformIOSStatic]
  }
}


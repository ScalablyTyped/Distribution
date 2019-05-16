package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformWebStatic extends PlatformStatic {
  var OS: reactDashNativeLib.reactDashNativeLibStrings.web
}

object PlatformWebStatic {
  @scala.inline
  def apply(
    OS: reactDashNativeLib.reactDashNativeLibStrings.web,
    Version: scala.Double | java.lang.String,
    isTV: scala.Boolean,
    select_default: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any => js.Any
  ): PlatformWebStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isTV = isTV)
    __obj.updateDynamic("select")(js.Any.fromFunction1(select_default))
    __obj.asInstanceOf[PlatformWebStatic]
  }
}


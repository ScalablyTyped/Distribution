package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformIOSStatic extends PlatformStatic {
  var isPad: scala.Boolean
  var isTVOS: scala.Boolean
}

object PlatformIOSStatic {
  @scala.inline
  def apply(
    OS: PlatformOSType,
    Version: scala.Double | java.lang.String,
    isPad: scala.Boolean,
    isTVOS: scala.Boolean,
    select_default: js.Function1[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any, 
      js.Any
    ]
  ): PlatformIOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], isPad = isPad, isTVOS = isTVOS)
    __obj.updateDynamic("select")(select_default)
    __obj.asInstanceOf[PlatformIOSStatic]
  }
}


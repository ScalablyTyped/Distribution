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
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => js.Any
  ): PlatformMacOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], isTV = isTV.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[PlatformMacOSStatic]
  }
}


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
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => js.Any
  ): PlatformIOSStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], isPad = isPad.asInstanceOf[js.Any], isTV = isTV.asInstanceOf[js.Any], isTVOS = isTVOS.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[PlatformIOSStatic]
  }
}


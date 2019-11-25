package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformStatic extends js.Object {
  var Version: Double | String
  var isTV: Boolean
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any
  ): T
}

object PlatformStatic {
  @scala.inline
  def apply(
    Version: Double | String,
    isTV: Boolean,
    select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ typings.reactDashNative.reactDashNativeStrings.PlatformStatic with js.Any => js.Any
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any], isTV = isTV.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[PlatformStatic]
  }
}


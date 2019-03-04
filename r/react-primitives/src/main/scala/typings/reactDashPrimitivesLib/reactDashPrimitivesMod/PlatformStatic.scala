package typings
package reactDashPrimitivesLib.reactDashPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformStatic extends js.Object {
  var OS: PlatformOSType
  var Version: scala.Double | java.lang.String
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
    */ reactDashPrimitivesLib.reactDashPrimitivesLibStrings.PlatformStatic with js.Any
  ): T
}

object PlatformStatic {
  @scala.inline
  def apply(
    OS: PlatformOSType,
    Version: scala.Double | java.lang.String,
    select_default: js.Function1[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
    */ reactDashPrimitivesLib.reactDashPrimitivesLibStrings.PlatformStatic with js.Any, 
      js.Any
    ]
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("select")(select_default)
    __obj.asInstanceOf[PlatformStatic]
  }
}


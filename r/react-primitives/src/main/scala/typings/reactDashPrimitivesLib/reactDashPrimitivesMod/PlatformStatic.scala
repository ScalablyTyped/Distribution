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


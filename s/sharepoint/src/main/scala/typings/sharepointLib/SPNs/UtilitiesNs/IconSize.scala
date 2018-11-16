package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconSize extends js.Object

@JSGlobal("SP.Utilities.IconSize")
@js.native
object IconSize extends js.Object {
  @js.native
  sealed trait size16
    extends sharepointLib.SPNs.UtilitiesNs.IconSize
  
  @js.native
  sealed trait size256
    extends sharepointLib.SPNs.UtilitiesNs.IconSize
  
  @js.native
  sealed trait size32
    extends sharepointLib.SPNs.UtilitiesNs.IconSize
  
  val size16: size16 with java.lang.String = js.native
  val size256: size256 with java.lang.String = js.native
  val size32: size32 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.IconSize with java.lang.String] = js.native
}


package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChoiceFormatType extends js.Object

@JSGlobal("SP.ChoiceFormatType")
@js.native
object ChoiceFormatType extends js.Object {
  @js.native
  sealed trait dropdown
    extends sharepointLib.SPNs.ChoiceFormatType
  
  @js.native
  sealed trait radioButtons
    extends sharepointLib.SPNs.ChoiceFormatType
  
  /* 0 */ val dropdown: dropdown with scala.Double = js.native
  /* 1 */ val radioButtons: radioButtons with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ChoiceFormatType with scala.Double] = js.native
}


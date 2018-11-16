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
  
  val dropdown: dropdown with java.lang.String = js.native
  val radioButtons: radioButtons with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ChoiceFormatType with java.lang.String] = js.native
}


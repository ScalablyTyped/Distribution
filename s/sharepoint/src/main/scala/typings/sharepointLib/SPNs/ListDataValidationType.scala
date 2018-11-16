package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListDataValidationType extends js.Object

@JSGlobal("SP.ListDataValidationType")
@js.native
object ListDataValidationType extends js.Object {
  @js.native
  sealed trait choiceField
    extends sharepointLib.SPNs.ListDataValidationType
  
  @js.native
  sealed trait minMaxField
    extends sharepointLib.SPNs.ListDataValidationType
  
  @js.native
  sealed trait requiredField
    extends sharepointLib.SPNs.ListDataValidationType
  
  @js.native
  sealed trait textField
    extends sharepointLib.SPNs.ListDataValidationType
  
  @js.native
  sealed trait userFormulaField
    extends sharepointLib.SPNs.ListDataValidationType
  
  @js.native
  sealed trait userFormulaItem
    extends sharepointLib.SPNs.ListDataValidationType
  
  val choiceField: choiceField with java.lang.String = js.native
  val minMaxField: minMaxField with java.lang.String = js.native
  val requiredField: requiredField with java.lang.String = js.native
  val textField: textField with java.lang.String = js.native
  val userFormulaField: userFormulaField with java.lang.String = js.native
  val userFormulaItem: userFormulaItem with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ListDataValidationType with java.lang.String] = js.native
}


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
  
  /* 3 */ val choiceField: choiceField with scala.Double = js.native
  /* 4 */ val minMaxField: minMaxField with scala.Double = js.native
  /* 2 */ val requiredField: requiredField with scala.Double = js.native
  /* 5 */ val textField: textField with scala.Double = js.native
  /* 0 */ val userFormulaField: userFormulaField with scala.Double = js.native
  /* 1 */ val userFormulaItem: userFormulaItem with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ListDataValidationType with scala.Double] = js.native
}


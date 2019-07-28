package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListDataValidationType extends js.Object

@JSGlobal("SP.ListDataValidationType")
@js.native
object ListDataValidationType extends js.Object {
  @js.native
  sealed trait choiceField extends ListDataValidationType
  
  @js.native
  sealed trait minMaxField extends ListDataValidationType
  
  @js.native
  sealed trait requiredField extends ListDataValidationType
  
  @js.native
  sealed trait textField extends ListDataValidationType
  
  @js.native
  sealed trait userFormulaField extends ListDataValidationType
  
  @js.native
  sealed trait userFormulaItem extends ListDataValidationType
  
  /* 3 */ val choiceField: typings.sharepoint.SPNs.ListDataValidationType.choiceField with Double = js.native
  /* 4 */ val minMaxField: typings.sharepoint.SPNs.ListDataValidationType.minMaxField with Double = js.native
  /* 2 */ val requiredField: typings.sharepoint.SPNs.ListDataValidationType.requiredField with Double = js.native
  /* 5 */ val textField: typings.sharepoint.SPNs.ListDataValidationType.textField with Double = js.native
  /* 0 */ val userFormulaField: typings.sharepoint.SPNs.ListDataValidationType.userFormulaField with Double = js.native
  /* 1 */ val userFormulaItem: typings.sharepoint.SPNs.ListDataValidationType.userFormulaItem with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListDataValidationType with Double] = js.native
}


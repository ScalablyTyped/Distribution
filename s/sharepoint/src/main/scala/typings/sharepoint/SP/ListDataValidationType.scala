package typings.sharepoint.SP

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
  
  /* 3 */ val choiceField: typings.sharepoint.SP.ListDataValidationType.choiceField with Double = js.native
  /* 4 */ val minMaxField: typings.sharepoint.SP.ListDataValidationType.minMaxField with Double = js.native
  /* 2 */ val requiredField: typings.sharepoint.SP.ListDataValidationType.requiredField with Double = js.native
  /* 5 */ val textField: typings.sharepoint.SP.ListDataValidationType.textField with Double = js.native
  /* 0 */ val userFormulaField: typings.sharepoint.SP.ListDataValidationType.userFormulaField with Double = js.native
  /* 1 */ val userFormulaItem: typings.sharepoint.SP.ListDataValidationType.userFormulaItem with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListDataValidationType with Double] = js.native
}


package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.ListDataValidationType.choiceField
import typings.sharepoint.SP.ListDataValidationType.minMaxField
import typings.sharepoint.SP.ListDataValidationType.requiredField
import typings.sharepoint.SP.ListDataValidationType.textField
import typings.sharepoint.SP.ListDataValidationType.userFormulaField
import typings.sharepoint.SP.ListDataValidationType.userFormulaItem
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListDataValidationType with Double] = js.native
  /* 3 */ @js.native
  object choiceField extends TopLevel[choiceField with Double]
  
  /* 4 */ @js.native
  object minMaxField extends TopLevel[minMaxField with Double]
  
  /* 2 */ @js.native
  object requiredField extends TopLevel[requiredField with Double]
  
  /* 5 */ @js.native
  object textField extends TopLevel[textField with Double]
  
  /* 0 */ @js.native
  object userFormulaField extends TopLevel[userFormulaField with Double]
  
  /* 1 */ @js.native
  object userFormulaItem extends TopLevel[userFormulaItem with Double]
  
}


package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

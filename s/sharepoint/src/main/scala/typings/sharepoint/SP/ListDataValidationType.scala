package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListDataValidationType extends StObject
@JSGlobal("SP.ListDataValidationType")
@js.native
object ListDataValidationType extends StObject {
  
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

package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListDataValidationType extends StObject
@JSGlobal("SP.ListDataValidationType")
@js.native
object ListDataValidationType extends StObject {
  
  @js.native
  sealed trait choiceField
    extends StObject
       with ListDataValidationType
  
  @js.native
  sealed trait minMaxField
    extends StObject
       with ListDataValidationType
  
  @js.native
  sealed trait requiredField
    extends StObject
       with ListDataValidationType
  
  @js.native
  sealed trait textField
    extends StObject
       with ListDataValidationType
  
  @js.native
  sealed trait userFormulaField
    extends StObject
       with ListDataValidationType
  
  @js.native
  sealed trait userFormulaItem
    extends StObject
       with ListDataValidationType
}

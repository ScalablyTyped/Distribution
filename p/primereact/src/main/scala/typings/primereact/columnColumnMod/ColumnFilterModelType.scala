package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.primereact.columnColumnMod.ColumnFilterMetaData
  - typings.primereact.columnColumnMod.ColumnFilterMetaDataWithConstraint
*/
trait ColumnFilterModelType extends StObject
object ColumnFilterModelType {
  
  inline def ColumnFilterMetaData(matchMode: ColumnFilterMatchModeType, value: Any): typings.primereact.columnColumnMod.ColumnFilterMetaData = {
    val __obj = js.Dynamic.literal(matchMode = matchMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.primereact.columnColumnMod.ColumnFilterMetaData]
  }
  
  inline def ColumnFilterMetaDataWithConstraint(constraints: js.Array[ColumnFilterMetaData], operator: ColumnFilterOperatorType): typings.primereact.columnColumnMod.ColumnFilterMetaDataWithConstraint = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.primereact.columnColumnMod.ColumnFilterMetaDataWithConstraint]
  }
}

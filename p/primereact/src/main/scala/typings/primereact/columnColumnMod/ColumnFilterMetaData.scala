package typings.primereact.columnColumnMod

import typings.primereact.primereactStrings.contains
import typings.primereact.primereactStrings.custom
import typings.primereact.primereactStrings.endsWith
import typings.primereact.primereactStrings.equals
import typings.primereact.primereactStrings.gt
import typings.primereact.primereactStrings.gte
import typings.primereact.primereactStrings.in
import typings.primereact.primereactStrings.lt
import typings.primereact.primereactStrings.lte
import typings.primereact.primereactStrings.notEquals
import typings.primereact.primereactStrings.startsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterMetaData extends StObject {
  
  /**
    * Type of filter match.
    */
  var matchMode: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom
  
  /**
    * Value of the filter.
    */
  var value: Any
}
object ColumnFilterMetaData {
  
  inline def apply(
    matchMode: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom,
    value: Any
  ): ColumnFilterMetaData = {
    val __obj = js.Dynamic.literal(matchMode = matchMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterMetaData] (val x: Self) extends AnyVal {
    
    inline def setMatchMode(value: startsWith | contains | endsWith | equals | notEquals | in | lt | lte | gt | gte | custom): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

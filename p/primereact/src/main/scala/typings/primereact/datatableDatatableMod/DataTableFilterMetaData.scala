package typings.primereact.datatableDatatableMod

import typings.primereact.primereactStrings.between
import typings.primereact.primereactStrings.contains
import typings.primereact.primereactStrings.custom
import typings.primereact.primereactStrings.dateAfter
import typings.primereact.primereactStrings.dateBefore
import typings.primereact.primereactStrings.dateIs
import typings.primereact.primereactStrings.dateIsNot
import typings.primereact.primereactStrings.endsWith
import typings.primereact.primereactStrings.equals
import typings.primereact.primereactStrings.gt
import typings.primereact.primereactStrings.gte
import typings.primereact.primereactStrings.in
import typings.primereact.primereactStrings.lt
import typings.primereact.primereactStrings.lte
import typings.primereact.primereactStrings.notContains
import typings.primereact.primereactStrings.notEquals
import typings.primereact.primereactStrings.startsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom datatable filter metadata.
  */
trait DataTableFilterMetaData extends StObject {
  
  /**
    * Type of filter match.
    */
  var matchMode: js.UndefOr[
    startsWith | contains | notContains | endsWith | equals | notEquals | in | lt | lte | gt | gte | between | dateIs | dateIsNot | dateBefore | dateAfter | custom
  ] = js.undefined
  
  /**
    * Value to filter against.
    */
  var value: Any
}
object DataTableFilterMetaData {
  
  inline def apply(value: Any): DataTableFilterMetaData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableFilterMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableFilterMetaData] (val x: Self) extends AnyVal {
    
    inline def setMatchMode(
      value: startsWith | contains | notContains | endsWith | equals | notEquals | in | lt | lte | gt | gte | between | dateIs | dateIsNot | dateBefore | dateAfter | custom
    ): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    inline def setMatchModeUndefined: Self = StObject.set(x, "matchMode", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

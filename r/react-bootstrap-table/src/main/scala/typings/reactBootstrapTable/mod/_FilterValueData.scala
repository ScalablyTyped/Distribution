package typings.reactBootstrapTable.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _FilterValueData extends StObject
object _FilterValueData {
  
  inline def DateFilterValue(comparator: FilterComparator, date: Date | String): typings.reactBootstrapTable.mod.DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.DateFilterValue]
  }
  
  inline def NumberFilterValue(comparator: FilterComparator, number: Double | String): typings.reactBootstrapTable.mod.NumberFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.NumberFilterValue]
  }
}

package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFilterValue extends _FilterValueData {
  
  var comparator: FilterComparator = js.native
  
  var number: Double | String = js.native
}
object NumberFilterValue {
  
  @scala.inline
  def apply(comparator: FilterComparator, number: Double | String): NumberFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilterValue]
  }
  
  @scala.inline
  implicit class NumberFilterValueMutableBuilder[Self <: NumberFilterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double | String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}

package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparator extends StObject {
  
  var comparator: js.Any = js.native
  
  var filterType: TEXT = js.native
  
  var filterVal: js.Any = js.native
}
object Comparator {
  
  @scala.inline
  def apply(comparator: js.Any, filterType: TEXT, filterVal: js.Any): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any], filterVal = filterVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  
  @scala.inline
  implicit class ComparatorMutableBuilder[Self <: Comparator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: js.Any): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterType(value: TEXT): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterVal(value: js.Any): Self = StObject.set(x, "filterVal", value.asInstanceOf[js.Any])
  }
}

package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comparator extends StObject {
  
  var comparator: js.Any
  
  var filterType: TEXT
  
  var filterVal: js.Any
}
object Comparator {
  
  inline def apply(comparator: js.Any, filterVal: js.Any): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], filterType = "TEXT", filterVal = filterVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  
  extension [Self <: Comparator](x: Self) {
    
    inline def setComparator(value: js.Any): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: TEXT): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterVal(value: js.Any): Self = StObject.set(x, "filterVal", value.asInstanceOf[js.Any])
  }
}

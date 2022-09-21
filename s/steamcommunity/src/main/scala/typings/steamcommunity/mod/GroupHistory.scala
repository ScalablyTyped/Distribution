package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupHistory extends StObject {
  
  /** The index of the first history item on this page, starting at 1. */
  var first: Double
  
  /** An array of group history objects. */
  var items: js.Array[GroupItemHistory]
  
  /** The index of the last history item on this page. */
  var last: Double
  
  /** How many total history items there are. */
  var total: Double
}
object GroupHistory {
  
  inline def apply(first: Double, items: js.Array[GroupItemHistory], last: Double, total: Double): GroupHistory = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupHistory]
  }
  
  extension [Self <: GroupHistory](x: Self) {
    
    inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[GroupItemHistory]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: GroupItemHistory*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}

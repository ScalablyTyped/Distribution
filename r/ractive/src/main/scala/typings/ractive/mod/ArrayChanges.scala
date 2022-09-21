package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayChanges extends StObject {
  
  /**
  	 * A list of any removed items.
  	 */
  var deleted: js.Array[Any]
  
  /**
  	 * A list of any added items.
  	 */
  var inserted: js.Array[Any]
  
  /**
  	 * The starting index for the changes.
  	 */
  var start: Double
}
object ArrayChanges {
  
  inline def apply(deleted: js.Array[Any], inserted: js.Array[Any], start: Double): ArrayChanges = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChanges]
  }
  
  extension [Self <: ArrayChanges](x: Self) {
    
    inline def setDeleted(value: js.Array[Any]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedVarargs(value: Any*): Self = StObject.set(x, "deleted", js.Array(value*))
    
    inline def setInserted(value: js.Array[Any]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
    
    inline def setInsertedVarargs(value: Any*): Self = StObject.set(x, "inserted", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

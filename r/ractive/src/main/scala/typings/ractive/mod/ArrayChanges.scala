package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayChanges extends StObject {
  
  /**
  	 * A list of any removed items.
  	 */
  var deleted: js.Array[js.Any]
  
  /**
  	 * A list of any added items.
  	 */
  var inserted: js.Array[js.Any]
  
  /**
  	 * The starting index for the changes.
  	 */
  var start: Double
}
object ArrayChanges {
  
  @scala.inline
  def apply(deleted: js.Array[js.Any], inserted: js.Array[js.Any], start: Double): ArrayChanges = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayChanges]
  }
  
  @scala.inline
  implicit class ArrayChangesMutableBuilder[Self <: ArrayChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: js.Array[js.Any]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedVarargs(value: js.Any*): Self = StObject.set(x, "deleted", js.Array(value :_*))
    
    @scala.inline
    def setInserted(value: js.Array[js.Any]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedVarargs(value: js.Any*): Self = StObject.set(x, "inserted", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

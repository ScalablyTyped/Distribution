package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteResult extends StObject {
  
  var deleted: Double
  
  var errors: Double
  
  var first_error: js.Error
  
  var generated_keys: js.Array[String]
  
  var inserted: Double
  
  var replaced: Double
  
  var skipped: Double
  
  var unchanged: Double
}
object WriteResult {
  
  inline def apply(
    deleted: Double,
    errors: Double,
    first_error: js.Error,
    generated_keys: js.Array[String],
    inserted: Double,
    replaced: Double,
    skipped: Double,
    unchanged: Double
  ): WriteResult = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], first_error = first_error.asInstanceOf[js.Any], generated_keys = generated_keys.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  
  extension [Self <: WriteResult](x: Self) {
    
    inline def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setFirst_error(value: js.Error): Self = StObject.set(x, "first_error", value.asInstanceOf[js.Any])
    
    inline def setGenerated_keys(value: js.Array[String]): Self = StObject.set(x, "generated_keys", value.asInstanceOf[js.Any])
    
    inline def setGenerated_keysVarargs(value: String*): Self = StObject.set(x, "generated_keys", js.Array(value*))
    
    inline def setInserted(value: Double): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
    
    inline def setReplaced(value: Double): Self = StObject.set(x, "replaced", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setUnchanged(value: Double): Self = StObject.set(x, "unchanged", value.asInstanceOf[js.Any])
  }
}

package typings.rethinkdb.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteResult extends StObject {
  
  var deleted: Double = js.native
  
  var errors: Double = js.native
  
  var first_error: Error = js.native
  
  var generated_keys: js.Array[String] = js.native
  
  var inserted: Double = js.native
  
  var replaced: Double = js.native
  
  var skipped: Double = js.native
  
  var unchanged: Double = js.native
}
object WriteResult {
  
  @scala.inline
  def apply(
    deleted: Double,
    errors: Double,
    first_error: Error,
    generated_keys: js.Array[String],
    inserted: Double,
    replaced: Double,
    skipped: Double,
    unchanged: Double
  ): WriteResult = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], first_error = first_error.asInstanceOf[js.Any], generated_keys = generated_keys.asInstanceOf[js.Any], inserted = inserted.asInstanceOf[js.Any], replaced = replaced.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
  
  @scala.inline
  implicit class WriteResultMutableBuilder[Self <: WriteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_error(value: Error): Self = StObject.set(x, "first_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerated_keys(value: js.Array[String]): Self = StObject.set(x, "generated_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerated_keysVarargs(value: String*): Self = StObject.set(x, "generated_keys", js.Array(value :_*))
    
    @scala.inline
    def setInserted(value: Double): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaced(value: Double): Self = StObject.set(x, "replaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnchanged(value: Double): Self = StObject.set(x, "unchanged", value.asInstanceOf[js.Any])
  }
}

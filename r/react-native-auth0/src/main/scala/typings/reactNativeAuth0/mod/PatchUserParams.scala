package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchUserParams[T] extends StObject {
  
  var id: String
  
  var metadata: T
}
object PatchUserParams {
  
  inline def apply[T](id: String, metadata: T): PatchUserParams[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchUserParams[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchUserParams[?], T] (val x: Self & PatchUserParams[T]) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: T): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}

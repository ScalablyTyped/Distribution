package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchUserParams[T] extends StObject {
  
  var id: String = js.native
  
  var metadata: T = js.native
}
object PatchUserParams {
  
  @scala.inline
  def apply[T](id: String, metadata: T): PatchUserParams[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchUserParams[T]]
  }
  
  @scala.inline
  implicit class PatchUserParamsMutableBuilder[Self <: PatchUserParams[_], T] (val x: Self with PatchUserParams[T]) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: T): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}

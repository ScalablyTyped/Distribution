package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteInfo[T] extends StObject {
  
  var isIndexing: Boolean = js.native
  
  var original: T = js.native
  
  var patch: JSONDiff[T] = js.native
}
object RemoteInfo {
  
  @scala.inline
  def apply[T](isIndexing: Boolean, original: T, patch: JSONDiff[T]): RemoteInfo[T] = {
    val __obj = js.Dynamic.literal(isIndexing = isIndexing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo[T]]
  }
  
  @scala.inline
  implicit class RemoteInfoMutableBuilder[Self <: RemoteInfo[_], T] (val x: Self with RemoteInfo[T]) extends AnyVal {
    
    @scala.inline
    def setIsIndexing(value: Boolean): Self = StObject.set(x, "isIndexing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: T): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: JSONDiff[T]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}

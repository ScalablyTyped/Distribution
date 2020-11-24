package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteInfo[T] extends js.Object {
  
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
  implicit class RemoteInfoOps[Self <: RemoteInfo[_], T] (val x: Self with RemoteInfo[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsIndexing(value: Boolean): Self = this.set("isIndexing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: T): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: JSONDiff[T]): Self = this.set("patch", value.asInstanceOf[js.Any])
  }
}

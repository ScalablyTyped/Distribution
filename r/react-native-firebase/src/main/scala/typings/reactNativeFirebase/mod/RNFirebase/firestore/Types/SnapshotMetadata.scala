package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotMetadata extends js.Object {
  
  var fromCache: Boolean = js.native
  
  var hasPendingWrites: Boolean = js.native
}
object SnapshotMetadata {
  
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMetadata]
  }
  
  @scala.inline
  implicit class SnapshotMetadataOps[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
    
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
    def setFromCache(value: Boolean): Self = this.set("fromCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPendingWrites(value: Boolean): Self = this.set("hasPendingWrites", value.asInstanceOf[js.Any])
  }
}

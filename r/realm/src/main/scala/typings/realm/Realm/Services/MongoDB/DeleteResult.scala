package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of deleting documents
  */
@js.native
trait DeleteResult extends js.Object {
  
  /**
    * The number of documents that were deleted.
    */
  val deletedCount: Double = js.native
}
object DeleteResult {
  
  @scala.inline
  def apply(deletedCount: Double): DeleteResult = {
    val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResult]
  }
  
  @scala.inline
  implicit class DeleteResultOps[Self <: DeleteResult] (val x: Self) extends AnyVal {
    
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
    def setDeletedCount(value: Double): Self = this.set("deletedCount", value.asInstanceOf[js.Any])
  }
}

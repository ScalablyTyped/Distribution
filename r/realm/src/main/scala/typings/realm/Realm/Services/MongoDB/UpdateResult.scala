package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of updating documents
  */
@js.native
trait UpdateResult[IdType] extends js.Object {
  
  /**
    * The number of documents that matched the filter.
    */
  val matchedCount: Double = js.native
  
  /**
    * The number of documents matched by the query.
    */
  val modifiedCount: Double = js.native
  
  /**
    * The identifier of the inserted document if an upsert took place.
    *
    * See [[RemoteUpdateOptions.upsert]].
    */
  val upsertedId: js.UndefOr[IdType] = js.native
}
object UpdateResult {
  
  @scala.inline
  def apply[IdType](matchedCount: Double, modifiedCount: Double): UpdateResult[IdType] = {
    val __obj = js.Dynamic.literal(matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[IdType]]
  }
  
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult[_], IdType] (val x: Self with UpdateResult[IdType]) extends AnyVal {
    
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
    def setMatchedCount(value: Double): Self = this.set("matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCount(value: Double): Self = this.set("modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedId(value: IdType): Self = this.set("upsertedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsertedId: Self = this.set("upsertedId", js.undefined)
  }
}

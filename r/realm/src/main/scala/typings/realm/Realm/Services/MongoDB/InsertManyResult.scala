package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of inserting many documents
  */
@js.native
trait InsertManyResult[IdType] extends js.Object {
  
  /**
    * The ids of the inserted documents
    */
  val insertedIds: js.Array[IdType] = js.native
}
object InsertManyResult {
  
  @scala.inline
  def apply[IdType](insertedIds: js.Array[IdType]): InsertManyResult[IdType] = {
    val __obj = js.Dynamic.literal(insertedIds = insertedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertManyResult[IdType]]
  }
  
  @scala.inline
  implicit class InsertManyResultOps[Self <: InsertManyResult[_], IdType] (val x: Self with InsertManyResult[IdType]) extends AnyVal {
    
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
    def setInsertedIdsVarargs(value: IdType*): Self = this.set("insertedIds", js.Array(value :_*))
    
    @scala.inline
    def setInsertedIds(value: js.Array[IdType]): Self = this.set("insertedIds", value.asInstanceOf[js.Any])
  }
}

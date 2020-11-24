package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of inserting one document
  */
@js.native
trait InsertOneResult[IdType] extends js.Object {
  
  /**
    * The id of the inserted document
    */
  val insertedId: IdType = js.native
}
object InsertOneResult {
  
  @scala.inline
  def apply[IdType](insertedId: IdType): InsertOneResult[IdType] = {
    val __obj = js.Dynamic.literal(insertedId = insertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneResult[IdType]]
  }
  
  @scala.inline
  implicit class InsertOneResultOps[Self <: InsertOneResult[_], IdType] (val x: Self with InsertOneResult[IdType]) extends AnyVal {
    
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
    def setInsertedId(value: IdType): Self = this.set("insertedId", value.asInstanceOf[js.Any])
  }
}

package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options passed when finding and modifying a signle document
  */
@js.native
trait FindOneAndModifyOptions extends FindOneOptions {
  
  /**
    * Optional. Default: false.
    * A boolean that, if true, indicates that the action should return
    * the document in its updated form instead of its original, pre-update form.
    */
  val returnNewDocument: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Default: false.
    * A boolean that, if true, indicates that MongoDB should insert a new document that matches the
    * query filter when the query does not match any existing documents in the collection.
    */
  val upsert: js.UndefOr[Boolean] = js.native
}
object FindOneAndModifyOptions {
  
  @scala.inline
  def apply(): FindOneAndModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndModifyOptions]
  }
  
  @scala.inline
  implicit class FindOneAndModifyOptionsOps[Self <: FindOneAndModifyOptions] (val x: Self) extends AnyVal {
    
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
    def setReturnNewDocument(value: Boolean): Self = this.set("returnNewDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnNewDocument: Self = this.set("returnNewDocument", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
}

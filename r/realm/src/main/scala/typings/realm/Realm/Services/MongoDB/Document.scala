package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document from a MongoDB collection
  */
@js.native
trait Document[IdType] extends js.Object {
  
  /**
    * The id of the document.
    */
  var _id: IdType = js.native
}
object Document {
  
  @scala.inline
  def apply[IdType](_id: IdType): Document[IdType] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[IdType]]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document[_], IdType] (val x: Self with Document[IdType]) extends AnyVal {
    
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
    def set_id(value: IdType): Self = this.set("_id", value.asInstanceOf[js.Any])
  }
}

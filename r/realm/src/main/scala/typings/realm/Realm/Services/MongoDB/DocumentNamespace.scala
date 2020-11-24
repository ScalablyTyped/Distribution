package typings.realm.Realm.Services.MongoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The namespace of a document.
  */
@js.native
trait DocumentNamespace extends js.Object {
  
  // database: string;
  /** The name of the collection. */
  var coll: String = js.native
  
  /** The name of the database. */
  var db: String = js.native
}
object DocumentNamespace {
  
  @scala.inline
  def apply(coll: String, db: String): DocumentNamespace = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentNamespace]
  }
  
  @scala.inline
  implicit class DocumentNamespaceOps[Self <: DocumentNamespace] (val x: Self) extends AnyVal {
    
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
    def setColl(value: String): Self = this.set("coll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
  }
}

package typings.realm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<realm.Realm.Services.MongoDB.DocumentNamespace, 'coll'> */
@js.native
trait OmitDocumentNamespacecoll extends js.Object {
  
  var db: String = js.native
}
object OmitDocumentNamespacecoll {
  
  @scala.inline
  def apply(db: String): OmitDocumentNamespacecoll = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDocumentNamespacecoll]
  }
  
  @scala.inline
  implicit class OmitDocumentNamespacecollOps[Self <: OmitDocumentNamespacecoll] (val x: Self) extends AnyVal {
    
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
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
  }
}

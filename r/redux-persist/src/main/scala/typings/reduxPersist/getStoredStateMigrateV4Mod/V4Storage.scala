package typings.reduxPersist.getStoredStateMigrateV4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V4Storage extends js.Object {
  
  var getAllKeys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.native
  
  var getItem: js.UndefOr[
    js.Function1[
      /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _], 
      _
    ]
  ] = js.native
  
  var keys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.native
}
object V4Storage {
  
  @scala.inline
  def apply(): V4Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V4Storage]
  }
  
  @scala.inline
  implicit class V4StorageOps[Self <: V4Storage] (val x: Self) extends AnyVal {
    
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
    def setGetAllKeys(value: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _): Self = this.set("getAllKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAllKeys: Self = this.set("getAllKeys", js.undefined)
    
    @scala.inline
    def setGetItem(value: /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _] => _): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItem: Self = this.set("getItem", js.undefined)
    
    @scala.inline
    def setKeys(value: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _): Self = this.set("keys", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
}

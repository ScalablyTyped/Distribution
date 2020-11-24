package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends js.Object {
  
  var endAt: js.UndefOr[js.Array[_]] = js.native
  
  var endBefore: js.UndefOr[js.Array[_]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var selectFields: js.UndefOr[js.Array[String]] = js.native
  
  var startAfter: js.UndefOr[js.Array[_]] = js.native
  
  var startAt: js.UndefOr[js.Array[_]] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
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
    def setEndAtVarargs(value: js.Any*): Self = this.set("endAt", js.Array(value :_*))
    
    @scala.inline
    def setEndAt(value: js.Array[_]): Self = this.set("endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAt: Self = this.set("endAt", js.undefined)
    
    @scala.inline
    def setEndBeforeVarargs(value: js.Any*): Self = this.set("endBefore", js.Array(value :_*))
    
    @scala.inline
    def setEndBefore(value: js.Array[_]): Self = this.set("endBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndBefore: Self = this.set("endBefore", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSelectFieldsVarargs(value: String*): Self = this.set("selectFields", js.Array(value :_*))
    
    @scala.inline
    def setSelectFields(value: js.Array[String]): Self = this.set("selectFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectFields: Self = this.set("selectFields", js.undefined)
    
    @scala.inline
    def setStartAfterVarargs(value: js.Any*): Self = this.set("startAfter", js.Array(value :_*))
    
    @scala.inline
    def setStartAfter(value: js.Array[_]): Self = this.set("startAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAfter: Self = this.set("startAfter", js.undefined)
    
    @scala.inline
    def setStartAtVarargs(value: js.Any*): Self = this.set("startAt", js.Array(value :_*))
    
    @scala.inline
    def setStartAt(value: js.Array[_]): Self = this.set("startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
  }
}

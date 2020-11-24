package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetOptions extends js.Object {
  
  var field: js.UndefOr[String | js.Array[String]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var mincout: js.UndefOr[Double] = js.native
  
  var missing: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var on: Boolean = js.native
  
  var pivot: js.UndefOr[String | js.Array[String]] = js.native
  
  var prefix: String = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[String] = js.native
}
object FacetOptions {
  
  @scala.inline
  def apply(on: Boolean, prefix: String): FacetOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetOptions]
  }
  
  @scala.inline
  implicit class FacetOptionsOps[Self <: FacetOptions] (val x: Self) extends AnyVal {
    
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
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldVarargs(value: String*): Self = this.set("field", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String | js.Array[String]): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMincout(value: Double): Self = this.set("mincout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMincout: Self = this.set("mincout", js.undefined)
    
    @scala.inline
    def setMissing(value: Boolean): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPivotVarargs(value: String*): Self = this.set("pivot", js.Array(value :_*))
    
    @scala.inline
    def setPivot(value: String | js.Array[String]): Self = this.set("pivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivot: Self = this.set("pivot", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}

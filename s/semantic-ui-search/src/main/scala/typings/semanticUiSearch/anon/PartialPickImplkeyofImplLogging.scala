package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplLogging extends js.Object {
  
  var logging: js.UndefOr[String] = js.native
  
  var maxResults: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var noResults: js.UndefOr[String] = js.native
  
  var noTemplate: js.UndefOr[String] = js.native
  
  var serverError: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplLogging {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplLogging]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplLoggingOps[Self <: PartialPickImplkeyofImplLogging] (val x: Self) extends AnyVal {
    
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
    def setLogging(value: String): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMaxResults(value: String): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setNoResults(value: String): Self = this.set("noResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResults: Self = this.set("noResults", js.undefined)
    
    @scala.inline
    def setNoTemplate(value: String): Self = this.set("noTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTemplate: Self = this.set("noTemplate", js.undefined)
    
    @scala.inline
    def setServerError(value: String): Self = this.set("serverError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerError: Self = this.set("serverError", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}

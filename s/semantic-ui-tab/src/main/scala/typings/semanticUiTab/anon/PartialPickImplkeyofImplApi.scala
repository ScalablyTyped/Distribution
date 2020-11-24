package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplApi extends js.Object {
  
  var api: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var missingTab: js.UndefOr[String] = js.native
  
  var noContent: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var recursion: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplApi {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplApi]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplApiOps[Self <: PartialPickImplkeyofImplApi] (val x: Self) extends AnyVal {
    
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
    def setApi(value: String): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMissingTab(value: String): Self = this.set("missingTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingTab: Self = this.set("missingTab", js.undefined)
    
    @scala.inline
    def setNoContent(value: String): Self = this.set("noContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoContent: Self = this.set("noContent", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRecursion(value: String): Self = this.set("recursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursion: Self = this.set("recursion", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}

package typings.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBottom extends js.Object {
  
  var bottom: js.UndefOr[String] = js.native
  
  var fixed: js.UndefOr[String] = js.native
}
object PartialPickImplkeyofImplBottom {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBottom]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplBottomOps[Self <: PartialPickImplkeyofImplBottom] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
  }
}

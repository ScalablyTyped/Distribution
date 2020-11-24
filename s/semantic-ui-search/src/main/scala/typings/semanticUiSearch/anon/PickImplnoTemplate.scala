package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'noTemplate'> */
@js.native
trait PickImplnoTemplate extends js.Object {
  
  var noTemplate: String = js.native
}
object PickImplnoTemplate {
  
  @scala.inline
  def apply(noTemplate: String): PickImplnoTemplate = {
    val __obj = js.Dynamic.literal(noTemplate = noTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoTemplate]
  }
  
  @scala.inline
  implicit class PickImplnoTemplateOps[Self <: PickImplnoTemplate] (val x: Self) extends AnyVal {
    
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
    def setNoTemplate(value: String): Self = this.set("noTemplate", value.asInstanceOf[js.Any])
  }
}

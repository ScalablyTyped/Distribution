package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'omitted'> */
@js.native
trait PickImplomitted extends js.Object {
  
  var omitted: String = js.native
}
object PickImplomitted {
  
  @scala.inline
  def apply(omitted: String): PickImplomitted = {
    val __obj = js.Dynamic.literal(omitted = omitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplomitted]
  }
  
  @scala.inline
  implicit class PickImplomittedOps[Self <: PickImplomitted] (val x: Self) extends AnyVal {
    
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
    def setOmitted(value: String): Self = this.set("omitted", value.asInstanceOf[js.Any])
  }
}

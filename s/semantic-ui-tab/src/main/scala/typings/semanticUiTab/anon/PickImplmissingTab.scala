package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'missingTab'> */
@js.native
trait PickImplmissingTab extends js.Object {
  
  var missingTab: String = js.native
}
object PickImplmissingTab {
  
  @scala.inline
  def apply(missingTab: String): PickImplmissingTab = {
    val __obj = js.Dynamic.literal(missingTab = missingTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingTab]
  }
  
  @scala.inline
  implicit class PickImplmissingTabOps[Self <: PickImplmissingTab] (val x: Self) extends AnyVal {
    
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
    def setMissingTab(value: String): Self = this.set("missingTab", value.asInstanceOf[js.Any])
  }
}

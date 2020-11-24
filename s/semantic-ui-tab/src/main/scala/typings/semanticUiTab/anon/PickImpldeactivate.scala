package typings.semanticUiTab.anon

import typings.semanticUiTab.semanticUiTabStrings.all
import typings.semanticUiTab.semanticUiTabStrings.siblings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'deactivate'> */
@js.native
trait PickImpldeactivate extends js.Object {
  
  var deactivate: siblings | all = js.native
}
object PickImpldeactivate {
  
  @scala.inline
  def apply(deactivate: siblings | all): PickImpldeactivate = {
    val __obj = js.Dynamic.literal(deactivate = deactivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeactivate]
  }
  
  @scala.inline
  implicit class PickImpldeactivateOps[Self <: PickImpldeactivate] (val x: Self) extends AnyVal {
    
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
    def setDeactivate(value: siblings | all): Self = this.set("deactivate", value.asInstanceOf[js.Any])
  }
}

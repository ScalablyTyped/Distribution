package typings.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'showActivity'> */
@js.native
trait PickImplshowActivity extends js.Object {
  
  var showActivity: Boolean = js.native
}
object PickImplshowActivity {
  
  @scala.inline
  def apply(showActivity: Boolean): PickImplshowActivity = {
    val __obj = js.Dynamic.literal(showActivity = showActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowActivity]
  }
  
  @scala.inline
  implicit class PickImplshowActivityOps[Self <: PickImplshowActivity] (val x: Self) extends AnyVal {
    
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
    def setShowActivity(value: Boolean): Self = this.set("showActivity", value.asInstanceOf[js.Any])
  }
}

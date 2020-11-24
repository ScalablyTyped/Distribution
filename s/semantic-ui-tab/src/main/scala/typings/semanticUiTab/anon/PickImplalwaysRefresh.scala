package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'alwaysRefresh'> */
@js.native
trait PickImplalwaysRefresh extends js.Object {
  
  var alwaysRefresh: Boolean = js.native
}
object PickImplalwaysRefresh {
  
  @scala.inline
  def apply(alwaysRefresh: Boolean): PickImplalwaysRefresh = {
    val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplalwaysRefresh]
  }
  
  @scala.inline
  implicit class PickImplalwaysRefreshOps[Self <: PickImplalwaysRefresh] (val x: Self) extends AnyVal {
    
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
    def setAlwaysRefresh(value: Boolean): Self = this.set("alwaysRefresh", value.asInstanceOf[js.Any])
  }
}

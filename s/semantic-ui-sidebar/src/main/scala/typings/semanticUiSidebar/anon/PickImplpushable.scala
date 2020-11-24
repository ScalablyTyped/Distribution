package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'pushable'> */
@js.native
trait PickImplpushable extends js.Object {
  
  var pushable: String = js.native
}
object PickImplpushable {
  
  @scala.inline
  def apply(pushable: String): PickImplpushable = {
    val __obj = js.Dynamic.literal(pushable = pushable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushable]
  }
  
  @scala.inline
  implicit class PickImplpushableOps[Self <: PickImplpushable] (val x: Self) extends AnyVal {
    
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
    def setPushable(value: String): Self = this.set("pushable", value.asInstanceOf[js.Any])
  }
}

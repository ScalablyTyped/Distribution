package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'pusher'> */
@js.native
trait PickImplpusher extends js.Object {
  
  var pusher: String = js.native
}
object PickImplpusher {
  
  @scala.inline
  def apply(pusher: String): PickImplpusher = {
    val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpusher]
  }
  
  @scala.inline
  implicit class PickImplpusherOps[Self <: PickImplpusher] (val x: Self) extends AnyVal {
    
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
    def setPusher(value: String): Self = this.set("pusher", value.asInstanceOf[js.Any])
  }
}

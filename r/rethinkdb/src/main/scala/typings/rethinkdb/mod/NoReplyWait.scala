package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoReplyWait extends js.Object {
  
  var noreplyWait: Boolean = js.native
}
object NoReplyWait {
  
  @scala.inline
  def apply(noreplyWait: Boolean): NoReplyWait = {
    val __obj = js.Dynamic.literal(noreplyWait = noreplyWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoReplyWait]
  }
  
  @scala.inline
  implicit class NoReplyWaitOps[Self <: NoReplyWait] (val x: Self) extends AnyVal {
    
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
    def setNoreplyWait(value: Boolean): Self = this.set("noreplyWait", value.asInstanceOf[js.Any])
  }
}

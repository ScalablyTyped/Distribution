package typings.sentryBrowser.tracekitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTrace extends js.Object {
  
  var failed: js.UndefOr[Boolean] = js.native
  
  var mechanism: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.Array[StackFrame] = js.native
}
object StackTrace {
  
  @scala.inline
  def apply(message: String, name: String, stack: js.Array[StackFrame]): StackTrace = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit class StackTraceOps[Self <: StackTrace] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: StackFrame*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[StackFrame]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: Boolean): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    
    @scala.inline
    def setMechanism(value: String): Self = this.set("mechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMechanism: Self = this.set("mechanism", js.undefined)
  }
}

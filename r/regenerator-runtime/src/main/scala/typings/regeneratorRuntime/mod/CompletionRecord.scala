package typings.regeneratorRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionRecord extends js.Object {
  
  var arg: js.Any = js.native
  
  var `type`: CompletionType = js.native
}
object CompletionRecord {
  
  @scala.inline
  def apply(arg: js.Any, `type`: CompletionType): CompletionRecord = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionRecord]
  }
  
  @scala.inline
  implicit class CompletionRecordOps[Self <: CompletionRecord] (val x: Self) extends AnyVal {
    
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
    def setArg(value: js.Any): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompletionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

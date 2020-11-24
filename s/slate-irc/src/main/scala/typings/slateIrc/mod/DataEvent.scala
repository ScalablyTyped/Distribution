package typings.slateIrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEvent extends js.Object {
  
  var command: String = js.native
  
  var params: String = js.native
  
  var prefix: String = js.native
  
  var string: String = js.native
  
  var trailing: String = js.native
}
object DataEvent {
  
  @scala.inline
  def apply(command: String, params: String, prefix: String, string: String, trailing: String): DataEvent = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
  
  @scala.inline
  implicit class DataEventOps[Self <: DataEvent] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailing(value: String): Self = this.set("trailing", value.asInstanceOf[js.Any])
  }
}

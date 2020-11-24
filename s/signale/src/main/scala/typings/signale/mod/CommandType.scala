package typings.signale.mod

import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandType extends js.Object {
  
  /** The icon corresponding to the logger. */
  var badge: String = js.native
  
  /**
    * The color of the label, can be any of the foreground colors supported by
    * [chalk](https://github.com/chalk/chalk#colors).
    */
  var color: String = js.native
  
  /** The label used to identify the type of the logger. */
  var label: String = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  var stream: js.UndefOr[WriteStream | js.Array[WriteStream]] = js.native
}
object CommandType {
  
  @scala.inline
  def apply(badge: String, color: String, label: String): CommandType = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandType]
  }
  
  @scala.inline
  implicit class CommandTypeOps[Self <: CommandType] (val x: Self) extends AnyVal {
    
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
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setStreamVarargs(value: WriteStream*): Self = this.set("stream", js.Array(value :_*))
    
    @scala.inline
    def setStream(value: WriteStream | js.Array[WriteStream]): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}

package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleMessage extends js.Object {
  
  /** The message arguments. */
  def args(): js.Array[JSHandle[_]] = js.native
  
  /** The location the message originated from */
  def location(): ConsoleMessageLocation = js.native
  
  /** The message text. */
  def text(): String = js.native
  
  def `type`(): ConsoleMessageType = js.native
}
object ConsoleMessage {
  
  @scala.inline
  def apply(
    args: () => js.Array[JSHandle[_]],
    location: () => ConsoleMessageLocation,
    text: () => String,
    `type`: () => ConsoleMessageType
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction0(args), location = js.Any.fromFunction0(location), text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ConsoleMessage]
  }
  
  @scala.inline
  implicit class ConsoleMessageOps[Self <: ConsoleMessage] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: () => js.Array[JSHandle[_]]): Self = this.set("args", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocation(value: () => ConsoleMessageLocation): Self = this.set("location", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => String): Self = this.set("text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: () => ConsoleMessageType): Self = this.set("type", js.Any.fromFunction0(value))
  }
}

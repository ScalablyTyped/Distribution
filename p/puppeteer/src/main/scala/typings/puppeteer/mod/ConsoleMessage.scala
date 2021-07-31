package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleMessage extends StObject {
  
  /** The message arguments. */
  def args(): js.Array[JSHandle[js.Any]]
  
  /** The location the message originated from */
  def location(): ConsoleMessageLocation
  
  /** The message text. */
  def text(): String
  
  def `type`(): ConsoleMessageType
}
object ConsoleMessage {
  
  @scala.inline
  def apply(
    args: () => js.Array[JSHandle[js.Any]],
    location: () => ConsoleMessageLocation,
    text: () => String,
    `type`: () => ConsoleMessageType
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction0(args), location = js.Any.fromFunction0(location), text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ConsoleMessage]
  }
  
  @scala.inline
  implicit class ConsoleMessageMutableBuilder[Self <: ConsoleMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: () => js.Array[JSHandle[js.Any]]): Self = StObject.set(x, "args", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocation(value: () => ConsoleMessageLocation): Self = StObject.set(x, "location", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: () => ConsoleMessageType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}

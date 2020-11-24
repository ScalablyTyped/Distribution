package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validation extends js.Object {
  
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit = js.native
  
  var messages: StringDictionary[String] = js.native
  
  var overrideMessages: Boolean = js.native
}
object Validation {
  
  @scala.inline
  def apply(
    errorFilter: (String, String, String) => Unit,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3(errorFilter), messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
  
  @scala.inline
  implicit class ValidationOps[Self <: Validation] (val x: Self) extends AnyVal {
    
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
    def setErrorFilter(value: (String, String, String) => Unit): Self = this.set("errorFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMessages(value: Boolean): Self = this.set("overrideMessages", value.asInstanceOf[js.Any])
  }
}

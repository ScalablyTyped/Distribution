package typings.ssUtils.ssutils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptional extends js.Object {
  var errorFilter: js.UndefOr[
    js.Function3[/* errorMsg */ String, /* errorCode */ String, /* type */ String, Unit]
  ] = js.native
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  var overrideMessages: js.UndefOr[Boolean] = js.native
}

object ValidationOptional {
  @scala.inline
  def apply(): ValidationOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptional]
  }
  @scala.inline
  implicit class ValidationOptionalOps[Self <: ValidationOptional] (val x: Self) extends AnyVal {
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
    def setErrorFilter(value: (/* errorMsg */ String, /* errorCode */ String, /* type */ String) => Unit): Self = this.set("errorFilter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteErrorFilter: Self = this.set("errorFilter", js.undefined)
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setOverrideMessages(value: Boolean): Self = this.set("overrideMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideMessages: Self = this.set("overrideMessages", js.undefined)
  }
  
}


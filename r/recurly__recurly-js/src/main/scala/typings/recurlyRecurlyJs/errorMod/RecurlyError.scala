package typings.recurlyRecurlyJs.errorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurlyError extends Error {
  var classification: String = js.native
  var code: String = js.native
  var help: js.UndefOr[String] = js.native
}

object RecurlyError {
  @scala.inline
  def apply(classification: String, code: String, message: String, name: String): RecurlyError = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurlyError]
  }
  @scala.inline
  implicit class RecurlyErrorOps[Self <: RecurlyError] (val x: Self) extends AnyVal {
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
    def setClassification(value: String): Self = this.set("classification", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
  }
  
}


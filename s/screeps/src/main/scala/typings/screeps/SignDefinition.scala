package typings.screeps

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignDefinition extends js.Object {
  var datetime: Date = js.native
  var text: String = js.native
  var time: Double = js.native
  var username: String = js.native
}

object SignDefinition {
  @scala.inline
  def apply(datetime: Date, text: String, time: Double, username: String): SignDefinition = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignDefinition]
  }
  @scala.inline
  implicit class SignDefinitionOps[Self <: SignDefinition] (val x: Self) extends AnyVal {
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
    def setDatetime(value: Date): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}


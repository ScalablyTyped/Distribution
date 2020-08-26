package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.EditValidatorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Msg extends js.Object {
  /**
    * A text message explaining the validation result.
    */
  var msg: String = js.native
  /**
    * A text title explaining the validation result.
    */
  var title: String = js.native
  /**
    * One of 'success' or 'error'
    */
  var `type`: EditValidatorType = js.native
}

object Msg {
  @scala.inline
  def apply(msg: String, title: String, `type`: EditValidatorType): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  @scala.inline
  implicit class MsgOps[Self <: Msg] (val x: Self) extends AnyVal {
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
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EditValidatorType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Act extends js.Object {
  var act: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[Boolean] = js.native
  var unknown: js.UndefOr[String] = js.native
}

object Act {
  @scala.inline
  def apply(): Act = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Act]
  }
  @scala.inline
  implicit class ActOps[Self <: Act] (val x: Self) extends AnyVal {
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
    def setAct(value: Boolean): Self = this.set("act", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAct: Self = this.set("act", js.undefined)
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setUnknown(value: String): Self = this.set("unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
  
}


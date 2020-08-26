package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SIGBREAK extends js.Object {
  var SIGBREAK: js.UndefOr[Boolean] = js.native
  var SIGHUP: js.UndefOr[Boolean] = js.native
  var SIGINT: js.UndefOr[Boolean] = js.native
  var SIGTERM: js.UndefOr[Boolean] = js.native
}

object SIGBREAK {
  @scala.inline
  def apply(): SIGBREAK = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SIGBREAK]
  }
  @scala.inline
  implicit class SIGBREAKOps[Self <: SIGBREAK] (val x: Self) extends AnyVal {
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
    def setSIGBREAK(value: Boolean): Self = this.set("SIGBREAK", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIGBREAK: Self = this.set("SIGBREAK", js.undefined)
    @scala.inline
    def setSIGHUP(value: Boolean): Self = this.set("SIGHUP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIGHUP: Self = this.set("SIGHUP", js.undefined)
    @scala.inline
    def setSIGINT(value: Boolean): Self = this.set("SIGINT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIGINT: Self = this.set("SIGINT", js.undefined)
    @scala.inline
    def setSIGTERM(value: Boolean): Self = this.set("SIGTERM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIGTERM: Self = this.set("SIGTERM", js.undefined)
  }
  
}


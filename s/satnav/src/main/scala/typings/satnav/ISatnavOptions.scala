package typings.satnav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISatnavOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var html5: js.UndefOr[Boolean] = js.native
  var matchAll: js.UndefOr[Boolean] = js.native
  var poll: js.UndefOr[Double] = js.native
}

object ISatnavOptions {
  @scala.inline
  def apply(): ISatnavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISatnavOptions]
  }
  @scala.inline
  implicit class ISatnavOptionsOps[Self <: ISatnavOptions] (val x: Self) extends AnyVal {
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setHtml5(value: Boolean): Self = this.set("html5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml5: Self = this.set("html5", js.undefined)
    @scala.inline
    def setMatchAll(value: Boolean): Self = this.set("matchAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchAll: Self = this.set("matchAll", js.undefined)
    @scala.inline
    def setPoll(value: Double): Self = this.set("poll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
  }
  
}


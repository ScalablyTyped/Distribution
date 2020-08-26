package typings.signalr.SignalR.Hub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var logging: js.UndefOr[Boolean] = js.native
  var qs: js.UndefOr[String] = js.native
  var useDefaultPath: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setQs(value: String): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    @scala.inline
    def setUseDefaultPath(value: Boolean): Self = this.set("useDefaultPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDefaultPath: Self = this.set("useDefaultPath", js.undefined)
  }
  
}


package typings.skyway

import typings.std.RTCConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var config: js.UndefOr[RTCConfiguration] = js.native
  var credential: js.UndefOr[Credential] = js.native
  var debug: js.UndefOr[Double] = js.native
  var key: String = js.native
  var turn: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(key: String): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: RTCConfiguration): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setCredential(value: Credential): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    @scala.inline
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setTurn(value: Boolean): Self = this.set("turn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTurn: Self = this.set("turn", js.undefined)
  }
  
}


package typings.reactPlayer.lazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacebookConfig extends js.Object {
  var appId: String = js.native
  var playerId: String = js.native
  var version: String = js.native
}

object FacebookConfig {
  @scala.inline
  def apply(appId: String, playerId: String, version: String): FacebookConfig = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacebookConfig]
  }
  @scala.inline
  implicit class FacebookConfigOps[Self <: FacebookConfig] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerId(value: String): Self = this.set("playerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


package typings.riotGamesApi.RiotGamesAPI.FeaturedGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer extends js.Object {
  var encryptionKey: String = js.native
}

object Observer {
  @scala.inline
  def apply(encryptionKey: String): Observer = {
    val __obj = js.Dynamic.literal(encryptionKey = encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer] (val x: Self) extends AnyVal {
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
    def setEncryptionKey(value: String): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
  }
  
}


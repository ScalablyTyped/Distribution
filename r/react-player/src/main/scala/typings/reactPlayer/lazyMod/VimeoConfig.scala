package typings.reactPlayer.lazyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoConfig extends js.Object {
  var playerOptions: js.UndefOr[js.Object] = js.native
}

object VimeoConfig {
  @scala.inline
  def apply(): VimeoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VimeoConfig]
  }
  @scala.inline
  implicit class VimeoConfigOps[Self <: VimeoConfig] (val x: Self) extends AnyVal {
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
    def setPlayerOptions(value: js.Object): Self = this.set("playerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerOptions: Self = this.set("playerOptions", js.undefined)
  }
  
}


package typings.storybookChannelPostmessage.mod

import typings.storybookChannelPostmessage.storybookChannelPostmessageStrings.manager
import typings.storybookChannelPostmessage.storybookChannelPostmessageStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var page: manager | preview = js.native
}

object Config {
  @scala.inline
  def apply(page: manager | preview): Config = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setPage(value: manager | preview): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}


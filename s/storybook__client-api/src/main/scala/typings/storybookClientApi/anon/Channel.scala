package typings.storybookClientApi.anon

import typings.storybookChannels.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var channel: default | Null = js.native
  var clientApi: typings.storybookClientApi.clientApiMod.default = js.native
  var storyStore: typings.storybookClientApi.storyStoreMod.default = js.native
  def clearDecorators(): Unit = js.native
}

object Channel {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    clientApi: typings.storybookClientApi.clientApiMod.default,
    storyStore: typings.storybookClientApi.storyStoreMod.default
  ): Channel = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), clientApi = clientApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setClearDecorators(value: () => Unit): Self = this.set("clearDecorators", js.Any.fromFunction0(value))
    @scala.inline
    def setClientApi(value: typings.storybookClientApi.clientApiMod.default): Self = this.set("clientApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryStore(value: typings.storybookClientApi.storyStoreMod.default): Self = this.set("storyStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: default): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelNull: Self = this.set("channel", null)
  }
  
}


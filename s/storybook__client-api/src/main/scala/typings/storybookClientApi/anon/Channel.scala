package typings.storybookClientApi.anon

import typings.storybookChannels.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var channel: default | Null
  var clientApi: typings.storybookClientApi.clientApiMod.default
  var storyStore: typings.storybookClientApi.storyStoreMod.default
  def clearDecorators(): Unit
}

object Channel {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    clientApi: typings.storybookClientApi.clientApiMod.default,
    storyStore: typings.storybookClientApi.storyStoreMod.default,
    channel: default = null
  ): Channel = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), clientApi = clientApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}


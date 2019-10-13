package typings.atStorybookClientDashApi

import typings.atStorybookChannels.atStorybookChannelsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: default | Null
  var clientApi: typings.atStorybookClientDashApi.distClientUnderscoreApiMod.default
  var storyStore: typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default
  def clearDecorators(): Unit
}

object Anon_Channel {
  @scala.inline
  def apply(
    clearDecorators: () => Unit,
    clientApi: typings.atStorybookClientDashApi.distClientUnderscoreApiMod.default,
    storyStore: typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default,
    channel: default = null
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(clearDecorators = js.Any.fromFunction0(clearDecorators), clientApi = clientApi, storyStore = storyStore)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[Anon_Channel]
  }
}


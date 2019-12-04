package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.Module
import typings.atStorybookChannels.atStorybookChannelsMod.Channel
import typings.atStorybookChannels.atStorybookChannelsMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/modules/channel", JSImport.Namespace)
@js.native
object distModulesChannelMod extends js.Object {
  @js.native
  trait SubAPI extends js.Object {
    def emit(`type`: String, args: js.Any*): Unit = js.native
    def getChannel(): Channel = js.native
    def off(`type`: String, cb: Listener): Unit = js.native
    def on(`type`: String, cb: Listener): js.Function0[Unit] = js.native
    def on(`type`: String, cb: Listener, peer: Boolean): js.Function0[Unit] = js.native
    def onStory(cb: Listener): Unit = js.native
    def once(`type`: String, cb: Listener): Unit = js.native
  }
  
  def default(hasProvider: Module): Anon_ApiSubAPI = js.native
}


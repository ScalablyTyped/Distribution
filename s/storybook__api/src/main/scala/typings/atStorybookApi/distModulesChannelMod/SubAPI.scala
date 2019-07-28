package typings.atStorybookApi.distModulesChannelMod

import typings.atStorybookChannels.atStorybookChannelsMod.Channel
import typings.atStorybookChannels.atStorybookChannelsMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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


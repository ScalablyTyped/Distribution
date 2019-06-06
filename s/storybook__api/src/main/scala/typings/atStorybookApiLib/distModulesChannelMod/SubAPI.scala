package typings
package atStorybookApiLib.distModulesChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  def emit(`type`: java.lang.String, args: js.Any*): scala.Unit = js.native
  def getChannel(): atStorybookChannelsLib.atStorybookChannelsMod.Channel = js.native
  def off(`type`: java.lang.String, cb: atStorybookChannelsLib.atStorybookChannelsMod.Listener): scala.Unit = js.native
  def on(`type`: java.lang.String, cb: atStorybookChannelsLib.atStorybookChannelsMod.Listener): js.Function0[scala.Unit] = js.native
  def on(
    `type`: java.lang.String,
    cb: atStorybookChannelsLib.atStorybookChannelsMod.Listener,
    peer: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  def onStory(cb: atStorybookChannelsLib.atStorybookChannelsMod.Listener): scala.Unit = js.native
  def once(`type`: java.lang.String, cb: atStorybookChannelsLib.atStorybookChannelsMod.Listener): scala.Unit = js.native
}


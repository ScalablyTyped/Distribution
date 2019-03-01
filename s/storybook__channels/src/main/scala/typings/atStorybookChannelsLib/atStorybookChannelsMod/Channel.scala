package typings
package atStorybookChannelsLib.atStorybookChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def addListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit
  def addPeerListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit
  def emit(
    `type`: atStorybookChannelsLib.EventName,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): scala.Unit
  def eventNames(): js.Array[atStorybookChannelsLib.EventName]
  def listenerCount(`type`: atStorybookChannelsLib.EventName): scala.Double
  def listeners(`type`: atStorybookChannelsLib.EventName): js.Array[atStorybookChannelsLib.Listener]
  def on(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit
  def once(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit
  def prependListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit
  def removeAllListeners(`type`: atStorybookChannelsLib.EventName): scala.Unit
  def removeListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit
}

object Channel {
  @scala.inline
  def apply(
    addListener: js.Function2[atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener, scala.Unit],
    addPeerListener: js.Function2[atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener, scala.Unit],
    emit: js.Function2[atStorybookChannelsLib.EventName, js.Any, scala.Unit],
    eventNames: js.Function0[js.Array[atStorybookChannelsLib.EventName]],
    listenerCount: js.Function1[atStorybookChannelsLib.EventName, scala.Double],
    listeners: js.Function1[atStorybookChannelsLib.EventName, js.Array[atStorybookChannelsLib.Listener]],
    on: js.Function2[atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener, scala.Unit],
    once: js.Function2[atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener, scala.Unit],
    prependListener: js.Function2[atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener, scala.Unit],
    removeAllListeners: js.Function1[atStorybookChannelsLib.EventName, scala.Unit],
    removeListener: js.Function2[atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener, scala.Unit]
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(addListener)
    __obj.updateDynamic("addPeerListener")(addPeerListener)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("eventNames")(eventNames)
    __obj.updateDynamic("listenerCount")(listenerCount)
    __obj.updateDynamic("listeners")(listeners)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("once")(once)
    __obj.updateDynamic("prependListener")(prependListener)
    __obj.updateDynamic("removeAllListeners")(removeAllListeners)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Channel]
  }
}


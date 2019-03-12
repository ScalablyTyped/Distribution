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
    addListener: (atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener) => scala.Unit,
    addPeerListener: (atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener) => scala.Unit,
    emit: (atStorybookChannelsLib.EventName, js.Any) => scala.Unit,
    eventNames: () => js.Array[atStorybookChannelsLib.EventName],
    listenerCount: atStorybookChannelsLib.EventName => scala.Double,
    listeners: atStorybookChannelsLib.EventName => js.Array[atStorybookChannelsLib.Listener],
    on: (atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener) => scala.Unit,
    once: (atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener) => scala.Unit,
    prependListener: (atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener) => scala.Unit,
    removeAllListeners: atStorybookChannelsLib.EventName => scala.Unit,
    removeListener: (atStorybookChannelsLib.EventName, atStorybookChannelsLib.Listener) => scala.Unit
  ): Channel = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPeerListener = js.Any.fromFunction2(addPeerListener), emit = js.Any.fromFunction2(emit), eventNames = js.Any.fromFunction0(eventNames), listenerCount = js.Any.fromFunction1(listenerCount), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener))
  
    __obj.asInstanceOf[Channel]
  }
}


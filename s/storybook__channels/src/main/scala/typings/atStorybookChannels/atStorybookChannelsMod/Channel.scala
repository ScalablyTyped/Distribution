package typings.atStorybookChannels.atStorybookChannelsMod

import typings.atStorybookChannels.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def addListener(`type`: EventName, listener: Listener): Unit
  def addPeerListener(`type`: EventName, listener: Listener): Unit
  def emit(
    `type`: EventName,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit
  def eventNames(): js.Array[EventName]
  def listenerCount(`type`: EventName): Double
  def listeners(`type`: EventName): js.Array[Listener]
  def on(`type`: EventName, listener: Listener): Unit
  def once(`type`: EventName, listener: Listener): Unit
  def prependListener(`type`: EventName, listener: Listener): Unit
  def removeAllListeners(`type`: EventName): Unit
  def removeListener(`type`: EventName, listener: Listener): Unit
}

object Channel {
  @scala.inline
  def apply(
    addListener: (EventName, Listener) => Unit,
    addPeerListener: (EventName, Listener) => Unit,
    emit: (EventName, js.Any) => Unit,
    eventNames: () => js.Array[EventName],
    listenerCount: EventName => Double,
    listeners: EventName => js.Array[Listener],
    on: (EventName, Listener) => Unit,
    once: (EventName, Listener) => Unit,
    prependListener: (EventName, Listener) => Unit,
    removeAllListeners: EventName => Unit,
    removeListener: (EventName, Listener) => Unit
  ): Channel = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPeerListener = js.Any.fromFunction2(addPeerListener), emit = js.Any.fromFunction2(emit), eventNames = js.Any.fromFunction0(eventNames), listenerCount = js.Any.fromFunction1(listenerCount), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener))
  
    __obj.asInstanceOf[Channel]
  }
}


package typings.storybookChannels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/channels", "Channel")
@js.native
class Channel () extends js.Object {
  def this(hasTransportAsync: ChannelArgs) = this()
  var events: js.Any = js.native
  var handleEvent: js.Any = js.native
  val isAsync: Boolean = js.native
  var onceListener: js.Any = js.native
  var sender: js.Any = js.native
  val transport: js.Any = js.native
  def addListener(eventName: String, listener: Listener): Unit = js.native
  def addPeerListener(eventName: String, listener: Listener): Unit = js.native
  def emit(
    eventName: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def eventNames(): js.Array[String] = js.native
  def hasTransport: Boolean = js.native
  def listenerCount(eventName: String): Double = js.native
  def listeners(eventName: String): js.UndefOr[js.Array[Listener]] = js.native
  def off(eventName: String, listener: Listener): Unit = js.native
  def on(eventName: String, listener: Listener): Unit = js.native
  def once(eventName: String, listener: Listener): Unit = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventName: String): Unit = js.native
  def removeListener(eventName: String, listener: Listener): Unit = js.native
}


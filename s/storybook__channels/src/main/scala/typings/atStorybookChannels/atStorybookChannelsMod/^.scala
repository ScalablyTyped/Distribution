package typings.atStorybookChannels.atStorybookChannelsMod

import typings.atStorybookChannels.Anon_Async
import typings.atStorybookChannels.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/channels", JSImport.Namespace)
@js.native
class ^ () extends Channel {
  def this(options: Anon_Async) = this()
  /* CompleteClass */
  override def addListener(`type`: EventName, listener: Listener): Unit = js.native
  /* CompleteClass */
  override def addPeerListener(`type`: EventName, listener: Listener): Unit = js.native
  /* CompleteClass */
  override def emit(
    `type`: EventName,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def eventNames(): js.Array[EventName] = js.native
  /* CompleteClass */
  override def listenerCount(`type`: EventName): Double = js.native
  /* CompleteClass */
  override def listeners(`type`: EventName): js.Array[Listener] = js.native
  /* CompleteClass */
  override def on(`type`: EventName, listener: Listener): Unit = js.native
  /* CompleteClass */
  override def once(`type`: EventName, listener: Listener): Unit = js.native
  /* CompleteClass */
  override def prependListener(`type`: EventName, listener: Listener): Unit = js.native
  /* CompleteClass */
  override def removeAllListeners(`type`: EventName): Unit = js.native
  /* CompleteClass */
  override def removeListener(`type`: EventName, listener: Listener): Unit = js.native
}


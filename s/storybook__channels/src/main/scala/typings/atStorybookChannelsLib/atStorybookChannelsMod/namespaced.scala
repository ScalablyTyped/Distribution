package typings
package atStorybookChannelsLib.atStorybookChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/channels", JSImport.Namespace)
@js.native
class namespaced () extends Channel {
  def this(options: atStorybookChannelsLib.Anon_Async) = this()
  /* CompleteClass */
  override def addListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit = js.native
  /* CompleteClass */
  override def addPeerListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit = js.native
  /* CompleteClass */
  override def emit(
    `type`: atStorybookChannelsLib.EventName,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): scala.Unit = js.native
  /* CompleteClass */
  override def eventNames(): js.Array[atStorybookChannelsLib.EventName] = js.native
  /* CompleteClass */
  override def listenerCount(`type`: atStorybookChannelsLib.EventName): scala.Double = js.native
  /* CompleteClass */
  override def listeners(`type`: atStorybookChannelsLib.EventName): js.Array[atStorybookChannelsLib.Listener] = js.native
  /* CompleteClass */
  override def on(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit = js.native
  /* CompleteClass */
  override def once(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit = js.native
  /* CompleteClass */
  override def prependListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit = js.native
  /* CompleteClass */
  override def removeAllListeners(`type`: atStorybookChannelsLib.EventName): scala.Unit = js.native
  /* CompleteClass */
  override def removeListener(`type`: atStorybookChannelsLib.EventName, listener: atStorybookChannelsLib.Listener): scala.Unit = js.native
}


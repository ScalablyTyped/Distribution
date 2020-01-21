package typings.scChannel.mod

import typings.componentEmitter.mod.Emitter
import typings.scChannel.scChannelStrings.pending
import typings.scChannel.scChannelStrings.subscribed
import typings.scChannel.scChannelStrings.unsubscribed
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-channel", "SCChannel")
@js.native
class SCChannel protected () extends Emitter {
  def this(
    name: String,
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCExchange */ js.Any
  ) = this()
  def this(
    name: String,
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCExchange */ js.Any,
    options: SCChannelOptions
  ) = this()
  val PENDING: pending = js.native
  val SUBSCRIBED: subscribed = js.native
  val UNSUBSCRIBED: unsubscribed = js.native
  var batch: Boolean = js.native
  var data: js.Any = js.native
  var name: String = js.native
  var state: ChannelState = js.native
  var waitForAuth: Boolean = js.native
  def destroy(): Unit = js.native
  def getState(): pending | subscribed | unsubscribed = js.native
  def isSubscribed(): Boolean = js.native
  def isSubscribed(includePending: Boolean): Boolean = js.native
  def publish(data: js.Any): Unit = js.native
  def publish(data: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def setOptions(): Unit = js.native
  def setOptions(options: SCChannelOptions): Unit = js.native
  def subscribe(): Unit = js.native
  def subscribe(options: js.Any): Unit = js.native
  def unsubscribe(): Unit = js.native
  def unwatch(): Unit = js.native
  def unwatch(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify handlerFunction */ js.Any
  ): Unit = js.native
  def watch(
    handler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify handlerFunction */ js.Any
  ): Unit = js.native
  def watchers(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify handlerFunction */ _
  ] = js.native
}


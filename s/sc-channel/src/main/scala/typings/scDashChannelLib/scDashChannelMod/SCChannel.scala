package typings
package scDashChannelLib.scDashChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-channel", "SCChannel")
@js.native
class SCChannel protected ()
  extends componentDashEmitterLib.componentDashEmitterMod.Emitter {
  def this(name: java.lang.String, client: js.Any) = this()
  def this(name: java.lang.String, client: js.Any, options: SCChannelOptions) = this()
  val PENDING: scDashChannelLib.scDashChannelLibStrings.pending = js.native
  val SUBSCRIBED: scDashChannelLib.scDashChannelLibStrings.subscribed = js.native
  val UNSUBSCRIBED: scDashChannelLib.scDashChannelLibStrings.unsubscribed = js.native
  var batch: scala.Boolean = js.native
  var data: js.Any = js.native
  var name: java.lang.String = js.native
  var state: ChannelState = js.native
  var waitForAuth: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def getState(): scDashChannelLib.scDashChannelLibStrings.pending | scDashChannelLib.scDashChannelLibStrings.subscribed | scDashChannelLib.scDashChannelLibStrings.unsubscribed = js.native
  def isSubscribed(): scala.Boolean = js.native
  def isSubscribed(includePending: scala.Boolean): scala.Boolean = js.native
  def publish(data: js.Any): scala.Unit = js.native
  def publish(data: js.Any, callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setOptions(options: SCChannelOptions): scala.Unit = js.native
  def subscribe(): scala.Unit = js.native
  def subscribe(options: js.Any): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unwatch(): scala.Unit = js.native
  def unwatch(handler: js.Any): scala.Unit = js.native
  def watch(handler: js.Any): scala.Unit = js.native
  def watchers(): js.Array[_] = js.native
}


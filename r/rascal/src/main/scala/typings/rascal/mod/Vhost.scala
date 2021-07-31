package typings.rascal.mod

import typings.amqplib.mod.Channel
import typings.amqplib.mod.Connection
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "Vhost")
@js.native
class Vhost () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def borrowChannel(next: js.Function2[/* err */ js.UndefOr[Error], /* channel */ js.UndefOr[Channel], Unit]): Unit = js.native
  
  def borrowConfirmChannel(next: js.Function2[/* err */ js.UndefOr[Error], /* channel */ js.UndefOr[Channel], Unit]): Unit = js.native
  
  def bounce(next: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def connect(next: js.Function2[/* err */ js.UndefOr[Error], /* connection */ js.UndefOr[Connection], Unit]): Unit = js.native
  
  def destroyChannel(channel: Channel): Unit = js.native
  
  def destroyConfirmChannel(channel: Channel): Unit = js.native
  
  def disconnect(next: js.Function2[/* err */ js.UndefOr[Error], /* connection */ js.UndefOr[Connection], Unit]): Unit = js.native
  
  def getChannel(next: js.Function2[/* err */ js.UndefOr[Error], /* channel */ js.UndefOr[Channel], Unit]): Unit = js.native
  
  def getConfirmChannel(next: js.Function2[/* err */ js.UndefOr[Error], /* channel */ js.UndefOr[Channel], Unit]): Unit = js.native
  
  def init(next: js.Function2[/* err */ js.UndefOr[Error], /* vhost */ js.UndefOr[this.type], Unit]): Vhost = js.native
  
  def isPaused(): Boolean = js.native
  
  def nuke(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def purge(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def returnChannel(channel: Channel): Unit = js.native
  
  def returnConfirmChannel(channel: Channel): Unit = js.native
  
  def shutdown(next: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}
/* static members */
object Vhost {
  
  @JSImport("rascal", "Vhost")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    config: VhostConfig,
    next: js.Function2[/* err */ js.UndefOr[Error], /* vhost */ js.UndefOr[this.type], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

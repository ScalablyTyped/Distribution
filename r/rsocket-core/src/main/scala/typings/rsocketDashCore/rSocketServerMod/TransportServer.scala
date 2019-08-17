package typings.rsocketDashCore.rSocketServerMod

import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportServer extends js.Object {
  def start(): Flowable[DuplexConnection]
  def stop(): Unit
}

object TransportServer {
  @scala.inline
  def apply(start: () => Flowable[DuplexConnection], stop: () => Unit): TransportServer = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[TransportServer]
  }
}


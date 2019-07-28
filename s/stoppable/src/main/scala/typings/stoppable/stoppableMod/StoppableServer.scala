package typings.stoppable.stoppableMod

import typings.node.httpMod.Server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoppableServer extends Server {
  def stop(): Unit = js.native
  def stop(callback: js.Function2[/* e */ Error, /* gracefully */ Boolean, Unit]): Unit = js.native
}


package typings
package stoppableLib.stoppableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoppableServer
  extends nodeLib.httpMod.Server {
  def stop(): scala.Unit = js.native
  def stop(callback: js.Function2[/* e */ stdLib.Error, /* gracefully */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}


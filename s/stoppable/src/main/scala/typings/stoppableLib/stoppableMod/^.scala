package typings
package stoppableLib.stoppableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stoppable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(server: nodeLib.httpMod.Server): stoppableLib.stoppableMod.stoppableNs.StoppableServer = js.native
  def apply(server: nodeLib.httpMod.Server, grace: scala.Double): stoppableLib.stoppableMod.stoppableNs.StoppableServer = js.native
}


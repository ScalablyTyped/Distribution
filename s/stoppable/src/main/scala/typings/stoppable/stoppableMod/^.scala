package typings.stoppable.stoppableMod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stoppable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(server: Server): StoppableServer = js.native
  def apply(server: Server, grace: Double): StoppableServer = js.native
}


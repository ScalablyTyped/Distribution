package typings.roads

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads/types/tests/resources/mockServer", JSImport.Namespace)
@js.native
object mockServerMod extends js.Object {
  val port: Double = js.native
  def default(): js.Promise[Server] = js.native
}


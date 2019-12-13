package typings.stickyDashSession

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sticky-session", JSImport.Namespace)
@js.native
object stickyDashSessionMod extends js.Object {
  def listen(server: Server): Boolean = js.native
  def listen(server: Server, port: Double): Boolean = js.native
  def listen(server: Server, port: Double, options: Anon_Env): Boolean = js.native
}


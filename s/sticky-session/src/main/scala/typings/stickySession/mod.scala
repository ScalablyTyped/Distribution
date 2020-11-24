package typings.stickySession

import typings.node.httpMod.Server
import typings.stickySession.anon.Env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sticky-session", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def listen(server: Server): Boolean = js.native
  def listen(server: Server, port: js.UndefOr[scala.Nothing], options: Env): Boolean = js.native
  def listen(server: Server, port: Double): Boolean = js.native
  def listen(server: Server, port: Double, options: Env): Boolean = js.native
}

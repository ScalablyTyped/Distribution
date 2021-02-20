package typings.stickySession

import typings.node.httpMod.Server
import typings.stickySession.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sticky-session", "listen")
  @js.native
  def listen(server: Server): Boolean = js.native
  @JSImport("sticky-session", "listen")
  @js.native
  def listen(server: Server, port: js.UndefOr[scala.Nothing], options: Env): Boolean = js.native
  @JSImport("sticky-session", "listen")
  @js.native
  def listen(server: Server, port: Double): Boolean = js.native
  @JSImport("sticky-session", "listen")
  @js.native
  def listen(server: Server, port: Double, options: Env): Boolean = js.native
}

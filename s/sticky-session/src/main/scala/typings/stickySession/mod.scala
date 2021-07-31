package typings.stickySession

import typings.node.httpMod.Server
import typings.stickySession.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sticky-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def listen(server: Server): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def listen(server: Server, port: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def listen(server: Server, port: Double, options: Env): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def listen(server: Server, port: Unit, options: Env): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

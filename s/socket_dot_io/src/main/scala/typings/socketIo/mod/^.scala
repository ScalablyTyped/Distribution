package typings.socketIo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socket.io", JSImport.Namespace)
@js.native
/**
  * Default Server constructor
  */
class ^ () extends Server {
  /**
    * Creates a new Server
    * @param A parameters object
    */
  def this(opts: ServerOptions) = this()
  /**
    * Creates a new Server
    * @param port A port to bind to, as a number, or a string
    * @param An optional parameters object
    */
  def this(port: String) = this()
  def this(port: Double) = this()
  /**
    * Creates a new Server
    * @param srv The HTTP server that we're going to bind to
    * @param opts An optional parameters object
    */
  def this(srv: typings.node.httpMod.Server) = this()
  def this(srv: typings.node.httpsMod.Server) = this()
  def this(port: String, opts: ServerOptions) = this()
  def this(port: Double, opts: ServerOptions) = this()
  def this(srv: typings.node.httpMod.Server, opts: ServerOptions) = this()
  def this(srv: typings.node.httpsMod.Server, opts: ServerOptions) = this()
}
@JSImport("socket.io", JSImport.Namespace)
@js.native
object ^ extends TopLevel[SocketIOStatic]

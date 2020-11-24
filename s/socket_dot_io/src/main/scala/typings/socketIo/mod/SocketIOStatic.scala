package typings.socketIo.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketIOStatic
  extends /**
  * Creates a new Server
  * @param A parameters object
  */
/**
  * Creates a new Server
  * @param port A port to bind to, as a number, or a string
  * @param An optional parameters object
  */
/**
  * Creates a new Server
  * @param srv The HTTP server that we're going to bind to
  * @param opts An optional parameters object
  */
Instantiable1[
      (/* port */ Double) | (/* srv */ typings.node.httpMod.Server) | (/* srv */ typings.node.httpsMod.Server) | (/* opts */ ServerOptions) | (/* port */ String), 
      Server
    ]
     with /**
  * Default Server constructor
  */
Instantiable0[Server]
     with Instantiable2[
      (/* port */ Double) | (/* srv */ typings.node.httpMod.Server) | (/* srv */ typings.node.httpsMod.Server) | (/* port */ String), 
      /* opts */ ServerOptions, 
      Server
    ] {
  
  /**
    * Default Server constructor
    */
  def apply(): Server = js.native
  /**
    * Creates a new Server
    * @param A parameters object
    */
  def apply(opts: ServerOptions): Server = js.native
  /**
    * Creates a new Server
    * @param port A port to bind to, as a number, or a string
    * @param An optional parameters object
    */
  def apply(port: String): Server = js.native
  def apply(port: String, opts: ServerOptions): Server = js.native
  def apply(port: Double): Server = js.native
  def apply(port: Double, opts: ServerOptions): Server = js.native
  /**
    * Creates a new Server
    * @param srv The HTTP server that we're going to bind to
    * @param opts An optional parameters object
    */
  def apply(srv: typings.node.httpMod.Server): Server = js.native
  def apply(srv: typings.node.httpMod.Server, opts: ServerOptions): Server = js.native
  def apply(srv: typings.node.httpsMod.Server): Server = js.native
  def apply(srv: typings.node.httpsMod.Server, opts: ServerOptions): Server = js.native
  
  /**
    * Default Server constructor
    */
  /**
    * Backwards compatibility
    * @see io().listen()
    */
  def listen(): Server = js.native
  /**
    * Creates a new Server
    * @param A parameters object
    */
  /**
    * Backwards compatibility
    * @see io().listen()
    */
  def listen(opts: ServerOptions): Server = js.native
  /**
    * Creates a new Server
    * @param port A port to bind to, as a number, or a string
    * @param An optional parameters object
    */
  /**
    * Backwards compatibility
    * @see io().listen()
    */
  def listen(port: String): Server = js.native
  def listen(port: String, opts: ServerOptions): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, opts: ServerOptions): Server = js.native
  /**
    * Creates a new Server
    * @param srv The HTTP server that we're going to bind to
    * @param opts An optional parameters object
    */
  /**
    * Backwards compatibility
    * @see io().listen()
    */
  def listen(srv: typings.node.httpMod.Server): Server = js.native
  def listen(srv: typings.node.httpMod.Server, opts: ServerOptions): Server = js.native
  def listen(srv: typings.node.httpsMod.Server): Server = js.native
  def listen(srv: typings.node.httpsMod.Server, opts: ServerOptions): Server = js.native
  /**
    * Backwards compatibility
    * @see io().listen()
    */
  @JSName("listen")
  var listen_Original: SocketIOStatic = js.native
}

package typings.socketDotIo.socketDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketIOStatic extends js.Object {
  /**
  	 * Backwards compatibility
  	 * @see io().listen()
  	 */
  @JSName("listen")
  var listen_Original: SocketIOStatic = js.native
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
  def apply(srv: js.Any): Server = js.native
  def apply(srv: js.Any, opts: ServerOptions): Server = js.native
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
  def listen(srv: js.Any): Server = js.native
  def listen(srv: js.Any, opts: ServerOptions): Server = js.native
}


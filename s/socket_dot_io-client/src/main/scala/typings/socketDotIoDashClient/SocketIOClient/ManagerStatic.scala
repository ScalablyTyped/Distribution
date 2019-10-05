package typings.socketDotIoDashClient.SocketIOClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Manager static interface
	 */
@js.native
trait ManagerStatic
  extends Instantiable2[/* uri */ String, /* opts */ ConnectOpts, Manager]
     with /**
		 * @see default constructor
		 */
Instantiable1[(/* opts */ ConnectOpts) | (/* uri */ String), Manager] {
  /**
  		 * Creates a new Manager with the default URI (window host)
  		 * @param opts Any connection options that we want to use (and pass to engine.io)
  		 */
  def apply(opts: ConnectOpts): Manager = js.native
  /**
  		 * Creates a new Manager
  		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
  		 * @param opts Any connection options that we want to use (and pass to engine.io)
  		 * @return A Manager
  		 */
  def apply(uri: String): Manager = js.native
  def apply(uri: String, opts: ConnectOpts): Manager = js.native
}


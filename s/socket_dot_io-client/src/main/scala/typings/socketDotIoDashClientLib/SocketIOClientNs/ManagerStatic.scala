package typings
package socketDotIoDashClientLib.SocketIOClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The Manager static interface
	 */
@js.native
trait ManagerStatic
  extends /**
		 * @see default constructor
		 */
org.scalablytyped.runtime.Instantiable2[/* uri */ java.lang.String, /* opts */ ConnectOpts, Manager]
     with /**
		 * @see default constructor
		 */
org.scalablytyped.runtime.Instantiable1[(/* uri */ java.lang.String) | (/* opts */ ConnectOpts), Manager] {
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
  def apply(uri: java.lang.String): Manager = js.native
  /**
  		 * Creates a new Manager
  		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
  		 * @param opts Any connection options that we want to use (and pass to engine.io)
  		 * @return A Manager
  		 */
  def apply(uri: java.lang.String, opts: ConnectOpts): Manager = js.native
}


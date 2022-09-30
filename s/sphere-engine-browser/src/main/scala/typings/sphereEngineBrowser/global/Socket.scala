package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an active connection to a remote machine over the TCP protocol.
  */
@JSGlobal("Socket")
@js.native
/**
  * Construct a new socket object. It will start out disconnected and a connection must be
  * initiated manually later.
  */
open class Socket ()
  extends StObject
     with typings.sphereEngineBrowser.Socket {
  /**
    * Construct a new socket and attempt to make a connection. If the connection fails, there is no
    * way to tell; it is recommended to use `Socket.connectTo` instead.
    * @deprecated
    * @param hostName The name or IP address of the remote machine to connect to.
    * @param port     TCP port to connect on. The host must be listening on this port.
    */
  def this(hostName: String, port: Double) = this()
}
object Socket {
  
  @JSGlobal("Socket")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Connect to a host in the background. The promise resolves once the connection has been made.
    * @param hostName The name or IP address of the remote machine to connect to.
    * @param port     TCP port to connect on. The host must be listening on this port.
    */
  /* static member */
  inline def connectTo(hostName: String, port: Double): js.Promise[typings.sphereEngineBrowser.Socket] = (^.asInstanceOf[js.Dynamic].applyDynamic("connectTo")(hostName.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.sphereEngineBrowser.Socket]]
}

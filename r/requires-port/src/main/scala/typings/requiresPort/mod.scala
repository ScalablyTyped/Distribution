package typings.requiresPort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(port: String, protocol: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(port: String, protocol: Protocol): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(port: Double, protocol: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(port: Double, protocol: Protocol): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("requires-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.requiresPort.requiresPortStrings.http
    - typings.requiresPort.requiresPortStrings.https
    - typings.requiresPort.requiresPortStrings.ws
    - typings.requiresPort.requiresPortStrings.wss
    - typings.requiresPort.requiresPortStrings.ftp
    - typings.requiresPort.requiresPortStrings.gopher
    - typings.requiresPort.requiresPortStrings.file
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def file: typings.requiresPort.requiresPortStrings.file = "file".asInstanceOf[typings.requiresPort.requiresPortStrings.file]
    
    inline def ftp: typings.requiresPort.requiresPortStrings.ftp = "ftp".asInstanceOf[typings.requiresPort.requiresPortStrings.ftp]
    
    inline def gopher: typings.requiresPort.requiresPortStrings.gopher = "gopher".asInstanceOf[typings.requiresPort.requiresPortStrings.gopher]
    
    inline def http: typings.requiresPort.requiresPortStrings.http = "http".asInstanceOf[typings.requiresPort.requiresPortStrings.http]
    
    inline def https: typings.requiresPort.requiresPortStrings.https = "https".asInstanceOf[typings.requiresPort.requiresPortStrings.https]
    
    inline def ws: typings.requiresPort.requiresPortStrings.ws = "ws".asInstanceOf[typings.requiresPort.requiresPortStrings.ws]
    
    inline def wss: typings.requiresPort.requiresPortStrings.wss = "wss".asInstanceOf[typings.requiresPort.requiresPortStrings.wss]
  }
}

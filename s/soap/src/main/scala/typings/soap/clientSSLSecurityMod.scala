package typings.soap

import typings.node.bufferMod.global.Buffer
import typings.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientSSLSecurityMod {
  
  @JSImport("soap/lib/security/ClientSSLSecurity", "ClientSSLSecurity")
  @js.native
  open class ClientSSLSecurity protected ()
    extends StObject
       with ISecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, ca: String) = this()
    def this(key: String, cert: String, ca: js.Array[Any]) = this()
    def this(key: String, cert: String, ca: Any) = this()
    def this(key: String, cert: String, ca: Buffer) = this()
    def this(key: String, cert: Buffer, ca: String) = this()
    def this(key: String, cert: Buffer, ca: js.Array[Any]) = this()
    def this(key: String, cert: Buffer, ca: Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer) = this()
    def this(key: Buffer, cert: String, ca: String) = this()
    def this(key: Buffer, cert: String, ca: js.Array[Any]) = this()
    def this(key: Buffer, cert: String, ca: Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer) = this()
    def this(key: Buffer, cert: Buffer, ca: String) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[Any]) = this()
    def this(key: Buffer, cert: Buffer, ca: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
    def this(key: String, cert: String, ca: String, defaults: Any) = this()
    def this(key: String, cert: String, ca: js.Array[Any], defaults: Any) = this()
    def this(key: String, cert: String, ca: Any, defaults: Any) = this()
    def this(key: String, cert: String, ca: Unit, defaults: Any) = this()
    def this(key: String, cert: String, ca: Buffer, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: String, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Any, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Unit, defaults: Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: String, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[Any], defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Any, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Unit, defaults: Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: String, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[Any], defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Any, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Unit, defaults: Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: Any) = this()
    
    @JSName("addOptions")
    def addOptions_MClientSSLSecurity(options: Any): Unit = js.native
    
    /* private */ var agent: Any = js.native
    
    /* private */ var ca: Any = js.native
    
    /* private */ var cert: Any = js.native
    
    /* private */ var defaults: Any = js.native
    
    /* private */ var key: Any = js.native
    
    @JSName("toXML")
    def toXML_MClientSSLSecurity(): String = js.native
  }
}

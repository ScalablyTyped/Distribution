package typings.soap

import typings.node.Buffer
import typings.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientSSLSecurityMod {
  
  @JSImport("soap/lib/security/ClientSSLSecurity", "ClientSSLSecurity")
  @js.native
  class ClientSSLSecurity protected () extends ISecurity {
    def this(key: String, cert: String) = this()
    def this(key: String, cert: Buffer) = this()
    def this(key: Buffer, cert: String) = this()
    def this(key: Buffer, cert: Buffer) = this()
    def this(key: String, cert: String, ca: String) = this()
    def this(key: String, cert: String, ca: js.Any) = this()
    def this(key: String, cert: String, ca: js.Array[_]) = this()
    def this(key: String, cert: String, ca: Buffer) = this()
    def this(key: String, cert: Buffer, ca: String) = this()
    def this(key: String, cert: Buffer, ca: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[_]) = this()
    def this(key: String, cert: Buffer, ca: Buffer) = this()
    def this(key: Buffer, cert: String, ca: String) = this()
    def this(key: Buffer, cert: String, ca: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[_]) = this()
    def this(key: Buffer, cert: String, ca: Buffer) = this()
    def this(key: Buffer, cert: Buffer, ca: String) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[_]) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer) = this()
    def this(key: String, cert: String, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: String, cert: String, ca: String, defaults: js.Any) = this()
    def this(key: String, cert: String, ca: js.Any, defaults: js.Any) = this()
    def this(key: String, cert: String, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: String, cert: String, ca: Buffer, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: String, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.Any, defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: String, cert: Buffer, ca: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.Any, defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: Buffer, cert: String, ca: Buffer, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.UndefOr[scala.Nothing], defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: String, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Any, defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: js.Array[_], defaults: js.Any) = this()
    def this(key: Buffer, cert: Buffer, ca: Buffer, defaults: js.Any) = this()
    
    @JSName("addOptions")
    def addOptions_MClientSSLSecurity(options: js.Any): Unit = js.native
    
    var agent: js.Any = js.native
    
    var ca: js.Any = js.native
    
    var cert: js.Any = js.native
    
    var defaults: js.Any = js.native
    
    var key: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MClientSSLSecurity(): String = js.native
  }
}

package typings.soap

import typings.soap.libTypesMod.IHeaders
import typings.soap.libTypesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityBasicAuthSecurityMod {
  
  @JSImport("soap/lib/security/BasicAuthSecurity", "BasicAuthSecurity")
  @js.native
  open class BasicAuthSecurity protected ()
    extends StObject
       with ISecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: Any) = this()
    
    /* private */ var _password: Any = js.native
    
    /* private */ var _username: Any = js.native
    
    @JSName("addHeaders")
    def addHeaders_MBasicAuthSecurity(headers: IHeaders): Unit = js.native
    
    @JSName("addOptions")
    def addOptions_MBasicAuthSecurity(options: Any): Unit = js.native
    
    /* private */ var defaults: Any = js.native
    
    @JSName("toXML")
    def toXML_MBasicAuthSecurity(): String = js.native
  }
}

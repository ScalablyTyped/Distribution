package typings.soap

import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicAuthSecurityMod {
  
  @JSImport("soap/lib/security/BasicAuthSecurity", "BasicAuthSecurity")
  @js.native
  class BasicAuthSecurity protected ()
    extends StObject
       with ISecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: js.Any) = this()
    
    var _password: js.Any = js.native
    
    var _username: js.Any = js.native
    
    @JSName("addHeaders")
    def addHeaders_MBasicAuthSecurity(headers: IHeaders): Unit = js.native
    
    @JSName("addOptions")
    def addOptions_MBasicAuthSecurity(options: js.Any): Unit = js.native
    
    var defaults: js.Any = js.native
    
    @JSName("toXML")
    def toXML_MBasicAuthSecurity(): String = js.native
  }
}

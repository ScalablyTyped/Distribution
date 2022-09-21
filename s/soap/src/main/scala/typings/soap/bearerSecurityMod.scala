package typings.soap

import typings.soap.typesMod.IHeaders
import typings.soap.typesMod.ISecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bearerSecurityMod {
  
  @JSImport("soap/lib/security/BearerSecurity", "BearerSecurity")
  @js.native
  open class BearerSecurity protected ()
    extends StObject
       with ISecurity {
    def this(token: String) = this()
    def this(token: String, defaults: Any) = this()
    
    /* private */ var _token: Any = js.native
    
    @JSName("addHeaders")
    def addHeaders_MBearerSecurity(headers: IHeaders): Unit = js.native
    
    @JSName("addOptions")
    def addOptions_MBearerSecurity(options: Any): Unit = js.native
    
    /* private */ var defaults: Any = js.native
    
    @JSName("toXML")
    def toXML_MBearerSecurity(): String = js.native
  }
}

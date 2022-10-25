package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anonymous extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var outbound: js.UndefOr[Boolean] = js.undefined
  
  var register: js.UndefOr[Boolean] = js.undefined
}
object Anonymous {
  
  inline def apply(): Anonymous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anonymous]
  }
  
  extension [Self <: Anonymous](x: Self) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setOutbound(value: Boolean): Self = StObject.set(x, "outbound", value.asInstanceOf[js.Any])
    
    inline def setOutboundUndefined: Self = StObject.set(x, "outbound", js.undefined)
    
    inline def setRegister(value: Boolean): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}

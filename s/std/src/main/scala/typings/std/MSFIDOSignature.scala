package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSFIDOSignature extends StObject {
  
  val authnrData: java.lang.String
  
  val clientData: java.lang.String
  
  val signature: java.lang.String
}
object MSFIDOSignature {
  
  inline def apply(authnrData: java.lang.String, clientData: java.lang.String, signature: java.lang.String): MSFIDOSignature = {
    val __obj = js.Dynamic.literal(authnrData = authnrData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignature]
  }
  
  extension [Self <: MSFIDOSignature](x: Self) {
    
    inline def setAuthnrData(value: java.lang.String): Self = StObject.set(x, "authnrData", value.asInstanceOf[js.Any])
    
    inline def setClientData(value: java.lang.String): Self = StObject.set(x, "clientData", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: java.lang.String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}

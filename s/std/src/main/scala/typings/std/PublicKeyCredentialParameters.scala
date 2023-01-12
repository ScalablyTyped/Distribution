package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialParameters extends StObject {
  
  /* standard dom */
  var alg: COSEAlgorithmIdentifier
  
  /* standard dom */
  var `type`: PublicKeyCredentialType
}
object PublicKeyCredentialParameters {
  
  inline def apply(alg: COSEAlgorithmIdentifier, `type`: PublicKeyCredentialType): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialParameters] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: COSEAlgorithmIdentifier): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setType(value: PublicKeyCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

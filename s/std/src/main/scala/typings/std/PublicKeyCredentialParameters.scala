package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialParameters extends StObject {
  
  var alg: COSEAlgorithmIdentifier = js.native
  
  var `type`: PublicKeyCredentialType = js.native
}
object PublicKeyCredentialParameters {
  
  @scala.inline
  def apply(alg: COSEAlgorithmIdentifier, `type`: PublicKeyCredentialType): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialParametersMutableBuilder[Self <: PublicKeyCredentialParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: COSEAlgorithmIdentifier): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PublicKeyCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

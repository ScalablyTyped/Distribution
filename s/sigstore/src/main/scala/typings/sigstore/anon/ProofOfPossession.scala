package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofOfPossession extends StObject {
  
  var proofOfPossession: String
  
  var publicKey: Algorithm
}
object ProofOfPossession {
  
  inline def apply(proofOfPossession: String, publicKey: Algorithm): ProofOfPossession = {
    val __obj = js.Dynamic.literal(proofOfPossession = proofOfPossession.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofOfPossession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProofOfPossession] (val x: Self) extends AnyVal {
    
    inline def setProofOfPossession(value: String): Self = StObject.set(x, "proofOfPossession", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: Algorithm): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}

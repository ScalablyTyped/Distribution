package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatParams
  extends StObject
     with Algorithm {
  
  var algorithmId: Uint8Array
  
  var hash: js.UndefOr[java.lang.String | Algorithm] = js.undefined
  
  var partyUInfo: Uint8Array
  
  var partyVInfo: Uint8Array
  
  var privateInfo: js.UndefOr[Uint8Array] = js.undefined
  
  var publicInfo: js.UndefOr[Uint8Array] = js.undefined
}
object ConcatParams {
  
  inline def apply(algorithmId: Uint8Array, name: java.lang.String, partyUInfo: Uint8Array, partyVInfo: Uint8Array): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
  
  extension [Self <: ConcatParams](x: Self) {
    
    inline def setAlgorithmId(value: Uint8Array): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
    
    inline def setHash(value: java.lang.String | Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setPartyUInfo(value: Uint8Array): Self = StObject.set(x, "partyUInfo", value.asInstanceOf[js.Any])
    
    inline def setPartyVInfo(value: Uint8Array): Self = StObject.set(x, "partyVInfo", value.asInstanceOf[js.Any])
    
    inline def setPrivateInfo(value: Uint8Array): Self = StObject.set(x, "privateInfo", value.asInstanceOf[js.Any])
    
    inline def setPrivateInfoUndefined: Self = StObject.set(x, "privateInfo", js.undefined)
    
    inline def setPublicInfo(value: Uint8Array): Self = StObject.set(x, "publicInfo", value.asInstanceOf[js.Any])
    
    inline def setPublicInfoUndefined: Self = StObject.set(x, "publicInfo", js.undefined)
  }
}

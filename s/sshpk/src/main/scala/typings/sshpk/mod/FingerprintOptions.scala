package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FingerprintOptions extends StObject {
  
  var algorithm: AlgorithmHashType
  
  var hash: Buffer
  
  var hashType: js.UndefOr[FingerprintHashType] = js.undefined
  
  var `type`: FingerprintType
}
object FingerprintOptions {
  
  inline def apply(algorithm: AlgorithmHashType, hash: Buffer, `type`: FingerprintType): FingerprintOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FingerprintOptions]
  }
  
  extension [Self <: FingerprintOptions](x: Self) {
    
    inline def setAlgorithm(value: AlgorithmHashType): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashType(value: FingerprintHashType): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
    
    inline def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    
    inline def setType(value: FingerprintType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

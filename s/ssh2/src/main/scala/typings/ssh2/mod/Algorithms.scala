package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithms extends StObject {
  
  var cipher: js.UndefOr[AlgorithmList[CipherAlgorithm]] = js.undefined
  
  var compress: js.UndefOr[AlgorithmList[CompressionAlgorithm]] = js.undefined
  
  var hmac: js.UndefOr[AlgorithmList[MacAlgorithm]] = js.undefined
  
  var kex: js.UndefOr[AlgorithmList[KexAlgorithm]] = js.undefined
  
  var serverHostKey: js.UndefOr[AlgorithmList[ServerHostKeyAlgorithm]] = js.undefined
}
object Algorithms {
  
  inline def apply(): Algorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithms]
  }
  
  extension [Self <: Algorithms](x: Self) {
    
    inline def setCipher(value: AlgorithmList[CipherAlgorithm]): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    inline def setCipherVarargs(value: CipherAlgorithm*): Self = StObject.set(x, "cipher", js.Array(value*))
    
    inline def setCompress(value: AlgorithmList[CompressionAlgorithm]): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setCompressVarargs(value: CompressionAlgorithm*): Self = StObject.set(x, "compress", js.Array(value*))
    
    inline def setHmac(value: AlgorithmList[MacAlgorithm]): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
    
    inline def setHmacUndefined: Self = StObject.set(x, "hmac", js.undefined)
    
    inline def setHmacVarargs(value: MacAlgorithm*): Self = StObject.set(x, "hmac", js.Array(value*))
    
    inline def setKex(value: AlgorithmList[KexAlgorithm]): Self = StObject.set(x, "kex", value.asInstanceOf[js.Any])
    
    inline def setKexUndefined: Self = StObject.set(x, "kex", js.undefined)
    
    inline def setKexVarargs(value: KexAlgorithm*): Self = StObject.set(x, "kex", js.Array(value*))
    
    inline def setServerHostKey(value: AlgorithmList[ServerHostKeyAlgorithm]): Self = StObject.set(x, "serverHostKey", value.asInstanceOf[js.Any])
    
    inline def setServerHostKeyUndefined: Self = StObject.set(x, "serverHostKey", js.undefined)
    
    inline def setServerHostKeyVarargs(value: ServerHostKeyAlgorithm*): Self = StObject.set(x, "serverHostKey", js.Array(value*))
  }
}

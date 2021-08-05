package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
trait CryptoKey extends StObject {
  
  val algorithm: KeyAlgorithm
  
  val extractable: scala.Boolean
  
  val `type`: KeyType
  
  val usages: js.Array[KeyUsage]
}
object CryptoKey {
  
  inline def apply(algorithm: KeyAlgorithm, extractable: scala.Boolean, `type`: KeyType, usages: js.Array[KeyUsage]): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  extension [Self <: CryptoKey](x: Self) {
    
    inline def setAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setExtractable(value: scala.Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
    
    inline def setType(value: KeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsages(value: js.Array[KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "usages", js.Array(value :_*))
  }
}

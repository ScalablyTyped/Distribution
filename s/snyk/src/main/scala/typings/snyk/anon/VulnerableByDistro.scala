package typings.snyk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnerableByDistro extends StObject {
  
  var vulnerable: String | js.Array[String]
  
  var vulnerableByDistro: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var vulnerableHashes: js.UndefOr[js.Array[String]] = js.undefined
}
object VulnerableByDistro {
  
  inline def apply(vulnerable: String | js.Array[String]): VulnerableByDistro = {
    val __obj = js.Dynamic.literal(vulnerable = vulnerable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VulnerableByDistro]
  }
  
  extension [Self <: VulnerableByDistro](x: Self) {
    
    inline def setVulnerable(value: String | js.Array[String]): Self = StObject.set(x, "vulnerable", value.asInstanceOf[js.Any])
    
    inline def setVulnerableByDistro(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "vulnerableByDistro", value.asInstanceOf[js.Any])
    
    inline def setVulnerableByDistroUndefined: Self = StObject.set(x, "vulnerableByDistro", js.undefined)
    
    inline def setVulnerableHashes(value: js.Array[String]): Self = StObject.set(x, "vulnerableHashes", value.asInstanceOf[js.Any])
    
    inline def setVulnerableHashesUndefined: Self = StObject.set(x, "vulnerableHashes", js.undefined)
    
    inline def setVulnerableHashesVarargs(value: String*): Self = StObject.set(x, "vulnerableHashes", js.Array(value*))
    
    inline def setVulnerableVarargs(value: String*): Self = StObject.set(x, "vulnerable", js.Array(value*))
  }
}

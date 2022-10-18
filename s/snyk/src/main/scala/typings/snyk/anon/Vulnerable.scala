package typings.snyk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vulnerable extends StObject {
  
  var vulnerable: String | js.Array[String]
  
  var vulnerable_by_distro: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var vulnerable_hashes: js.UndefOr[js.Array[String]] = js.undefined
}
object Vulnerable {
  
  inline def apply(vulnerable: String | js.Array[String]): Vulnerable = {
    val __obj = js.Dynamic.literal(vulnerable = vulnerable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vulnerable]
  }
  
  extension [Self <: Vulnerable](x: Self) {
    
    inline def setVulnerable(value: String | js.Array[String]): Self = StObject.set(x, "vulnerable", value.asInstanceOf[js.Any])
    
    inline def setVulnerableVarargs(value: String*): Self = StObject.set(x, "vulnerable", js.Array(value*))
    
    inline def setVulnerable_by_distro(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "vulnerable_by_distro", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_by_distroUndefined: Self = StObject.set(x, "vulnerable_by_distro", js.undefined)
    
    inline def setVulnerable_hashes(value: js.Array[String]): Self = StObject.set(x, "vulnerable_hashes", value.asInstanceOf[js.Any])
    
    inline def setVulnerable_hashesUndefined: Self = StObject.set(x, "vulnerable_hashes", js.undefined)
    
    inline def setVulnerable_hashesVarargs(value: String*): Self = StObject.set(x, "vulnerable_hashes", js.Array(value*))
  }
}

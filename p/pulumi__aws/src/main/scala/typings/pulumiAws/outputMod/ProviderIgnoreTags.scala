package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderIgnoreTags extends StObject {
  
  var keyPrefixes: js.UndefOr[js.Array[String]] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
}
object ProviderIgnoreTags {
  
  inline def apply(): ProviderIgnoreTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderIgnoreTags]
  }
  
  extension [Self <: ProviderIgnoreTags](x: Self) {
    
    inline def setKeyPrefixes(value: js.Array[String]): Self = StObject.set(x, "keyPrefixes", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixesUndefined: Self = StObject.set(x, "keyPrefixes", js.undefined)
    
    inline def setKeyPrefixesVarargs(value: String*): Self = StObject.set(x, "keyPrefixes", js.Array(value :_*))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}

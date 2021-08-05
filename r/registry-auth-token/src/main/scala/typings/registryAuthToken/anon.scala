package typings.registryAuthToken

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictregistryUrls
    extends StObject
       with /**
    * Registry url's with token information
    */
  /* registryUrls */ StringDictionary[js.UndefOr[String]] {
    
    /**
      * A registry url used for matching
      */
    var registry: js.UndefOr[String] = js.undefined
  }
  object DictregistryUrls {
    
    inline def apply(): DictregistryUrls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictregistryUrls]
    }
    
    extension [Self <: DictregistryUrls](x: Self) {
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}

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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DictregistryUrls] (val x: Self) extends AnyVal {
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  /* Inlined std.Pick<registry-auth-token.registry-auth-token.AuthOptions, 'npmrc'> */
  trait PickAuthOptionsnpmrc extends StObject {
    
    var npmrc: js.UndefOr[DictregistryUrls] = js.undefined
  }
  object PickAuthOptionsnpmrc {
    
    inline def apply(): PickAuthOptionsnpmrc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAuthOptionsnpmrc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickAuthOptionsnpmrc] (val x: Self) extends AnyVal {
      
      inline def setNpmrc(value: DictregistryUrls): Self = StObject.set(x, "npmrc", value.asInstanceOf[js.Any])
      
      inline def setNpmrcUndefined: Self = StObject.set(x, "npmrc", js.undefined)
    }
  }
}

package typings.stellarSdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stellarTomlResolverMod {
  
  @JSImport("stellar-sdk/lib/stellar_toml_resolver", "STELLAR_TOML_MAX_SIZE")
  @js.native
  val STELLAR_TOML_MAX_SIZE: Double = js.native
  
  @JSImport("stellar-sdk/lib/stellar_toml_resolver", "StellarTomlResolver")
  @js.native
  class StellarTomlResolver () extends StObject
  /* static members */
  object StellarTomlResolver {
    
    @JSImport("stellar-sdk/lib/stellar_toml_resolver", "StellarTomlResolver.resolve")
    @js.native
    def resolve(domain: String): js.Promise[StringDictionary[_]] = js.native
    @JSImport("stellar-sdk/lib/stellar_toml_resolver", "StellarTomlResolver.resolve")
    @js.native
    def resolve(domain: String, opts: StellarTomlResolveOptions): js.Promise[StringDictionary[_]] = js.native
    
    @js.native
    trait StellarTomlResolveOptions extends StObject {
      
      var allowHttp: js.UndefOr[Boolean] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
    }
    object StellarTomlResolveOptions {
      
      @scala.inline
      def apply(): StellarTomlResolveOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StellarTomlResolveOptions]
      }
      
      @scala.inline
      implicit class StellarTomlResolveOptionsMutableBuilder[Self <: StellarTomlResolveOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowHttp(value: Boolean): Self = StObject.set(x, "allowHttp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowHttpUndefined: Self = StObject.set(x, "allowHttp", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
  }
}

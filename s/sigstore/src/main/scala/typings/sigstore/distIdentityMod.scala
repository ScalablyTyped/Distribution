package typings.sigstore

import typings.sigstore.anon.ClientID
import typings.sigstore.distIdentityProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIdentityMod {
  
  object default {
    
    @JSImport("sigstore/dist/identity", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def ciContextProvider(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("ciContextProvider")().asInstanceOf[Provider]
    inline def ciContextProvider(audience: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("ciContextProvider")(audience.asInstanceOf[js.Any]).asInstanceOf[Provider]
    @JSImport("sigstore/dist/identity", "default.ciContextProvider")
    @js.native
    def ciContextProvider_Fdefault: js.Function1[/* audience */ js.UndefOr[String], Provider] = js.native
    
    inline def ciContextProvider_Fdefault_=(x: js.Function1[/* audience */ js.UndefOr[String], Provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ciContextProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/identity", "default.oauthProvider")
    @js.native
    def oauthProvider: js.Function1[/* options */ ClientID, Provider] = js.native
    inline def oauthProvider(options: ClientID): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("oauthProvider")(options.asInstanceOf[js.Any]).asInstanceOf[Provider]
    inline def oauthProvider_=(x: js.Function1[/* options */ ClientID, Provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthProvider")(x.asInstanceOf[js.Any])
  }
}

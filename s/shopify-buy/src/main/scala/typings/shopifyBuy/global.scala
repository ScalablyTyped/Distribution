package typings.shopifyBuy

import typings.shopifyBuy.ShopifyBuy.Client
import typings.shopifyBuy.ShopifyBuy.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ShopifyBuy {
    
    @JSGlobal("ShopifyBuy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ShopifyBuy.NO_IMAGE_URI")
    @js.native
    def NO_IMAGE_URI: String = js.native
    inline def NO_IMAGE_URI_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_IMAGE_URI")(x.asInstanceOf[js.Any])
    
    inline def buildClient(config: Config): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClient")(config.asInstanceOf[js.Any]).asInstanceOf[Client]
  }
}

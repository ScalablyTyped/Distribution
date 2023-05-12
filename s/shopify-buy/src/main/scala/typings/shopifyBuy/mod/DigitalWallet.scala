package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DigitalWallet extends StObject
@JSImport("shopify-buy", "DigitalWallet")
@js.native
object DigitalWallet extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DigitalWallet & String] = js.native
  
  @js.native
  sealed trait ANDROID_PAY
    extends StObject
       with DigitalWallet
  /* "ANDROID_PAY" */ val ANDROID_PAY: typings.shopifyBuy.mod.DigitalWallet.ANDROID_PAY & String = js.native
  
  @js.native
  sealed trait APPLE_PAY
    extends StObject
       with DigitalWallet
  /* "APPLE_PAY" */ val APPLE_PAY: typings.shopifyBuy.mod.DigitalWallet.APPLE_PAY & String = js.native
  
  @js.native
  sealed trait FACEBOOK_PAY
    extends StObject
       with DigitalWallet
  /* "FACEBOOK_PAY" */ val FACEBOOK_PAY: typings.shopifyBuy.mod.DigitalWallet.FACEBOOK_PAY & String = js.native
  
  @js.native
  sealed trait GOOGLE_PAY
    extends StObject
       with DigitalWallet
  /* "GOOGLE_PAY" */ val GOOGLE_PAY: typings.shopifyBuy.mod.DigitalWallet.GOOGLE_PAY & String = js.native
  
  @js.native
  sealed trait SHOPIFY_PAY
    extends StObject
       with DigitalWallet
  /* "SHOPIFY_PAY" */ val SHOPIFY_PAY: typings.shopifyBuy.mod.DigitalWallet.SHOPIFY_PAY & String = js.native
}

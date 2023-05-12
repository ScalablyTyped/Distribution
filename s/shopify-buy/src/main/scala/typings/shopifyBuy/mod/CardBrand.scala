package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardBrand extends StObject
@JSImport("shopify-buy", "CardBrand")
@js.native
object CardBrand extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardBrand & String] = js.native
  
  @js.native
  sealed trait AMERICAN_EXPRESS
    extends StObject
       with CardBrand
  /* "AMERICAN_EXPRESS" */ val AMERICAN_EXPRESS: typings.shopifyBuy.mod.CardBrand.AMERICAN_EXPRESS & String = js.native
  
  @js.native
  sealed trait DINERS_CLUB
    extends StObject
       with CardBrand
  /* "DINERS_CLUB" */ val DINERS_CLUB: typings.shopifyBuy.mod.CardBrand.DINERS_CLUB & String = js.native
  
  @js.native
  sealed trait DISCOVER
    extends StObject
       with CardBrand
  /* "DISCOVER" */ val DISCOVER: typings.shopifyBuy.mod.CardBrand.DISCOVER & String = js.native
  
  @js.native
  sealed trait ELO
    extends StObject
       with CardBrand
  /* "ELO" */ val ELO: typings.shopifyBuy.mod.CardBrand.ELO & String = js.native
  
  @js.native
  sealed trait JCB
    extends StObject
       with CardBrand
  /* "JCB" */ val JCB: typings.shopifyBuy.mod.CardBrand.JCB & String = js.native
  
  @js.native
  sealed trait MASTERCARD
    extends StObject
       with CardBrand
  /* "MASTERCARD" */ val MASTERCARD: typings.shopifyBuy.mod.CardBrand.MASTERCARD & String = js.native
  
  @js.native
  sealed trait UNIONPAY
    extends StObject
       with CardBrand
  /* "UNIONPAY" */ val UNIONPAY: typings.shopifyBuy.mod.CardBrand.UNIONPAY & String = js.native
  
  @js.native
  sealed trait VISA
    extends StObject
       with CardBrand
  /* "VISA" */ val VISA: typings.shopifyBuy.mod.CardBrand.VISA & String = js.native
}

package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeliveryMethodType extends StObject
@JSImport("shopify-buy", "DeliveryMethodType")
@js.native
object DeliveryMethodType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeliveryMethodType & String] = js.native
  
  @js.native
  sealed trait LOCAL
    extends StObject
       with DeliveryMethodType
  /* "LOCAL" */ val LOCAL: typings.shopifyBuy.mod.DeliveryMethodType.LOCAL & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with DeliveryMethodType
  /* "NONE" */ val NONE: typings.shopifyBuy.mod.DeliveryMethodType.NONE & String = js.native
  
  @js.native
  sealed trait PICKUP_POINT
    extends StObject
       with DeliveryMethodType
  /* "PICKUP_POINT" */ val PICKUP_POINT: typings.shopifyBuy.mod.DeliveryMethodType.PICKUP_POINT & String = js.native
  
  @js.native
  sealed trait PICK_UP
    extends StObject
       with DeliveryMethodType
  /* "PICK_UP" */ val PICK_UP: typings.shopifyBuy.mod.DeliveryMethodType.PICK_UP & String = js.native
  
  @js.native
  sealed trait RETAIL
    extends StObject
       with DeliveryMethodType
  /* "RETAIL" */ val RETAIL: typings.shopifyBuy.mod.DeliveryMethodType.RETAIL & String = js.native
  
  @js.native
  sealed trait SHIPPING
    extends StObject
       with DeliveryMethodType
  /* "SHIPPING" */ val SHIPPING: typings.shopifyBuy.mod.DeliveryMethodType.SHIPPING & String = js.native
}

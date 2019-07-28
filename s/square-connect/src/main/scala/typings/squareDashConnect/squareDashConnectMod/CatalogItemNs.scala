package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItem")
@js.native
object CatalogItemNs extends js.Object {
  @js.native
  sealed trait ProductTypeEnum extends js.Object
  
  @js.native
  object ProductTypeEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS_SERVICE extends ProductTypeEnum
    
    @js.native
    sealed trait GIFT_CARD extends ProductTypeEnum
    
    @js.native
    sealed trait REGULAR extends ProductTypeEnum
    
    @js.native
    sealed trait RESTAURANT_ITEM extends ProductTypeEnum
    
    @js.native
    sealed trait RETAIL_ITEM extends ProductTypeEnum
    
    /* "APPOINTMENTS_SERVICE" */ val APPOINTMENTS_SERVICE: typings.squareDashConnect.squareDashConnectMod.CatalogItemNs.ProductTypeEnum.APPOINTMENTS_SERVICE with String = js.native
    /* "GIFT_CARD" */ val GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.CatalogItemNs.ProductTypeEnum.GIFT_CARD with String = js.native
    /* "REGULAR" */ val REGULAR: typings.squareDashConnect.squareDashConnectMod.CatalogItemNs.ProductTypeEnum.REGULAR with String = js.native
    /* "RESTAURANT_ITEM" */ val RESTAURANT_ITEM: typings.squareDashConnect.squareDashConnectMod.CatalogItemNs.ProductTypeEnum.RESTAURANT_ITEM with String = js.native
    /* "RETAIL_ITEM" */ val RETAIL_ITEM: typings.squareDashConnect.squareDashConnectMod.CatalogItemNs.ProductTypeEnum.RETAIL_ITEM with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ProductTypeEnum with String] = js.native
  }
  
}


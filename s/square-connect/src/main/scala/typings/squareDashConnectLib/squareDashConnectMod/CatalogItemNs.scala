package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait APPOINTMENTS_SERVICE
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait GIFT_CARD
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait REGULAR
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait RESTAURANT_ITEM
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait RETAIL_ITEM
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    /* "APPOINTMENTS_SERVICE" */ val APPOINTMENTS_SERVICE: APPOINTMENTS_SERVICE with java.lang.String = js.native
    /* "GIFT_CARD" */ val GIFT_CARD: GIFT_CARD with java.lang.String = js.native
    /* "REGULAR" */ val REGULAR: REGULAR with java.lang.String = js.native
    /* "RESTAURANT_ITEM" */ val RESTAURANT_ITEM: RESTAURANT_ITEM with java.lang.String = js.native
    /* "RETAIL_ITEM" */ val RETAIL_ITEM: RETAIL_ITEM with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum with java.lang.String
      ] = js.native
  }
  
}


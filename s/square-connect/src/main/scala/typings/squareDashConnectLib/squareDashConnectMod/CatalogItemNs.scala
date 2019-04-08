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
    sealed trait APPOINTMENTSSERVICE
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait GIFTCARD
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait REGULAR
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait RESTAURANTITEM
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    @js.native
    sealed trait RETAILITEM
      extends squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum
    
    /* "APPOINTMENTS_SERVICE" */ val APPOINTMENTSSERVICE: APPOINTMENTSSERVICE with java.lang.String = js.native
    /* "GIFT_CARD" */ val GIFTCARD: GIFTCARD with java.lang.String = js.native
    /* "REGULAR" */ val REGULAR: REGULAR with java.lang.String = js.native
    /* "RESTAURANT_ITEM" */ val RESTAURANTITEM: RESTAURANTITEM with java.lang.String = js.native
    /* "RETAIL_ITEM" */ val RETAILITEM: RETAILITEM with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogItemNs.ProductTypeEnum with java.lang.String
      ] = js.native
  }
  
}


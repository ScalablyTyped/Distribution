package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogDiscount")
@js.native
object CatalogDiscountNs extends js.Object {
  @js.native
  sealed trait DiscountTypeEnum extends js.Object
  
  @js.native
  object DiscountTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_AMOUNT
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait FIXED_PERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_AMOUNT
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_PERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    /* "FIXED_AMOUNT" */ val FIXED_AMOUNT: FIXED_AMOUNT with java.lang.String = js.native
    /* "FIXED_PERCENTAGE" */ val FIXED_PERCENTAGE: FIXED_PERCENTAGE with java.lang.String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: VARIABLE_AMOUNT with java.lang.String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: VARIABLE_PERCENTAGE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum with java.lang.String
      ] = js.native
  }
  
}


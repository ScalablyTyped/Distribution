package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
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
    sealed trait FIXED_AMOUNT extends DiscountTypeEnum
    
    @js.native
    sealed trait FIXED_PERCENTAGE extends DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_AMOUNT extends DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_PERCENTAGE extends DiscountTypeEnum
    
    /* "FIXED_AMOUNT" */ val FIXED_AMOUNT: typings.squareDashConnect.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum.FIXED_AMOUNT with String = js.native
    /* "FIXED_PERCENTAGE" */ val FIXED_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum.FIXED_PERCENTAGE with String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: typings.squareDashConnect.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum.VARIABLE_AMOUNT with String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum.VARIABLE_PERCENTAGE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DiscountTypeEnum with String] = js.native
  }
  
}


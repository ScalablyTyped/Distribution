package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiscountTypeEnum extends js.Object

@JSImport("square-connect", "DiscountTypeEnum")
@js.native
object DiscountTypeEnum extends js.Object {
  @js.native
  sealed trait FIXED_AMOUNT extends DiscountTypeEnum
  
  @js.native
  sealed trait FIXED_PERCENTAGE extends DiscountTypeEnum
  
  @js.native
  sealed trait UNKNOWN_DISCOUNT extends DiscountTypeEnum
  
  @js.native
  sealed trait VARIABLE_AMOUNT extends DiscountTypeEnum
  
  @js.native
  sealed trait VARIABLE_PERCENTAGE extends DiscountTypeEnum
  
  /* "FIXED_AMOUNT" */ val FIXED_AMOUNT: typings.squareDashConnect.squareDashConnectMod.DiscountTypeEnum.FIXED_AMOUNT with String = js.native
  /* "FIXED_PERCENTAGE" */ val FIXED_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.DiscountTypeEnum.FIXED_PERCENTAGE with String = js.native
  /* "UNKNOWN_DISCOUNT" */ val UNKNOWN_DISCOUNT: typings.squareDashConnect.squareDashConnectMod.DiscountTypeEnum.UNKNOWN_DISCOUNT with String = js.native
  /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: typings.squareDashConnect.squareDashConnectMod.DiscountTypeEnum.VARIABLE_AMOUNT with String = js.native
  /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.DiscountTypeEnum.VARIABLE_PERCENTAGE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiscountTypeEnum with String] = js.native
}


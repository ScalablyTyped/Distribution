package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiscountApplicationScopeEnum extends js.Object

@JSImport("square-connect", "DiscountApplicationScopeEnum")
@js.native
object DiscountApplicationScopeEnum extends js.Object {
  @js.native
  sealed trait LINE_ITEM extends DiscountApplicationScopeEnum
  
  @js.native
  sealed trait ORDER extends DiscountApplicationScopeEnum
  
  @js.native
  sealed trait OTHER_DISCOUNT_SCOPE extends DiscountApplicationScopeEnum
  
  /* "LINE_ITEM" */ val LINE_ITEM: typings.squareDashConnect.squareDashConnectMod.DiscountApplicationScopeEnum.LINE_ITEM with String = js.native
  /* "ORDER" */ val ORDER: typings.squareDashConnect.squareDashConnectMod.DiscountApplicationScopeEnum.ORDER with String = js.native
  /* "OTHER_DISCOUNT_SCOPE" */ val OTHER_DISCOUNT_SCOPE: typings.squareDashConnect.squareDashConnectMod.DiscountApplicationScopeEnum.OTHER_DISCOUNT_SCOPE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiscountApplicationScopeEnum with String] = js.native
}


package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaxApplicationScopeEnum extends js.Object

@JSImport("square-connect", "TaxApplicationScopeEnum")
@js.native
object TaxApplicationScopeEnum extends js.Object {
  @js.native
  sealed trait LINE_ITEM extends TaxApplicationScopeEnum
  
  @js.native
  sealed trait ORDER extends TaxApplicationScopeEnum
  
  @js.native
  sealed trait OTHER_TAX_SCOPE extends TaxApplicationScopeEnum
  
  /* "LINE_ITEM" */ val LINE_ITEM: typings.squareDashConnect.squareDashConnectMod.TaxApplicationScopeEnum.LINE_ITEM with String = js.native
  /* "ORDER" */ val ORDER: typings.squareDashConnect.squareDashConnectMod.TaxApplicationScopeEnum.ORDER with String = js.native
  /* "OTHER_TAX_SCOPE" */ val OTHER_TAX_SCOPE: typings.squareDashConnect.squareDashConnectMod.TaxApplicationScopeEnum.OTHER_TAX_SCOPE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaxApplicationScopeEnum with String] = js.native
}


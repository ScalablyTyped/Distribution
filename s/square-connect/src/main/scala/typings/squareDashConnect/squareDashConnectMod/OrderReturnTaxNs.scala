package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.ScopeEnum
import typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderReturnTax")
@js.native
object OrderReturnTaxNs extends js.Object {
  @js.native
  sealed trait ScopeEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object ScopeEnum extends js.Object {
    @js.native
    sealed trait LINE_ITEM extends ScopeEnum
    
    @js.native
    sealed trait ORDER extends ScopeEnum
    
    @js.native
    sealed trait OTHER_TAX_SCOPE extends ScopeEnum
    
    /* "LINE_ITEM" */ val LINE_ITEM: typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.ScopeEnum.LINE_ITEM with String = js.native
    /* "ORDER" */ val ORDER: typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.ScopeEnum.ORDER with String = js.native
    /* "OTHER_TAX_SCOPE" */ val OTHER_TAX_SCOPE: typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.ScopeEnum.OTHER_TAX_SCOPE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ScopeEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE extends TypeEnum
    
    @js.native
    sealed trait INCLUSIVE extends TypeEnum
    
    @js.native
    sealed trait UNKNOWN_TAX extends TypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.TypeEnum.ADDITIVE with String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.TypeEnum.INCLUSIVE with String = js.native
    /* "UNKNOWN_TAX" */ val UNKNOWN_TAX: typings.squareDashConnect.squareDashConnectMod.OrderReturnTaxNs.TypeEnum.UNKNOWN_TAX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}


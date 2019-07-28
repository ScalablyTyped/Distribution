package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PageCell")
@js.native
object V1PageCellNs extends js.Object {
  @js.native
  sealed trait ObjectTypeEnum extends js.Object
  
  @js.native
  sealed trait PlaceholderTypeEnum extends js.Object
  
  @js.native
  object ObjectTypeEnum extends js.Object {
    @js.native
    sealed trait CATEGORY extends ObjectTypeEnum
    
    @js.native
    sealed trait DISCOUNT extends ObjectTypeEnum
    
    @js.native
    sealed trait ITEM extends ObjectTypeEnum
    
    @js.native
    sealed trait PLACEHOLDER extends ObjectTypeEnum
    
    /* "CATEGORY" */ val CATEGORY: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum.CATEGORY with String = js.native
    /* "DISCOUNT" */ val DISCOUNT: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum.DISCOUNT with String = js.native
    /* "ITEM" */ val ITEM: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum.ITEM with String = js.native
    /* "PLACEHOLDER" */ val PLACEHOLDER: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum.PLACEHOLDER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectTypeEnum with String] = js.native
  }
  
  @js.native
  object PlaceholderTypeEnum extends js.Object {
    @js.native
    sealed trait ALL_ITEMS extends PlaceholderTypeEnum
    
    @js.native
    sealed trait DISCOUNTS_CATEGORY extends PlaceholderTypeEnum
    
    @js.native
    sealed trait REWARDS_FINDER extends PlaceholderTypeEnum
    
    /* "ALL_ITEMS" */ val ALL_ITEMS: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum.ALL_ITEMS with String = js.native
    /* "DISCOUNTS_CATEGORY" */ val DISCOUNTS_CATEGORY: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum.DISCOUNTS_CATEGORY with String = js.native
    /* "REWARDS_FINDER" */ val REWARDS_FINDER: typings.squareDashConnect.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum.REWARDS_FINDER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PlaceholderTypeEnum with String] = js.native
  }
  
}


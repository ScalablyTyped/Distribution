package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CATEGORY
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum
    
    @js.native
    sealed trait DISCOUNT
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum
    
    @js.native
    sealed trait ITEM
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum
    
    @js.native
    sealed trait PLACEHOLDER
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum
    
    /* "CATEGORY" */ val CATEGORY: CATEGORY with java.lang.String = js.native
    /* "DISCOUNT" */ val DISCOUNT: DISCOUNT with java.lang.String = js.native
    /* "ITEM" */ val ITEM: ITEM with java.lang.String = js.native
    /* "PLACEHOLDER" */ val PLACEHOLDER: PLACEHOLDER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PageCellNs.ObjectTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object PlaceholderTypeEnum extends js.Object {
    @js.native
    sealed trait ALL_ITEMS
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
    
    @js.native
    sealed trait DISCOUNTS_CATEGORY
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
    
    @js.native
    sealed trait REWARDS_FINDER
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
    
    /* "ALL_ITEMS" */ val ALL_ITEMS: ALL_ITEMS with java.lang.String = js.native
    /* "DISCOUNTS_CATEGORY" */ val DISCOUNTS_CATEGORY: DISCOUNTS_CATEGORY with java.lang.String = js.native
    /* "REWARDS_FINDER" */ val REWARDS_FINDER: REWARDS_FINDER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum with java.lang.String
      ] = js.native
  }
  
}


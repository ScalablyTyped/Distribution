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
    sealed trait ALLITEMS
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
    
    @js.native
    sealed trait DISCOUNTSCATEGORY
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
    
    @js.native
    sealed trait REWARDSFINDER
      extends squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum
    
    /* "ALL_ITEMS" */ val ALLITEMS: ALLITEMS with java.lang.String = js.native
    /* "DISCOUNTS_CATEGORY" */ val DISCOUNTSCATEGORY: DISCOUNTSCATEGORY with java.lang.String = js.native
    /* "REWARDS_FINDER" */ val REWARDSFINDER: REWARDSFINDER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PageCellNs.PlaceholderTypeEnum with java.lang.String
      ] = js.native
  }
  
}


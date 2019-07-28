package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchCatalogObjectsRequest")
@js.native
object SearchCatalogObjectsRequestNs extends js.Object {
  @js.native
  sealed trait ObjectTypesEnum extends js.Object
  
  @js.native
  object ObjectTypesEnum extends js.Object {
    @js.native
    sealed trait CATEGORY extends ObjectTypesEnum
    
    @js.native
    sealed trait DISCOUNT extends ObjectTypesEnum
    
    @js.native
    sealed trait IMAGE extends ObjectTypesEnum
    
    @js.native
    sealed trait ITEM extends ObjectTypesEnum
    
    @js.native
    sealed trait ITEM_VARIATION extends ObjectTypesEnum
    
    @js.native
    sealed trait MODIFIER extends ObjectTypesEnum
    
    @js.native
    sealed trait MODIFIER_LIST extends ObjectTypesEnum
    
    @js.native
    sealed trait TAX extends ObjectTypesEnum
    
    /* "CATEGORY" */ val CATEGORY: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.CATEGORY with String = js.native
    /* "DISCOUNT" */ val DISCOUNT: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.DISCOUNT with String = js.native
    /* "IMAGE" */ val IMAGE: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.IMAGE with String = js.native
    /* "ITEM" */ val ITEM: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.ITEM with String = js.native
    /* "ITEM_VARIATION" */ val ITEM_VARIATION: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.ITEM_VARIATION with String = js.native
    /* "MODIFIER" */ val MODIFIER: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.MODIFIER with String = js.native
    /* "MODIFIER_LIST" */ val MODIFIER_LIST: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.MODIFIER_LIST with String = js.native
    /* "TAX" */ val TAX: typings.squareDashConnect.squareDashConnectMod.SearchCatalogObjectsRequestNs.ObjectTypesEnum.TAX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectTypesEnum with String] = js.native
  }
  
}


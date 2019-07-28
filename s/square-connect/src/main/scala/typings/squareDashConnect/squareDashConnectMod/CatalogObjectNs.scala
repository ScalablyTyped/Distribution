package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogObject")
@js.native
object CatalogObjectNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait CATEGORY extends TypeEnum
    
    @js.native
    sealed trait DISCOUNT extends TypeEnum
    
    @js.native
    sealed trait IMAGE extends TypeEnum
    
    @js.native
    sealed trait ITEM extends TypeEnum
    
    @js.native
    sealed trait ITEM_VARIATION extends TypeEnum
    
    @js.native
    sealed trait MODIFIER extends TypeEnum
    
    @js.native
    sealed trait MODIFIER_LIST extends TypeEnum
    
    @js.native
    sealed trait TAX extends TypeEnum
    
    /* "CATEGORY" */ val CATEGORY: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.CATEGORY with String = js.native
    /* "DISCOUNT" */ val DISCOUNT: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.DISCOUNT with String = js.native
    /* "IMAGE" */ val IMAGE: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.IMAGE with String = js.native
    /* "ITEM" */ val ITEM: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.ITEM with String = js.native
    /* "ITEM_VARIATION" */ val ITEM_VARIATION: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.ITEM_VARIATION with String = js.native
    /* "MODIFIER" */ val MODIFIER: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.MODIFIER with String = js.native
    /* "MODIFIER_LIST" */ val MODIFIER_LIST: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.MODIFIER_LIST with String = js.native
    /* "TAX" */ val TAX: typings.squareDashConnect.squareDashConnectMod.CatalogObjectNs.TypeEnum.TAX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}


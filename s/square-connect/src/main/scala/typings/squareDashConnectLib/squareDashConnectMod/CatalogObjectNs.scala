package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CATEGORY
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    @js.native
    sealed trait DISCOUNT
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    @js.native
    sealed trait ITEM
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    @js.native
    sealed trait ITEMVARIATION
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    @js.native
    sealed trait MODIFIER
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    @js.native
    sealed trait MODIFIERLIST
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    @js.native
    sealed trait TAX
      extends squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum
    
    /* "CATEGORY" */ val CATEGORY: CATEGORY with java.lang.String = js.native
    /* "DISCOUNT" */ val DISCOUNT: DISCOUNT with java.lang.String = js.native
    /* "ITEM" */ val ITEM: ITEM with java.lang.String = js.native
    /* "ITEM_VARIATION" */ val ITEMVARIATION: ITEMVARIATION with java.lang.String = js.native
    /* "MODIFIER" */ val MODIFIER: MODIFIER with java.lang.String = js.native
    /* "MODIFIER_LIST" */ val MODIFIERLIST: MODIFIERLIST with java.lang.String = js.native
    /* "TAX" */ val TAX: TAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogObjectNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}


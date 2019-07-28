package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogModifierListNs.SelectionTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogModifierList")
@js.native
object CatalogModifierListNs extends js.Object {
  @js.native
  sealed trait SelectionTypeEnum extends js.Object
  
  @js.native
  object SelectionTypeEnum extends js.Object {
    @js.native
    sealed trait MULTIPLE extends SelectionTypeEnum
    
    @js.native
    sealed trait SINGLE extends SelectionTypeEnum
    
    /* "MULTIPLE" */ val MULTIPLE: typings.squareDashConnect.squareDashConnectMod.CatalogModifierListNs.SelectionTypeEnum.MULTIPLE with String = js.native
    /* "SINGLE" */ val SINGLE: typings.squareDashConnect.squareDashConnectMod.CatalogModifierListNs.SelectionTypeEnum.SINGLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SelectionTypeEnum with String] = js.native
  }
  
}


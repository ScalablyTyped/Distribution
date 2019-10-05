package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CatalogModifierList.SelectionTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogModifierList")
@js.native
class CatalogModifierList () extends js.Object {
  /**
    * The options included in the [CatalogModifierList](#type-catalogmodifierlist). You must include at least one
    * [CatalogModifier](#type-catalogmodifier). Each [CatalogObject](#type-catalogobject) must have type `MODIFIER` and
    * contain [CatalogModifier](#type-catalogmodifier) data.
    */
  var modifiers: js.UndefOr[js.Array[CatalogObject]] = js.native
  /**
    * The [CatalogModifierList](#type-catalogmodifierlist)'s name. Searchable.
    * This field has max length of 255 Unicode code points.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether multiple options from the [CatalogModifierList](#type-catalogmodifierlist) can be applied to a
    * single [CatalogItem](#type-catalogitem).
    * See [CatalogModifierListSelectionType](#type-catalogmodifierlistselectiontype) for possible values.
    */
  var selection_type: js.UndefOr[SelectionTypeEnum] = js.native
}

@JSImport("square-connect", "CatalogModifierList")
@js.native
object CatalogModifierList extends js.Object {
  @js.native
  sealed trait SelectionTypeEnum extends js.Object
  
  @js.native
  object SelectionTypeEnum extends js.Object {
    @js.native
    sealed trait MULTIPLE extends SelectionTypeEnum
    
    @js.native
    sealed trait SINGLE extends SelectionTypeEnum
    
    /* "MULTIPLE" */ val MULTIPLE: typings.squareDashConnect.squareDashConnectMod.CatalogModifierList.SelectionTypeEnum.MULTIPLE with String = js.native
    /* "SINGLE" */ val SINGLE: typings.squareDashConnect.squareDashConnectMod.CatalogModifierList.SelectionTypeEnum.SINGLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SelectionTypeEnum with String] = js.native
  }
  
}


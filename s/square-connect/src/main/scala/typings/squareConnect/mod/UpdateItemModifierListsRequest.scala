package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateItemModifierListsRequest")
@js.native
class UpdateItemModifierListsRequest () extends js.Object {
  /**
    * The [CatalogItem](#type-catalogitem)s whose [CatalogModifierList](#type-catalogmodifierlist)s are being updated.
    */
  var item_ids: js.Array[String] = js.native
  /**
    * The set of [CatalogModifierList](#type-catalogmodifierlist)s (referenced by ID) to disable for the
    * [CatalogItem](#type-catalogitem).
    */
  var modifier_lists_to_disable: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of [CatalogModifierList](#type-catalogmodifierlist)s (referenced by ID) to enable for the
    * [CatalogItem](#type-catalogitem).
    */
  var modifier_lists_to_enable: js.UndefOr[js.Array[String]] = js.native
}


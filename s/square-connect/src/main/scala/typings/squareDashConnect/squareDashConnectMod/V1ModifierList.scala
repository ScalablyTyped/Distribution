package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1ModifierListNs.SelectionTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ModifierList")
@js.native
class V1ModifierList () extends js.Object {
  /**
    * The modifier list's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The options included in the modifier list.
    */
  var modifier_options: js.UndefOr[js.Array[V1ModifierOption]] = js.native
  /**
    * The modifier list's name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether MULTIPLE options or a SINGLE option from the modifier list can be applied to a single item.
    * See [V1ModifierListSelectionType](#type-v1modifierlistselectiontype) for possible values.
    */
  var selection_type: js.UndefOr[SelectionTypeEnum] = js.native
  /**
    * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID.
    */
  var v2_id: js.UndefOr[String] = js.native
}


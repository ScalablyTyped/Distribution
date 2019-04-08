package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItemModifierListInfo")
@js.native
class CatalogItemModifierListInfo () extends js.Object {
  /**
    * If `true`, enable this [CatalogModifierList](#type-catalogmodifierlist).
    */
  var enabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * If zero or larger, the largest number of [CatalogModifier](#type-catalogmodifier)s that can be selected from this
    * [CatalogModifierList](#type-catalogmodifierlist).
    */
  var max_selected_modifiers: js.UndefOr[scala.Double] = js.native
  /**
    * If zero or larger, the smallest number of [CatalogModifier](#type-catalogmodifier)s that must be selected from
    * this [CatalogModifierList](#type-catalogmodifierlist).
    */
  var min_selected_modifiers: js.UndefOr[scala.Double] = js.native
  /**
    * The ID of the [CatalogModifierList](#type-catalogmodifierlist) controlled by this
    * [CatalogModifierListInfo](#type-catalogmodifierlistinfo).
    */
  var modifier_list_id: java.lang.String = js.native
  /**
    * A set of [CatalogModifierOverride](#type-catalogmodifieroverride) objects that override whether a given
    * [CatalogModifier](#type-catalogmodifier) is enabled by default.
    */
  var modifier_overrides: js.UndefOr[js.Array[CatalogModifierOverride]] = js.native
}


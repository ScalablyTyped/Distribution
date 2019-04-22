package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ModifierOption")
@js.native
class V1ModifierOption () extends js.Object {
  /**
    * The modifier option's unique ID.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the modifier list the option belongs to.
    */
  var modifier_list_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The modifier option's name.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * If true, the modifier option is the default option in a modifier list for which selection_type is SINGLE.
    */
  var on_by_default: js.UndefOr[scala.Boolean] = js.native
  /**
    * Indicates the modifier option's list position when displayed in Square Register and the merchant dashboard.
    * If more than one modifier option in the same modifier list has the same ordinal value, those options are displayed
    * in alphabetical order.
    */
  var ordinal: js.UndefOr[scala.Double] = js.native
  /**
    * The modifier option's price.
    */
  var price_money: js.UndefOr[V1Money] = js.native
  /**
    * The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID.
    */
  var v2_id: js.UndefOr[java.lang.String] = js.native
}


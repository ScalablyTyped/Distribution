package typings
package shopifyDashPrimeLib.distModelsLineUnderscoreItemUnderscorePropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItemProperty
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The name of the note attribute.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value of the note attribute.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object LineItemProperty {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    value: js.Any = null
  ): LineItemProperty = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LineItemProperty]
  }
}


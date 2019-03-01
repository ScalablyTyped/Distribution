package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOption extends js.Object {
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var modifier: js.UndefOr[scala.Boolean] = js.undefined
  var upsert: js.UndefOr[scala.Boolean] = js.undefined
  var upsertextendedCustomContext: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidationOption {
  @scala.inline
  def apply(
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[java.lang.String] = null,
    modifier: js.UndefOr[scala.Boolean] = js.undefined,
    upsert: js.UndefOr[scala.Boolean] = js.undefined,
    upsertextendedCustomContext: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (!js.isUndefined(modifier)) __obj.updateDynamic("modifier")(modifier)
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert)
    if (!js.isUndefined(upsertextendedCustomContext)) __obj.updateDynamic("upsertextendedCustomContext")(upsertextendedCustomContext)
    __obj.asInstanceOf[ValidationOption]
  }
}


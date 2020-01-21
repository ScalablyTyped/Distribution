package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOption extends js.Object {
  var clean: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var modifier: js.UndefOr[Boolean] = js.undefined
  var upsert: js.UndefOr[Boolean] = js.undefined
  var upsertextendedCustomContext: js.UndefOr[Boolean] = js.undefined
}

object ValidationOption {
  @scala.inline
  def apply(
    clean: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    modifier: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined,
    upsertextendedCustomContext: js.UndefOr[Boolean] = js.undefined
  ): ValidationOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(modifier)) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    if (!js.isUndefined(upsertextendedCustomContext)) __obj.updateDynamic("upsertextendedCustomContext")(upsertextendedCustomContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOption]
  }
}


package typings.relaxedJson.anon

import typings.relaxedJson.mod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duplicate extends js.Object {
  var duplicate: js.UndefOr[Boolean] = js.undefined
  var relaxed: js.UndefOr[Boolean] = js.undefined
  var reviver: js.UndefOr[Reviver] = js.undefined
  var tolerant: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean] = js.undefined
}

object Duplicate {
  @scala.inline
  def apply(
    duplicate: js.UndefOr[Boolean] = js.undefined,
    relaxed: js.UndefOr[Boolean] = js.undefined,
    reviver: Reviver = null,
    tolerant: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined
  ): Duplicate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duplicate)) __obj.updateDynamic("duplicate")(duplicate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relaxed)) __obj.updateDynamic("relaxed")(relaxed.get.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(reviver.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duplicate]
  }
}


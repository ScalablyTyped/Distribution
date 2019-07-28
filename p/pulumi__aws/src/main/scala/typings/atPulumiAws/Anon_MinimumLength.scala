package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinimumLength extends js.Object {
  var minimumLength: js.UndefOr[Double] = js.undefined
  var requireLowercase: js.UndefOr[Boolean] = js.undefined
  var requireNumbers: js.UndefOr[Boolean] = js.undefined
  var requireSymbols: js.UndefOr[Boolean] = js.undefined
  var requireUppercase: js.UndefOr[Boolean] = js.undefined
}

object Anon_MinimumLength {
  @scala.inline
  def apply(
    minimumLength: Int | Double = null,
    requireLowercase: js.UndefOr[Boolean] = js.undefined,
    requireNumbers: js.UndefOr[Boolean] = js.undefined,
    requireSymbols: js.UndefOr[Boolean] = js.undefined,
    requireUppercase: js.UndefOr[Boolean] = js.undefined
  ): Anon_MinimumLength = {
    val __obj = js.Dynamic.literal()
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (!js.isUndefined(requireLowercase)) __obj.updateDynamic("requireLowercase")(requireLowercase)
    if (!js.isUndefined(requireNumbers)) __obj.updateDynamic("requireNumbers")(requireNumbers)
    if (!js.isUndefined(requireSymbols)) __obj.updateDynamic("requireSymbols")(requireSymbols)
    if (!js.isUndefined(requireUppercase)) __obj.updateDynamic("requireUppercase")(requireUppercase)
    __obj.asInstanceOf[Anon_MinimumLength]
  }
}


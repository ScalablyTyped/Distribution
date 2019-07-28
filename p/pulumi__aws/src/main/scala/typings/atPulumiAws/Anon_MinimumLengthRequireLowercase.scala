package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinimumLengthRequireLowercase extends js.Object {
  var minimumLength: js.UndefOr[Input[Double]] = js.undefined
  var requireLowercase: js.UndefOr[Input[Boolean]] = js.undefined
  var requireNumbers: js.UndefOr[Input[Boolean]] = js.undefined
  var requireSymbols: js.UndefOr[Input[Boolean]] = js.undefined
  var requireUppercase: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_MinimumLengthRequireLowercase {
  @scala.inline
  def apply(
    minimumLength: Input[Double] = null,
    requireLowercase: Input[Boolean] = null,
    requireNumbers: Input[Boolean] = null,
    requireSymbols: Input[Boolean] = null,
    requireUppercase: Input[Boolean] = null
  ): Anon_MinimumLengthRequireLowercase = {
    val __obj = js.Dynamic.literal()
    if (minimumLength != null) __obj.updateDynamic("minimumLength")(minimumLength.asInstanceOf[js.Any])
    if (requireLowercase != null) __obj.updateDynamic("requireLowercase")(requireLowercase.asInstanceOf[js.Any])
    if (requireNumbers != null) __obj.updateDynamic("requireNumbers")(requireNumbers.asInstanceOf[js.Any])
    if (requireSymbols != null) __obj.updateDynamic("requireSymbols")(requireSymbols.asInstanceOf[js.Any])
    if (requireUppercase != null) __obj.updateDynamic("requireUppercase")(requireUppercase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MinimumLengthRequireLowercase]
  }
}


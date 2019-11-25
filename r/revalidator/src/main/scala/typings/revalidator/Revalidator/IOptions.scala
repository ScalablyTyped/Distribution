package typings.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /** When additionalProperties is true allow additional unvisited properties on the object. (default true) */
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  /** Enforce casting of some types (for integers/numbers are only supported) when it's possible, e.g. "42" => 42, but "forty2" => "forty2" for the integer type. */
  var cast: js.UndefOr[Boolean] = js.undefined
  /** When validateFormats is true also validate formats defined in validate.formatExtensions (default true) */
  var validateFormatExtensions: js.UndefOr[Boolean] = js.undefined
  /** Enforce format constraints (default true) */
  var validateFormats: js.UndefOr[Boolean] = js.undefined
  /** When validateFormats is true treat unrecognized formats as validation errors (default false) */
  var validateFormatsStrict: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    additionalProperties: js.UndefOr[Boolean] = js.undefined,
    cast: js.UndefOr[Boolean] = js.undefined,
    validateFormatExtensions: js.UndefOr[Boolean] = js.undefined,
    validateFormats: js.UndefOr[Boolean] = js.undefined,
    validateFormatsStrict: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(cast)) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFormatExtensions)) __obj.updateDynamic("validateFormatExtensions")(validateFormatExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFormats)) __obj.updateDynamic("validateFormats")(validateFormats.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFormatsStrict)) __obj.updateDynamic("validateFormatsStrict")(validateFormatsStrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}


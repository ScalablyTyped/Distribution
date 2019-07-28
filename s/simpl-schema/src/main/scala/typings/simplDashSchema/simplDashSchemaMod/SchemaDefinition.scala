package typings.simplDashSchema.simplDashSchemaMod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDefinition extends js.Object {
  var allowedValues: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
  var autoValue: js.UndefOr[js.Function0[_]] = js.undefined
  var blackbox: js.UndefOr[Boolean] = js.undefined
  /**
    * For custom validation function. If you use an arrow function the context
    * for "this" will not be available. Use "custom: function() { return
    * something(this.value); }" instead.
    */
  var custom: js.UndefOr[
    js.ThisFunction0[
      /* this */ CustomValidationContext, 
      js.UndefOr[String | SimpleSchemaValidationError]
    ]
  ] = js.undefined
  var decimal: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var exclusiveMax: js.UndefOr[Boolean] = js.undefined
  var exclusiveMin: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | js.Function0[String]] = js.undefined
  var max: js.UndefOr[Double | Boolean | Date | (js.Function0[Double | Boolean | Date])] = js.undefined
  var maxCount: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var min: js.UndefOr[Double | Boolean | Date | (js.Function0[Double | Boolean | Date])] = js.undefined
  var minCount: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var optional: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  var regEx: js.UndefOr[RegExp | js.Array[RegExp]] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var `type`: js.Any
}

object SchemaDefinition {
  @scala.inline
  def apply(
    `type`: js.Any,
    allowedValues: js.Array[_] | js.Function0[js.Array[_]] = null,
    autoValue: () => _ = null,
    blackbox: js.UndefOr[Boolean] = js.undefined,
    custom: js.ThisFunction0[
      /* this */ CustomValidationContext, 
      js.UndefOr[String | SimpleSchemaValidationError]
    ] = null,
    decimal: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    exclusiveMax: js.UndefOr[Boolean] = js.undefined,
    exclusiveMin: js.UndefOr[Boolean] = js.undefined,
    label: String | js.Function0[String] = null,
    max: Double | Boolean | Date | (js.Function0[Double | Boolean | Date]) = null,
    maxCount: Double | js.Function0[Double] = null,
    min: Double | Boolean | Date | (js.Function0[Double | Boolean | Date]) = null,
    minCount: Double | js.Function0[Double] = null,
    optional: Boolean | js.Function0[Boolean] = null,
    regEx: RegExp | js.Array[RegExp] = null,
    trim: js.UndefOr[Boolean] = js.undefined
  ): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (autoValue != null) __obj.updateDynamic("autoValue")(js.Any.fromFunction0(autoValue))
    if (!js.isUndefined(blackbox)) __obj.updateDynamic("blackbox")(blackbox)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (!js.isUndefined(decimal)) __obj.updateDynamic("decimal")(decimal)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(exclusiveMax)) __obj.updateDynamic("exclusiveMax")(exclusiveMax)
    if (!js.isUndefined(exclusiveMin)) __obj.updateDynamic("exclusiveMin")(exclusiveMin)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minCount != null) __obj.updateDynamic("minCount")(minCount.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (regEx != null) __obj.updateDynamic("regEx")(regEx.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[SchemaDefinition]
  }
}


package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaDefinition extends js.Object {
  var allowedValues: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.undefined
  var autoValue: js.UndefOr[js.Function0[_]] = js.undefined
  var blackbox: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For custom validation function. If you use an arrow function the context
    * for "this" will not be available. Use "custom: function() { return
    * something(this.value); }" instead.
    */
  var custom: js.UndefOr[
    js.ThisFunction0[
      /* this */ CustomValidationContext, 
      js.UndefOr[java.lang.String | SimpleSchemaValidationError]
    ]
  ] = js.undefined
  var decimal: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var exclusiveMax: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMin: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var max: js.UndefOr[
    scala.Double | scala.Boolean | stdLib.Date | (js.Function0[scala.Double | scala.Boolean | stdLib.Date])
  ] = js.undefined
  var maxCount: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  var min: js.UndefOr[
    scala.Double | scala.Boolean | stdLib.Date | (js.Function0[scala.Double | scala.Boolean | stdLib.Date])
  ] = js.undefined
  var minCount: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  var optional: js.UndefOr[scala.Boolean | js.Function0[scala.Boolean]] = js.undefined
  var regEx: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.Any
}

object SchemaDefinition {
  @scala.inline
  def apply(
    `type`: js.Any,
    allowedValues: js.Array[_] | js.Function0[js.Array[_]] = null,
    autoValue: js.Function0[_] = null,
    blackbox: js.UndefOr[scala.Boolean] = js.undefined,
    custom: js.ThisFunction0[
      /* this */ CustomValidationContext, 
      js.UndefOr[java.lang.String | SimpleSchemaValidationError]
    ] = null,
    decimal: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: js.Any = null,
    exclusiveMax: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMin: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | js.Function0[java.lang.String] = null,
    max: scala.Double | scala.Boolean | stdLib.Date | (js.Function0[scala.Double | scala.Boolean | stdLib.Date]) = null,
    maxCount: scala.Double | js.Function0[scala.Double] = null,
    min: scala.Double | scala.Boolean | stdLib.Date | (js.Function0[scala.Double | scala.Boolean | stdLib.Date]) = null,
    minCount: scala.Double | js.Function0[scala.Double] = null,
    optional: scala.Boolean | js.Function0[scala.Boolean] = null,
    regEx: stdLib.RegExp | js.Array[stdLib.RegExp] = null,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (allowedValues != null) __obj.updateDynamic("allowedValues")(allowedValues.asInstanceOf[js.Any])
    if (autoValue != null) __obj.updateDynamic("autoValue")(autoValue)
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


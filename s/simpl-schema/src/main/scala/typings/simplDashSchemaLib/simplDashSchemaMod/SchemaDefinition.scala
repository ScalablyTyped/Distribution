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


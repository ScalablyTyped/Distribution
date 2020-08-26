package typings.simplSchema.mod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDefinition extends js.Object {
  var allowedValues: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
  var autoValue: js.UndefOr[js.Function0[_]] = js.native
  var blackbox: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  var decimal: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var exclusiveMax: js.UndefOr[Boolean] = js.native
  var exclusiveMin: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String | js.Function0[String]] = js.native
  var max: js.UndefOr[Double | Boolean | Date | (js.Function0[Double | Boolean | Date])] = js.native
  var maxCount: js.UndefOr[Double | js.Function0[Double]] = js.native
  var min: js.UndefOr[Double | Boolean | Date | (js.Function0[Double | Boolean | Date])] = js.native
  var minCount: js.UndefOr[Double | js.Function0[Double]] = js.native
  var optional: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  var regEx: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  var trim: js.UndefOr[Boolean] = js.native
  var `type`: js.Any = js.native
}

object SchemaDefinition {
  @scala.inline
  def apply(`type`: js.Any): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDefinition]
  }
  @scala.inline
  implicit class SchemaDefinitionOps[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedValuesVarargs(value: js.Any*): Self = this.set("allowedValues", js.Array(value :_*))
    @scala.inline
    def setAllowedValuesFunction0(value: () => js.Array[_]): Self = this.set("allowedValues", js.Any.fromFunction0(value))
    @scala.inline
    def setAllowedValues(value: js.Array[_] | js.Function0[js.Array[_]]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
    @scala.inline
    def setAutoValue(value: () => _): Self = this.set("autoValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAutoValue: Self = this.set("autoValue", js.undefined)
    @scala.inline
    def setBlackbox(value: Boolean): Self = this.set("blackbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlackbox: Self = this.set("blackbox", js.undefined)
    @scala.inline
    def setCustom(
      value: js.ThisFunction0[
          /* this */ CustomValidationContext, 
          js.UndefOr[String | SimpleSchemaValidationError]
        ]
    ): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDecimal(value: Boolean): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setExclusiveMax(value: Boolean): Self = this.set("exclusiveMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMax: Self = this.set("exclusiveMax", js.undefined)
    @scala.inline
    def setExclusiveMin(value: Boolean): Self = this.set("exclusiveMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMin: Self = this.set("exclusiveMin", js.undefined)
    @scala.inline
    def setLabelFunction0(value: () => String): Self = this.set("label", js.Any.fromFunction0(value))
    @scala.inline
    def setLabel(value: String | js.Function0[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMaxFunction0(value: () => Double | Boolean | Date): Self = this.set("max", js.Any.fromFunction0(value))
    @scala.inline
    def setMax(value: Double | Boolean | Date | (js.Function0[Double | Boolean | Date])): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxCountFunction0(value: () => Double): Self = this.set("maxCount", js.Any.fromFunction0(value))
    @scala.inline
    def setMaxCount(value: Double | js.Function0[Double]): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
    @scala.inline
    def setMinFunction0(value: () => Double | Boolean | Date): Self = this.set("min", js.Any.fromFunction0(value))
    @scala.inline
    def setMin(value: Double | Boolean | Date | (js.Function0[Double | Boolean | Date])): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinCountFunction0(value: () => Double): Self = this.set("minCount", js.Any.fromFunction0(value))
    @scala.inline
    def setMinCount(value: Double | js.Function0[Double]): Self = this.set("minCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCount: Self = this.set("minCount", js.undefined)
    @scala.inline
    def setOptionalFunction0(value: () => Boolean): Self = this.set("optional", js.Any.fromFunction0(value))
    @scala.inline
    def setOptional(value: Boolean | js.Function0[Boolean]): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setRegExVarargs(value: RegExp*): Self = this.set("regEx", js.Array(value :_*))
    @scala.inline
    def setRegEx(value: RegExp | js.Array[RegExp]): Self = this.set("regEx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegEx: Self = this.set("regEx", js.undefined)
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
  
}


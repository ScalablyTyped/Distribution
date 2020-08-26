package typings.revalidator.Revalidator

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISchema[T] extends js.Object {
  /**If false, the value must not be an empty string */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**Value must conform to constraint denoted by expected value */
  var conform: js.UndefOr[js.Function2[/* value */ js.Any, /* data */ js.UndefOr[T], Boolean]] = js.native
  /**Default value */
  var default: js.UndefOr[js.Any] = js.native
  /**Value is valid only if the dependent value is valid */
  var dependencies: js.UndefOr[String] = js.native
  /**Description for this object */
  var description: js.UndefOr[String] = js.native
  /**Value must be divisible by expected value */
  var divisibleBy: js.UndefOr[Double] = js.native
  /**Value must be present in the array of expected values */
  var enum: js.UndefOr[js.Array[_]] = js.native
  /**Value must be lesser than expected value */
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  /**Value must be greater than expected value */
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**Value must be a valid format */
  var format: js.UndefOr[Formats] = js.native
  /**Property to describe items for type: 'array' */
  var items: js.UndefOr[ISchema[T] | JSONSchema[T]] = js.native
  /**Value must contain fewer than expected number of items */
  var maxItems: js.UndefOr[Double] = js.native
  /**The length of value must be greater than or equal to expected value */
  var maxLength: js.UndefOr[Double] = js.native
  /**Value must be lesser than or equal to the expected value */
  var maximum: js.UndefOr[Double] = js.native
  /**Custom messages for different constraints */
  var message: js.UndefOr[String] = js.native
  /**Custom messages for different constraints */
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  /**Value must contain more than expected number of items */
  var minItems: js.UndefOr[Double] = js.native
  /**The length of value must be lesser than or equal to expected value */
  var minLength: js.UndefOr[Double] = js.native
  /**Value must be greater than or equal to the expected value */
  var minimum: js.UndefOr[Double] = js.native
  /**The expected value regex needs to be satisfied by the value */
  var pattern: js.UndefOr[RegExp | String] = js.native
  /**If true, the value should not be undefined */
  var required: js.UndefOr[Boolean] = js.native
  /**The type of value should be equal to the expected value */
  var `type`: Types | js.Array[Types] = js.native
  /**Value must hold a unique set of values */
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

object ISchema {
  @scala.inline
  def apply[T](`type`: Types | js.Array[Types]): ISchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema[T]]
  }
  @scala.inline
  implicit class ISchemaOps[Self <: ISchema[_], T] (val x: Self with ISchema[T]) extends AnyVal {
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
    def setTypeVarargs(value: Types*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: Types | js.Array[Types]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def setConform(value: (/* value */ js.Any, /* data */ js.UndefOr[T]) => Boolean): Self = this.set("conform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConform: Self = this.set("conform", js.undefined)
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDependencies(value: String): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDivisibleBy(value: Double): Self = this.set("divisibleBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivisibleBy: Self = this.set("divisibleBy", js.undefined)
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[_]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setExclusiveMaximum(value: Double): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Double): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setFormat(value: Formats): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setItems(value: ISchema[T] | JSONSchema[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessages(value: StringDictionary[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setPattern(value: RegExp | String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
  }
  
}


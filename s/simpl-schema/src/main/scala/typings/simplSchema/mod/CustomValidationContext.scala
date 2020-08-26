package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomValidationContext extends js.Object {
  /** The schema definition object. */
  var definition: SchemaDefinition = js.native
  /** The generic name of the schema key (e.g., "addresses.$.street") */
  var genericKey: String = js.native
  /** Does the object being validated have this key set? */
  var isSet: Boolean = js.native
  /** The name of the schema key (e.g., "addresses.0.street") */
  var key: String = js.native
  /** The Mongo operator for which we're doing validation. Might be null. */
  var operator: js.Any = js.native
  var validationContext: ValidationContext = js.native
  /** Value to validate */
  var value: js.Any = js.native
  /**
    * Call this to add validation errors for any key. In general, you should use
    * this to add errors for other keys. To add an error for the current key,
    * return the error type string. If you do use this to add an error for the
    * current key, return false from your custom validation function.
    */
  def addValidationErrors(errors: SimpleSchemaValidationError): js.Any = js.native
  /**
    * Use this method to get information about other fields. Pass a field name
    * (non-generic schema key) as the only argument. The return object will
    * have isSet, value, and operator properties for that field.
    */
  def field(): js.Any = js.native
  /**
    * Use this method to get information about other fields that have the same
    * parent object. Works the same way as field(). This is helpful when you use
    * sub-schemas or when you're dealing with arrays of objects.
    */
  def siblingField(): js.Any = js.native
}

object CustomValidationContext {
  @scala.inline
  def apply(
    addValidationErrors: SimpleSchemaValidationError => js.Any,
    definition: SchemaDefinition,
    field: () => js.Any,
    genericKey: String,
    isSet: Boolean,
    key: String,
    operator: js.Any,
    siblingField: () => js.Any,
    validationContext: ValidationContext,
    value: js.Any
  ): CustomValidationContext = {
    val __obj = js.Dynamic.literal(addValidationErrors = js.Any.fromFunction1(addValidationErrors), definition = definition.asInstanceOf[js.Any], field = js.Any.fromFunction0(field), genericKey = genericKey.asInstanceOf[js.Any], isSet = isSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], siblingField = js.Any.fromFunction0(siblingField), validationContext = validationContext.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomValidationContext]
  }
  @scala.inline
  implicit class CustomValidationContextOps[Self <: CustomValidationContext] (val x: Self) extends AnyVal {
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
    def setAddValidationErrors(value: SimpleSchemaValidationError => js.Any): Self = this.set("addValidationErrors", js.Any.fromFunction1(value))
    @scala.inline
    def setDefinition(value: SchemaDefinition): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: () => js.Any): Self = this.set("field", js.Any.fromFunction0(value))
    @scala.inline
    def setGenericKey(value: String): Self = this.set("genericKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSet(value: Boolean): Self = this.set("isSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: js.Any): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiblingField(value: () => js.Any): Self = this.set("siblingField", js.Any.fromFunction0(value))
    @scala.inline
    def setValidationContext(value: ValidationContext): Self = this.set("validationContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomValidationContext extends js.Object {
  /** The schema definition object. */
  var definition: SchemaDefinition
  /** The generic name of the schema key (e.g., "addresses.$.street") */
  var genericKey: java.lang.String
  /** Does the object being validated have this key set? */
  var isSet: scala.Boolean
  /** The name of the schema key (e.g., "addresses.0.street") */
  var key: java.lang.String
  /** The Mongo operator for which we're doing validation. Might be null. */
  var operator: js.Any
  var validationContext: ValidationContext
  /** Value to validate */
  var value: js.Any
  /**
    * Call this to add validation errors for any key. In general, you should use
    * this to add errors for other keys. To add an error for the current key,
    * return the error type string. If you do use this to add an error for the
    * current key, return false from your custom validation function.
    */
  def addValidationErrors(errors: SimpleSchemaValidationError): js.Any
  /**
    * Use this method to get information about other fields. Pass a field name
    * (non-generic schema key) as the only argument. The return object will
    * have isSet, value, and operator properties for that field.
    */
  def field(): js.Any
  /**
    * Use this method to get information about other fields that have the same
    * parent object. Works the same way as field(). This is helpful when you use
    * sub-schemas or when you're dealing with arrays of objects.
    */
  def siblingField(): js.Any
}

object CustomValidationContext {
  @scala.inline
  def apply(
    addValidationErrors: js.Function1[SimpleSchemaValidationError, js.Any],
    definition: SchemaDefinition,
    field: js.Function0[js.Any],
    genericKey: java.lang.String,
    isSet: scala.Boolean,
    key: java.lang.String,
    operator: js.Any,
    siblingField: js.Function0[js.Any],
    validationContext: ValidationContext,
    value: js.Any
  ): CustomValidationContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addValidationErrors")(addValidationErrors)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("genericKey")(genericKey)
    __obj.updateDynamic("isSet")(isSet)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("siblingField")(siblingField)
    __obj.updateDynamic("validationContext")(validationContext)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomValidationContext]
  }
}


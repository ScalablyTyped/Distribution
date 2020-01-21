package typings.reactNativeJoi.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnySchema
  extends _Schema
     with JoiObject {
  var schemaType: js.UndefOr[Types | String] = js.native
  /**
    * Whitelists a value
    */
  def allow(values: js.Any*): this.type = js.native
  def allow(values: js.Array[_]): this.type = js.native
  /**
    * By default, some Joi methods to function properly need to rely on the Joi instance they are attached to because
    * they use `this` internally.
    * So `Joi.string()` works but if you extract the function from it and call `string()` it won't.
    * `bind()` creates a new Joi instance where all the functions relying on `this` are bound to the Joi instance.
    */
  def bind(): this.type = js.native
  /**
    * Returns a new type that is the result of adding the rules of one type to another.
    */
  def concat(schema: this.type): this.type = js.native
  /**
    * Sets a default value if the original value is undefined.
    * @param value - the value.
    *   value supports references.
    *   value may also be a function which returns the default value.
    *   If value is specified as a function that accepts a single parameter, that parameter will be a context
    *    object that can be used to derive the resulting value. This clones the object however, which incurs some
    *    overhead so if you don't need access to the context define your method so that it does not accept any
    *    parameters.
    *   Without any value, default has no effect, except for object that will then create nested defaults
    *    (applying inner defaults of that object).
    *
    * Note that if value is an object, any changes to the object after default() is called will change the
    *  reference and any future assignment.
    *
    * Additionally, when specifying a method you must either have a description property on your method or the
    *  second parameter is required.
    */
  def default(): this.type = js.native
  def default(value: js.Any): this.type = js.native
  def default(value: js.Any, description: String): this.type = js.native
  /**
    * Returns a plain object representing the schema's rules and properties
    */
  def describe(): Description_ = js.native
  /**
    * Annotates the key
    */
  def description(desc: String): this.type = js.native
  def disallow(values: js.Any*): this.type = js.native
  def disallow(values: js.Array[_]): this.type = js.native
  /**
    * Considers anything that matches the schema to be empty (undefined).
    * @param schema - any object or joi schema to match. An undefined schema unsets that rule.
    */
  def empty(): this.type = js.native
  def empty(schema: SchemaLike): this.type = js.native
  def equal(values: js.Any*): this.type = js.native
  def equal(values: js.Array[_]): this.type = js.native
  def error(err: ValidationErrorFunction): this.type = js.native
  def error(err: ValidationErrorFunction, options: ErrorOptions): this.type = js.native
  /**
    * Overrides the default joi error with a custom error if the rule fails where:
    * @param err - can be:
    *   an instance of `Error` - the override error.
    *   a `function(errors)`, taking an array of errors as argument, where it must either:
    *    return a `string` - substitutes the error message with this text
    *    return a single ` object` or an `Array` of it, where:
    *     `type` - optional parameter providing the type of the error (eg. `number.min`).
    *     `message` - optional parameter if `template` is provided, containing the text of the error.
    *     `template` - optional parameter if `message` is provided, containing a template string, using the same format as usual joi language errors.
    *     `context` - optional parameter, to provide context to your error if you are using the `template`.
    *    return an `Error` - same as when you directly provide an `Error`, but you can customize the error message based on the errors.
    *
    * Note that if you provide an `Error`, it will be returned as-is, unmodified and undecorated with any of the
    * normal joi error properties. If validation fails and another error is found before the error
    * override, that error will be returned and the override will be ignored (unless the `abortEarly`
    * option has been set to `false`).
    */
  def error(err: Error): this.type = js.native
  def error(err: Error, options: ErrorOptions): this.type = js.native
  /**
    * Annotates the key with an example value, must be valid.
    */
  def example(value: js.Any): this.type = js.native
  def exist(): this.type = js.native
  /**
    * Marks a key as forbidden which will not allow any value except undefined. Used to explicitly forbid keys.
    */
  def forbidden(): this.type = js.native
  /**
    * Blacklists a value
    */
  def invalid(values: js.Any*): this.type = js.native
  def invalid(values: js.Array[_]): this.type = js.native
  /**
    * Overrides the key name in error messages.
    */
  def label(name: String): this.type = js.native
  /**
    * Attaches metadata to the key.
    */
  def meta(meta: js.Object): this.type = js.native
  def not(values: js.Any*): this.type = js.native
  def not(values: js.Array[_]): this.type = js.native
  /**
    * Annotates the key
    */
  def notes(notes: String): this.type = js.native
  def notes(notes: js.Array[String]): this.type = js.native
  def only(values: js.Any*): this.type = js.native
  def only(values: js.Array[_]): this.type = js.native
  /**
    * Marks a key as optional which will allow undefined as values. Used to annotate the schema for readability as all keys are optional by default.
    */
  def optional(): this.type = js.native
  /**
    * Overrides the global validate() options for the current key and any sub-key.
    */
  def options(options: ValidationOptions): this.type = js.native
  /**
    * Outputs the original untouched value instead of the casted value.
    */
  def raw(): this.type = js.native
  def raw(isRaw: Boolean): this.type = js.native
  /**
    * Marks a key as required which will not allow undefined as value. All keys are optional by default.
    */
  def required(): this.type = js.native
  /**
    * Sets the options.convert options to false which prevent type casting for the current key and any child keys.
    */
  def strict(): this.type = js.native
  def strict(isStrict: Boolean): this.type = js.native
  /**
    * Marks a key to be removed from a resulting object or array after validation. Used to sanitize output.
    */
  def strip(): this.type = js.native
  /**
    * Annotates the key
    */
  def tags(notes: String): this.type = js.native
  def tags(notes: js.Array[String]): this.type = js.native
  /**
    * Annotates the key with an unit name.
    */
  def unit(name: String): this.type = js.native
  /**
    * Adds the provided values into the allowed whitelist and marks them as the only valid values allowed.
    */
  def valid(values: js.Any*): this.type = js.native
  def valid(values: js.Array[_]): this.type = js.native
  /**
    * Validates a value using the schema and options.
    */
  def validate[T](value: T): ValidationResult[T] = js.native
  def validate[T](value: T, options: ValidationOptions): ValidationResult[T] = js.native
  def validate[T, R](value: T, callback: js.Function2[/* err */ ValidationError, /* value */ T, R]): R = js.native
  def validate[T, R](
    value: T,
    options: ValidationOptions,
    callback: js.Function2[/* err */ ValidationError, /* value */ T, R]
  ): R = js.native
  /**
    * Converts the type into an alternatives type where the conditions are merged into the type definition where:
    */
  def when(ref: String, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Reference, options: WhenOptions): AlternativesSchema = js.native
  def when(ref: Schema, options: WhenSchemaOptions): AlternativesSchema = js.native
}


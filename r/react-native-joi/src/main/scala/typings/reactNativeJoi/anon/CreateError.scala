package typings.reactNativeJoi.anon

import typings.reactNativeJoi.mod.Context
import typings.reactNativeJoi.mod.Err
import typings.reactNativeJoi.mod.State
import typings.reactNativeJoi.mod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateError extends js.Object {
  /**
    * Creates a joi error object.
    * Used in conjunction with custom rules.
    * @param type - the type of rule to create the error for.
    * @param context - provide properties that will be available in the `language` templates.
    * @param state - should the context passed into the `validate` function in a custom rule
    * @param options - should the context passed into the `validate` function in a custom rule
    */
  def createError(`type`: String, context: Context, state: State, options: ValidationOptions): Err
}

object CreateError {
  @scala.inline
  def apply(createError: (String, Context, State, ValidationOptions) => Err): CreateError = {
    val __obj = js.Dynamic.literal(createError = js.Any.fromFunction4(createError))
    __obj.asInstanceOf[CreateError]
  }
}


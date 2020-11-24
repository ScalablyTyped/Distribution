package typings.reactNativeJoi.anon

import typings.reactNativeJoi.mod.Context
import typings.reactNativeJoi.mod.Err
import typings.reactNativeJoi.mod.State
import typings.reactNativeJoi.mod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateError extends js.Object {
  
  /**
    * Creates a joi error object.
    * Used in conjunction with custom rules.
    * @param type - the type of rule to create the error for.
    * @param context - provide properties that will be available in the `language` templates.
    * @param state - should the context passed into the `validate` function in a custom rule
    * @param options - should the context passed into the `validate` function in a custom rule
    */
  def createError(`type`: String, context: Context, state: State, options: ValidationOptions): Err = js.native
}
object CreateError {
  
  @scala.inline
  def apply(createError: (String, Context, State, ValidationOptions) => Err): CreateError = {
    val __obj = js.Dynamic.literal(createError = js.Any.fromFunction4(createError))
    __obj.asInstanceOf[CreateError]
  }
  
  @scala.inline
  implicit class CreateErrorOps[Self <: CreateError] (val x: Self) extends AnyVal {
    
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
    def setCreateError(value: (String, Context, State, ValidationOptions) => Err): Self = this.set("createError", js.Any.fromFunction4(value))
  }
}

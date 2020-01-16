package typings.reactDashJsonschemaDashForm

import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.AjvError
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.ErrorSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorSchema extends js.Object {
  var errorSchema: ErrorSchema
  var errors: js.Array[AjvError]
}

object Anon_ErrorSchema {
  @scala.inline
  def apply(errorSchema: ErrorSchema, errors: js.Array[AjvError]): Anon_ErrorSchema = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorSchema]
  }
}


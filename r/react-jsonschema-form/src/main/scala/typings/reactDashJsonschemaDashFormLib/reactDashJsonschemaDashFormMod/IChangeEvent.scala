package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IChangeEvent[T] extends js.Object {
  var edit: scala.Boolean
  var errorSchema: FormValidation
  var errors: js.Array[AjvError]
  var formData: T
  var idSchema: IdSchema
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var status: js.UndefOr[java.lang.String] = js.undefined
  var uiSchema: UiSchema
}


package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FieldTemplateOverrides extends js.Object {
  /** Defines templates for rendering the field on a display form. */
  var DisplayForm: js.UndefOr[FieldInFormCallback] = js.undefined
  /** Defines templates for rendering the field on an edit form. */
  var EditForm: js.UndefOr[FieldInFormCallback] = js.undefined
  /** Defines templates for rendering the field on a new form. */
  var NewForm: js.UndefOr[FieldInFormCallback] = js.undefined
  /** Defines templates for rendering the field on a list view. */
  var View: js.UndefOr[FieldInViewCallback] = js.undefined
}


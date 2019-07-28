package typings.sharepoint.SPClientTemplatesNs

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

object FieldTemplateOverrides {
  @scala.inline
  def apply(
    DisplayForm: FieldInFormCallback = null,
    EditForm: FieldInFormCallback = null,
    NewForm: FieldInFormCallback = null,
    View: FieldInViewCallback = null
  ): FieldTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (DisplayForm != null) __obj.updateDynamic("DisplayForm")(DisplayForm)
    if (EditForm != null) __obj.updateDynamic("EditForm")(EditForm)
    if (NewForm != null) __obj.updateDynamic("NewForm")(NewForm)
    if (View != null) __obj.updateDynamic("View")(View)
    __obj.asInstanceOf[FieldTemplateOverrides]
  }
}


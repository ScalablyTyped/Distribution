package typings.sharepoint.SPClientTemplates

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
    DisplayForm: /* renderContext */ RenderContextFieldInForm => String = null,
    EditForm: /* renderContext */ RenderContextFieldInForm => String = null,
    NewForm: /* renderContext */ RenderContextFieldInForm => String = null,
    View: /* renderContext */ RenderContextFieldInView => String = null
  ): FieldTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (DisplayForm != null) __obj.updateDynamic("DisplayForm")(js.Any.fromFunction1(DisplayForm))
    if (EditForm != null) __obj.updateDynamic("EditForm")(js.Any.fromFunction1(EditForm))
    if (NewForm != null) __obj.updateDynamic("NewForm")(js.Any.fromFunction1(NewForm))
    if (View != null) __obj.updateDynamic("View")(js.Any.fromFunction1(View))
    __obj.asInstanceOf[FieldTemplateOverrides]
  }
}


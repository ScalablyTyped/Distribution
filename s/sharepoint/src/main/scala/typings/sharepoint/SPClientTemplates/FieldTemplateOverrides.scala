package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldTemplateOverrides extends js.Object {
  /** Defines templates for rendering the field on a display form. */
  var DisplayForm: js.UndefOr[FieldInFormCallback] = js.native
  /** Defines templates for rendering the field on an edit form. */
  var EditForm: js.UndefOr[FieldInFormCallback] = js.native
  /** Defines templates for rendering the field on a new form. */
  var NewForm: js.UndefOr[FieldInFormCallback] = js.native
  /** Defines templates for rendering the field on a list view. */
  var View: js.UndefOr[FieldInViewCallback] = js.native
}

object FieldTemplateOverrides {
  @scala.inline
  def apply(): FieldTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldTemplateOverrides]
  }
  @scala.inline
  implicit class FieldTemplateOverridesOps[Self <: FieldTemplateOverrides] (val x: Self) extends AnyVal {
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
    def setDisplayForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = this.set("DisplayForm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisplayForm: Self = this.set("DisplayForm", js.undefined)
    @scala.inline
    def setEditForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = this.set("EditForm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEditForm: Self = this.set("EditForm", js.undefined)
    @scala.inline
    def setNewForm(value: /* renderContext */ RenderContextFieldInForm => String): Self = this.set("NewForm", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNewForm: Self = this.set("NewForm", js.undefined)
    @scala.inline
    def setView(value: /* renderContext */ RenderContextFieldInView => String): Self = this.set("View", js.Any.fromFunction1(value))
    @scala.inline
    def deleteView: Self = this.set("View", js.undefined)
  }
  
}


package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templates extends js.Object {
   // TODO: determine appropriate context type and purpose of this template
  var Body: js.UndefOr[RenderCallback | String] = js.native
  /** Defines templates for fields rendering. The field is specified by it's internal name. */
  var Fields: js.UndefOr[FieldTemplates] = js.native
  /** Defines template for rendering list view footer.
    Can be either string or SingleTemplateCallback */
  var Footer: js.UndefOr[SingleTemplateCallback | String] = js.native
   // TODO: determine appropriate context type and purpose of this template
  /** Defines templates for rendering groups (aggregations). */
  var Group: js.UndefOr[GroupCallback | String] = js.native
  /** Defines template for rendering list view header.
    Can be either string or SingleTemplateCallback */
  var Header: js.UndefOr[SingleTemplateCallback | String] = js.native
  /** Defines templates for list items rendering. */
  var Item: js.UndefOr[ItemCallback | String] = js.native
  var View: js.UndefOr[RenderCallback | String] = js.native
}

object Templates {
  @scala.inline
  def apply(): Templates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates]
  }
  @scala.inline
  implicit class TemplatesOps[Self <: Templates] (val x: Self) extends AnyVal {
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
    def setBodyFunction1(value: /* ctx */ RenderContext => Unit): Self = this.set("Body", js.Any.fromFunction1(value))
    @scala.inline
    def setBody(value: RenderCallback | String): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    @scala.inline
    def setFields(value: FieldTemplates): Self = this.set("Fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
    @scala.inline
    def setFooterFunction1(value: /* renderContext */ RenderContextInView => String): Self = this.set("Footer", js.Any.fromFunction1(value))
    @scala.inline
    def setFooter(value: SingleTemplateCallback | String): Self = this.set("Footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("Footer", js.undefined)
    @scala.inline
    def setGroupFunction1(value: /* renderContext */ RenderContextGroupInView => String): Self = this.set("Group", js.Any.fromFunction1(value))
    @scala.inline
    def setGroup(value: GroupCallback | String): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
    @scala.inline
    def setHeaderFunction1(value: /* renderContext */ RenderContextInView => String): Self = this.set("Header", js.Any.fromFunction1(value))
    @scala.inline
    def setHeader(value: SingleTemplateCallback | String): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("Header", js.undefined)
    @scala.inline
    def setItemFunction1(value: /* renderContext */ RenderContext => String): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: ItemCallback | String): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
    @scala.inline
    def setViewFunction1(value: /* ctx */ RenderContext => Unit): Self = this.set("View", js.Any.fromFunction1(value))
    @scala.inline
    def setView(value: RenderCallback | String): Self = this.set("View", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("View", js.undefined)
  }
  
}


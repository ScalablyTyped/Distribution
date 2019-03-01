package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templates extends js.Object {
   // TODO: determine appropriate context type and purpose of this template
  var Body: js.UndefOr[RenderCallback | java.lang.String] = js.undefined
  /** Defines templates for fields rendering. The field is specified by it's internal name. */
  var Fields: js.UndefOr[FieldTemplates] = js.undefined
  /** Defines template for rendering list view footer.
    Can be either string or SingleTemplateCallback */
  var Footer: js.UndefOr[SingleTemplateCallback | java.lang.String] = js.undefined
   // TODO: determine appropriate context type and purpose of this template
  /** Defines templates for rendering groups (aggregations). */
  var Group: js.UndefOr[GroupCallback | java.lang.String] = js.undefined
  /** Defines template for rendering list view header.
    Can be either string or SingleTemplateCallback */
  var Header: js.UndefOr[SingleTemplateCallback | java.lang.String] = js.undefined
  /** Defines templates for list items rendering. */
  var Item: js.UndefOr[ItemCallback | java.lang.String] = js.undefined
  var View: js.UndefOr[RenderCallback | java.lang.String] = js.undefined
}

object Templates {
  @scala.inline
  def apply(
    Body: RenderCallback | java.lang.String = null,
    Fields: FieldTemplates = null,
    Footer: SingleTemplateCallback | java.lang.String = null,
    Group: GroupCallback | java.lang.String = null,
    Header: SingleTemplateCallback | java.lang.String = null,
    Item: ItemCallback | java.lang.String = null,
    View: RenderCallback | java.lang.String = null
  ): Templates = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields)
    if (Footer != null) __obj.updateDynamic("Footer")(Footer.asInstanceOf[js.Any])
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (View != null) __obj.updateDynamic("View")(View.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates]
  }
}


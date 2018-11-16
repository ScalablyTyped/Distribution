package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TemplateOverrides extends js.Object {
   // TODO: determine appropriate context type and purpose of this template
  var Body: js.UndefOr[RenderCallback | java.lang.String] = js.undefined
  /** Defines templates for fields rendering. The field is specified by it's internal name. */
  var Fields: js.UndefOr[FieldTemplateMap] = js.undefined
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


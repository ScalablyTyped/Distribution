package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOverridesOptions extends js.Object {
  /** Base view ID (SPView.BaseViewID) for which the template should be applied.
    If not defined, the templates will be applied to all views. */
  var BaseViewID: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** List template type (SPList.BaseTemplate) for which the template should be applied.
    If not defined, the templates will be applied to all lists. */
  var ListTemplateType: js.UndefOr[scala.Double] = js.undefined
  /** Callbacks called after rendered html inserted into DOM. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  /** Callbacks called before rendering starts. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  /** Template overrides */
  var Templates: js.UndefOr[TemplateOverrides] = js.undefined
  /** View style (SPView.StyleID) for which the templates should be applied.
    If not defined, the templates will be applied only to default view style. */
  var ViewStyle: js.UndefOr[scala.Double] = js.undefined
}


package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacroOpts extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var css: js.UndefOr[String | CssFn] = js.undefined
  var cssData: js.UndefOr[ValueMap] = js.undefined
  var cssId: js.UndefOr[String] = js.undefined
  var noCssTransform: js.UndefOr[Boolean] = js.undefined
  var partials: js.UndefOr[PartialMap] = js.undefined
  var template: js.UndefOr[Template] = js.undefined
}

object MacroOpts {
  @scala.inline
  def apply(
    attributes: js.Array[String] = null,
    css: String | CssFn = null,
    cssData: ValueMap = null,
    cssId: String = null,
    noCssTransform: js.UndefOr[Boolean] = js.undefined,
    partials: PartialMap = null,
    template: Template = null
  ): MacroOpts = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (cssData != null) __obj.updateDynamic("cssData")(cssData)
    if (cssId != null) __obj.updateDynamic("cssId")(cssId)
    if (!js.isUndefined(noCssTransform)) __obj.updateDynamic("noCssTransform")(noCssTransform)
    if (partials != null) __obj.updateDynamic("partials")(partials)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroOpts]
  }
}


package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BsSize extends js.Object {
  var bsSize: js.UndefOr[reactstrapLib.reactstrapLibStrings.lg | reactstrapLib.reactstrapLibStrings.sm] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var invalid: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var `type`: reactstrapLib.libCustomInputMod.CustomInputType
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BsSize {
  @scala.inline
  def apply(
    `type`: reactstrapLib.libCustomInputMod.CustomInputType,
    bsSize: reactstrapLib.reactstrapLibStrings.lg | reactstrapLib.reactstrapLibStrings.sm = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    invalid: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BsSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[Anon_BsSize]
  }
}


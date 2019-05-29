package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  val fit: js.UndefOr[scala.Boolean] = js.undefined
  val invert: js.UndefOr[scala.Boolean] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  val options: js.UndefOr[js.Array[reactDashElementalLib.Anon_LabelValueReactNode]] = js.undefined
  val secondary: js.UndefOr[scala.Boolean] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val value: js.UndefOr[java.lang.String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    fit: js.UndefOr[scala.Boolean] = js.undefined,
    invert: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    options: js.Array[reactDashElementalLib.Anon_LabelValueReactNode] = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    value: java.lang.String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TabsProps]
  }
}


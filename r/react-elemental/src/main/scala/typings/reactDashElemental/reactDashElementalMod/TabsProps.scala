package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
import typings.reactDashElemental.Anon_LabelValueReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  val fit: js.UndefOr[Boolean] = js.undefined
  val invert: js.UndefOr[Boolean] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  val options: js.UndefOr[js.Array[Anon_LabelValueReactNode]] = js.undefined
  val secondary: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val value: js.UndefOr[String] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    fit: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Unit = null,
    options: js.Array[Anon_LabelValueReactNode] = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    value: String = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}


package typings.reactDashOnsenui

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledEModifier extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.undefined
  var ripple: js.UndefOr[Boolean] = js.undefined
}

object Anon_DisabledEModifier {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    name: String = null,
    onClick: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    ripple: js.UndefOr[Boolean] = js.undefined
  ): Anon_DisabledEModifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple)
    __obj.asInstanceOf[Anon_DisabledEModifier]
  }
}


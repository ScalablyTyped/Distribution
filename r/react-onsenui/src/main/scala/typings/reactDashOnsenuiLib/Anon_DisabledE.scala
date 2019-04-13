package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledE extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]], 
      scala.Unit
    ]
  ] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var ripple: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DisabledE {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    modifier: java.lang.String = null,
    name: java.lang.String = null,
    onClick: /* e */ js.UndefOr[reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]] => scala.Unit = null,
    position: java.lang.String = null,
    ripple: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DisabledE = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple)
    __obj.asInstanceOf[Anon_DisabledE]
  }
}


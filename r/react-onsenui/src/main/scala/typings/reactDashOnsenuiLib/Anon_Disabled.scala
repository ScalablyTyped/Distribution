package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    modifier: java.lang.String = null,
    onClick: js.Function1[
      /* e */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      scala.Unit
    ] = null
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[Anon_Disabled]
  }
}


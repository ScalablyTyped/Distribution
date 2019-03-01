package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
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

object Anon_E {
  @scala.inline
  def apply(
    icon: java.lang.String = null,
    modifier: java.lang.String = null,
    onClick: js.Function1[
      /* e */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      scala.Unit
    ] = null
  ): Anon_E = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[Anon_E]
  }
}


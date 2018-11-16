package typings
package reactDashMdLib.libButtonsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashMdLib.libButtonsButtonMod.SharedButtonProps because Would inherit conflicting mutable fields List(disabled))*/

trait ButtonProps
  extends reactDashMdLib.libInksInjectInkMod.InjectedInkProps
     with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps
     with // for the `component` prop until refactored out
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var fixedPosition: js.UndefOr[FixedPositions] = js.undefined
}


package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsIndicatorsMod {
  type IndicatorProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_ChildrenIsFocused
  type LoadingIconProps[OptionType] = reactDashSelectLib.Anon_IsFocusedIsRtl with reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_SizeNumber
  type baseCSS = js.Function1[/* props */ IndicatorProps[js.Any], reactLib.reactMod.ReactNs.CSSProperties]
}

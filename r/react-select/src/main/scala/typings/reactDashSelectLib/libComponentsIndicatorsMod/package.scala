package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsIndicatorsMod {
  type IndicatorProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_ChildrenInnerPropsIsFocused
  type LoadingIconProps[OptionType] = reactDashSelectLib.Anon_InnerProps with reactDashSelectLib.libTypesMod.CommonProps[OptionType]
  type baseCSS = js.Function1[/* props */ IndicatorProps[js.Any], reactLib.reactMod.CSSProperties]
}

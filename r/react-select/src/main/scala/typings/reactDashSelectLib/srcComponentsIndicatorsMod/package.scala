package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsIndicatorsMod {
  type IndicatorProps[OptionType] = reactDashSelectLib.srcTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_ChildrenInnerPropsIsFocused
  type LoadingIconProps[OptionType] = reactDashSelectLib.Anon_InnerProps with reactDashSelectLib.srcTypesMod.CommonProps[OptionType]
  type baseCSS = js.Function1[/* props */ IndicatorProps[js.Any], reactLib.reactMod.CSSProperties]
}

package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsIndicatorsMod {
  import typings.react.reactMod.CSSProperties
  import typings.reactDashSelect.Anon_ChildrenInnerPropsIsFocused
  import typings.reactDashSelect.Anon_InnerProps
  import typings.reactDashSelect.srcTypesMod.CommonProps

  type IndicatorProps[OptionType] = CommonProps[OptionType] with Anon_ChildrenInnerPropsIsFocused
  type LoadingIconProps[OptionType] = Anon_InnerProps with CommonProps[OptionType]
  type baseCSS = js.Function1[/* props */ IndicatorProps[js.Any], CSSProperties]
}

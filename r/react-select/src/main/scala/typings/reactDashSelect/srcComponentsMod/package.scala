package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMod {
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ReactElement
  import typings.reactDashSelect.srcComponentsIndicatorsMod.IndicatorProps
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase
  import typings.std.Partial

  type IndicatorComponentType[OptionType /* <: OptionTypeBase */] = ComponentType[IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType /* <: OptionTypeBase */] = ReactElement | js.Array[ReactElement]
  type SelectComponentsConfig[OptionType /* <: OptionTypeBase */] = Partial[SelectComponents[OptionType]]
}

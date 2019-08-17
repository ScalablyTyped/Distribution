package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMod {
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ReactElement
  import typings.reactDashSelect.srcComponentsIndicatorsMod.IndicatorProps
  import typings.std.Partial

  type IndicatorComponentType[OptionType] = ComponentType[IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType] = ReactElement | js.Array[ReactElement]
  type SelectComponentsConfig[OptionType] = Partial[SelectComponents[OptionType]]
}

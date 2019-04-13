package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsMod {
  type IndicatorComponentType[OptionType] = reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType] = (reactLib.reactMod.ReactElement[
    reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsPlaceholderMod.PlaceholderProps[OptionType]]
  ]) | (reactLib.reactMod.ReactElement[
    reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsSingleValueMod.SingleValueProps[OptionType]]
  ]) | (js.Array[
    reactLib.reactMod.ReactElement[
      reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsMultiValueMod.MultiValueProps[OptionType]]
    ]
  ])
  type SelectComponentsConfig[OptionType] = stdLib.Partial[SelectComponents[OptionType]]
}

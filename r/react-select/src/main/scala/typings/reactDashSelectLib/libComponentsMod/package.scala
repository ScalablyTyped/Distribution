package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsMod {
  type IndicatorComponentType[OptionType] = reactLib.reactMod.ReactNs.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType] = reactLib.reactMod.ReactNs.ReactElement | js.Array[reactLib.reactMod.ReactNs.ReactElement]
  type SelectComponentsConfig[OptionType] = stdLib.Partial[SelectComponents[OptionType]]
}

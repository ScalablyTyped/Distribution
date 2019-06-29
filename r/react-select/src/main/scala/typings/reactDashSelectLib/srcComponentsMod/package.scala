package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMod {
  type IndicatorComponentType[OptionType] = reactLib.reactMod.ComponentType[reactDashSelectLib.srcComponentsIndicatorsMod.IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType] = reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement]
  type SelectComponentsConfig[OptionType] = stdLib.Partial[SelectComponents[OptionType]]
}

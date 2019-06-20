package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsMod {
  type IndicatorComponentType[OptionType] = reactLib.reactMod.ComponentType[reactDashSelectLib.libComponentsIndicatorsMod.IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType] = reactLib.reactMod.ReactElement | js.Array[reactLib.reactMod.ReactElement]
  type SelectComponentsConfig[OptionType] = stdLib.Partial[SelectComponents[OptionType]]
}

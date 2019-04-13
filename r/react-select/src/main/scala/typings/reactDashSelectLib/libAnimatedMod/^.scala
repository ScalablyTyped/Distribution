package typings
package reactDashSelectLib.libAnimatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/animated", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Input: reactLib.reactMod.ComponentType[reactDashSelectLib.libAnimatedInputMod.AnimatedInputProps] = js.native
  val MultiValue: reactLib.reactMod.ComponentType[reactDashSelectLib.libAnimatedMultiValueMod.AnimatedMultiValueProps[js.Any]] = js.native
  val Placeholder: reactLib.reactMod.ComponentType[reactDashSelectLib.libAnimatedPlaceholderMod.AnimatedPlaceholderProps[js.Any]] = js.native
  val SingleValue: reactLib.reactMod.ComponentType[reactDashSelectLib.libAnimatedSingleValueMod.AnimatedSingleValueProps[js.Any]] = js.native
  val ValueContainer: reactLib.reactMod.ComponentType[
    reactDashSelectLib.libAnimatedValueContainerMod.AnimatedValueContainerProps[js.Any]
  ] = js.native
  def default[OptionType](): reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
  def default[OptionType](externalComponents: reactDashSelectLib.libComponentsMod.SelectComponentsConfig[OptionType]): reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType](): reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType](externalComponents: reactDashSelectLib.libComponentsMod.SelectComponentsConfig[OptionType]): reactDashSelectLib.libComponentsMod.SelectComponents[OptionType] = js.native
}


package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.OptionsConfig
import typings.storybookComponents.controlsTypesMod.OptionsSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/options/Options", JSImport.Namespace)
@js.native
object optionsOptionsMod extends js.Object {
  
  val OptionsControl: FC[OptionsProps] = js.native
  
  type OptionsProps = ControlProps[OptionsSelection] with OptionsConfig
}

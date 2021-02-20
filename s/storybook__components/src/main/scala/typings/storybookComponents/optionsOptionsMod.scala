package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.OptionsConfig
import typings.storybookComponents.controlsTypesMod.OptionsSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsOptionsMod {
  
  @JSImport("@storybook/components/dist/controls/options/Options", "OptionsControl")
  @js.native
  val OptionsControl: FC[OptionsProps] = js.native
  
  type OptionsProps = ControlProps[OptionsSelection] with OptionsConfig
}

package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ColorConfig
import typings.storybookComponents.controlsTypesMod.ColorValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  
  val ColorControl: FC[ColorProps] = js.native
  
  type ColorProps = ControlProps[ColorValue] with ColorConfig
}

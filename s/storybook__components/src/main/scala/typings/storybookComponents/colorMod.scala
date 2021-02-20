package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ColorConfig
import typings.storybookComponents.controlsTypesMod.ColorValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@storybook/components/dist/controls/Color", "ColorControl")
  @js.native
  val ColorControl: FC[ColorProps] = js.native
  
  type ColorProps = ControlProps[ColorValue] with ColorConfig
}

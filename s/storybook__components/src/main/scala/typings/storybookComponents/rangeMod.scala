package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NumberValue
import typings.storybookComponents.controlsTypesMod.RangeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@storybook/components/dist/controls/Range", "RangeControl")
  @js.native
  val RangeControl: FC[RangeProps] = js.native
  
  type RangeProps = (ControlProps[NumberValue | Null]) with RangeConfig
}

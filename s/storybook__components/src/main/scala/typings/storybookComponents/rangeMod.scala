package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NumberValue
import typings.storybookComponents.controlsTypesMod.RangeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  
  val RangeControl: FC[RangeProps] = js.native
  
  type RangeProps = (ControlProps[NumberValue | Null]) with RangeConfig
}

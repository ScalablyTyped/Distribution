package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NumberConfig
import typings.storybookComponents.controlsTypesMod.NumberValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Number", JSImport.Namespace)
@js.native
object numberMod extends js.Object {
  
  val NumberControl: FC[NumberProps] = js.native
  
  def format(value: NumberValue): String = js.native
  
  def parse(value: String): Double = js.native
  
  type NumberProps = (ControlProps[NumberValue | Null]) with NumberConfig
}

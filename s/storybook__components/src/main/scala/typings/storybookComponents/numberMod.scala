package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NumberConfig
import typings.storybookComponents.controlsTypesMod.NumberValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@storybook/components/dist/controls/Number", "NumberControl")
  @js.native
  val NumberControl: FC[NumberProps] = js.native
  
  @JSImport("@storybook/components/dist/controls/Number", "format")
  @js.native
  def format(value: NumberValue): String = js.native
  
  @JSImport("@storybook/components/dist/controls/Number", "parse")
  @js.native
  def parse(value: String): Double = js.native
  
  type NumberProps = (ControlProps[NumberValue | Null]) with NumberConfig
}

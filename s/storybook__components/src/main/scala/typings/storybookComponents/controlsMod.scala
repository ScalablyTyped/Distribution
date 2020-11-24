package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.arrayMod.ArrayProps
import typings.storybookComponents.booleanMod.BooleanProps
import typings.storybookComponents.colorMod.ColorProps
import typings.storybookComponents.controlsTypesMod.NumberValue
import typings.storybookComponents.dateMod.DateProps
import typings.storybookComponents.numberMod.NumberProps
import typings.storybookComponents.objectMod.ObjectProps
import typings.storybookComponents.optionsOptionsMod.OptionsProps
import typings.storybookComponents.rangeMod.RangeProps
import typings.storybookComponents.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls", JSImport.Namespace)
@js.native
object controlsMod extends js.Object {
  
  val ArrayControl: FC[ArrayProps] = js.native
  
  val BooleanControl: FC[BooleanProps] = js.native
  
  val ColorControl: FC[ColorProps] = js.native
  
  val DateControl: FC[DateProps] = js.native
  
  val NumberControl: FC[NumberProps] = js.native
  
  val ObjectControl: FC[ObjectProps] = js.native
  
  val OptionsControl: FC[OptionsProps] = js.native
  
  val RangeControl: FC[RangeProps] = js.native
  
  val TextControl: FC[TextProps] = js.native
  
  def format(value: NumberValue): String = js.native
  
  def parse(value: String): Double = js.native
}

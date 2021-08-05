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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsMod {
  
  @JSImport("@storybook/components/dist/controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/components/dist/controls", "ArrayControl")
  @js.native
  val ArrayControl: FC[ArrayProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "BooleanControl")
  @js.native
  val BooleanControl: FC[BooleanProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "ColorControl")
  @js.native
  val ColorControl: FC[ColorProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "DateControl")
  @js.native
  val DateControl: FC[DateProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "NumberControl")
  @js.native
  val NumberControl: FC[NumberProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "ObjectControl")
  @js.native
  val ObjectControl: FC[ObjectProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "OptionsControl")
  @js.native
  val OptionsControl: FC[OptionsProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "RangeControl")
  @js.native
  val RangeControl: FC[RangeProps] = js.native
  
  @JSImport("@storybook/components/dist/controls", "TextControl")
  @js.native
  val TextControl: FC[TextProps] = js.native
  
  inline def format(value: NumberValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}

package typings.storybookComponents

import typings.std.Date
import typings.std.Record
import typings.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsTypesMod {
  
  @js.native
  trait ArrayConfig extends _Control {
    
    var separator: js.UndefOr[String] = js.native
  }
  object ArrayConfig {
    
    @scala.inline
    def apply(): ArrayConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayConfig]
    }
    
    @scala.inline
    implicit class ArrayConfigMutableBuilder[Self <: ArrayConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type ArrayValue = js.Array[String]
  
  @js.native
  trait BooleanConfig extends _Control
  
  type BooleanValue = Boolean
  
  @js.native
  trait ColorConfig extends _Control {
    
    var presetColors: js.UndefOr[js.Array[String]] = js.native
  }
  object ColorConfig {
    
    @scala.inline
    def apply(): ColorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorConfig]
    }
    
    @scala.inline
    implicit class ColorConfigMutableBuilder[Self <: ColorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPresetColors(value: js.Array[String]): Self = StObject.set(x, "presetColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetColorsUndefined: Self = StObject.set(x, "presetColors", js.undefined)
      
      @scala.inline
      def setPresetColorsVarargs(value: String*): Self = StObject.set(x, "presetColors", js.Array(value :_*))
    }
  }
  
  type ColorValue = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.controlsTypesMod.ArrayConfig
    - typings.storybookComponents.controlsTypesMod.BooleanConfig
    - typings.storybookComponents.controlsTypesMod.ColorConfig
    - typings.storybookComponents.controlsTypesMod.DateConfig
    - typings.storybookComponents.controlsTypesMod.NumberConfig
    - typings.storybookComponents.controlsTypesMod.ObjectConfig
    - typings.storybookComponents.controlsTypesMod.OptionsConfig
    - typings.storybookComponents.controlsTypesMod.RangeConfig
    - typings.storybookComponents.controlsTypesMod.TextConfig
  */
  type Control = _Control | RangeConfig
  
  @js.native
  trait ControlProps[T] extends StObject {
    
    var argType: js.UndefOr[ArgType] = js.native
    
    var defaultValue: js.UndefOr[T] = js.native
    
    var name: String = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    def onChange(value: T): T | Unit = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  object ControlProps {
    
    @scala.inline
    def apply[T](name: String, onChange: T => T | Unit): ControlProps[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ControlProps[T]]
    }
    
    @scala.inline
    implicit class ControlPropsMutableBuilder[Self <: ControlProps[_], T] (val x: Self with ControlProps[T]) extends AnyVal {
      
      @scala.inline
      def setArgType(value: ArgType): Self = StObject.set(x, "argType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgTypeUndefined: Self = StObject.set(x, "argType", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: T => T | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.storybookComponentsStrings.array
    - typings.storybookComponents.storybookComponentsStrings.boolean
    - typings.storybookComponents.storybookComponentsStrings.color
    - typings.storybookComponents.storybookComponentsStrings.date
    - typings.storybookComponents.storybookComponentsStrings.number
    - typings.storybookComponents.storybookComponentsStrings.range
    - typings.storybookComponents.storybookComponentsStrings.`object`
    - typings.storybookComponents.storybookComponentsStrings.text
    - typings.storybookComponents.storybookComponentsStrings.radio
    - typings.storybookComponents.storybookComponentsStrings.`inline-radio`
    - typings.storybookComponents.storybookComponentsStrings.check
    - typings.storybookComponents.storybookComponentsStrings.`inline-check`
    - typings.storybookComponents.storybookComponentsStrings.select
    - typings.storybookComponents.storybookComponentsStrings.`multi-select`
  */
  trait ControlType extends StObject
  object ControlType {
    
    @scala.inline
    def array: typings.storybookComponents.storybookComponentsStrings.array = "array".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.array]
    
    @scala.inline
    def boolean: typings.storybookComponents.storybookComponentsStrings.boolean = "boolean".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.boolean]
    
    @scala.inline
    def check: typings.storybookComponents.storybookComponentsStrings.check = "check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.check]
    
    @scala.inline
    def color: typings.storybookComponents.storybookComponentsStrings.color = "color".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.color]
    
    @scala.inline
    def date: typings.storybookComponents.storybookComponentsStrings.date = "date".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.date]
    
    @scala.inline
    def `inline-check`: typings.storybookComponents.storybookComponentsStrings.`inline-check` = "inline-check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-check`]
    
    @scala.inline
    def `inline-radio`: typings.storybookComponents.storybookComponentsStrings.`inline-radio` = "inline-radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-radio`]
    
    @scala.inline
    def `multi-select`: typings.storybookComponents.storybookComponentsStrings.`multi-select` = "multi-select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`multi-select`]
    
    @scala.inline
    def number: typings.storybookComponents.storybookComponentsStrings.number = "number".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.number]
    
    @scala.inline
    def `object`: typings.storybookComponents.storybookComponentsStrings.`object` = "object".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`object`]
    
    @scala.inline
    def radio: typings.storybookComponents.storybookComponentsStrings.radio = "radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.radio]
    
    @scala.inline
    def range: typings.storybookComponents.storybookComponentsStrings.range = "range".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.range]
    
    @scala.inline
    def select: typings.storybookComponents.storybookComponentsStrings.select = "select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.select]
    
    @scala.inline
    def text: typings.storybookComponents.storybookComponentsStrings.text = "text".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.text]
  }
  
  type Controls = Record[String, Control]
  
  @js.native
  trait DateConfig extends _Control
  
  type DateValue = Date | Double
  
  @js.native
  trait NormalizedOptionsConfig extends StObject {
    
    var options: OptionsObject = js.native
  }
  object NormalizedOptionsConfig {
    
    @scala.inline
    def apply(options: OptionsObject): NormalizedOptionsConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOptionsConfig]
    }
    
    @scala.inline
    implicit class NormalizedOptionsConfigMutableBuilder[Self <: NormalizedOptionsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumberConfig extends _Control {
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object NumberConfig {
    
    @scala.inline
    def apply(): NumberConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberConfig]
    }
    
    @scala.inline
    implicit class NumberConfigMutableBuilder[Self <: NumberConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type NumberValue = Double
  
  @js.native
  trait ObjectConfig extends _Control
  
  type ObjectValue = js.Any
  
  type Options = OptionsArray | OptionsObject
  
  type OptionsArray = js.Array[js.Any]
  
  @js.native
  trait OptionsConfig extends _Control {
    
    var options: Options = js.native
    
    var `type`: OptionsControlType = js.native
  }
  object OptionsConfig {
    
    @scala.inline
    def apply(options: Options, `type`: OptionsControlType): OptionsConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsConfig]
    }
    
    @scala.inline
    implicit class OptionsConfigMutableBuilder[Self <: OptionsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setType(value: OptionsControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookComponents.storybookComponentsStrings.radio
    - typings.storybookComponents.storybookComponentsStrings.`inline-radio`
    - typings.storybookComponents.storybookComponentsStrings.check
    - typings.storybookComponents.storybookComponentsStrings.`inline-check`
    - typings.storybookComponents.storybookComponentsStrings.select
    - typings.storybookComponents.storybookComponentsStrings.`multi-select`
  */
  trait OptionsControlType extends StObject
  object OptionsControlType {
    
    @scala.inline
    def check: typings.storybookComponents.storybookComponentsStrings.check = "check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.check]
    
    @scala.inline
    def `inline-check`: typings.storybookComponents.storybookComponentsStrings.`inline-check` = "inline-check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-check`]
    
    @scala.inline
    def `inline-radio`: typings.storybookComponents.storybookComponentsStrings.`inline-radio` = "inline-radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-radio`]
    
    @scala.inline
    def `multi-select`: typings.storybookComponents.storybookComponentsStrings.`multi-select` = "multi-select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`multi-select`]
    
    @scala.inline
    def radio: typings.storybookComponents.storybookComponentsStrings.radio = "radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.radio]
    
    @scala.inline
    def select: typings.storybookComponents.storybookComponentsStrings.select = "select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.select]
  }
  
  type OptionsMultiSelection = js.Array[js.Any]
  
  type OptionsObject = Record[String, js.Any]
  
  type OptionsSelection = OptionsSingleSelection | OptionsMultiSelection
  
  type OptionsSingleSelection = js.Any
  
  type RangeConfig = NumberConfig
  
  @js.native
  trait TextConfig extends _Control
  
  type TextValue = String
  
  trait _Control extends StObject
  object _Control {
    
    @scala.inline
    def ArrayConfig(): typings.storybookComponents.controlsTypesMod.ArrayConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.ArrayConfig]
    }
    
    @scala.inline
    def ColorConfig(): typings.storybookComponents.controlsTypesMod.ColorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.ColorConfig]
    }
    
    @scala.inline
    def NumberConfig(): typings.storybookComponents.controlsTypesMod.NumberConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.NumberConfig]
    }
    
    @scala.inline
    def OptionsConfig(options: Options, `type`: OptionsControlType): typings.storybookComponents.controlsTypesMod.OptionsConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.OptionsConfig]
    }
  }
}

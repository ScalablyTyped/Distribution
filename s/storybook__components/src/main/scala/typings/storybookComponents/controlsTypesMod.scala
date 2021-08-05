package typings.storybookComponents

import typings.std.Date
import typings.std.Record
import typings.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsTypesMod {
  
  trait ArrayConfig
    extends StObject
       with _Control {
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object ArrayConfig {
    
    inline def apply(): ArrayConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayConfig]
    }
    
    extension [Self <: ArrayConfig](x: Self) {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type ArrayValue = js.Array[String]
  
  trait BooleanConfig
    extends StObject
       with _Control
  
  type BooleanValue = Boolean
  
  trait ColorConfig
    extends StObject
       with _Control {
    
    var presetColors: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ColorConfig {
    
    inline def apply(): ColorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorConfig]
    }
    
    extension [Self <: ColorConfig](x: Self) {
      
      inline def setPresetColors(value: js.Array[String]): Self = StObject.set(x, "presetColors", value.asInstanceOf[js.Any])
      
      inline def setPresetColorsUndefined: Self = StObject.set(x, "presetColors", js.undefined)
      
      inline def setPresetColorsVarargs(value: String*): Self = StObject.set(x, "presetColors", js.Array(value :_*))
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
  
  trait ControlProps[T] extends StObject {
    
    var argType: js.UndefOr[ArgType] = js.undefined
    
    var defaultValue: js.UndefOr[T] = js.undefined
    
    var name: String
    
    var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.undefined
    
    def onChange(value: T): T | Unit
    
    var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object ControlProps {
    
    inline def apply[T](name: String, onChange: T => T | Unit): ControlProps[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ControlProps[T]]
    }
    
    extension [Self <: ControlProps[?], T](x: Self & ControlProps[T]) {
      
      inline def setArgType(value: ArgType): Self = StObject.set(x, "argType", value.asInstanceOf[js.Any])
      
      inline def setArgTypeUndefined: Self = StObject.set(x, "argType", js.undefined)
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: T => T | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    
    inline def array: typings.storybookComponents.storybookComponentsStrings.array = "array".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.array]
    
    inline def boolean: typings.storybookComponents.storybookComponentsStrings.boolean = "boolean".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.boolean]
    
    inline def check: typings.storybookComponents.storybookComponentsStrings.check = "check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.check]
    
    inline def color: typings.storybookComponents.storybookComponentsStrings.color = "color".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.color]
    
    inline def date: typings.storybookComponents.storybookComponentsStrings.date = "date".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.date]
    
    inline def `inline-check`: typings.storybookComponents.storybookComponentsStrings.`inline-check` = "inline-check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-check`]
    
    inline def `inline-radio`: typings.storybookComponents.storybookComponentsStrings.`inline-radio` = "inline-radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-radio`]
    
    inline def `multi-select`: typings.storybookComponents.storybookComponentsStrings.`multi-select` = "multi-select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`multi-select`]
    
    inline def number: typings.storybookComponents.storybookComponentsStrings.number = "number".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.number]
    
    inline def `object`: typings.storybookComponents.storybookComponentsStrings.`object` = "object".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`object`]
    
    inline def radio: typings.storybookComponents.storybookComponentsStrings.radio = "radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.radio]
    
    inline def range: typings.storybookComponents.storybookComponentsStrings.range = "range".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.range]
    
    inline def select: typings.storybookComponents.storybookComponentsStrings.select = "select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.select]
    
    inline def text: typings.storybookComponents.storybookComponentsStrings.text = "text".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.text]
  }
  
  type Controls = Record[String, Control]
  
  trait DateConfig
    extends StObject
       with _Control
  
  type DateValue = Date | Double
  
  trait NormalizedOptionsConfig extends StObject {
    
    var options: OptionsObject
  }
  object NormalizedOptionsConfig {
    
    inline def apply(options: OptionsObject): NormalizedOptionsConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOptionsConfig]
    }
    
    extension [Self <: NormalizedOptionsConfig](x: Self) {
      
      inline def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberConfig
    extends StObject
       with _Control {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object NumberConfig {
    
    inline def apply(): NumberConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberConfig]
    }
    
    extension [Self <: NumberConfig](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type NumberValue = Double
  
  trait ObjectConfig
    extends StObject
       with _Control
  
  type ObjectValue = js.Any
  
  type Options = OptionsArray | OptionsObject
  
  type OptionsArray = js.Array[js.Any]
  
  trait OptionsConfig
    extends StObject
       with _Control {
    
    var options: Options
    
    var `type`: OptionsControlType
  }
  object OptionsConfig {
    
    inline def apply(options: Options, `type`: OptionsControlType): OptionsConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsConfig]
    }
    
    extension [Self <: OptionsConfig](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setType(value: OptionsControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def check: typings.storybookComponents.storybookComponentsStrings.check = "check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.check]
    
    inline def `inline-check`: typings.storybookComponents.storybookComponentsStrings.`inline-check` = "inline-check".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-check`]
    
    inline def `inline-radio`: typings.storybookComponents.storybookComponentsStrings.`inline-radio` = "inline-radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`inline-radio`]
    
    inline def `multi-select`: typings.storybookComponents.storybookComponentsStrings.`multi-select` = "multi-select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.`multi-select`]
    
    inline def radio: typings.storybookComponents.storybookComponentsStrings.radio = "radio".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.radio]
    
    inline def select: typings.storybookComponents.storybookComponentsStrings.select = "select".asInstanceOf[typings.storybookComponents.storybookComponentsStrings.select]
  }
  
  type OptionsMultiSelection = js.Array[js.Any]
  
  type OptionsObject = Record[String, js.Any]
  
  type OptionsSelection = OptionsSingleSelection | OptionsMultiSelection
  
  type OptionsSingleSelection = js.Any
  
  type RangeConfig = NumberConfig
  
  trait TextConfig
    extends StObject
       with _Control
  
  type TextValue = String
  
  trait _Control extends StObject
  object _Control {
    
    inline def ArrayConfig(): typings.storybookComponents.controlsTypesMod.ArrayConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.ArrayConfig]
    }
    
    inline def ColorConfig(): typings.storybookComponents.controlsTypesMod.ColorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.ColorConfig]
    }
    
    inline def NumberConfig(): typings.storybookComponents.controlsTypesMod.NumberConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.NumberConfig]
    }
    
    inline def OptionsConfig(options: Options, `type`: OptionsControlType): typings.storybookComponents.controlsTypesMod.OptionsConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.storybookComponents.controlsTypesMod.OptionsConfig]
    }
  }
}

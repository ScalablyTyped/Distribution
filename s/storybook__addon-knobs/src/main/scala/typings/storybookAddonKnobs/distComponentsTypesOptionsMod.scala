package typings.storybookAddonKnobs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.std.NonNullable
import typings.storybookAddonKnobs.anon.FnCall
import typings.storybookAddonKnobs.anon.PartialOptionsTypePropsan
import typings.storybookAddonKnobs.anon.WeakValidationMapOptionsT
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesOptionsMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> & {  serialize :{None <T>(value : T): T},   deserialize :{None <T>(value : T): T}} */
  object default {
    
    inline def apply(props: OptionsTypeProps[Any]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: OptionsTypeProps[Any], context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialOptionsTypePropsan]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.deserialize")
    @js.native
    def deserialize: FnCall = js.native
    inline def deserialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapOptionsT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.serialize")
    @js.native
    def serialize: FnCall = js.native
    inline def serialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  trait OptionsKnobOptions extends StObject {
    
    var display: OptionsKnobOptionsDisplay
  }
  object OptionsKnobOptions {
    
    inline def apply(display: OptionsKnobOptionsDisplay): OptionsKnobOptions = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsKnobOptions]
    }
    
    extension [Self <: OptionsKnobOptions](x: Self) {
      
      inline def setDisplay(value: OptionsKnobOptionsDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.radio
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-radio`
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.check
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-check`
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.select
    - typings.storybookAddonKnobs.storybookAddonKnobsStrings.`multi-select`
  */
  trait OptionsKnobOptionsDisplay extends StObject
  object OptionsKnobOptionsDisplay {
    
    inline def check: typings.storybookAddonKnobs.storybookAddonKnobsStrings.check = "check".asInstanceOf[typings.storybookAddonKnobs.storybookAddonKnobsStrings.check]
    
    inline def `inline-check`: typings.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-check` = "inline-check".asInstanceOf[typings.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-check`]
    
    inline def `inline-radio`: typings.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-radio` = "inline-radio".asInstanceOf[typings.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-radio`]
    
    inline def `multi-select`: typings.storybookAddonKnobs.storybookAddonKnobsStrings.`multi-select` = "multi-select".asInstanceOf[typings.storybookAddonKnobs.storybookAddonKnobsStrings.`multi-select`]
    
    inline def radio: typings.storybookAddonKnobs.storybookAddonKnobsStrings.radio = "radio".asInstanceOf[typings.storybookAddonKnobs.storybookAddonKnobsStrings.radio]
    
    inline def select: typings.storybookAddonKnobs.storybookAddonKnobsStrings.select = "select".asInstanceOf[typings.storybookAddonKnobs.storybookAddonKnobsStrings.select]
  }
  
  trait OptionsTypeKnob[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */]
    extends StObject
       with KnobControlConfig[T] {
    
    var options: OptionsTypeOptionsProp[T]
    
    var optionsObj: OptionsKnobOptions
  }
  object OptionsTypeKnob {
    
    inline def apply[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](name: String, options: OptionsTypeOptionsProp[T], optionsObj: OptionsKnobOptions, value: T): OptionsTypeKnob[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsTypeKnob[T]]
    }
    
    extension [Self <: OptionsTypeKnob[?], T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](x: Self & OptionsTypeKnob[T]) {
      
      inline def setOptions(value: OptionsTypeOptionsProp[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsObj(value: OptionsKnobOptions): Self = StObject.set(x, "optionsObj", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionsTypeKnobSingleValue = js.UndefOr[String | Double | Null | (js.Array[Double | String])]
  
  type OptionsTypeKnobValue[T /* <: OptionsTypeKnobSingleValue */] = T | js.Array[NonNullable[T]]
  
  type OptionsTypeOptionsProp[T] = StringDictionary[T]
  
  trait OptionsTypeProps[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */]
    extends StObject
       with KnobControlProps[T] {
    
    var display: OptionsKnobOptionsDisplay
    
    @JSName("knob")
    var knob_OptionsTypeProps: OptionsTypeKnob[T]
  }
  object OptionsTypeProps {
    
    inline def apply[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[T], onChange: T => T): OptionsTypeProps[T] = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[OptionsTypeProps[T]]
    }
    
    extension [Self <: OptionsTypeProps[?], T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](x: Self & OptionsTypeProps[T]) {
      
      inline def setDisplay(value: OptionsKnobOptionsDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setKnob(value: OptionsTypeKnob[T]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}

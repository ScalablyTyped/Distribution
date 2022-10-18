package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.anon.DisableDebounce
import typings.storybookAddonKnobs.distComponentsTypesMod.KnobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypeDefsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 'text' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.TextTypeKnob, 'value'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Text.TextTypeKnobValue | undefined}> : T extends 'boolean' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.BooleanTypeKnob, 'value'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeKnobValue}> : T extends 'number' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.NumberTypeKnob, 'value' | 'range' | 'min' | 'max' | 'step'> * /
  {  max :number | undefined,   value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Number.NumberTypeKnobValue | undefined,   min :number | undefined,   step :number | undefined,   range :boolean | undefined}> : T extends 'color' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ColorTypeKnob, 'value'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Color.ColorTypeKnobValue}> : T extends 'object' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> * /
  {  value :any}> : T extends 'select' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.SelectTypeKnob<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>, 'value' | 'options'> & {  selectV2 :true} * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue,   options :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeOptionsProp<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>,   selectV2 :true}> : T extends 'radios' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.RadiosTypeKnob, 'value' | 'options'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Radio.RadiosTypeKnobValue,   options :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Radio.RadiosTypeOptionsProp<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Radio.RadiosTypeKnobValue>}> : T extends 'array' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ArrayTypeKnob, 'value' | 'separator'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeKnobValue,   separator :string}> : T extends 'date' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.DateTypeKnob, 'value'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Date.DateTypeKnobValue}> : T extends 'files' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.FileTypeKnob, 'value' | 'accept'> * /
  {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.DateTypeKnobValue,   accept :string}> : T extends 'button' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, {  value :never | undefined,   callback :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeOnClickProp,   hideLabel :true}> : T extends 'options' ? @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.KnobPlus<T, / * Inlined std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.OptionsTypeKnob<any>, 'options' | 'value' | 'optionsObj'> * /
  {  options :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeOptionsProp<any>,   value :any,   optionsObj :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsKnobOptions}> : never
    }}}
    */
  @js.native
  trait Knob[T /* <: KnobType */] extends StObject
  
  type KnobPlus[T /* <: KnobType */, K] = K & DisableDebounce[T]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {-readonly [ P in keyof T ]: T[P] extends std.Array<infer U>? std.Array<U> : T[P]}
    }}}
    */
  @js.native
  trait Mutable[T] extends StObject
}

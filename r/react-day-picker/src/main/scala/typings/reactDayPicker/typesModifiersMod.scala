package typings.reactDayPicker

import typings.react.mod.CSSProperties
import typings.reactDayPicker.matchersMod.Matcher
import typings.reactDayPicker.reactDayPickerBooleans.`true`
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModifiersMod {
  
  @js.native
  sealed trait InternalModifier extends StObject
  @JSImport("react-day-picker/dist/types/Modifiers", "InternalModifier")
  @js.native
  object InternalModifier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InternalModifier & String] = js.native
    
    /** Name of the modifier applied to the disabled days, using the `disabled` prop. */
    @js.native
    sealed trait Disabled
      extends StObject
         with InternalModifier
    /* "disabled" */ val Disabled: typings.reactDayPicker.typesModifiersMod.InternalModifier.Disabled & String = js.native
    
    /** Name of the modifier applied to the hidden days using the `hidden` prop). */
    @js.native
    sealed trait Hidden
      extends StObject
         with InternalModifier
    /* "hidden" */ val Hidden: typings.reactDayPicker.typesModifiersMod.InternalModifier.Hidden & String = js.native
    
    @js.native
    sealed trait Outside
      extends StObject
         with InternalModifier
    /* "outside" */ val Outside: typings.reactDayPicker.typesModifiersMod.InternalModifier.Outside & String = js.native
    
    /** The modifier applied to the day ending a selected range, when in range selection mode.  */
    @js.native
    sealed trait RangeEnd
      extends StObject
         with InternalModifier
    /* "range_end" */ val RangeEnd: typings.reactDayPicker.typesModifiersMod.InternalModifier.RangeEnd & String = js.native
    
    /** The modifier applied to the days between the start and the end of a selected range, when in range selection mode.  */
    @js.native
    sealed trait RangeMiddle
      extends StObject
         with InternalModifier
    /* "range_middle" */ val RangeMiddle: typings.reactDayPicker.typesModifiersMod.InternalModifier.RangeMiddle & String = js.native
    
    /** The modifier applied to the day starting a selected range, when in range selection mode.  */
    @js.native
    sealed trait RangeStart
      extends StObject
         with InternalModifier
    /* "range_start" */ val RangeStart: typings.reactDayPicker.typesModifiersMod.InternalModifier.RangeStart & String = js.native
    
    /** Name of the modifier applied to the selected days using the `selected` prop). */
    @js.native
    sealed trait Selected
      extends StObject
         with InternalModifier
    /* "selected" */ val Selected: typings.reactDayPicker.typesModifiersMod.InternalModifier.Selected & String = js.native
    
    /** Name of the modifier applied to the day specified using the `today` prop). */
    @js.native
    sealed trait Today
      extends StObject
         with InternalModifier
    /* "today" */ val Today: typings.reactDayPicker.typesModifiersMod.InternalModifier.Today & String = js.native
  }
  
  type ActiveModifiers = (Record[Modifier, `true`]) & (Partial[Record[InternalModifier, `true`]])
  
  type CustomModifiers = Record[Modifier, js.Array[Matcher]]
  
  type DayModifiers = Record[Modifier, Matcher | js.Array[Matcher]]
  
  type InternalModifiers = Record[InternalModifier, js.Array[Matcher]]
  
  type Modifier = String
  
  type Modifiers = CustomModifiers & InternalModifiers
  
  type ModifiersClassNames = (Record[Modifier, String]) & (Partial[Record[InternalModifier, String]])
  
  type ModifiersStyles = (Record[Modifier, CSSProperties]) & (Partial[Record[InternalModifier, CSSProperties]])
}

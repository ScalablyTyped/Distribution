package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.anon.Children
import typings.reactDayPicker.anon.PickButtonPropsmultiplede
import typings.reactDayPicker.anon.`2`
import typings.reactDayPicker.captionCaptionMod.CaptionProps
import typings.reactDayPicker.captionLabelCaptionLabelMod.CaptionLabelProps
import typings.reactDayPicker.dayContentDayContentMod.DayContentProps
import typings.reactDayPicker.dayDayMod.DayProps
import typings.reactDayPicker.dayPickerContextMod.DayPickerContextValue
import typings.reactDayPicker.dayPickerContextMod.DayPickerProviderProps
import typings.reactDayPicker.dayPickerDefaultMod.DayPickerDefaultProps
import typings.reactDayPicker.dayPickerMultipleMod.DayPickerMultipleProps
import typings.reactDayPicker.dayPickerRangeMod.DayPickerRangeProps
import typings.reactDayPicker.dayPickerSingleMod.DayPickerSingleProps
import typings.reactDayPicker.distDayPickerMod.DayPickerProps
import typings.reactDayPicker.dropdownDropdownMod.DropdownProps
import typings.reactDayPicker.focusContextMod.FocusContextValue
import typings.reactDayPicker.matchersMod.DateRange
import typings.reactDayPicker.matchersMod.Matcher
import typings.reactDayPicker.navigationContextMod.NavigationContextValue
import typings.reactDayPicker.rootProviderMod.RootContext
import typings.reactDayPicker.rowRowMod.RowProps
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleContextValue
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleProviderInternalProps
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleProviderProps
import typings.reactDayPicker.selectRangeContextMod.SelectRangeContextValue
import typings.reactDayPicker.selectRangeContextMod.SelectRangeProviderInternalProps
import typings.reactDayPicker.selectRangeContextMod.SelectRangeProviderProps
import typings.reactDayPicker.selectSingleContextMod.SelectSingleContextValue
import typings.reactDayPicker.selectSingleContextMod.SelectSingleProviderProps
import typings.reactDayPicker.stylesMod.StyledComponent
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.reactDayPicker.useDayRenderUseDayRenderMod.DayRender
import typings.reactDayPicker.useInputUseInputMod.UseInputOptions
import typings.reactDayPicker.useInputUseInputMod.UseInputValue
import typings.reactDayPicker.weekNumberWeekNumberMod.WeekNumberProps
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-day-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[PickButtonPropsmultiplede] = js.native
  
  inline def Caption(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Caption")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CaptionDropdowns(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionDropdowns")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CaptionLabel(props: CaptionLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CaptionNavigation(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionNavigation")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Day(props: DayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Day")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DayContent(props: DayContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def DayPicker(props: DayPickerDefaultProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def DayPicker(props: DayPickerMultipleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def DayPicker(props: DayPickerRangeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def DayPicker(props: DayPickerSingleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-day-picker", "DayPickerContext")
  @js.native
  val DayPickerContext: Context[js.UndefOr[DayPickerContextValue]] = js.native
  
  inline def DayPickerProvider(props: DayPickerProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPickerProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Dropdown(props: DropdownProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Dropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-day-picker", "FocusContext")
  @js.native
  val FocusContext: Context[js.UndefOr[FocusContextValue]] = js.native
  
  inline def FocusProvider(props: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Footer(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Footer")().asInstanceOf[Element]
  
  inline def Head(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Head")().asInstanceOf[Element]
  
  inline def HeadRow(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeadRow")().asInstanceOf[Element]
  
  inline def IconDropdown(props: StyledComponent): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconDropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IconLeft(props: StyledComponent): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconLeft")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IconRight(props: StyledComponent): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconRight")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-day-picker", "InternalModifier")
  @js.native
  object InternalModifier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactDayPicker.typesModifiersMod.InternalModifier & String] = js.native
    
    /* "disabled" */ val Disabled: typings.reactDayPicker.typesModifiersMod.InternalModifier.Disabled & String = js.native
    
    /* "hidden" */ val Hidden: typings.reactDayPicker.typesModifiersMod.InternalModifier.Hidden & String = js.native
    
    /* "outside" */ val Outside: typings.reactDayPicker.typesModifiersMod.InternalModifier.Outside & String = js.native
    
    /* "range_end" */ val RangeEnd: typings.reactDayPicker.typesModifiersMod.InternalModifier.RangeEnd & String = js.native
    
    /* "range_middle" */ val RangeMiddle: typings.reactDayPicker.typesModifiersMod.InternalModifier.RangeMiddle & String = js.native
    
    /* "range_start" */ val RangeStart: typings.reactDayPicker.typesModifiersMod.InternalModifier.RangeStart & String = js.native
    
    /* "selected" */ val Selected: typings.reactDayPicker.typesModifiersMod.InternalModifier.Selected & String = js.native
    
    /* "today" */ val Today: typings.reactDayPicker.typesModifiersMod.InternalModifier.Today & String = js.native
  }
  
  @JSImport("react-day-picker", "NavigationContext")
  @js.native
  val NavigationContext: Context[js.UndefOr[NavigationContextValue]] = js.native
  
  inline def NavigationProvider(props: `2`): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NavigationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def RootProvider(props: RootContext): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RootProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Row(props: RowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-day-picker", "SelectMultipleContext")
  @js.native
  val SelectMultipleContext: Context[js.UndefOr[SelectMultipleContextValue]] = js.native
  
  inline def SelectMultipleProvider(props: SelectMultipleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectMultipleProviderInternal(hasInitialPropsChildren: SelectMultipleProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-day-picker", "SelectRangeContext")
  @js.native
  val SelectRangeContext: Context[js.UndefOr[SelectRangeContextValue]] = js.native
  
  inline def SelectRangeProvider(props: SelectRangeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectRangeProviderInternal(hasInitialPropsChildren: SelectRangeProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-day-picker", "SelectSingleContext")
  @js.native
  val SelectSingleContext: Context[js.UndefOr[SelectSingleContextValue]] = js.native
  
  inline def SelectSingleProvider(props: SelectSingleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectSingleProviderInternal(
    hasInitialPropsChildren: typings.reactDayPicker.selectSingleContextMod.SelectSingleProviderInternal
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def WeekNumber(props: WeekNumberProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekNumber")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def addToRange(day: js.Date): js.UndefOr[DateRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("addToRange")(day.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DateRange]]
  inline def addToRange(day: js.Date, range: DateRange): js.UndefOr[DateRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DateRange]]
  
  inline def isDateAfterType(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateAfter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateAfterType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateAfter */ Boolean]
  
  inline def isDateBeforeType(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateBefore */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateBeforeType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateBefore */ Boolean]
  
  inline def isDateInterval(matcher: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateInterval */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateInterval")(matcher.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateInterval */ Boolean]
  
  inline def isDateRange(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DateRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateRange")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DateRange */ Boolean]
  
  inline def isDayOfWeekType(value: Any): /* is react-day-picker.react-day-picker/dist/types/Matchers.DayOfWeek */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayOfWeekType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/Matchers.DayOfWeek */ Boolean]
  
  inline def isDayPickerDefault(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/types/DayPickerDefault.DayPickerDefaultProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerDefault")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerDefault.DayPickerDefaultProps */ Boolean]
  
  inline def isDayPickerMultiple(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/types/DayPickerMultiple.DayPickerMultipleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerMultiple")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerMultiple.DayPickerMultipleProps */ Boolean]
  inline def isDayPickerMultiple(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/types/DayPickerMultiple.DayPickerMultipleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerMultiple")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerMultiple.DayPickerMultipleProps */ Boolean]
  
  inline def isDayPickerRange(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/types/DayPickerRange.DayPickerRangeProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerRange")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerRange.DayPickerRangeProps */ Boolean]
  inline def isDayPickerRange(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/types/DayPickerRange.DayPickerRangeProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerRange")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerRange.DayPickerRangeProps */ Boolean]
  
  inline def isDayPickerSingle(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerSingle")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean]
  inline def isDayPickerSingle(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerSingle")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean]
  
  inline def isMatch(day: js.Date, matchers: js.Array[Matcher]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(day.asInstanceOf[js.Any], matchers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useActiveModifiers(day: js.Date): ActiveModifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveModifiers")(day.asInstanceOf[js.Any]).asInstanceOf[ActiveModifiers]
  inline def useActiveModifiers(
    day: js.Date,
    /**
    * The month where the date is displayed. If not the same as `date`, the day
    * is an "outside day".
    */
  displayMonth: js.Date
  ): ActiveModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("useActiveModifiers")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any])).asInstanceOf[ActiveModifiers]
  
  inline def useDayPicker(): DayPickerContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDayPicker")().asInstanceOf[DayPickerContextValue]
  
  inline def useDayRender(
    /** The date to render. */
  day: js.Date,
    /** The month where the date is displayed (if not the same as `date`, it means it is an "outside" day). */
  displayMonth: js.Date,
    /** A ref to the button element that will be target of focus when rendered (if required). */
  buttonRef: RefObject[HTMLButtonElement]
  ): DayRender = (^.asInstanceOf[js.Dynamic].applyDynamic("useDayRender")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any], buttonRef.asInstanceOf[js.Any])).asInstanceOf[DayRender]
  
  inline def useFocusContext(): FocusContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusContext")().asInstanceOf[FocusContextValue]
  
  inline def useInput(): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")().asInstanceOf[UseInputValue]
  inline def useInput(options: UseInputOptions): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(options.asInstanceOf[js.Any]).asInstanceOf[UseInputValue]
  
  inline def useNavigation(): NavigationContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[NavigationContextValue]
  
  inline def useSelectMultiple(): SelectMultipleContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectMultiple")().asInstanceOf[SelectMultipleContextValue]
  
  inline def useSelectRange(): SelectRangeContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectRange")().asInstanceOf[SelectRangeContextValue]
  
  inline def useSelectSingle(): SelectSingleContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectSingle")().asInstanceOf[SelectSingleContextValue]
}

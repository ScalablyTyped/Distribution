package typings.reactDayPicker.indexEsmMod

import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.FocusEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLProps
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.anon.Children
import typings.reactDayPicker.anon.Locale
import typings.reactDayPicker.anon.PickButtonPropsmultiplede
import typings.reactDayPicker.anon.`0`
import typings.reactDayPicker.indexEsmMod.^
import typings.reactDayPicker.reactDayPickerBooleans.`true`
import typings.std.HTMLButtonElement
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Render a button HTML element applying the reset class name.
  */
inline def Button: ForwardRefExoticComponent[PickButtonPropsmultiplede] = ^.asInstanceOf[js.Dynamic].selectDynamic("Button").asInstanceOf[ForwardRefExoticComponent[PickButtonPropsmultiplede]]

/**
  * Render the caption of a month. The caption has a different layout when
  * setting the {@link DayPickerBase.captionLayout} prop.
  */
inline def Caption(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Caption")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Render a caption with the dropdowns to navigate between months and years.
  */
inline def CaptionDropdowns(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionDropdowns")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Render the caption for the displayed month. This component is used when `captionLayout="buttons"`. */
inline def CaptionLabel(props: CaptionLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Render a caption with a button-based navigation.
  */
inline def CaptionNavigation(props: CaptionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptionNavigation")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The content of a day cell – as a button or span element according to its
  * modifiers.
  */
inline def Day(props: DayProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Day")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Render the content of the day cell. */
inline def DayContent(props: DayContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * DayPicker render a date picker component to let users pick dates from a
  * calendar. See http://react-day-picker.js.org for updated documentation and
  * examples.
  *
  * ### Customization
  *
  * DayPicker offers different customization props. For example,
  *
  * - show multiple months using `numberOfMonths`
  * - display a dropdown to navigate the months via `captionLayout`
  * - display the week numbers with `showWeekNumbers`
  * - disable or hide days with `disabled` or `hidden`
  *
  * ### Controlling the months
  *
  * Change the initially displayed month using the `defaultMonth` prop. The
  * displayed months are controlled by DayPicker and stored in its internal
  * state. To control the months yourself, use `month` instead of `defaultMonth`
  * and use the `onMonthChange` event to set it.
  *
  * To limit the months the user can navigate to, use
  * `fromDate`/`fromMonth`/`fromYear` or `toDate`/`toMonth`/`toYear`.
  *
  * ### Selection modes
  *
  * DayPicker supports different selection mode that can be toggled using the
  * `mode` prop:
  *
  * - `mode="single"`: only one day can be selected. Use `required` to make the
  *   selection required. Use the `onSelect` event handler to get the selected
  *   days.
  * - `mode="multiple"`: users can select one or more days. Limit the amount of
  *   days that can be selected with the `min` or the `max` props.
  * - `mode="range"`: users can select a range of days. Limit the amount of days
  *   in the range with the `min` or the `max` props.
  * - `mode="default"` (default): the built-in selections are disabled. Implement
  *   your own selection mode with `onDayClick`.
  *
  * The selection modes should cover the most common use cases. In case you
  * need a more refined way of selecting days, use `mode="default"`. Use the
  * `selected` props and add the day event handlers to add/remove days from the
  * selection.
  *
  * ### Modifiers
  *
  * A _modifier_ represents different styles or states for the days displayed in
  * the calendar (like "selected" or "disabled"). Define custom modifiers using
  * the `modifiers` prop.
  *
  * ### Formatters and custom component
  *
  * You can customize how the content is displayed in the date picker by using
  * either the formatters or replacing the internal components.
  *
  * For the most common cases you want to use the `formatters` prop to change how
  * the content is formatted in the calendar. Use the `components` prop to
  * replace the internal components, like the navigation icons.
  *
  * ### Styling
  *
  * DayPicker comes with a default, basic style in `react-day-picker/style` – use
  * it as template for your own style.
  *
  * If you are using CSS modules, pass the imported styles object the
  * `classNames` props.
  *
  * You can also style the elements via inline-styles using the `styles` prop.
  *
  * ### Form fields
  *
  * If you need to bind the date picker to a form field, you can use the
  * `useInput` hooks for a basic behavior. See the `useInput` source as an
  * example to bind the date picker with form fields.
  *
  * ### Localization
  *
  * To localize DayPicker, import the locale from `date-fns` package and use the
  * `locale` prop.
  *
  * For example, to use Spanish locale:
  *
  * ```
  * import es from 'date-fns/locale/es';
  * <DayPicker locale={es} />
  * ```
  */
inline def DayPicker(props: DayPickerDefaultProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def DayPicker(props: DayPickerMultipleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def DayPicker(props: DayPickerRangeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def DayPicker(props: DayPickerSingleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The DayPicker context shares the props passed to DayPicker within internal
  * and custom components. It is used to set the default values and perform
  * one-time calculations required to render the days.
  *
  * Access to this context from the {@link useDayPicker} hook.
  */
inline def DayPickerContext: Context[js.UndefOr[DayPickerContextValue]] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPickerContext").asInstanceOf[Context[js.UndefOr[DayPickerContextValue]]]

/**
  * The provider for the {@link DayPickerContext}, assigning the defaults from the
  * initial DayPicker props.
  */
inline def DayPickerProvider(props: DayPickerProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPickerProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Render a styled select component – displaying a caption and a custom
  * drop-down icon.
  */
inline def Dropdown(props: DropdownProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Dropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The Focus context shares details about the focused day for the keyboard
  *
  * Access this context from the {@link useFocusContext} hook.
  */
inline def FocusContext: Context[js.UndefOr[FocusContextValue]] = ^.asInstanceOf[js.Dynamic].selectDynamic("FocusContext").asInstanceOf[Context[js.UndefOr[FocusContextValue]]]

/** The provider for the {@link FocusContext}. */
inline def FocusProvider(props: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FocusProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Render the Footer component (empty as default).*/
inline def Footer(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Footer")().asInstanceOf[Element]

/** Render the table head. */
inline def Head(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Head")().asInstanceOf[Element]

/**
  * Render the HeadRow component - i.e. the table head row with the weekday names.
  */
inline def HeadRow(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeadRow")().asInstanceOf[Element]

/**
  * Render the icon in the styled drop-down.
  */
inline def IconDropdown(props: StyledComponent): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconDropdown")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Render the "previous month" button in the navigation.
  */
inline def IconLeft(props: StyledComponent): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconLeft")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Render the "next month" button in the navigation.
  */
inline def IconRight(props: StyledComponent): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconRight")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The Navigation context shares details and methods to navigate the months in DayPicker.
  * Access this context from the {@link useNavigation} hook.
  */
inline def NavigationContext: Context[js.UndefOr[NavigationContextValue]] = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationContext").asInstanceOf[Context[js.UndefOr[NavigationContextValue]]]

/** Provides the values for the {@link NavigationContext}. */
inline def NavigationProvider(props: `0`): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NavigationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Provide the value for all the context providers. */
inline def RootProvider(props: RootContext): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RootProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Render a row in the calendar, with the days and the week number. */
inline def Row(props: RowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Row")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The SelectMultiple context shares details about the selected days when in
  * multiple selection mode.
  *
  * Access this context from the {@link useSelectMultiple} hook.
  */
inline def SelectMultipleContext: Context[js.UndefOr[SelectMultipleContextValue]] = ^.asInstanceOf[js.Dynamic].selectDynamic("SelectMultipleContext").asInstanceOf[Context[js.UndefOr[SelectMultipleContextValue]]]

/** Provides the values for the {@link SelectMultipleContext}. */
inline def SelectMultipleProvider(props: SelectMultipleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SelectMultipleProviderInternal(hasInitialPropsChildren: SelectMultipleProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The SelectRange context shares details about the selected days when in
  * range selection mode.
  *
  * Access this context from the {@link useSelectRange} hook.
  */
inline def SelectRangeContext: Context[js.UndefOr[SelectRangeContextValue]] = ^.asInstanceOf[js.Dynamic].selectDynamic("SelectRangeContext").asInstanceOf[Context[js.UndefOr[SelectRangeContextValue]]]

/** Provides the values for the {@link SelectRangeProvider}. */
inline def SelectRangeProvider(props: SelectRangeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SelectRangeProviderInternal(hasInitialPropsChildren: SelectRangeProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * The SelectSingle context shares details about the selected days when in
  * single selection mode.
  *
  * Access this context from the {@link useSelectSingle} hook.
  */
inline def SelectSingleContext: Context[js.UndefOr[SelectSingleContextValue]] = ^.asInstanceOf[js.Dynamic].selectDynamic("SelectSingleContext").asInstanceOf[Context[js.UndefOr[SelectSingleContextValue]]]

/** Provides the values for the {@link SelectSingleProvider}. */
inline def SelectSingleProvider(props: SelectSingleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Render the week number element. If `onWeekNumberClick` is passed to DayPicker, it
  * renders a button, otherwise a span element.
  */
inline def WeekNumber(props: WeekNumberProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekNumber")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Add a day to an existing range.
  *
  * The returned range takes in account the `undefined` values and if the added
  * day is already present in the range.
  */
inline def addToRange(day: js.Date): js.UndefOr[DateRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("addToRange")(day.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DateRange]]
inline def addToRange(day: js.Date, range: DateRange): js.UndefOr[DateRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("addToRange")(day.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DateRange]]

/** Returns true if `value` is of type {@link DateAfter}. */
inline def isDateAfterType(value: Any): /* is react-day-picker.react-day-picker/dist/index.esm.DateAfter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateAfterType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DateAfter */ Boolean]

/** Returns true if `value` is of type {@link DateBefore}. */
inline def isDateBeforeType(value: Any): /* is react-day-picker.react-day-picker/dist/index.esm.DateBefore */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateBeforeType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DateBefore */ Boolean]

/** Returns true if `matcher` is of type {@link DateInterval}. */
inline def isDateInterval(matcher: Any): /* is react-day-picker.react-day-picker/dist/index.esm.DateInterval */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateInterval")(matcher.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DateInterval */ Boolean]

/** Returns true if `value` is a {@link DateRange} type. */
inline def isDateRange(value: Any): /* is react-day-picker.react-day-picker/dist/index.esm.DateRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateRange")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DateRange */ Boolean]

/** Returns true if `value` is a {@link DayOfWeek} type. */
inline def isDayOfWeekType(value: Any): /* is react-day-picker.react-day-picker/dist/index.esm.DayOfWeek */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayOfWeekType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayOfWeek */ Boolean]

/** Returns true when the props are of type {@link DayPickerDefaultProps}. */
inline def isDayPickerDefault(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerDefaultProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerDefault")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerDefaultProps */ Boolean]

inline def isDayPickerMultiple(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerMultipleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerMultiple")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerMultipleProps */ Boolean]
/** Returns true when the props are of type {@link DayPickerMultipleProps}. */
inline def isDayPickerMultiple(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerMultipleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerMultiple")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerMultipleProps */ Boolean]

inline def isDayPickerRange(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerRangeProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerRange")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerRangeProps */ Boolean]
/** Returns true when the props are of type {@link DayPickerRangeProps}. */
inline def isDayPickerRange(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerRangeProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerRange")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerRangeProps */ Boolean]

inline def isDayPickerSingle(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerSingleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerSingle")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerSingleProps */ Boolean]
/** Returns true when the props are of type {@link DayPickerSingleProps}. */
inline def isDayPickerSingle(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/index.esm.DayPickerSingleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerSingle")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/index.esm.DayPickerSingleProps */ Boolean]

/**
  * Returns whether a day matches against at least one of the given Matchers.
  *
  * ```
  * const day = new Date(2022, 5, 19);
  * const matcher1: DateRange = {
  *    from: new Date(2021, 12, 21),
  *    to: new Date(2021, 12, 30)
  * }
  * const matcher2: DateRange = {
  *    from: new Date(2022, 5, 1),
  *    to: new Date(2022, 5, 23)
  * }
  *
  * const isMatch(day, [matcher1, matcher2]); // true, since day is in the matcher1 range.
  * ```
  * */
inline def isMatch(day: js.Date, matchers: js.Array[Matcher]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(day.asInstanceOf[js.Any], matchers.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Return the active modifiers for the specified day.
  *
  * This hook is meant to be used inside internal or custom components.
  *
  * @param day
  * @param displayMonth
  */
inline def useActiveModifiers(day: js.Date): ActiveModifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveModifiers")(day.asInstanceOf[js.Any]).asInstanceOf[ActiveModifiers]
inline def useActiveModifiers(
  day: js.Date,
  /**
  * The month where the date is displayed. If not the same as `date`, the day
  * is an "outside day".
  */
displayMonth: js.Date
): ActiveModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("useActiveModifiers")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any])).asInstanceOf[ActiveModifiers]

/**
  * Hook to access the {@link DayPickerContextValue}.
  *
  * Use the DayPicker context to access to the props passed to DayPicker inside
  * internal or custom components.
  */
inline def useDayPicker(): DayPickerContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDayPicker")().asInstanceOf[DayPickerContextValue]

/**
  * Return props and data used to render the {@link Day} component.
  *
  * Use this hook when creating a component to replace the built-in `Day`
  * component.
  */
inline def useDayRender(
  /** The date to render. */
day: js.Date,
  /** The month where the date is displayed (if not the same as `date`, it means it is an "outside" day). */
displayMonth: js.Date,
  /** A ref to the button element that will be target of focus when rendered (if required). */
buttonRef: RefObject[HTMLButtonElement]
): DayRender = (^.asInstanceOf[js.Dynamic].applyDynamic("useDayRender")(day.asInstanceOf[js.Any], displayMonth.asInstanceOf[js.Any], buttonRef.asInstanceOf[js.Any])).asInstanceOf[DayRender]

/**
  * Hook to access the {@link FocusContextValue}. Use this hook to handle the
  * focus state of the elements.
  *
  * This hook is meant to be used inside internal or custom components.
  */
inline def useFocusContext(): FocusContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusContext")().asInstanceOf[FocusContextValue]

/** Return props and setters for binding an input field to DayPicker. */
inline def useInput(): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")().asInstanceOf[UseInputValue]
inline def useInput(options: UseInputOptions): UseInputValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useInput")(options.asInstanceOf[js.Any]).asInstanceOf[UseInputValue]

/**
  * Hook to access the {@link NavigationContextValue}. Use this hook to navigate
  * between months or years in DayPicker.
  *
  * This hook is meant to be used inside internal or custom components.
  */
inline def useNavigation(): NavigationContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[NavigationContextValue]

/**
  * Hook to access the {@link SelectMultipleContextValue}.
  *
  * This hook is meant to be used inside internal or custom components.
  */
inline def useSelectMultiple(): SelectMultipleContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectMultiple")().asInstanceOf[SelectMultipleContextValue]

/**
  * Hook to access the {@link SelectRangeContextValue}.
  *
  * This hook is meant to be used inside internal or custom components.
  */
inline def useSelectRange(): SelectRangeContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectRange")().asInstanceOf[SelectRangeContextValue]

/**
  * Hook to access the {@link SelectSingleContextValue}.
  *
  * This hook is meant to be used inside internal or custom components.
  */
inline def useSelectSingle(): SelectSingleContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectSingle")().asInstanceOf[SelectSingleContextValue]

/**
  * The modifiers that are matching a day in the calendar. Use the {@link useActiveModifiers} hook to get the modifiers for a day.
  *
  * ```
  * const activeModifiers: ActiveModifiers = {
  *  selected: true,
  *  customModifier: true
  * }
  * ```
  *
  * */
type ActiveModifiers = (Record[Modifier, `true`]) & (Partial[Record[InternalModifier, `true`]])

/** The props for the {@link Button} component. */
type ButtonProps = HTMLProps[HTMLButtonElement]

/**
  * A map of matchers used as custom modifiers by DayPicker component. This is
  * the same as {@link DayModifiers]], but it accepts only array of [[Matcher}s.
  */
type CustomModifiers = Record[Modifier, js.Array[Matcher]]

/** Represents a function to format a date. */
type DateFormatter = js.Function2[/* date */ js.Date, /* options */ js.UndefOr[Locale], ReactNode]

/** The event handler when a day is clicked. */
type DayClickEventHandler = js.Function3[
/* day */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], 
Unit]

/** The event handler when a day is focused. */
type DayFocusEventHandler = js.Function3[
/* day */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ (FocusEvent[typings.std.Element, typings.std.Element]) | KeyboardEvent[typings.std.Element], 
Unit]

/** The event handler when a day gets a keyboard event. */
type DayKeyboardEventHandler = js.Function3[
/* day */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ KeyboardEvent[typings.std.Element], 
Unit]

/** Return the ARIA label for the {@link Day} component. */
type DayLabel = js.Function3[
/* day */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* options */ js.UndefOr[Locale], 
String]

/** The custom modifiers passed to the {@link DayPickerBase.modifiers}. */
type DayModifiers = Record[Modifier, Matcher | js.Array[Matcher]]

/** The event handler when a day gets a mouse event. */
type DayMouseEventHandler = js.Function3[
/* day */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], 
Unit]

/** The event handler when a day gets a touch event. */
type DayTouchEventHandler = js.Function3[
/* day */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ TouchEvent[typings.std.Element], 
Unit]

/** Map of matchers used for the internal modifiers. */
type InternalModifiers = Record[InternalModifier, js.Array[Matcher]]

/**
  * A value or a function that matches a specific day.
  *
  *
  * Matchers are passed to DayPicker via {@link DayPickerBase.disabled},
  * {@link DayPickerBase.hidden]] or [[DayPickerProps.selected} and are used to
  * determine if a day should get a {@link Modifier}.
  *
  * Matchers can be of different types:
  *
  * ```
  * // will always match the day
  * const booleanMatcher: Matcher = true;
  *
  *  // will match the today's date
  * const dateMatcher: Matcher = new Date();
  *
  * // will match the days in the array
  * const arrayMatcher: Matcher = [new Date(2019, 1, 2);, new Date(2019, 1, 4)];
  *
  * // will match days after the 2nd of February 2019
  * const afterMatcher: DateAfter = { after: new Date(2019, 1, 2); };
  *  // will match days before the 2nd of February 2019 }
  * const beforeMatcher: DateBefore = { before: : new Date(2019, 1, 2); };
  *
  * // will match Sundays
  * const dayOfWeekMatcher: DayOfWeek = {
  *  dayOfWeek: 0
  * };
  *
  * // will match the included days, except the two dates
  * const intervalMatcher: DateInterval = {
  *    after: new Date(2019, 1, 2);,
  *    before: new Date(2019, 1, 5)
  * };
  *
  * // will match the included days, including the two dates
  * const rangeMatcher: DateRange = {
  *    from: new Date(2019, 1, 2);,
  *    to: new Date(2019, 1, 5)
  * };
  *
  * // will match when the function return true
  * const functionMatcher: Matcher = (day: Date) => {
  *  return day.getMonth() === 2 // match when month is March
  * };
  * ```
  *
  * @see {@link isMatch}
  *
  * */
/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - js.Function1[/ * date * / js.Date, scala.Boolean]
  - js.Date
  - js.Array[js.Date]
  - typings.reactDayPicker.indexEsmMod.DateRange
  - typings.reactDayPicker.indexEsmMod.DateBefore
  - typings.reactDayPicker.indexEsmMod.DateAfter
  - typings.reactDayPicker.indexEsmMod.DateInterval
  - typings.reactDayPicker.indexEsmMod.DayOfWeek
*/
type Matcher = _Matcher | (js.Function1[/* date */ js.Date, Boolean]) | js.Array[js.Date] | Boolean | js.Date

/** A _modifier_ represents different styles or states of a day displayed in the calendar. */
type Modifier = String

/** The modifiers used by DayPicker. */
type Modifiers = CustomModifiers & InternalModifiers

/** The classnames to assign to each day element matching a modifier. */
type ModifiersClassNames = (Record[Modifier, String]) & (Partial[Record[InternalModifier, String]])

/** The style to apply to each day element matching a modifier. */
type ModifiersStyles = (Record[Modifier, CSSProperties]) & (Partial[Record[InternalModifier, CSSProperties]])

/** The event handler when a month is changed in the calendar. */
type MonthChangeEventHandler = js.Function1[/* month */ js.Date, Unit]

/** Return the ARIA label for the "next month" / "prev month" buttons in the navigation.*/
type NavButtonLabel = js.Function2[/* month */ js.UndefOr[js.Date], /* options */ js.UndefOr[Locale], String]

/** The event handler when selecting multiple days. */
type SelectMultipleEventHandler = js.Function4[
/* days */ js.UndefOr[js.Array[js.Date]], 
/* selectedDay */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], 
Unit]

/** The event handler when selecting a range of days. */
type SelectRangeEventHandler = js.Function4[
/* range */ js.UndefOr[DateRange], 
/* selectedDay */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], 
Unit]

/** The event handler when selecting a single day. */
type SelectSingleEventHandler = js.Function4[
/* day */ js.UndefOr[js.Date], 
/* selectedDay */ js.Date, 
/* activeModifiers */ ActiveModifiers, 
/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], 
Unit]

type SelectedDays = js.UndefOr[js.Date | js.Array[js.Date] | DateRange]

/**The event handler when the week number is clicked. */
type WeekNumberClickEventHandler = js.Function3[
/* weekNumber */ Double, 
/* dates */ js.Array[js.Date], 
/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], 
Unit]

/** Represent a function to format the week number. */
type WeekNumberFormatter = js.Function2[/* weekNumber */ Double, /* options */ js.UndefOr[Locale], ReactNode]

/** Return the ARIA label of the week number.*/
type WeekNumberLabel = js.Function2[/* n */ Double, /* options */ js.UndefOr[Locale], String]

/** Return the ARIA label for the Head component.*/
type WeekdayLabel = js.Function2[/* day */ js.Date, /* options */ js.UndefOr[Locale], String]

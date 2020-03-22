package typings.reactPhoneNumberInput.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.AnonHtml
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.ComponentType
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.reactPhoneNumberInput.AnonCountry
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.`additions text`
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.`inline`
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.additions
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.all
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.ascending
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.assertive
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.both
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.copy
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.date
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.decimal
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.descending
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.dialog
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.email
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.execute
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.grammar
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.grid
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.horizontal
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.inherit
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.link
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.list
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.listbox
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.location
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.menu
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.mixed
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.move
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.no
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.none
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.numeric
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.off
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.on
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.other
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.page
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.polite
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.popup
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.removals
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.search
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.spelling
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.step
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.tel
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.text
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.time
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.tree
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.url
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.vertical
import typings.reactPhoneNumberInput.reactPhoneNumberInputStrings.yes
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react.react.InputHTMLAttributes<string>, 'onChange'> */
trait PhoneInputProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accept: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  // Optional props
  /**
    * Set to false to remove the "International" option from country <select/>.
    */
  var addInternationalOption: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  /**
    * If specified, only these countries will be available for selection.
    * @example ["RU", "UA", "KZ"]
    */
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Can be used to place some countries on top of the list of country <select/> options.
    *  - "|" — inserts a separator.
    *  - "..." — means "the rest of the countries" (can be omitted, in which case it will
    * automatically be added at the end).
    *
    * @example
    * ["US", "CA", "AU", "|", "..."]
    */
  var countryOptionsOrder: js.UndefOr[js.Array[String]] = js.undefined
  var countrySelectComponent: js.UndefOr[ComponentType[CountrySelectComponentProps]] = js.undefined
  /**
    * Country <select/> component props. Along with the usual DOM properties such as aria-label
    * and tabIndex, some custom properties are supported, such as arrowComponent and unicodeFlags.
    */
  var countrySelectProps: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  /**
    * A two-letter country code for formatting `value`
    * when a user inputs a national phone number (example: `(213) 373-4253`).
    * The user can still input a phone number in international format.
    * Example: "US".
    * `country` and `defaultCountry` properties are mutually exclusive.
    */
  var defaultCountry: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  /**
    * Set to true to disable both the phone number <input/> and the country <select/>
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  var displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var flagComponent: js.UndefOr[ComponentType[AnonCountry]] = js.undefined
  /**
    * A URL template of a country flag, where "{XX}" is a two-letter country code in upper case,
    * or where "{xx}" is a two-letter country code in lower case. By default it points to
    * country-flag-icons github pages website. I imagine someone might want to download those
    * country flag icons and host them on their own servers instead (all flags are available in
    * the country-flag-icons library). There's a catch though: new countries may be added in future,
    * so when hosting country flag icons on your own server one should check the CHANGELOG.md every
    * time before updating this library, otherwise there's a possibility that some new country flag
    * would be missing.
    */
  var flagUrl: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[FlagsMap] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  /**
    * Phone number <input/> component.
    *
    * Receives properties:
    *  - value: string — The formatted value.
    *  - onChange(event: Event) — Updates the formatted value from event.target.value.
    *  - onFocus() — Is used to toggle the --focus CSS class.
    *  - onBlur() — Is used to toggle the --focus CSS class.
    *  - Other properties like type="tel" or autoComplete="tel" that should be passed through to the DOM <input/>.
    *
    * Must also either use React.forwardRef() to "forward" ref to the <input/> or implement .focus() method.
    */
  var inputComponent: js.UndefOr[
    ForwardRefExoticComponent[InputHTMLAttributes[HTMLInputElement] with RefAttributes[_]]
  ] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  /**
    * If `country` property is passed along with `international={true}` property
    * then the phone number will be input in "international" format for that `country`
    * (without "country calling code").
    * For example, if `country="US"` property is passed to "without country select" input
    * then the phone number will be input in the "national" format for `US` (`(213) 373-4253`).
    * But if both `country="US"` and `international={true}` properties are passed then
    * the phone number will be input in the "international" format for `US` (`213 373 4253`)
    * (without "country calling code" `+1`).
    */
  var internationalIcon: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  /**
    * If set to true the phone number input will get trimmed if it exceeds the maximum length for the country.
    */
  var limitMaxLength: js.UndefOr[Boolean] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * Phone number <input/> component additional props.
    */
  var numberInputProps: js.UndefOr[js.Object] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[String]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[String]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[String]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[String]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[String]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[String]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[String]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[String]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[String]] = js.undefined
  /**
    * Is called every time the selected country changes: either programmatically or when user selects it manually from the list.
    */
  var onCountryChange: js.UndefOr[js.Function1[/* countryCode */ js.UndefOr[String], Unit]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[String]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[String]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[String]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[String]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[String]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[String]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[String]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[String]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[String]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[String]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[String]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[String]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[String]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[String]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[String]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[String]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[String]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[String]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[String]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[String]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[String]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var showCountrySelect: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  /**
    * By default, the caret position is being "intelligently" managed
    * while a user inputs a phone number.
    * This "smart" caret behavior can be turned off
    * by passing `smartCaret={false}` property.
    * This is just an "escape hatch" for any possible caret position issues.
    * @default true
    */
  var smartCaret: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  /**
    * When `defaultCountry` is defined and the initial `value` corresponds to `defaultCountry`,
    * then the `value` will be formatted as a national phone number by default.
    * To format the initial `value` of `defaultCountry` as an international number instead
    * set `useNationalFormatForDefaultCountryValue` property to `true`.
    */
  var useNationalFormatForDefaultCountryValue: js.UndefOr[Boolean] = js.undefined
  /**
    * The phone number (in E.164 format).
    * Examples: `undefined`, `"+12"`, `"+12133734253"`.
    */
  var value: String
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  // Required props
  def onChange(value: String): Unit
}

object PhoneInputProps {
  @scala.inline
  def apply(
    onChange: String => Unit,
    value: String,
    about: String = null,
    accept: String = null,
    accessKey: String = null,
    addInternationalOption: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    countries: js.Array[String] = null,
    countryOptionsOrder: js.Array[String] = null,
    countrySelectComponent: ComponentType[CountrySelectComponentProps] = null,
    countrySelectProps: Int | Double = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: AnonHtml = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultCountry: String = null,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayInitialValueAsLocalNumber: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    flagComponent: ComponentType[AnonCountry] = null,
    flagUrl: String = null,
    flags: FlagsMap = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputClassName: String = null,
    inputComponent: ForwardRefExoticComponent[InputHTMLAttributes[HTMLInputElement] with RefAttributes[_]] = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    internationalIcon: ComponentType[js.Object] = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    labels: StringDictionary[String] = null,
    lang: String = null,
    limitMaxLength: js.UndefOr[Boolean] = js.undefined,
    list: String = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    metadata: js.Object = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    numberInputProps: js.Object = null,
    onAbort: SyntheticEvent[String, Event_] => Unit = null,
    onAnimationEnd: AnimationEvent[String] => Unit = null,
    onAnimationIteration: AnimationEvent[String] => Unit = null,
    onAnimationStart: AnimationEvent[String] => Unit = null,
    onAuxClick: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[String] => Unit = null,
    onBlur: FocusEvent[String] => Unit = null,
    onCanPlay: SyntheticEvent[String, Event_] => Unit = null,
    onCanPlayThrough: SyntheticEvent[String, Event_] => Unit = null,
    onClick: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[String] => Unit = null,
    onCompositionStart: CompositionEvent[String] => Unit = null,
    onCompositionUpdate: CompositionEvent[String] => Unit = null,
    onContextMenu: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[String] => Unit = null,
    onCountryChange: /* countryCode */ js.UndefOr[String] => Unit = null,
    onCut: ClipboardEvent[String] => Unit = null,
    onDoubleClick: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[String] => Unit = null,
    onDragEnd: DragEvent[String] => Unit = null,
    onDragEnter: DragEvent[String] => Unit = null,
    onDragExit: DragEvent[String] => Unit = null,
    onDragLeave: DragEvent[String] => Unit = null,
    onDragOver: DragEvent[String] => Unit = null,
    onDragStart: DragEvent[String] => Unit = null,
    onDrop: DragEvent[String] => Unit = null,
    onDurationChange: SyntheticEvent[String, Event_] => Unit = null,
    onEmptied: SyntheticEvent[String, Event_] => Unit = null,
    onEncrypted: SyntheticEvent[String, Event_] => Unit = null,
    onEnded: SyntheticEvent[String, Event_] => Unit = null,
    onError: SyntheticEvent[String, Event_] => Unit = null,
    onFocus: FocusEvent[String] => Unit = null,
    onInput: FormEvent[String] => Unit = null,
    onInvalid: FormEvent[String] => Unit = null,
    onKeyDown: KeyboardEvent[String] => Unit = null,
    onKeyPress: KeyboardEvent[String] => Unit = null,
    onKeyUp: KeyboardEvent[String] => Unit = null,
    onLoad: SyntheticEvent[String, Event_] => Unit = null,
    onLoadStart: SyntheticEvent[String, Event_] => Unit = null,
    onLoadedData: SyntheticEvent[String, Event_] => Unit = null,
    onLoadedMetadata: SyntheticEvent[String, Event_] => Unit = null,
    onMouseDown: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[String, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[String] => Unit = null,
    onPause: SyntheticEvent[String, Event_] => Unit = null,
    onPlay: SyntheticEvent[String, Event_] => Unit = null,
    onPlaying: SyntheticEvent[String, Event_] => Unit = null,
    onPointerCancel: PointerEvent[String] => Unit = null,
    onPointerDown: PointerEvent[String] => Unit = null,
    onPointerEnter: PointerEvent[String] => Unit = null,
    onPointerLeave: PointerEvent[String] => Unit = null,
    onPointerMove: PointerEvent[String] => Unit = null,
    onPointerOut: PointerEvent[String] => Unit = null,
    onPointerOver: PointerEvent[String] => Unit = null,
    onPointerUp: PointerEvent[String] => Unit = null,
    onProgress: SyntheticEvent[String, Event_] => Unit = null,
    onRateChange: SyntheticEvent[String, Event_] => Unit = null,
    onReset: FormEvent[String] => Unit = null,
    onScroll: UIEvent[String] => Unit = null,
    onSeeked: SyntheticEvent[String, Event_] => Unit = null,
    onSeeking: SyntheticEvent[String, Event_] => Unit = null,
    onSelect: SyntheticEvent[String, Event_] => Unit = null,
    onStalled: SyntheticEvent[String, Event_] => Unit = null,
    onSubmit: FormEvent[String] => Unit = null,
    onSuspend: SyntheticEvent[String, Event_] => Unit = null,
    onTimeUpdate: SyntheticEvent[String, Event_] => Unit = null,
    onTouchCancel: TouchEvent[String] => Unit = null,
    onTouchEnd: TouchEvent[String] => Unit = null,
    onTouchMove: TouchEvent[String] => Unit = null,
    onTouchStart: TouchEvent[String] => Unit = null,
    onTransitionEnd: TransitionEvent[String] => Unit = null,
    onVolumeChange: SyntheticEvent[String, Event_] => Unit = null,
    onWaiting: SyntheticEvent[String, Event_] => Unit = null,
    onWheel: WheelEvent[String] => Unit = null,
    pattern: String = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    showCountrySelect: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    slot: String = null,
    smartCaret: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    step: Double | String = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    useNationalFormatForDefaultCountryValue: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null,
    width: Double | String = null
  ): PhoneInputProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(addInternationalOption)) __obj.updateDynamic("addInternationalOption")(addInternationalOption.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (countryOptionsOrder != null) __obj.updateDynamic("countryOptionsOrder")(countryOptionsOrder.asInstanceOf[js.Any])
    if (countrySelectComponent != null) __obj.updateDynamic("countrySelectComponent")(countrySelectComponent.asInstanceOf[js.Any])
    if (countrySelectProps != null) __obj.updateDynamic("countrySelectProps")(countrySelectProps.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInitialValueAsLocalNumber)) __obj.updateDynamic("displayInitialValueAsLocalNumber")(displayInitialValueAsLocalNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (flagComponent != null) __obj.updateDynamic("flagComponent")(flagComponent.asInstanceOf[js.Any])
    if (flagUrl != null) __obj.updateDynamic("flagUrl")(flagUrl.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (internationalIcon != null) __obj.updateDynamic("internationalIcon")(internationalIcon.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(limitMaxLength)) __obj.updateDynamic("limitMaxLength")(limitMaxLength.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberInputProps != null) __obj.updateDynamic("numberInputProps")(numberInputProps.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(showCountrySelect)) __obj.updateDynamic("showCountrySelect")(showCountrySelect.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(smartCaret)) __obj.updateDynamic("smartCaret")(smartCaret.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useNationalFormatForDefaultCountryValue)) __obj.updateDynamic("useNationalFormatForDefaultCountryValue")(useNationalFormatForDefaultCountryValue.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInputProps]
  }
}


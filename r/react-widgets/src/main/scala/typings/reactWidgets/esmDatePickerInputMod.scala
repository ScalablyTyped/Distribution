package typings.reactWidgets

import org.scalablytyped.runtime.Shortcut
import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.ElementType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactWidgets.esmLocalizationMod.Localizer
import typings.reactWidgets.esmLocalizationMod.RequiredDateMethods
import typings.reactWidgets.reactWidgetsStrings.`additions removals`
import typings.reactWidgets.reactWidgetsStrings.`additions text`
import typings.reactWidgets.reactWidgetsStrings.`inline`
import typings.reactWidgets.reactWidgetsStrings.`removals additions`
import typings.reactWidgets.reactWidgetsStrings.`removals text`
import typings.reactWidgets.reactWidgetsStrings.`text additions`
import typings.reactWidgets.reactWidgetsStrings.`text removals`
import typings.reactWidgets.reactWidgetsStrings.additions
import typings.reactWidgets.reactWidgetsStrings.all
import typings.reactWidgets.reactWidgetsStrings.ascending
import typings.reactWidgets.reactWidgetsStrings.assertive
import typings.reactWidgets.reactWidgetsStrings.both
import typings.reactWidgets.reactWidgetsStrings.copy
import typings.reactWidgets.reactWidgetsStrings.date
import typings.reactWidgets.reactWidgetsStrings.decimal
import typings.reactWidgets.reactWidgetsStrings.descending
import typings.reactWidgets.reactWidgetsStrings.dialog
import typings.reactWidgets.reactWidgetsStrings.email
import typings.reactWidgets.reactWidgetsStrings.environment
import typings.reactWidgets.reactWidgetsStrings.execute
import typings.reactWidgets.reactWidgetsStrings.grammar
import typings.reactWidgets.reactWidgetsStrings.grid
import typings.reactWidgets.reactWidgetsStrings.horizontal
import typings.reactWidgets.reactWidgetsStrings.inherit
import typings.reactWidgets.reactWidgetsStrings.link
import typings.reactWidgets.reactWidgetsStrings.list
import typings.reactWidgets.reactWidgetsStrings.listbox
import typings.reactWidgets.reactWidgetsStrings.location
import typings.reactWidgets.reactWidgetsStrings.menu
import typings.reactWidgets.reactWidgetsStrings.mixed
import typings.reactWidgets.reactWidgetsStrings.move
import typings.reactWidgets.reactWidgetsStrings.no
import typings.reactWidgets.reactWidgetsStrings.none
import typings.reactWidgets.reactWidgetsStrings.numeric
import typings.reactWidgets.reactWidgetsStrings.off
import typings.reactWidgets.reactWidgetsStrings.on
import typings.reactWidgets.reactWidgetsStrings.other
import typings.reactWidgets.reactWidgetsStrings.page
import typings.reactWidgets.reactWidgetsStrings.polite
import typings.reactWidgets.reactWidgetsStrings.popup
import typings.reactWidgets.reactWidgetsStrings.removals
import typings.reactWidgets.reactWidgetsStrings.search
import typings.reactWidgets.reactWidgetsStrings.spelling
import typings.reactWidgets.reactWidgetsStrings.step
import typings.reactWidgets.reactWidgetsStrings.tel
import typings.reactWidgets.reactWidgetsStrings.text
import typings.reactWidgets.reactWidgetsStrings.time
import typings.reactWidgets.reactWidgetsStrings.tree
import typings.reactWidgets.reactWidgetsStrings.url
import typings.reactWidgets.reactWidgetsStrings.user
import typings.reactWidgets.reactWidgetsStrings.vertical
import typings.reactWidgets.reactWidgetsStrings.yes
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDatePickerInputMod extends Shortcut {
  
  @JSImport("react-widgets/esm/DatePickerInput", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DatePickerInputProps[Any] & RefAttributes[HTMLInputElement]] = js.native
  
  /* Inlined parent std.Omit<react-widgets.react-widgets/esm/Input.InputProps, 'value' | 'onChange'> */
  @js.native
  trait DatePickerInputProps[TDateFormat] extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    var about: js.UndefOr[String] = js.native
    
    var accept: js.UndefOr[String] = js.native
    
    var acceptCharset: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var action: js.UndefOr[String] = js.native
    
    var allowFullScreen: js.UndefOr[Boolean] = js.native
    
    var allowTransparency: js.UndefOr[Boolean] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var as: js.UndefOr[String] = js.native
    
    var async: js.UndefOr[Boolean] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var capture: js.UndefOr[Boolean | user | environment] = js.native
    
    var cellPadding: js.UndefOr[Double | String] = js.native
    
    var cellSpacing: js.UndefOr[Double | String] = js.native
    
    var challenge: js.UndefOr[String] = js.native
    
    var charSet: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var cite: js.UndefOr[String] = js.native
    
    var classID: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var component: js.UndefOr[ElementType[Any]] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var coords: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var dateTime: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayFormat: js.UndefOr[TDateFormat] = js.native
    
    var download: js.UndefOr[Any] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var editFormat: js.UndefOr[TDateFormat] = js.native
    
    var editing: Boolean = js.native
    
    var encType: js.UndefOr[String] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var formatter: RequiredDateMethods = js.native
    
    var frameBorder: js.UndefOr[Double | String] = js.native
    
    var headers: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var high: js.UndefOr[Double] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var hrefLang: js.UndefOr[String] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var httpEquiv: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var integrity: js.UndefOr[String] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var keyParams: js.UndefOr[String] = js.native
    
    var keyType: js.UndefOr[String] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var localizer: Localizer[TDateFormat, Any] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var low: js.UndefOr[Double] = js.native
    
    var manifest: js.UndefOr[String] = js.native
    
    var marginHeight: js.UndefOr[Double] = js.native
    
    var marginWidth: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double | String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var mediaGroup: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double | String] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var noValidate: js.UndefOr[Boolean] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement, Element], Unit]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    def onChange(date: js.Date, rawValue: String): Unit = js.native
    def onChange(date: Null, rawValue: String): Unit = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onResize: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var optimum: js.UndefOr[Double] = js.native
    
    def parse(str: String): js.Date | Null = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var playsInline: js.UndefOr[Boolean] = js.native
    
    var poster: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var preload: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var sandbox: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var scoped: js.UndefOr[Boolean] = js.native
    
    var scrolling: js.UndefOr[String] = js.native
    
    var seamless: js.UndefOr[Boolean] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var shape: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var span: js.UndefOr[Double] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var srcDoc: js.UndefOr[String] = js.native
    
    var srcLang: js.UndefOr[String] = js.native
    
    var srcSet: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var useMap: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[js.Date | Null] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var wmode: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[String] = js.native
  }
  
  type _To = ForwardRefExoticComponent[DatePickerInputProps[Any] & RefAttributes[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esmDatePickerInputMod.foo` */
  override def _to: ForwardRefExoticComponent[DatePickerInputProps[Any] & RefAttributes[HTMLInputElement]] = default
}

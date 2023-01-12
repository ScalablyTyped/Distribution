package typings.reactWidgets

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.Component
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLInputTypeAttribute
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactWidgets.anon.LastValueFromProps
import typings.reactWidgets.anon.ValidatorbooleanacceptsAr
import typings.reactWidgets.esmLocalizationMod.Localizer
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
import typings.reactWidgets.reactWidgetsStrings.done
import typings.reactWidgets.reactWidgetsStrings.email
import typings.reactWidgets.reactWidgetsStrings.enter
import typings.reactWidgets.reactWidgetsStrings.environment
import typings.reactWidgets.reactWidgetsStrings.execute
import typings.reactWidgets.reactWidgetsStrings.go
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
import typings.reactWidgets.reactWidgetsStrings.next
import typings.reactWidgets.reactWidgetsStrings.no
import typings.reactWidgets.reactWidgetsStrings.none
import typings.reactWidgets.reactWidgetsStrings.numeric
import typings.reactWidgets.reactWidgetsStrings.off
import typings.reactWidgets.reactWidgetsStrings.on
import typings.reactWidgets.reactWidgetsStrings.other
import typings.reactWidgets.reactWidgetsStrings.page
import typings.reactWidgets.reactWidgetsStrings.polite
import typings.reactWidgets.reactWidgetsStrings.popup
import typings.reactWidgets.reactWidgetsStrings.previous
import typings.reactWidgets.reactWidgetsStrings.removals
import typings.reactWidgets.reactWidgetsStrings.search
import typings.reactWidgets.reactWidgetsStrings.send
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
import typings.std.Event
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmNumberInputMod {
  
  @JSImport("react-widgets/esm/NumberInput", JSImport.Default)
  @js.native
  open class default () extends NumberPickerInput
  object default {
    
    @JSImport("react-widgets/esm/NumberInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-widgets/esm/NumberInput", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/NumberInput", "default.defaultProps.editing")
      @js.native
      def editing: Boolean = js.native
      inline def editing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editing")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.defaultProps.value")
      @js.native
      def value: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      inline def value_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: NumberPickerInputProps, prevState: NumberPickerInputState): LastValueFromProps | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[LastValueFromProps | Null]
    
    /* static member */
    object propTypes {
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.disabled")
      @js.native
      def disabled: ValidatorbooleanacceptsAr = js.native
      inline def disabled_=(x: ValidatorbooleanacceptsAr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.editing")
      @js.native
      def editing: Requireable[Boolean] = js.native
      inline def editing_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editing")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.localizer")
      @js.native
      def localizer: Validator[js.Object] = js.native
      inline def localizer_=(x: Validator[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localizer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.max")
      @js.native
      def max: Requireable[Double] = js.native
      inline def max_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.min")
      @js.native
      def min: Requireable[Double] = js.native
      inline def min_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.onChange")
      @js.native
      def onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.parse")
      @js.native
      def parse: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def parse_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.placeholder")
      @js.native
      def placeholder: Requireable[String] = js.native
      inline def placeholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.readOnly")
      @js.native
      def readOnly: ValidatorbooleanacceptsAr = js.native
      inline def readOnly_=(x: ValidatorbooleanacceptsAr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/NumberInput", "default.propTypes.value")
      @js.native
      def value: Requireable[Double] = js.native
      inline def value_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumberPickerInput extends Component[NumberPickerInputProps, NumberPickerInputState, NumberPickerInputSnapshot] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNumberPickerInput(
      _underscore: NumberPickerInputProps,
      __ : NumberPickerInputState,
      param2: NumberPickerInputSnapshot
    ): Unit = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MNumberPickerInput(param0: NumberPickerInputProps): NumberPickerInputSnapshot = js.native
    
    def handleBlur(event: FocusEvent[HTMLInputElement, Element]): Unit = js.native
    
    def handleChange(event: FormEvent[HTMLInputElement]): Unit = js.native
    
    def isIntermediateValue(num: Double, str: String): Boolean = js.native
    def isIntermediateValue(num: Null, str: String): Boolean = js.native
    def isIntermediateValue(num: Unit, str: String): Boolean = js.native
    
    def isSelectingAllText(): Boolean = js.native
    
    def parseNumber(strVal: String): js.UndefOr[Double | Null] = js.native
    
    def setStringValue(stringValue: String): Unit = js.native
  }
  
  /* Inlined parent std.Omit<react.react.InputHTMLAttributes<std.HTMLInputElement>, 'onChange' | 'value'> */
  @js.native
  trait NumberPickerInputProps extends StObject {
    
    var about: js.UndefOr[String] = js.native
    
    var accept: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
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
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var capture: js.UndefOr[Boolean | user | environment] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var editing: js.UndefOr[Boolean] = js.native
    
    var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var localizer: Localizer[Any, Any] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    def onChange(number: Double, event: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
    def onChange(number: Null, event: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
    def onChange(number: Unit, event: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
    
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
    
    var parse: js.UndefOr[js.Function2[/* str */ String, /* localizer */ Localizer[Any, Any], Double]] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var value: js.UndefOr[Double | Null] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  
  trait NumberPickerInputSnapshot extends StObject {
    
    var reselectText: js.UndefOr[Boolean] = js.undefined
  }
  object NumberPickerInputSnapshot {
    
    inline def apply(): NumberPickerInputSnapshot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberPickerInputSnapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberPickerInputSnapshot] (val x: Self) extends AnyVal {
      
      inline def setReselectText(value: Boolean): Self = StObject.set(x, "reselectText", value.asInstanceOf[js.Any])
      
      inline def setReselectTextUndefined: Self = StObject.set(x, "reselectText", js.undefined)
    }
  }
  
  trait NumberPickerInputState extends StObject {
    
    var lastValueFromProps: js.UndefOr[String] = js.undefined
    
    var stringValue: js.UndefOr[String] = js.undefined
  }
  object NumberPickerInputState {
    
    inline def apply(): NumberPickerInputState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberPickerInputState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberPickerInputState] (val x: Self) extends AnyVal {
      
      inline def setLastValueFromProps(value: String): Self = StObject.set(x, "lastValueFromProps", value.asInstanceOf[js.Any])
      
      inline def setLastValueFromPropsUndefined: Self = StObject.set(x, "lastValueFromProps", js.undefined)
      
      inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    }
  }
}

package typings.reactBootstrapTypeahead.mod

import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.`additions text`
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.additions
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.all
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.ascending
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.assertive
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.copy
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.date
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.decimal
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.descending
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.email
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.execute
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.grammar
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.horizontal
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.inherit
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.input
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.link
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.location
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.mixed
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.move
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.no
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.none
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.numeric
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.off
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.on
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.other
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.page
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.polite
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.popup
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.removals
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.search
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.spelling
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.step
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.tel
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.text
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.time
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.url
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.vertical
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.yes
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.Omit<react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>> */
/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T> */
@js.native
trait TypeaheadSingleInputWithHocProps[T /* <: TypeaheadModel */] extends js.Object {
  var about: js.UndefOr[String] = js.native
  var accept: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var alt: js.UndefOr[String] = js.native
  var `aria-activedescendant`: String = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: list | both = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: Boolean = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: listbox = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: String = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var autoCapitalize: js.UndefOr[String] = js.native
  var autoComplete: String = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoSave: js.UndefOr[String] = js.native
  var capture: js.UndefOr[Boolean | String] = js.native
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
  var disabled: Boolean = js.native
  var draggable: js.UndefOr[Booleanish] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  var inputRef: LegacyRef[HTMLInputElement] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[input]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[input]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[input]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[input]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[input]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[input]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[input]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[input]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[input]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[input]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[input]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[input]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[input]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[input]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[input]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[input]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[input]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[input]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[input]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[input]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[input]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[input]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[input]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[input]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[input]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[input]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[input]] = js.native
  var onError: js.UndefOr[ReactEventHandler[input]] = js.native
  var onInput: js.UndefOr[FormEventHandler[input]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[input]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[input]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[input]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[input]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[input]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[input]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[input]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[input]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[input]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[input]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[input]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[input]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[input]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[input]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[input]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[input]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[input]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[input]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[input]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[input]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[input]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[input]] = js.native
  var onReset: js.UndefOr[FormEventHandler[input]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[input]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[input]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[input]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[input]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[input]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[input]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[input]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[input]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[input]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[input]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[input]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[input]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[input]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[input]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[input]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[input]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: String | Null = js.native
  var prefix: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var results: js.UndefOr[Double] = js.native
  var role: combobox = js.native
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
  var `type`: text = js.native
  var typeof: js.UndefOr[String] = js.native
  var unselectable: js.UndefOr[on | off] = js.native
  var value: String = js.native
  var vocab: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  def onBlur(e: Event): Unit = js.native
  def onChange(selected: js.Array[T]): Unit = js.native
  def onClick(e: Event): Unit = js.native
  def onFocus(e: Event): Unit = js.native
  def onKeyDown(e: Event): Unit = js.native
}

object TypeaheadSingleInputWithHocProps {
  @scala.inline
  def apply[/* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-haspopup`: listbox,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    onBlur: Event => Unit,
    onChange: js.Array[T] => Unit,
    onClick: Event => Unit,
    onFocus: Event => Unit,
    onKeyDown: Event => Unit,
    role: combobox,
    `type`: text,
    value: String
  ): TypeaheadSingleInputWithHocProps[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), role = role.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadSingleInputWithHocProps[T]]
  }
  @scala.inline
  implicit class TypeaheadSingleInputWithHocPropsOps[Self <: TypeaheadSingleInputWithHocProps[_], /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */ T] (val x: Self with TypeaheadSingleInputWithHocProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-autocomplete`(value: list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-haspopup`(value: listbox): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setOnChange(value: js.Array[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFocus(value: Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyDown(value: Event => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setRole(value: combobox): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-busy`(value: Boolean): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    @scala.inline
    def `setAria-checked`(value: Boolean | mixed): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    @scala.inline
    def `setAria-colcount`(value: Double): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    @scala.inline
    def `setAria-colindex`(value: Double): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    @scala.inline
    def `setAria-colspan`(value: Double): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    @scala.inline
    def `setAria-controls`(value: String): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    @scala.inline
    def `setAria-current`(value: Boolean | page | step | location | date | time): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    @scala.inline
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    @scala.inline
    def `setAria-details`(value: String): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    @scala.inline
    def `setAria-disabled`(value: Boolean): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    @scala.inline
    def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    @scala.inline
    def `setAria-errormessage`(value: String): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-hidden`(value: Boolean): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    @scala.inline
    def `setAria-invalid`(value: Boolean | grammar | spelling): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    @scala.inline
    def `setAria-keyshortcuts`(value: String): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def `setAria-level`(value: Double): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    @scala.inline
    def `setAria-live`(value: off | assertive | polite): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    @scala.inline
    def `setAria-modal`(value: Boolean): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    @scala.inline
    def `setAria-multiline`(value: Boolean): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    @scala.inline
    def `setAria-multiselectable`(value: Boolean): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    @scala.inline
    def `setAria-orientation`(value: horizontal | vertical): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    @scala.inline
    def `setAria-placeholder`(value: String): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    @scala.inline
    def `setAria-posinset`(value: Double): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    @scala.inline
    def `setAria-pressed`(value: Boolean | mixed): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    @scala.inline
    def `setAria-readonly`(value: Boolean): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    @scala.inline
    def `setAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    @scala.inline
    def `setAria-required`(value: Boolean): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    @scala.inline
    def `setAria-roledescription`(value: String): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    @scala.inline
    def `setAria-rowcount`(value: Double): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    @scala.inline
    def `setAria-rowindex`(value: Double): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    @scala.inline
    def `setAria-rowspan`(value: Double): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    @scala.inline
    def `setAria-selected`(value: Boolean): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    @scala.inline
    def `setAria-setsize`(value: Double): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    @scala.inline
    def `setAria-sort`(value: none | ascending | descending | other): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    @scala.inline
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    @scala.inline
    def `setAria-valuetext`(value: String): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDefaultChecked(value: Boolean): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: String | Double | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: LegacyRef[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnAbort(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[input] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[input] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[input] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAuxClick(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: FormEvent[input] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[input] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[input] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[input] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEvent[input] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEvent[input] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDrag(value: DragEvent[input] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEvent[input] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[input] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEvent[input] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[input] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[input] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEvent[input] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEvent[input] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEnded(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnInput(value: FormEvent[input] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInvalid(value: FormEvent[input] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[input] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[input] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnLoad(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[input, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEvent[input] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPause(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[input] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEvent[input] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[input] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[input] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEvent[input] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEvent[input] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEvent[input] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEvent[input] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnProgress(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnReset(value: FormEvent[input] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEvent[input, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSelect(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnStalled(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnSubmit(value: FormEvent[input] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[input] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[input] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[input] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[input] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[input] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[input, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEvent[input] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuppressContentEditableWarning(value: Boolean): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    @scala.inline
    def setSuppressHydrationWarning(value: Boolean): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


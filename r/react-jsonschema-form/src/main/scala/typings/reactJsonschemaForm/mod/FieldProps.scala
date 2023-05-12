package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`additions removals`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`additions text`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`inline`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`removals additions`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`removals text`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`text additions`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.`text removals`
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.additions
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.all
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.ascending
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.assertive
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.both
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.copy
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.date
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.decimal
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.descending
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.dialog
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.email
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.execute
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.grammar
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.grid
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.horizontal
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.inherit
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.link
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.list
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.listbox
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.location
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.menu
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.mixed
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.move
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.no
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.none
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.numeric
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.off
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.on
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.other
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.page
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.polite
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.popup
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.removals
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.search
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.spelling
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.step
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.tel
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.text
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.time
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.tree
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.url
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.vertical
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.yes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLElement>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'onBlur'>> */
@js.native
trait FieldProps[T]
  extends StObject
     with /* name */ StringDictionary[Any] {
  
  var about: js.UndefOr[String] = js.native
  
  var accessKey: js.UndefOr[String] = js.native
  
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
  
  var autoCorrect: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoSave: js.UndefOr[String] = js.native
  
  var autofocus: Boolean = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  
  var contextMenu: js.UndefOr[String] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  
  var datatype: js.UndefOr[String] = js.native
  
  var defaultChecked: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var disabled: Boolean = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var errorSchema: ErrorSchema = js.native
  
  var formContext: Any = js.native
  
  var formData: T = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idSchema: IdSchema[Any] = js.native
  
  var inlist: js.UndefOr[Any] = js.native
  
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  def onBlur(id: String): Unit = js.native
  def onBlur(id: String, value: String): Unit = js.native
  def onBlur(id: String, value: Boolean): Unit = js.native
  def onBlur(id: String, value: Double): Unit = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  def onChange(e: Any): Any = js.native
  def onChange(e: Any, es: ErrorSchema): Any = js.native
  def onChange(e: IChangeEvent[T]): Any = js.native
  def onChange(e: IChangeEvent[T], es: ErrorSchema): Any = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onDrag: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDragExit: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDragStart: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDrop: js.UndefOr[DragEventHandler[HTMLElement]] = js.native
  
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onEnded: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onError: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.native
  
  var onInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  var onInvalid: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
  
  var onLoad: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.native
  
  var onPause: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement]] = js.native
  
  var onProgress: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onReset: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  var onResize: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
  
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onSelect: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onStalled: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onSubmit: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.native
  
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLElement]] = js.native
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onWheel: js.UndefOr[WheelEventHandler[HTMLElement]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  var readonly: Boolean = js.native
  
  var registry: Definitions = js.native
  
  var rel: js.UndefOr[String] = js.native
  
  var required: Boolean = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var rev: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[AriaRole] = js.native
  
  var schema: JSONSchema6 = js.native
  
  var security: js.UndefOr[String] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var spellCheck: js.UndefOr[Booleanish] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var translate: js.UndefOr[yes | no] = js.native
  
  var typeof: js.UndefOr[String] = js.native
  
  var uiSchema: UiSchema = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  var vocab: js.UndefOr[String] = js.native
}

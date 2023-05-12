package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
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
import typings.rjsfUtils.anon.EnumOptions
import typings.rjsfUtils.rjsfUtilsStrings.`additions removals`
import typings.rjsfUtils.rjsfUtilsStrings.`additions text`
import typings.rjsfUtils.rjsfUtilsStrings.`inline`
import typings.rjsfUtils.rjsfUtilsStrings.`removals additions`
import typings.rjsfUtils.rjsfUtilsStrings.`removals text`
import typings.rjsfUtils.rjsfUtilsStrings.`text additions`
import typings.rjsfUtils.rjsfUtilsStrings.`text removals`
import typings.rjsfUtils.rjsfUtilsStrings.additions
import typings.rjsfUtils.rjsfUtilsStrings.all
import typings.rjsfUtils.rjsfUtilsStrings.ascending
import typings.rjsfUtils.rjsfUtilsStrings.assertive
import typings.rjsfUtils.rjsfUtilsStrings.both
import typings.rjsfUtils.rjsfUtilsStrings.copy
import typings.rjsfUtils.rjsfUtilsStrings.date
import typings.rjsfUtils.rjsfUtilsStrings.decimal
import typings.rjsfUtils.rjsfUtilsStrings.descending
import typings.rjsfUtils.rjsfUtilsStrings.dialog
import typings.rjsfUtils.rjsfUtilsStrings.email
import typings.rjsfUtils.rjsfUtilsStrings.execute
import typings.rjsfUtils.rjsfUtilsStrings.grammar
import typings.rjsfUtils.rjsfUtilsStrings.grid
import typings.rjsfUtils.rjsfUtilsStrings.horizontal
import typings.rjsfUtils.rjsfUtilsStrings.inherit
import typings.rjsfUtils.rjsfUtilsStrings.link
import typings.rjsfUtils.rjsfUtilsStrings.list
import typings.rjsfUtils.rjsfUtilsStrings.listbox
import typings.rjsfUtils.rjsfUtilsStrings.location
import typings.rjsfUtils.rjsfUtilsStrings.menu
import typings.rjsfUtils.rjsfUtilsStrings.mixed
import typings.rjsfUtils.rjsfUtilsStrings.move
import typings.rjsfUtils.rjsfUtilsStrings.no
import typings.rjsfUtils.rjsfUtilsStrings.none
import typings.rjsfUtils.rjsfUtilsStrings.numeric
import typings.rjsfUtils.rjsfUtilsStrings.off
import typings.rjsfUtils.rjsfUtilsStrings.on
import typings.rjsfUtils.rjsfUtilsStrings.other
import typings.rjsfUtils.rjsfUtilsStrings.page
import typings.rjsfUtils.rjsfUtilsStrings.polite
import typings.rjsfUtils.rjsfUtilsStrings.popup
import typings.rjsfUtils.rjsfUtilsStrings.removals
import typings.rjsfUtils.rjsfUtilsStrings.search
import typings.rjsfUtils.rjsfUtilsStrings.spelling
import typings.rjsfUtils.rjsfUtilsStrings.step
import typings.rjsfUtils.rjsfUtilsStrings.tel
import typings.rjsfUtils.rjsfUtilsStrings.text
import typings.rjsfUtils.rjsfUtilsStrings.time
import typings.rjsfUtils.rjsfUtilsStrings.tree
import typings.rjsfUtils.rjsfUtilsStrings.url
import typings.rjsfUtils.rjsfUtilsStrings.vertical
import typings.rjsfUtils.rjsfUtilsStrings.yes
import typings.std.HTMLElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a Widget implementation */
/* Inlined parent @rjsf/utils.@rjsf/utils.GenericObjectType */
/* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLElement>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, 'onBlur' | 'onFocus'>> */
@js.native
trait WidgetProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */]
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
  
  /** A boolean value stating if the widget should autofocus */
  var autofocus: js.UndefOr[Boolean] = js.native
  
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
  
  /** A boolean value stating if the widget is disabled */
  var disabled: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  /** The `formContext` object that you passed to `Form` */
  var formContext: js.UndefOr[F] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** A boolean value stating if the widget is hiding its errors */
  var hideError: js.UndefOr[Boolean] = js.native
  
  /** A boolean value, if true, will cause the label to be hidden. This is useful for nested fields where you don't want
    * to clutter the UI. Customized via `label` in the `UiSchema`
    */
  var hideLabel: js.UndefOr[Boolean] = js.native
  
  /** The generated id for this widget, used to provide unique `name`s and `id`s for the HTML field elements rendered by
    * widgets
    */
  var id: String = js.native
  
  var inlist: js.UndefOr[Any] = js.native
  
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var itemID: js.UndefOr[String] = js.native
  
  var itemProp: js.UndefOr[String] = js.native
  
  var itemRef: js.UndefOr[String] = js.native
  
  var itemScope: js.UndefOr[Boolean] = js.native
  
  var itemType: js.UndefOr[String] = js.native
  
  /** The computed label for this widget, as a string */
  var label: String = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  /** A boolean value stating if the widget can accept multiple values */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /** The unique name of the field, usually derived from the name of the property in the JSONSchema; Provided in support
    * of custom widgets.
    */
  var name: String = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.native
  
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  
  /** The input blur event handler; call it with the widget id and value */
  def onBlur(id: String, value: Any): Unit = js.native
  
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.native
  
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.native
  /** The value change event handler; call it with the new value every time it changes */
  def onChange(value: Any): Unit = js.native
  
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
  
  /** The input focus event handler; call it with the widget id and value */
  def onFocus(id: String, value: Any): Unit = js.native
  
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
  
  /** A map of UI Options passed as a prop to the component, including the optional `enumOptions`
    * which is a special case on top of `UIOptionsType` needed only by widgets
    */
  var options: (NonNullable[UIOptionsType[T, S, F]]) & EnumOptions[S] = js.native
  
  /** The placeholder for the widget, if any */
  var placeholder: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var radioGroup: js.UndefOr[String] = js.native
  
  /** An array of strings listing all generated error messages from encountered errors for this widget */
  var rawErrors: js.UndefOr[js.Array[String]] = js.native
  
  /** A boolean value stating if the widget is read-only */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /** The `registry` object */
  var registry: Registry[T, S, F] = js.native
  
  var rel: js.UndefOr[String] = js.native
  
  /** The required status of this widget */
  var required: js.UndefOr[Boolean] = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var rev: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[AriaRole] = js.native
  
  /** The JSONSchema subschema object for this widget */
  var schema: S = js.native
  
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
  
  /** The uiSchema for this widget */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.native
  
  var unselectable: js.UndefOr[on | off] = js.native
  
  /** The current value for this widget */
  var value: Any = js.native
  
  var vocab: js.UndefOr[String] = js.native
}

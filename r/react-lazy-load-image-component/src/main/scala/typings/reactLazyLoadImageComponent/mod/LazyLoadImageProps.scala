package typings.reactLazyLoadImageComponent.mod

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
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactElement
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
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings._empty
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`additions text`
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`inline`
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`lazy`
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`no-referrer`
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`unsafe-url`
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.`use-credentials`
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.additions
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.all
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.anonymous
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.ascending
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.assertive
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.async
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.auto
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.both
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.copy
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.date
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.decimal
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.descending
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.dialog
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.eager
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.email
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.execute
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.grammar
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.grid
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.horizontal
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.inherit
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.link
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.list
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.listbox
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.location
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.menu
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.mixed
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.move
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.no
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.none
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.numeric
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.off
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.on
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.origin
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.other
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.page
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.polite
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.popup
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.removals
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.search
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.spelling
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.step
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.sync
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.tel
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.text
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.time
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.tree
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.url
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.vertical
import typings.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.yes
import typings.std.Event
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-lazy-load-image-component.react-lazy-load-image-component.CommonProps */
/* Inlined parent std.Omit<react.react.ImgHTMLAttributes<std.HTMLImageElement>, 'placeholder' | 'onload'> */
trait LazyLoadImageProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  /** Function called after the image has been completely loaded. */
  var afterLoad: js.UndefOr[js.Function0[_]] = js.undefined
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
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  /** Function called right before the placeholder is replaced with the image element. */
  var beforeLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var decoding: js.UndefOr[async | auto | sync] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  /* Method from lodash to use to delay the scroll/resize events. */
  var delayMethod: js.UndefOr[DelayMethod] = js.undefined
  /** Time in ms sent to the delayMethod. */
  var delayTime: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  /** Name of the effect to use. Requires importing CSS, see README.md. */
  var effect: js.UndefOr[Effect] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[eager | `lazy`] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLImageElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLImageElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLImageElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLImageElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLImageElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLImageElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLImageElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLImageElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLImageElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLImageElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLImageElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLImageElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLImageElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLImageElement]] = js.undefined
  /** React element to use as a placeholder. Default is <span>. */
  var placeholder: js.UndefOr[ReactElement | Null] = js.undefined
  /** Image src to display while the image is not visible or loaded. */
  var placeholderSrc: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[`no-referrer` | origin | `unsafe-url`] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  /** See trackWindowScroll(). */
  var scrollPosition: js.UndefOr[ScrollPosition] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
  var threshold: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  /** Whether to use browser's IntersectionObserver when available. */
  var useIntersectionObserver: js.UndefOr[Boolean] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  /** Whether the image must be visible from the beginning. */
  var visibleByDefault: js.UndefOr[Boolean] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  /** In some occasions (for example, when using a placeholderSrc) a wrapper span tag is rendered. This prop allows setting a class to that element. */
  var wrapperClassName: js.UndefOr[String] = js.undefined
}

object LazyLoadImageProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    afterLoad: () => _ = null,
    alt: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: js.UndefOr[Double] = js.undefined,
    `aria-colindex`: js.UndefOr[Double] = js.undefined,
    `aria-colspan`: js.UndefOr[Double] = js.undefined,
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
    `aria-level`: js.UndefOr[Double] = js.undefined,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: js.UndefOr[Double] = js.undefined,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: js.UndefOr[Double] = js.undefined,
    `aria-rowindex`: js.UndefOr[Double] = js.undefined,
    `aria-rowspan`: js.UndefOr[Double] = js.undefined,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: js.UndefOr[Double] = js.undefined,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: js.UndefOr[Double] = js.undefined,
    `aria-valuemin`: js.UndefOr[Double] = js.undefined,
    `aria-valuenow`: js.UndefOr[Double] = js.undefined,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    beforeLoad: () => _ = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    crossOrigin: anonymous | `use-credentials` | _empty = null,
    dangerouslySetInnerHTML: Html = null,
    datatype: String = null,
    decoding: async | auto | sync = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    delayMethod: DelayMethod = null,
    delayTime: js.UndefOr[Double] = js.undefined,
    dir: String = null,
    draggable: js.UndefOr[Booleanish] = js.undefined,
    effect: Effect = null,
    height: Double | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    loading: eager | `lazy` = null,
    onAbort: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLImageElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLImageElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLImageElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLImageElement] => Unit = null,
    onBlur: FocusEvent[HTMLImageElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onChange: FormEvent[HTMLImageElement] => Unit = null,
    onClick: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLImageElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLImageElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLImageElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLImageElement] => Unit = null,
    onCut: ClipboardEvent[HTMLImageElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLImageElement] => Unit = null,
    onDragEnd: DragEvent[HTMLImageElement] => Unit = null,
    onDragEnter: DragEvent[HTMLImageElement] => Unit = null,
    onDragExit: DragEvent[HTMLImageElement] => Unit = null,
    onDragLeave: DragEvent[HTMLImageElement] => Unit = null,
    onDragOver: DragEvent[HTMLImageElement] => Unit = null,
    onDragStart: DragEvent[HTMLImageElement] => Unit = null,
    onDrop: DragEvent[HTMLImageElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLImageElement] => Unit = null,
    onInput: FormEvent[HTMLImageElement] => Unit = null,
    onInvalid: FormEvent[HTMLImageElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLImageElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLImageElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLImageElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLImageElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLImageElement] => Unit = null,
    onPause: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLImageElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLImageElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onReset: FormEvent[HTMLImageElement] => Unit = null,
    onScroll: UIEvent[HTMLImageElement, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLImageElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLImageElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLImageElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLImageElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLImageElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLImageElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLImageElement] => Unit = null,
    placeholder: js.UndefOr[Null | ReactElement] = js.undefined,
    placeholderSrc: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    referrerPolicy: `no-referrer` | origin | `unsafe-url` = null,
    resource: String = null,
    results: js.UndefOr[Double] = js.undefined,
    role: String = null,
    scrollPosition: ScrollPosition = null,
    security: String = null,
    sizes: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Booleanish] = js.undefined,
    src: String = null,
    srcSet: String = null,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    useMap: String = null,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined,
    vocab: String = null,
    width: Double | String = null,
    wrapperClassName: String = null
  ): LazyLoadImageProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.get.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.get.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colcount`)) __obj.updateDynamic("aria-colcount")(`aria-colcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colindex`)) __obj.updateDynamic("aria-colindex")(`aria-colindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-colspan`)) __obj.updateDynamic("aria-colspan")(`aria-colspan`.get.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.get.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.get.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.get.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.get.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-level`)) __obj.updateDynamic("aria-level")(`aria-level`.get.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.get.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-posinset`)) __obj.updateDynamic("aria-posinset")(`aria-posinset`.get.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.get.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.get.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowcount`)) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowindex`)) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-rowspan`)) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-setsize`)) __obj.updateDynamic("aria-setsize")(`aria-setsize`.get.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemax`)) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuemin`)) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-valuenow`)) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.get.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction0(beforeLoad))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (decoding != null) __obj.updateDynamic("decoding")(decoding.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(delayTime)) __obj.updateDynamic("delayTime")(delayTime.get.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.get.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
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
    if (!js.isUndefined(placeholder)) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderSrc != null) __obj.updateDynamic("placeholderSrc")(placeholderSrc.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(results)) __obj.updateDynamic("results")(results.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.get.asInstanceOf[js.Any])
    if (useMap != null) __obj.updateDynamic("useMap")(useMap.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.get.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadImageProps]
  }
}


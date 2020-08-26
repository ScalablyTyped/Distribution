package typings.reactOwlCarousel.mod

import org.scalablytyped.runtime.StringDictionary
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
import typings.reactOwlCarousel.optionsMod.HandlerCallback
import typings.reactOwlCarousel.optionsMod.Options
import typings.reactOwlCarousel.reactOwlCarouselStrings.`additions text`
import typings.reactOwlCarousel.reactOwlCarouselStrings.`inline`
import typings.reactOwlCarousel.reactOwlCarouselStrings.additions
import typings.reactOwlCarousel.reactOwlCarouselStrings.all
import typings.reactOwlCarousel.reactOwlCarouselStrings.ascending
import typings.reactOwlCarousel.reactOwlCarouselStrings.assertive
import typings.reactOwlCarousel.reactOwlCarouselStrings.both
import typings.reactOwlCarousel.reactOwlCarouselStrings.copy
import typings.reactOwlCarousel.reactOwlCarouselStrings.date
import typings.reactOwlCarousel.reactOwlCarouselStrings.decimal
import typings.reactOwlCarousel.reactOwlCarouselStrings.descending
import typings.reactOwlCarousel.reactOwlCarouselStrings.dialog
import typings.reactOwlCarousel.reactOwlCarouselStrings.email
import typings.reactOwlCarousel.reactOwlCarouselStrings.execute
import typings.reactOwlCarousel.reactOwlCarouselStrings.grammar
import typings.reactOwlCarousel.reactOwlCarouselStrings.grid
import typings.reactOwlCarousel.reactOwlCarouselStrings.horizontal
import typings.reactOwlCarousel.reactOwlCarouselStrings.inherit
import typings.reactOwlCarousel.reactOwlCarouselStrings.link
import typings.reactOwlCarousel.reactOwlCarouselStrings.list
import typings.reactOwlCarousel.reactOwlCarouselStrings.listbox
import typings.reactOwlCarousel.reactOwlCarouselStrings.location
import typings.reactOwlCarousel.reactOwlCarouselStrings.menu
import typings.reactOwlCarousel.reactOwlCarouselStrings.mixed
import typings.reactOwlCarousel.reactOwlCarouselStrings.move
import typings.reactOwlCarousel.reactOwlCarouselStrings.no
import typings.reactOwlCarousel.reactOwlCarouselStrings.none
import typings.reactOwlCarousel.reactOwlCarouselStrings.numeric
import typings.reactOwlCarousel.reactOwlCarouselStrings.off
import typings.reactOwlCarousel.reactOwlCarouselStrings.on
import typings.reactOwlCarousel.reactOwlCarouselStrings.other
import typings.reactOwlCarousel.reactOwlCarouselStrings.page
import typings.reactOwlCarousel.reactOwlCarouselStrings.polite
import typings.reactOwlCarousel.reactOwlCarouselStrings.popup
import typings.reactOwlCarousel.reactOwlCarouselStrings.removals
import typings.reactOwlCarousel.reactOwlCarouselStrings.search
import typings.reactOwlCarousel.reactOwlCarouselStrings.spelling
import typings.reactOwlCarousel.reactOwlCarouselStrings.step
import typings.reactOwlCarousel.reactOwlCarouselStrings.tel
import typings.reactOwlCarousel.reactOwlCarouselStrings.text
import typings.reactOwlCarousel.reactOwlCarouselStrings.time
import typings.reactOwlCarousel.reactOwlCarouselStrings.tree
import typings.reactOwlCarousel.reactOwlCarouselStrings.url
import typings.reactOwlCarousel.reactOwlCarouselStrings.vertical
import typings.reactOwlCarousel.reactOwlCarouselStrings.yes
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-owl-carousel.react-owl-carousel/umd/options.Options & react-owl-carousel.react-owl-carousel.ComponentProps */
@js.native
trait OwlCarouselProps extends js.Object {
  var URLhashListener: js.UndefOr[Boolean] = js.native
  val about: js.UndefOr[String] = js.native
  val accept: js.UndefOr[String] = js.native
  val acceptCharset: js.UndefOr[String] = js.native
  val accessKey: js.UndefOr[String] = js.native
  val action: js.UndefOr[String] = js.native
  val allowFullScreen: js.UndefOr[Boolean] = js.native
  val allowTransparency: js.UndefOr[Boolean] = js.native
  val alt: js.UndefOr[String] = js.native
  var animateIn: js.UndefOr[String | Boolean] = js.native
  var animateOut: js.UndefOr[String | Boolean] = js.native
  val `aria-activedescendant`: js.UndefOr[String] = js.native
  val `aria-atomic`: js.UndefOr[Boolean] = js.native
  val `aria-autocomplete`: js.UndefOr[none | `inline` | typings.reactOwlCarousel.reactOwlCarouselStrings.list | both] = js.native
  val `aria-busy`: js.UndefOr[Boolean] = js.native
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  val `aria-colcount`: js.UndefOr[Double] = js.native
  val `aria-colindex`: js.UndefOr[Double] = js.native
  val `aria-colspan`: js.UndefOr[Double] = js.native
  val `aria-controls`: js.UndefOr[String] = js.native
  val `aria-current`: js.UndefOr[
    Boolean | page | typings.reactOwlCarousel.reactOwlCarouselStrings.step | location | date | time
  ] = js.native
  val `aria-describedby`: js.UndefOr[String] = js.native
  val `aria-details`: js.UndefOr[String] = js.native
  val `aria-disabled`: js.UndefOr[Boolean] = js.native
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  val `aria-errormessage`: js.UndefOr[String] = js.native
  val `aria-expanded`: js.UndefOr[Boolean] = js.native
  val `aria-flowto`: js.UndefOr[String] = js.native
  val `aria-grabbed`: js.UndefOr[Boolean] = js.native
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  val `aria-hidden`: js.UndefOr[Boolean] = js.native
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  val `aria-keyshortcuts`: js.UndefOr[String] = js.native
  val `aria-label`: js.UndefOr[String] = js.native
  val `aria-labelledby`: js.UndefOr[String] = js.native
  val `aria-level`: js.UndefOr[Double] = js.native
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  val `aria-modal`: js.UndefOr[Boolean] = js.native
  val `aria-multiline`: js.UndefOr[Boolean] = js.native
  val `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  val `aria-owns`: js.UndefOr[String] = js.native
  val `aria-placeholder`: js.UndefOr[String] = js.native
  val `aria-posinset`: js.UndefOr[Double] = js.native
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  val `aria-readonly`: js.UndefOr[Boolean] = js.native
  val `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  val `aria-required`: js.UndefOr[Boolean] = js.native
  val `aria-roledescription`: js.UndefOr[String] = js.native
  val `aria-rowcount`: js.UndefOr[Double] = js.native
  val `aria-rowindex`: js.UndefOr[Double] = js.native
  val `aria-rowspan`: js.UndefOr[Double] = js.native
  val `aria-selected`: js.UndefOr[Boolean] = js.native
  val `aria-setsize`: js.UndefOr[Double] = js.native
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  val `aria-valuemax`: js.UndefOr[Double] = js.native
  val `aria-valuemin`: js.UndefOr[Double] = js.native
  val `aria-valuenow`: js.UndefOr[Double] = js.native
  val `aria-valuetext`: js.UndefOr[String] = js.native
  val as: js.UndefOr[String] = js.native
  val async: js.UndefOr[Boolean] = js.native
  val autoCapitalize: js.UndefOr[String] = js.native
  val autoComplete: js.UndefOr[String] = js.native
  val autoCorrect: js.UndefOr[String] = js.native
  val autoFocus: js.UndefOr[Boolean] = js.native
  var autoHeightClass: js.UndefOr[String] = js.native
  val autoPlay: js.UndefOr[Boolean] = js.native
  val autoSave: js.UndefOr[String] = js.native
  var autoWidth: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayHoverPause: js.UndefOr[Boolean] = js.native
  var autoplaySpeed: js.UndefOr[Double | Boolean] = js.native
  var autoplayTimeout: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[Boolean] = js.native
  val capture: js.UndefOr[Boolean | String] = js.native
  val cellPadding: js.UndefOr[Double | String] = js.native
  val cellSpacing: js.UndefOr[Double | String] = js.native
  var center: js.UndefOr[Boolean] = js.native
  val challenge: js.UndefOr[String] = js.native
  val charSet: js.UndefOr[String] = js.native
  val checked: js.UndefOr[Boolean] = js.native
  val children: js.UndefOr[ReactNode] = js.native
  val cite: js.UndefOr[String] = js.native
  val classID: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val colSpan: js.UndefOr[Double] = js.native
  val color: js.UndefOr[String] = js.native
  val cols: js.UndefOr[Double] = js.native
  val content: js.UndefOr[String] = js.native
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.native
  val contextMenu: js.UndefOr[String] = js.native
  val controls: js.UndefOr[Boolean] = js.native
  var controlsClass: js.UndefOr[String] = js.native
  val coords: js.UndefOr[String] = js.native
  val crossOrigin: js.UndefOr[String] = js.native
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  val data: js.UndefOr[String] = js.native
  val datatype: js.UndefOr[String] = js.native
  val dateTime: js.UndefOr[String] = js.native
  val default: js.UndefOr[Boolean] = js.native
  val defaultChecked: js.UndefOr[Boolean] = js.native
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
  val defer: js.UndefOr[Boolean] = js.native
  val dir: js.UndefOr[String] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  var dotClass: js.UndefOr[String] = js.native
  var dotData: js.UndefOr[Boolean] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var dotsClass: js.UndefOr[String] = js.native
  var dotsContainer: js.UndefOr[String | Boolean] = js.native
  var dotsEach: js.UndefOr[Double | Boolean] = js.native
  var dotsSpeed: js.UndefOr[Double | Boolean] = js.native
  val download: js.UndefOr[js.Any] = js.native
  var dragClass: js.UndefOr[String] = js.native
  var dragEndSpeed: js.UndefOr[Double | Boolean] = js.native
  val draggable: js.UndefOr[Booleanish] = js.native
  val encType: js.UndefOr[String] = js.native
  var fallbackEasing: js.UndefOr[String] = js.native
  var fluidSpeed: js.UndefOr[Double | Boolean] = js.native
  val form: js.UndefOr[String] = js.native
  val formAction: js.UndefOr[String] = js.native
  val formEncType: js.UndefOr[String] = js.native
  val formMethod: js.UndefOr[String] = js.native
  val formNoValidate: js.UndefOr[Boolean] = js.native
  val formTarget: js.UndefOr[String] = js.native
  val frameBorder: js.UndefOr[Double | String] = js.native
  var freeDrag: js.UndefOr[Boolean] = js.native
  var grabClass: js.UndefOr[String] = js.native
  val headers: js.UndefOr[String] = js.native
  val height: js.UndefOr[Double | String] = js.native
  val hidden: js.UndefOr[Boolean] = js.native
  val high: js.UndefOr[Double] = js.native
  val href: js.UndefOr[String] = js.native
  val hrefLang: js.UndefOr[String] = js.native
  val htmlFor: js.UndefOr[String] = js.native
  val httpEquiv: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  var info: js.UndefOr[HandlerCallback] = js.native
  val inlist: js.UndefOr[js.Any] = js.native
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  val integrity: js.UndefOr[String] = js.native
  val is: js.UndefOr[String] = js.native
  var itemElement: js.UndefOr[String] = js.native
  val itemID: js.UndefOr[String] = js.native
  val itemProp: js.UndefOr[String] = js.native
  val itemRef: js.UndefOr[String] = js.native
  val itemScope: js.UndefOr[Boolean] = js.native
  val itemType: js.UndefOr[String] = js.native
  var items: js.UndefOr[Double] = js.native
  val keyParams: js.UndefOr[String] = js.native
  val keyType: js.UndefOr[String] = js.native
  val kind: js.UndefOr[String] = js.native
  val label: js.UndefOr[String] = js.native
  val lang: js.UndefOr[String] = js.native
  var lazyContent: js.UndefOr[Boolean] = js.native
  var lazyLoad: js.UndefOr[Boolean] = js.native
  val list: js.UndefOr[String] = js.native
  var loadedClass: js.UndefOr[String] = js.native
  var loadingClass: js.UndefOr[String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  val low: js.UndefOr[Double] = js.native
  val manifest: js.UndefOr[String] = js.native
  var margin: js.UndefOr[Double] = js.native
  val marginHeight: js.UndefOr[Double] = js.native
  val marginWidth: js.UndefOr[Double] = js.native
  val max: js.UndefOr[Double | String] = js.native
  val maxLength: js.UndefOr[Double] = js.native
  val media: js.UndefOr[String] = js.native
  val mediaGroup: js.UndefOr[String] = js.native
  var merge: js.UndefOr[Boolean] = js.native
  var mergeFit: js.UndefOr[Boolean] = js.native
  val method: js.UndefOr[String] = js.native
  val min: js.UndefOr[Double | String] = js.native
  val minLength: js.UndefOr[Double] = js.native
  var mouseDrag: js.UndefOr[Boolean] = js.native
  val multiple: js.UndefOr[Boolean] = js.native
  val muted: js.UndefOr[Boolean] = js.native
  val name: js.UndefOr[String] = js.native
  var nav: js.UndefOr[Boolean] = js.native
  var navClass: js.UndefOr[js.Array[String]] = js.native
  var navContainer: js.UndefOr[String | Boolean] = js.native
  var navContainerClass: js.UndefOr[String] = js.native
  var navElement: js.UndefOr[String] = js.native
  var navSpeed: js.UndefOr[Double | Boolean] = js.native
  var navText: js.UndefOr[js.Array[String]] = js.native
  var nestedItemSelector: js.UndefOr[String] = js.native
  val noValidate: js.UndefOr[Boolean] = js.native
  val nonce: js.UndefOr[String] = js.native
  val onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  val onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
  val onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  val onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onChange: js.UndefOr[HandlerCallback] with js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onChanged: js.UndefOr[HandlerCallback] = js.native
  val onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
  val onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  val onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onDrag: js.UndefOr[HandlerCallback] with js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  var onDragged: js.UndefOr[HandlerCallback] = js.native
  val onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
  val onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
  var onInitialize: js.UndefOr[HandlerCallback] = js.native
  var onInitialized: js.UndefOr[HandlerCallback] = js.native
  val onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  val onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadLazy: js.UndefOr[HandlerCallback] = js.native
  val onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onLoadedLazy: js.UndefOr[HandlerCallback] = js.native
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  val onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
  val onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onPlayVideo: js.UndefOr[HandlerCallback] = js.native
  val onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
  val onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onRefresh: js.UndefOr[HandlerCallback] = js.native
  var onRefreshed: js.UndefOr[HandlerCallback] = js.native
  val onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  var onResize: js.UndefOr[HandlerCallback] = js.native
  var onResized: js.UndefOr[HandlerCallback] = js.native
  val onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
  val onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  var onStopVideo: js.UndefOr[HandlerCallback] = js.native
  val onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
  val onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
  var onTranslate: js.UndefOr[HandlerCallback] = js.native
  var onTranslated: js.UndefOr[HandlerCallback] = js.native
  val onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
  val onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
  val open: js.UndefOr[Boolean] = js.native
  val optimum: js.UndefOr[Double] = js.native
  val pattern: js.UndefOr[String] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val playsInline: js.UndefOr[Boolean] = js.native
  val poster: js.UndefOr[String] = js.native
  val prefix: js.UndefOr[String] = js.native
  val preload: js.UndefOr[String] = js.native
  val property: js.UndefOr[String] = js.native
  var pullDrag: js.UndefOr[Boolean] = js.native
  val radioGroup: js.UndefOr[String] = js.native
  val readOnly: js.UndefOr[Boolean] = js.native
  var refreshClass: js.UndefOr[String] = js.native
  val rel: js.UndefOr[String] = js.native
  val required: js.UndefOr[Boolean] = js.native
  val resource: js.UndefOr[String] = js.native
  var responsive: js.UndefOr[StringDictionary[Options]] = js.native
  var responsiveBaseElement: js.UndefOr[Element] = js.native
  var responsiveClass: js.UndefOr[String | Boolean] = js.native
  var responsiveRefreshRate: js.UndefOr[Double] = js.native
  val results: js.UndefOr[Double] = js.native
  val reversed: js.UndefOr[Boolean] = js.native
  var rewind: js.UndefOr[Boolean] = js.native
  val role: js.UndefOr[String] = js.native
  val rowSpan: js.UndefOr[Double] = js.native
  val rows: js.UndefOr[Double] = js.native
  var rtlClass: js.UndefOr[String] = js.native
  val sandbox: js.UndefOr[String] = js.native
  val scope: js.UndefOr[String] = js.native
  val scoped: js.UndefOr[Boolean] = js.native
  val scrolling: js.UndefOr[String] = js.native
  val seamless: js.UndefOr[Boolean] = js.native
  val security: js.UndefOr[String] = js.native
  val selected: js.UndefOr[Boolean] = js.native
  val shape: js.UndefOr[String] = js.native
  val size: js.UndefOr[Double] = js.native
  val sizes: js.UndefOr[String] = js.native
  var slideBy: js.UndefOr[Double | String] = js.native
  val slot: js.UndefOr[String] = js.native
  var smartSpeed: js.UndefOr[Double | Boolean] = js.native
  val span: js.UndefOr[Double] = js.native
  val spellCheck: js.UndefOr[Booleanish] = js.native
  val src: js.UndefOr[String] = js.native
  val srcDoc: js.UndefOr[String] = js.native
  val srcLang: js.UndefOr[String] = js.native
  val srcSet: js.UndefOr[String] = js.native
  var stageClass: js.UndefOr[String] = js.native
  var stageElement: js.UndefOr[String] = js.native
  var stageOuterClass: js.UndefOr[String] = js.native
  var stagePadding: js.UndefOr[Double] = js.native
  val start: js.UndefOr[Double] = js.native
  var startPosition: js.UndefOr[Double | String] = js.native
  val step: js.UndefOr[Double | String] = js.native
  val style: js.UndefOr[CSSProperties] = js.native
  val summary: js.UndefOr[String] = js.native
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.native
  val tabIndex: js.UndefOr[Double] = js.native
  val target: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
  var touchDrag: js.UndefOr[Boolean] = js.native
  val translate: js.UndefOr[yes | no] = js.native
  val `type`: js.UndefOr[String] = js.native
  val typeof: js.UndefOr[String] = js.native
  val unselectable: js.UndefOr[on | off] = js.native
  val useMap: js.UndefOr[String] = js.native
  val value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var video: js.UndefOr[Boolean] = js.native
  var videoHeight: js.UndefOr[Double | Boolean] = js.native
  var videoWidth: js.UndefOr[Double | Boolean] = js.native
  val vocab: js.UndefOr[String] = js.native
  val width: js.UndefOr[Double | String] = js.native
  val wmode: js.UndefOr[String] = js.native
  val wrap: js.UndefOr[String] = js.native
}

object OwlCarouselProps {
  @scala.inline
  def apply(
    onChange: js.UndefOr[HandlerCallback] with js.UndefOr[FormEventHandler[HTMLDivElement]],
    onDrag: js.UndefOr[HandlerCallback] with js.UndefOr[DragEventHandler[HTMLDivElement]]
  ): OwlCarouselProps = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any], onDrag = onDrag.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwlCarouselProps]
  }
  @scala.inline
  implicit class OwlCarouselPropsOps[Self <: OwlCarouselProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: js.UndefOr[HandlerCallback] with js.UndefOr[FormEventHandler[HTMLDivElement]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDrag(value: js.UndefOr[HandlerCallback] with js.UndefOr[DragEventHandler[HTMLDivElement]]): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def setURLhashListener(value: Boolean): Self = this.set("URLhashListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteURLhashListener: Self = this.set("URLhashListener", js.undefined)
    @scala.inline
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAcceptCharset(value: String): Self = this.set("acceptCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptCharset: Self = this.set("acceptCharset", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", js.undefined)
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAnimateIn(value: String | Boolean): Self = this.set("animateIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateIn: Self = this.set("animateIn", js.undefined)
    @scala.inline
    def setAnimateOut(value: String | Boolean): Self = this.set("animateOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateOut: Self = this.set("animateOut", js.undefined)
    @scala.inline
    def `setAria-activedescendant`(value: String): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    @scala.inline
    def `setAria-atomic`(value: Boolean): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    @scala.inline
    def `setAria-autocomplete`(value: none | `inline` | list | both): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
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
    def `setAria-expanded`(value: Boolean): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    @scala.inline
    def `setAria-flowto`(value: String): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    @scala.inline
    def `setAria-grabbed`(value: Boolean): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    @scala.inline
    def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
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
    def `setAria-owns`(value: String): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setAutoCapitalize(value: String): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoHeightClass(value: String): Self = this.set("autoHeightClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeightClass: Self = this.set("autoHeightClass", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setAutoSave(value: String): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setAutoplayHoverPause(value: Boolean): Self = this.set("autoplayHoverPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplayHoverPause: Self = this.set("autoplayHoverPause", js.undefined)
    @scala.inline
    def setAutoplaySpeed(value: Double | Boolean): Self = this.set("autoplaySpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplaySpeed: Self = this.set("autoplaySpeed", js.undefined)
    @scala.inline
    def setAutoplayTimeout(value: Double): Self = this.set("autoplayTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplayTimeout: Self = this.set("autoplayTimeout", js.undefined)
    @scala.inline
    def setCallbacks(value: Boolean): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setCapture(value: Boolean | String): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setCellPadding(value: Double | String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", js.undefined)
    @scala.inline
    def setCellSpacing(value: Double | String): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCite(value: String): Self = this.set("cite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCite: Self = this.set("cite", js.undefined)
    @scala.inline
    def setClassID(value: String): Self = this.set("classID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassID: Self = this.set("classID", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentEditable(value: Booleanish | inherit): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setControlsClass(value: String): Self = this.set("controlsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsClass: Self = this.set("controlsClass", js.undefined)
    @scala.inline
    def setCoords(value: String): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
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
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDotClass(value: String): Self = this.set("dotClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotClass: Self = this.set("dotClass", js.undefined)
    @scala.inline
    def setDotData(value: Boolean): Self = this.set("dotData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotData: Self = this.set("dotData", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setDotsClass(value: String): Self = this.set("dotsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsClass: Self = this.set("dotsClass", js.undefined)
    @scala.inline
    def setDotsContainer(value: String | Boolean): Self = this.set("dotsContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsContainer: Self = this.set("dotsContainer", js.undefined)
    @scala.inline
    def setDotsEach(value: Double | Boolean): Self = this.set("dotsEach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsEach: Self = this.set("dotsEach", js.undefined)
    @scala.inline
    def setDotsSpeed(value: Double | Boolean): Self = this.set("dotsSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsSpeed: Self = this.set("dotsSpeed", js.undefined)
    @scala.inline
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setDragClass(value: String): Self = this.set("dragClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragClass: Self = this.set("dragClass", js.undefined)
    @scala.inline
    def setDragEndSpeed(value: Double | Boolean): Self = this.set("dragEndSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragEndSpeed: Self = this.set("dragEndSpeed", js.undefined)
    @scala.inline
    def setDraggable(value: Booleanish): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncType: Self = this.set("encType", js.undefined)
    @scala.inline
    def setFallbackEasing(value: String): Self = this.set("fallbackEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackEasing: Self = this.set("fallbackEasing", js.undefined)
    @scala.inline
    def setFluidSpeed(value: Double | Boolean): Self = this.set("fluidSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluidSpeed: Self = this.set("fluidSpeed", js.undefined)
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
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", js.undefined)
    @scala.inline
    def setFreeDrag(value: Boolean): Self = this.set("freeDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeDrag: Self = this.set("freeDrag", js.undefined)
    @scala.inline
    def setGrabClass(value: String): Self = this.set("grabClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrabClass: Self = this.set("grabClass", js.undefined)
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setHttpEquiv(value: String): Self = this.set("httpEquiv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEquiv: Self = this.set("httpEquiv", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemElement(value: String): Self = this.set("itemElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemElement: Self = this.set("itemElement", js.undefined)
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
    def setItems(value: Double): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKeyParams(value: String): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", js.undefined)
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLazyContent(value: Boolean): Self = this.set("lazyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyContent: Self = this.set("lazyContent", js.undefined)
    @scala.inline
    def setLazyLoad(value: Boolean): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setLoadedClass(value: String): Self = this.set("loadedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedClass: Self = this.set("loadedClass", js.undefined)
    @scala.inline
    def setLoadingClass(value: String): Self = this.set("loadingClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingClass: Self = this.set("loadingClass", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", js.undefined)
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", js.undefined)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", js.undefined)
    @scala.inline
    def setMerge(value: Boolean): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    @scala.inline
    def setMergeFit(value: Boolean): Self = this.set("mergeFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeFit: Self = this.set("mergeFit", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMouseDrag(value: Boolean): Self = this.set("mouseDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseDrag: Self = this.set("mouseDrag", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNav(value: Boolean): Self = this.set("nav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    @scala.inline
    def setNavClassVarargs(value: String*): Self = this.set("navClass", js.Array(value :_*))
    @scala.inline
    def setNavClass(value: js.Array[String]): Self = this.set("navClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavClass: Self = this.set("navClass", js.undefined)
    @scala.inline
    def setNavContainer(value: String | Boolean): Self = this.set("navContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavContainer: Self = this.set("navContainer", js.undefined)
    @scala.inline
    def setNavContainerClass(value: String): Self = this.set("navContainerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavContainerClass: Self = this.set("navContainerClass", js.undefined)
    @scala.inline
    def setNavElement(value: String): Self = this.set("navElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavElement: Self = this.set("navElement", js.undefined)
    @scala.inline
    def setNavSpeed(value: Double | Boolean): Self = this.set("navSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavSpeed: Self = this.set("navSpeed", js.undefined)
    @scala.inline
    def setNavTextVarargs(value: String*): Self = this.set("navText", js.Array(value :_*))
    @scala.inline
    def setNavText(value: js.Array[String]): Self = this.set("navText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavText: Self = this.set("navText", js.undefined)
    @scala.inline
    def setNestedItemSelector(value: String): Self = this.set("nestedItemSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedItemSelector: Self = this.set("nestedItemSelector", js.undefined)
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOnAbort(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationIteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[HTMLDivElement] => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    @scala.inline
    def setOnAuxClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onAuxClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    @scala.inline
    def setOnBeforeInput(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onBeforeInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    @scala.inline
    def setOnBlur(value: FocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnChanged(value: /* repeated */ js.Any => Unit): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[HTMLDivElement] => Unit): Self = this.set("onCompositionUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    @scala.inline
    def setOnContextMenu(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnCopy(value: ClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onCopy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    @scala.inline
    def setOnCut(value: ClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onCut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragged(value: /* repeated */ js.Any => Unit): Self = this.set("onDragged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragged: Self = this.set("onDragged", js.undefined)
    @scala.inline
    def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onEncrypted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    @scala.inline
    def setOnEnded(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFocus(value: FocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInitialize(value: /* repeated */ js.Any => Unit): Self = this.set("onInitialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInitialize: Self = this.set("onInitialize", js.undefined)
    @scala.inline
    def setOnInitialized(value: /* repeated */ js.Any => Unit): Self = this.set("onInitialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
    @scala.inline
    def setOnInput(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInvalid(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnLoad(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadLazy(value: /* repeated */ js.Any => Unit): Self = this.set("onLoadLazy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadLazy: Self = this.set("onLoadLazy", js.undefined)
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedLazy(value: /* repeated */ js.Any => Unit): Self = this.set("onLoadedLazy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedLazy: Self = this.set("onLoadedLazy", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOver(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseUp(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPaste(value: ClipboardEvent[HTMLDivElement] => Unit): Self = this.set("onPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    @scala.inline
    def setOnPause(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlayVideo(value: /* repeated */ js.Any => Unit): Self = this.set("onPlayVideo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlayVideo: Self = this.set("onPlayVideo", js.undefined)
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerDown(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerMove(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerOut(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOver(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerUp(value: PointerEvent[HTMLDivElement] => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnProgress(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnRefresh(value: /* repeated */ js.Any => Unit): Self = this.set("onRefresh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    @scala.inline
    def setOnRefreshed(value: /* repeated */ js.Any => Unit): Self = this.set("onRefreshed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRefreshed: Self = this.set("onRefreshed", js.undefined)
    @scala.inline
    def setOnReset(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnResize(value: /* repeated */ js.Any => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOnResized(value: /* repeated */ js.Any => Unit): Self = this.set("onResized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResized: Self = this.set("onResized", js.undefined)
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLDivElement, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSelect(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnStalled(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnStopVideo(value: /* repeated */ js.Any => Unit): Self = this.set("onStopVideo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStopVideo: Self = this.set("onStopVideo", js.undefined)
    @scala.inline
    def setOnSubmit(value: FormEvent[HTMLDivElement] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLDivElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[HTMLDivElement] => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTranslate(value: /* repeated */ js.Any => Unit): Self = this.set("onTranslate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTranslate: Self = this.set("onTranslate", js.undefined)
    @scala.inline
    def setOnTranslated(value: /* repeated */ js.Any => Unit): Self = this.set("onTranslated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTranslated: Self = this.set("onTranslated", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[HTMLDivElement, Event] => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWheel(value: WheelEvent[HTMLDivElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptimum(value: Double): Self = this.set("optimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimum: Self = this.set("optimum", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setPullDrag(value: Boolean): Self = this.set("pullDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullDrag: Self = this.set("pullDrag", js.undefined)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRefreshClass(value: String): Self = this.set("refreshClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshClass: Self = this.set("refreshClass", js.undefined)
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResponsive(value: StringDictionary[Options]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setResponsiveBaseElement(value: Element): Self = this.set("responsiveBaseElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveBaseElement: Self = this.set("responsiveBaseElement", js.undefined)
    @scala.inline
    def setResponsiveClass(value: String | Boolean): Self = this.set("responsiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveClass: Self = this.set("responsiveClass", js.undefined)
    @scala.inline
    def setResponsiveRefreshRate(value: Double): Self = this.set("responsiveRefreshRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveRefreshRate: Self = this.set("responsiveRefreshRate", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setRewind(value: Boolean): Self = this.set("rewind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewind: Self = this.set("rewind", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRtlClass(value: String): Self = this.set("rtlClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtlClass: Self = this.set("rtlClass", js.undefined)
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", js.undefined)
    @scala.inline
    def setSecurity(value: String): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSlideBy(value: Double | String): Self = this.set("slideBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideBy: Self = this.set("slideBy", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSmartSpeed(value: Double | Boolean): Self = this.set("smartSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmartSpeed: Self = this.set("smartSpeed", js.undefined)
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    @scala.inline
    def setSpellCheck(value: Booleanish): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", js.undefined)
    @scala.inline
    def setSrcLang(value: String): Self = this.set("srcLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcLang: Self = this.set("srcLang", js.undefined)
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
    @scala.inline
    def setStageClass(value: String): Self = this.set("stageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageClass: Self = this.set("stageClass", js.undefined)
    @scala.inline
    def setStageElement(value: String): Self = this.set("stageElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageElement: Self = this.set("stageElement", js.undefined)
    @scala.inline
    def setStageOuterClass(value: String): Self = this.set("stageOuterClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageOuterClass: Self = this.set("stageOuterClass", js.undefined)
    @scala.inline
    def setStagePadding(value: Double): Self = this.set("stagePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStagePadding: Self = this.set("stagePadding", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartPosition(value: Double | String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTouchDrag(value: Boolean): Self = this.set("touchDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchDrag: Self = this.set("touchDrag", js.undefined)
    @scala.inline
    def setTranslate(value: yes | no): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUnselectable(value: on | off): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setVideoHeight(value: Double | Boolean): Self = this.set("videoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoHeight: Self = this.set("videoHeight", js.undefined)
    @scala.inline
    def setVideoWidth(value: Double | Boolean): Self = this.set("videoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoWidth: Self = this.set("videoWidth", js.undefined)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}


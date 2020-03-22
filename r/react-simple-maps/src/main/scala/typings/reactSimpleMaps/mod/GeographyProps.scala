package typings.reactSimpleMaps.mod

import typings.react.AnonHtml
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.reactSimpleMaps.AnonDefault
import typings.reactSimpleMaps.reactSimpleMapsStrings._empty
import typings.reactSimpleMaps.reactSimpleMapsStrings.`additions text`
import typings.reactSimpleMaps.reactSimpleMapsStrings.`after-edge`
import typings.reactSimpleMaps.reactSimpleMapsStrings.`before-edge`
import typings.reactSimpleMaps.reactSimpleMapsStrings.`inline`
import typings.reactSimpleMaps.reactSimpleMapsStrings.`text-after-edge`
import typings.reactSimpleMaps.reactSimpleMapsStrings.`text-before-edge`
import typings.reactSimpleMaps.reactSimpleMapsStrings.`use-credentials`
import typings.reactSimpleMaps.reactSimpleMapsStrings.additions
import typings.reactSimpleMaps.reactSimpleMapsStrings.all
import typings.reactSimpleMaps.reactSimpleMapsStrings.alphabetic
import typings.reactSimpleMaps.reactSimpleMapsStrings.anonymous
import typings.reactSimpleMaps.reactSimpleMapsStrings.ascending
import typings.reactSimpleMaps.reactSimpleMapsStrings.assertive
import typings.reactSimpleMaps.reactSimpleMapsStrings.auto
import typings.reactSimpleMaps.reactSimpleMapsStrings.baseline
import typings.reactSimpleMaps.reactSimpleMapsStrings.bevel
import typings.reactSimpleMaps.reactSimpleMapsStrings.both
import typings.reactSimpleMaps.reactSimpleMapsStrings.butt
import typings.reactSimpleMaps.reactSimpleMapsStrings.central
import typings.reactSimpleMaps.reactSimpleMapsStrings.copy
import typings.reactSimpleMaps.reactSimpleMapsStrings.date
import typings.reactSimpleMaps.reactSimpleMapsStrings.descending
import typings.reactSimpleMaps.reactSimpleMapsStrings.dialog
import typings.reactSimpleMaps.reactSimpleMapsStrings.evenodd
import typings.reactSimpleMaps.reactSimpleMapsStrings.execute
import typings.reactSimpleMaps.reactSimpleMapsStrings.grammar
import typings.reactSimpleMaps.reactSimpleMapsStrings.grid
import typings.reactSimpleMaps.reactSimpleMapsStrings.hanging
import typings.reactSimpleMaps.reactSimpleMapsStrings.horizontal
import typings.reactSimpleMaps.reactSimpleMapsStrings.ideographic
import typings.reactSimpleMaps.reactSimpleMapsStrings.inherit
import typings.reactSimpleMaps.reactSimpleMapsStrings.initial
import typings.reactSimpleMaps.reactSimpleMapsStrings.isolated
import typings.reactSimpleMaps.reactSimpleMapsStrings.linearRGB
import typings.reactSimpleMaps.reactSimpleMapsStrings.link
import typings.reactSimpleMaps.reactSimpleMapsStrings.list
import typings.reactSimpleMaps.reactSimpleMapsStrings.listbox
import typings.reactSimpleMaps.reactSimpleMapsStrings.location
import typings.reactSimpleMaps.reactSimpleMapsStrings.mathematical
import typings.reactSimpleMaps.reactSimpleMapsStrings.medial
import typings.reactSimpleMaps.reactSimpleMapsStrings.menu
import typings.reactSimpleMaps.reactSimpleMapsStrings.middle
import typings.reactSimpleMaps.reactSimpleMapsStrings.miter
import typings.reactSimpleMaps.reactSimpleMapsStrings.mixed
import typings.reactSimpleMaps.reactSimpleMapsStrings.move
import typings.reactSimpleMaps.reactSimpleMapsStrings.no
import typings.reactSimpleMaps.reactSimpleMapsStrings.none
import typings.reactSimpleMaps.reactSimpleMapsStrings.nonzero
import typings.reactSimpleMaps.reactSimpleMapsStrings.off
import typings.reactSimpleMaps.reactSimpleMapsStrings.other
import typings.reactSimpleMaps.reactSimpleMapsStrings.page
import typings.reactSimpleMaps.reactSimpleMapsStrings.polite
import typings.reactSimpleMaps.reactSimpleMapsStrings.popup
import typings.reactSimpleMaps.reactSimpleMapsStrings.removals
import typings.reactSimpleMaps.reactSimpleMapsStrings.replace
import typings.reactSimpleMaps.reactSimpleMapsStrings.round
import typings.reactSimpleMaps.reactSimpleMapsStrings.sRGB
import typings.reactSimpleMaps.reactSimpleMapsStrings.spelling
import typings.reactSimpleMaps.reactSimpleMapsStrings.square
import typings.reactSimpleMaps.reactSimpleMapsStrings.step
import typings.reactSimpleMaps.reactSimpleMapsStrings.sum
import typings.reactSimpleMaps.reactSimpleMapsStrings.terminal
import typings.reactSimpleMaps.reactSimpleMapsStrings.text
import typings.reactSimpleMaps.reactSimpleMapsStrings.time
import typings.reactSimpleMaps.reactSimpleMapsStrings.tree
import typings.reactSimpleMaps.reactSimpleMapsStrings.vertical
import typings.reactSimpleMaps.reactSimpleMapsStrings.yes
import typings.std.MouseEvent
import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react.react.SVGProps<std.SVGPathElement>, std.Exclude<keyof react.react.SVGProps<std.SVGPathElement>, 'style'>> */
@js.native
trait GeographyProps extends js.Object {
  var accentHeight: js.UndefOr[Double | String] = js.native
  var accumulate: js.UndefOr[none | sum] = js.native
  var additive: js.UndefOr[replace | sum] = js.native
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  var allowReorder: js.UndefOr[no | yes] = js.native
  var alphabetic: js.UndefOr[Double | String] = js.native
  var amplitude: js.UndefOr[Double | String] = js.native
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
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
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
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
  var `aria-owns`: js.UndefOr[String] = js.native
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
  var ascent: js.UndefOr[Double | String] = js.native
  var attributeName: js.UndefOr[String] = js.native
  var attributeType: js.UndefOr[String] = js.native
  var autoReverse: js.UndefOr[Booleanish] = js.native
  var azimuth: js.UndefOr[Double | String] = js.native
  var baseFrequency: js.UndefOr[Double | String] = js.native
  var baseProfile: js.UndefOr[Double | String] = js.native
  var baselineShift: js.UndefOr[Double | String] = js.native
  var bbox: js.UndefOr[Double | String] = js.native
  var begin: js.UndefOr[Double | String] = js.native
  var bias: js.UndefOr[Double | String] = js.native
  var by: js.UndefOr[Double | String] = js.native
  var calcMode: js.UndefOr[Double | String] = js.native
  var capHeight: js.UndefOr[Double | String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var clip: js.UndefOr[Double | String] = js.native
  var clipPath: js.UndefOr[String] = js.native
  var clipPathUnits: js.UndefOr[Double | String] = js.native
  var clipRule: js.UndefOr[Double | String] = js.native
  var color: js.UndefOr[String] = js.native
  var colorInterpolation: js.UndefOr[Double | String] = js.native
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  var colorProfile: js.UndefOr[Double | String] = js.native
  var colorRendering: js.UndefOr[Double | String] = js.native
  var contentScriptType: js.UndefOr[Double | String] = js.native
  var contentStyleType: js.UndefOr[Double | String] = js.native
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  var cursor: js.UndefOr[Double | String] = js.native
  var cx: js.UndefOr[Double | String] = js.native
  var cy: js.UndefOr[Double | String] = js.native
  var d: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[AnonHtml] = js.native
  var decelerate: js.UndefOr[Double | String] = js.native
  var descent: js.UndefOr[Double | String] = js.native
  var diffuseConstant: js.UndefOr[Double | String] = js.native
  var direction: js.UndefOr[Double | String] = js.native
  var display: js.UndefOr[Double | String] = js.native
  var divisor: js.UndefOr[Double | String] = js.native
  var dominantBaseline: js.UndefOr[Double | String] = js.native
  var dur: js.UndefOr[Double | String] = js.native
  var dx: js.UndefOr[Double | String] = js.native
  var dy: js.UndefOr[Double | String] = js.native
  var edgeMode: js.UndefOr[Double | String] = js.native
  var elevation: js.UndefOr[Double | String] = js.native
  var enableBackground: js.UndefOr[Double | String] = js.native
  var end: js.UndefOr[Double | String] = js.native
  var exponent: js.UndefOr[Double | String] = js.native
  var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
  var fill: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double | String] = js.native
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterRes: js.UndefOr[Double | String] = js.native
  var filterUnits: js.UndefOr[Double | String] = js.native
  var floodColor: js.UndefOr[Double | String] = js.native
  var floodOpacity: js.UndefOr[Double | String] = js.native
  var focusable: js.UndefOr[Booleanish | auto] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  var fontStretch: js.UndefOr[Double | String] = js.native
  var fontStyle: js.UndefOr[Double | String] = js.native
  var fontVariant: js.UndefOr[Double | String] = js.native
  var fontWeight: js.UndefOr[Double | String] = js.native
  var format: js.UndefOr[Double | String] = js.native
  var from: js.UndefOr[Double | String] = js.native
  var fx: js.UndefOr[Double | String] = js.native
  var fy: js.UndefOr[Double | String] = js.native
  var g1: js.UndefOr[Double | String] = js.native
  var g2: js.UndefOr[Double | String] = js.native
  var geography: js.UndefOr[js.Any] = js.native
  var glyphName: js.UndefOr[Double | String] = js.native
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
  var glyphRef: js.UndefOr[Double | String] = js.native
  var gradientTransform: js.UndefOr[String] = js.native
  var gradientUnits: js.UndefOr[String] = js.native
  var hanging: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var horizAdvX: js.UndefOr[Double | String] = js.native
  var horizOriginX: js.UndefOr[Double | String] = js.native
  var href: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ideographic: js.UndefOr[Double | String] = js.native
  var imageRendering: js.UndefOr[Double | String] = js.native
  var in: js.UndefOr[String] = js.native
  var in2: js.UndefOr[Double | String] = js.native
  var intercept: js.UndefOr[Double | String] = js.native
  var k: js.UndefOr[Double | String] = js.native
  var k1: js.UndefOr[Double | String] = js.native
  var k2: js.UndefOr[Double | String] = js.native
  var k3: js.UndefOr[Double | String] = js.native
  var k4: js.UndefOr[Double | String] = js.native
  var kernelMatrix: js.UndefOr[Double | String] = js.native
  var kernelUnitLength: js.UndefOr[Double | String] = js.native
  var kerning: js.UndefOr[Double | String] = js.native
  var key: js.UndefOr[Key] = js.native
  var keyPoints: js.UndefOr[Double | String] = js.native
  var keySplines: js.UndefOr[Double | String] = js.native
  var keyTimes: js.UndefOr[Double | String] = js.native
  var lang: js.UndefOr[String] = js.native
  var lengthAdjust: js.UndefOr[Double | String] = js.native
  var letterSpacing: js.UndefOr[Double | String] = js.native
  var lightingColor: js.UndefOr[Double | String] = js.native
  var limitingConeAngle: js.UndefOr[Double | String] = js.native
  var local: js.UndefOr[Double | String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerHeight: js.UndefOr[Double | String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var markerUnits: js.UndefOr[Double | String] = js.native
  var markerWidth: js.UndefOr[Double | String] = js.native
  var mask: js.UndefOr[String] = js.native
  var maskContentUnits: js.UndefOr[Double | String] = js.native
  var maskUnits: js.UndefOr[Double | String] = js.native
  var mathematical: js.UndefOr[Double | String] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var media: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var mode: js.UndefOr[Double | String] = js.native
  var name: js.UndefOr[String] = js.native
  var numOctaves: js.UndefOr[Double | String] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGPathElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGPathElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGPathElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[SVGPathElement]] = js.native
  var onBlur: js.UndefOr[
    FocusEventHandler[SVGPathElement] | (js.Function1[/* event */ FocusEvent[SVGPathElement], Unit])
  ] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[SVGPathElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGPathElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGPathElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGPathElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[SVGPathElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[SVGPathElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[SVGPathElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onFocus: js.UndefOr[
    FocusEventHandler[SVGPathElement] | (js.Function1[/* event */ FocusEvent[SVGPathElement], Unit])
  ] = js.native
  var onInput: js.UndefOr[FormEventHandler[SVGPathElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[SVGPathElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGPathElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGPathElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGPathElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onMouseDown: js.UndefOr[
    (js.Function1[/* event */ typings.react.mod.MouseEvent[SVGPathElement, MouseEvent], Unit]) | MouseEventHandler[SVGPathElement]
  ] = js.native
  var onMouseEnter: js.UndefOr[
    (js.Function1[/* event */ typings.react.mod.MouseEvent[SVGPathElement, MouseEvent], Unit]) | MouseEventHandler[SVGPathElement]
  ] = js.native
  var onMouseLeave: js.UndefOr[
    (js.Function1[/* event */ typings.react.mod.MouseEvent[SVGPathElement, MouseEvent], Unit]) | MouseEventHandler[SVGPathElement]
  ] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[SVGPathElement]] = js.native
  var onMouseUp: js.UndefOr[
    (js.Function1[/* event */ typings.react.mod.MouseEvent[SVGPathElement, MouseEvent], Unit]) | MouseEventHandler[SVGPathElement]
  ] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[SVGPathElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[SVGPathElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[SVGPathElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[SVGPathElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[SVGPathElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[SVGPathElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[SVGPathElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[SVGPathElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[SVGPathElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGPathElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[SVGPathElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[SVGPathElement]] = js.native
  var opacity: js.UndefOr[Double | String] = js.native
  var operator: js.UndefOr[Double | String] = js.native
  var order: js.UndefOr[Double | String] = js.native
  var orient: js.UndefOr[Double | String] = js.native
  var orientation: js.UndefOr[Double | String] = js.native
  var origin: js.UndefOr[Double | String] = js.native
  var overflow: js.UndefOr[Double | String] = js.native
  var overlinePosition: js.UndefOr[Double | String] = js.native
  var overlineThickness: js.UndefOr[Double | String] = js.native
  var paintOrder: js.UndefOr[Double | String] = js.native
  var panose1: js.UndefOr[Double | String] = js.native
  var path: js.UndefOr[String] = js.native
  var pathLength: js.UndefOr[Double | String] = js.native
  var patternContentUnits: js.UndefOr[String] = js.native
  var patternTransform: js.UndefOr[Double | String] = js.native
  var patternUnits: js.UndefOr[String] = js.native
  var pointerEvents: js.UndefOr[Double | String] = js.native
  var points: js.UndefOr[String] = js.native
  var pointsAtX: js.UndefOr[Double | String] = js.native
  var pointsAtY: js.UndefOr[Double | String] = js.native
  var pointsAtZ: js.UndefOr[Double | String] = js.native
  var preserveAlpha: js.UndefOr[Booleanish] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var primitiveUnits: js.UndefOr[Double | String] = js.native
  var r: js.UndefOr[Double | String] = js.native
  var radius: js.UndefOr[Double | String] = js.native
  var ref: js.UndefOr[LegacyRef[SVGPathElement]] = js.native
  var refX: js.UndefOr[Double | String] = js.native
  var refY: js.UndefOr[Double | String] = js.native
  var renderingIntent: js.UndefOr[Double | String] = js.native
  var repeatCount: js.UndefOr[Double | String] = js.native
  var repeatDur: js.UndefOr[Double | String] = js.native
  var requiredExtensions: js.UndefOr[Double | String] = js.native
  var requiredFeatures: js.UndefOr[Double | String] = js.native
  var restart: js.UndefOr[Double | String] = js.native
  var result: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var rotate: js.UndefOr[Double | String] = js.native
  var rx: js.UndefOr[Double | String] = js.native
  var ry: js.UndefOr[Double | String] = js.native
  var scale: js.UndefOr[Double | String] = js.native
  var seed: js.UndefOr[Double | String] = js.native
  var shapeRendering: js.UndefOr[Double | String] = js.native
  var slope: js.UndefOr[Double | String] = js.native
  var spacing: js.UndefOr[Double | String] = js.native
  var specularConstant: js.UndefOr[Double | String] = js.native
  var specularExponent: js.UndefOr[Double | String] = js.native
  var speed: js.UndefOr[Double | String] = js.native
  var spreadMethod: js.UndefOr[String] = js.native
  var startOffset: js.UndefOr[Double | String] = js.native
  var stdDeviation: js.UndefOr[Double | String] = js.native
  var stemh: js.UndefOr[Double | String] = js.native
  var stemv: js.UndefOr[Double | String] = js.native
  var stitchTiles: js.UndefOr[Double | String] = js.native
  var stopColor: js.UndefOr[String] = js.native
  var stopOpacity: js.UndefOr[Double | String] = js.native
  var strikethroughPosition: js.UndefOr[Double | String] = js.native
  var strikethroughThickness: js.UndefOr[Double | String] = js.native
  var string: js.UndefOr[Double | String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[String | Double] = js.native
  var strokeDashoffset: js.UndefOr[String | Double] = js.native
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  var strokeWidth: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[AnonDefault] = js.native
  var surfaceScale: js.UndefOr[Double | String] = js.native
  var systemLanguage: js.UndefOr[Double | String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tableValues: js.UndefOr[Double | String] = js.native
  var target: js.UndefOr[String] = js.native
  var targetX: js.UndefOr[Double | String] = js.native
  var targetY: js.UndefOr[Double | String] = js.native
  var textAnchor: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[Double | String] = js.native
  var textLength: js.UndefOr[Double | String] = js.native
  var textRendering: js.UndefOr[Double | String] = js.native
  var to: js.UndefOr[Double | String] = js.native
  var transform: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var u1: js.UndefOr[Double | String] = js.native
  var u2: js.UndefOr[Double | String] = js.native
  var underlinePosition: js.UndefOr[Double | String] = js.native
  var underlineThickness: js.UndefOr[Double | String] = js.native
  var unicode: js.UndefOr[Double | String] = js.native
  var unicodeBidi: js.UndefOr[Double | String] = js.native
  var unicodeRange: js.UndefOr[Double | String] = js.native
  var unitsPerEm: js.UndefOr[Double | String] = js.native
  var vAlphabetic: js.UndefOr[Double | String] = js.native
  var vHanging: js.UndefOr[Double | String] = js.native
  var vIdeographic: js.UndefOr[Double | String] = js.native
  var vMathematical: js.UndefOr[Double | String] = js.native
  var values: js.UndefOr[String] = js.native
  var vectorEffect: js.UndefOr[Double | String] = js.native
  var version: js.UndefOr[String] = js.native
  var vertAdvY: js.UndefOr[Double | String] = js.native
  var vertOriginX: js.UndefOr[Double | String] = js.native
  var vertOriginY: js.UndefOr[Double | String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var viewTarget: js.UndefOr[Double | String] = js.native
  var visibility: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var widths: js.UndefOr[Double | String] = js.native
  var wordSpacing: js.UndefOr[Double | String] = js.native
  var writingMode: js.UndefOr[Double | String] = js.native
  var x: js.UndefOr[Double | String] = js.native
  var x1: js.UndefOr[Double | String] = js.native
  var x2: js.UndefOr[Double | String] = js.native
  var xChannelSelector: js.UndefOr[String] = js.native
  var xHeight: js.UndefOr[Double | String] = js.native
  var xlinkActuate: js.UndefOr[String] = js.native
  var xlinkArcrole: js.UndefOr[String] = js.native
  var xlinkHref: js.UndefOr[String] = js.native
  var xlinkRole: js.UndefOr[String] = js.native
  var xlinkShow: js.UndefOr[String] = js.native
  var xlinkTitle: js.UndefOr[String] = js.native
  var xlinkType: js.UndefOr[String] = js.native
  var xmlBase: js.UndefOr[String] = js.native
  var xmlLang: js.UndefOr[String] = js.native
  var xmlSpace: js.UndefOr[String] = js.native
  var xmlns: js.UndefOr[String] = js.native
  var xmlnsXlink: js.UndefOr[String] = js.native
  var y: js.UndefOr[Double | String] = js.native
  var y1: js.UndefOr[Double | String] = js.native
  var y2: js.UndefOr[Double | String] = js.native
  var yChannelSelector: js.UndefOr[String] = js.native
  var z: js.UndefOr[Double | String] = js.native
  var zoomAndPan: js.UndefOr[String] = js.native
}


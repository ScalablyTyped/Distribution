package typings.rax.mod

import typings.rax.anon.Html
import typings.rax.raxStrings.`after-edge`
import typings.rax.raxStrings.`before-edge`
import typings.rax.raxStrings.`text-after-edge`
import typings.rax.raxStrings.`text-before-edge`
import typings.rax.raxStrings.alphabetic
import typings.rax.raxStrings.auto
import typings.rax.raxStrings.baseline
import typings.rax.raxStrings.bevel
import typings.rax.raxStrings.butt
import typings.rax.raxStrings.central
import typings.rax.raxStrings.evenodd
import typings.rax.raxStrings.hanging
import typings.rax.raxStrings.ideographic
import typings.rax.raxStrings.inherit
import typings.rax.raxStrings.initial
import typings.rax.raxStrings.isolated
import typings.rax.raxStrings.linearRGB
import typings.rax.raxStrings.mathematical
import typings.rax.raxStrings.medial
import typings.rax.raxStrings.middle
import typings.rax.raxStrings.miter
import typings.rax.raxStrings.no
import typings.rax.raxStrings.none
import typings.rax.raxStrings.nonzero
import typings.rax.raxStrings.replace
import typings.rax.raxStrings.round
import typings.rax.raxStrings.sRGB
import typings.rax.raxStrings.square
import typings.rax.raxStrings.sum
import typings.rax.raxStrings.terminal
import typings.rax.raxStrings.yes
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// this list is "complete" in that it contains every SVG attribute
// that Rax supports, but the types can be improved.
// Full list here: https://facebook.github.io/rax/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined 
- typings.rax.mod.DOMAttributes because Inheritance from two classes. Inlined children, dangerouslySetInnerHTML, onCopy, onCopyCapture, onCut, onCutCapture, onPaste, onPasteCapture, onCompositionEnd, onCompositionEndCapture, onCompositionStart, onCompositionStartCapture, onCompositionUpdate, onCompositionUpdateCapture, onFocus, onFocusCapture, onBlur, onBlurCapture, onChange, onChangeCapture, onBeforeInput, onBeforeInputCapture, onInput, onInputCapture, onReset, onResetCapture, onSubmit, onSubmitCapture, onInvalid, onInvalidCapture, onLoad, onLoadCapture, onError, onErrorCapture, onKeyDown, onKeyDownCapture, onKeyPress, onKeyPressCapture, onKeyUp, onKeyUpCapture, onAbort, onAbortCapture, onCanPlay, onCanPlayCapture, onCanPlayThrough, onCanPlayThroughCapture, onDurationChange, onDurationChangeCapture, onEmptied, onEmptiedCapture, onEncrypted, onEncryptedCapture, onEnded, onEndedCapture, onLoadedData, onLoadedDataCapture, onLoadedMetadata, onLoadedMetadataCapture, onLoadStart, onLoadStartCapture, onPause, onPauseCapture, onPlay, onPlayCapture, onPlaying, onPlayingCapture, onProgress, onProgressCapture, onRateChange, onRateChangeCapture, onSeeked, onSeekedCapture, onSeeking, onSeekingCapture, onStalled, onStalledCapture, onSuspend, onSuspendCapture, onTimeUpdate, onTimeUpdateCapture, onVolumeChange, onVolumeChangeCapture, onWaiting, onWaitingCapture, onAuxClick, onAuxClickCapture, onClick, onClickCapture, onContextMenu, onContextMenuCapture, onDoubleClick, onDoubleClickCapture, onDrag, onDragCapture, onDragEnd, onDragEndCapture, onDragEnter, onDragEnterCapture, onDragExit, onDragExitCapture, onDragLeave, onDragLeaveCapture, onDragOver, onDragOverCapture, onDragStart, onDragStartCapture, onDrop, onDropCapture, onMouseDown, onMouseDownCapture, onMouseEnter, onMouseLeave, onMouseMove, onMouseMoveCapture, onMouseOut, onMouseOutCapture, onMouseOver, onMouseOverCapture, onMouseUp, onMouseUpCapture, onSelect, onSelectCapture, onTouchCancel, onTouchCancelCapture, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchMoveCapture, onTouchStart, onTouchStartCapture, onPointerDown, onPointerDownCapture, onPointerMove, onPointerMoveCapture, onPointerUp, onPointerUpCapture, onPointerCancel, onPointerCancelCapture, onPointerEnter, onPointerEnterCapture, onPointerLeave, onPointerLeaveCapture, onPointerOver, onPointerOverCapture, onPointerOut, onPointerOutCapture, onGotPointerCapture, onGotPointerCaptureCapture, onLostPointerCapture, onLostPointerCaptureCapture, onScroll, onScrollCapture, onWheel, onWheelCapture, onAnimationStart, onAnimationStartCapture, onAnimationEnd, onAnimationEndCapture, onAnimationIteration, onAnimationIterationCapture, onTransitionEnd, onTransitionEndCapture, onLongpress, onAppear, onDisappear */ trait SVGAttributes[T]
  extends StObject
     with AriaAttributes {
  
  // SVG Specific attributes
  var accentHeight: js.UndefOr[Double | String] = js.undefined
  
  var accumulate: js.UndefOr[none | sum] = js.undefined
  
  var additive: js.UndefOr[replace | sum] = js.undefined
  
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.undefined
  
  var allowReorder: js.UndefOr[no | yes] = js.undefined
  
  var alphabetic: js.UndefOr[Double | String] = js.undefined
  
  var amplitude: js.UndefOr[Double | String] = js.undefined
  
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.undefined
  
  var ascent: js.UndefOr[Double | String] = js.undefined
  
  var attributeName: js.UndefOr[String] = js.undefined
  
  var attributeType: js.UndefOr[String] = js.undefined
  
  var autoReverse: js.UndefOr[Double | String] = js.undefined
  
  var azimuth: js.UndefOr[Double | String] = js.undefined
  
  var baseFrequency: js.UndefOr[Double | String] = js.undefined
  
  var baseProfile: js.UndefOr[Double | String] = js.undefined
  
  var baselineShift: js.UndefOr[Double | String] = js.undefined
  
  var bbox: js.UndefOr[Double | String] = js.undefined
  
  var begin: js.UndefOr[Double | String] = js.undefined
  
  var bias: js.UndefOr[Double | String] = js.undefined
  
  var by: js.UndefOr[Double | String] = js.undefined
  
  var calcMode: js.UndefOr[Double | String] = js.undefined
  
  var capHeight: js.UndefOr[Double | String] = js.undefined
  
  var children: js.UndefOr[RaxNode] = js.undefined
  
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: js.UndefOr[String] = js.undefined
  
  var clip: js.UndefOr[Double | String] = js.undefined
  
  var clipPath: js.UndefOr[String] = js.undefined
  
  var clipPathUnits: js.UndefOr[Double | String] = js.undefined
  
  var clipRule: js.UndefOr[Double | String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var colorInterpolation: js.UndefOr[Double | String] = js.undefined
  
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.undefined
  
  var colorProfile: js.UndefOr[Double | String] = js.undefined
  
  var colorRendering: js.UndefOr[Double | String] = js.undefined
  
  var contentScriptType: js.UndefOr[Double | String] = js.undefined
  
  var contentStyleType: js.UndefOr[Double | String] = js.undefined
  
  var cursor: js.UndefOr[Double | String] = js.undefined
  
  var cx: js.UndefOr[Double | String] = js.undefined
  
  var cy: js.UndefOr[Double | String] = js.undefined
  
  var d: js.UndefOr[String] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  var decelerate: js.UndefOr[Double | String] = js.undefined
  
  var descent: js.UndefOr[Double | String] = js.undefined
  
  var diffuseConstant: js.UndefOr[Double | String] = js.undefined
  
  var direction: js.UndefOr[Double | String] = js.undefined
  
  var display: js.UndefOr[Double | String] = js.undefined
  
  var divisor: js.UndefOr[Double | String] = js.undefined
  
  var dominantBaseline: js.UndefOr[Double | String] = js.undefined
  
  var dur: js.UndefOr[Double | String] = js.undefined
  
  var dx: js.UndefOr[Double | String] = js.undefined
  
  var dy: js.UndefOr[Double | String] = js.undefined
  
  var edgeMode: js.UndefOr[Double | String] = js.undefined
  
  var elevation: js.UndefOr[Double | String] = js.undefined
  
  var enableBackground: js.UndefOr[Double | String] = js.undefined
  
  var end: js.UndefOr[Double | String] = js.undefined
  
  var exponent: js.UndefOr[Double | String] = js.undefined
  
  var externalResourcesRequired: js.UndefOr[Double | String] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double | String] = js.undefined
  
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var filterRes: js.UndefOr[Double | String] = js.undefined
  
  var filterUnits: js.UndefOr[Double | String] = js.undefined
  
  var floodColor: js.UndefOr[Double | String] = js.undefined
  
  var floodOpacity: js.UndefOr[Double | String] = js.undefined
  
  var focusable: js.UndefOr[Double | String] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  var fontSizeAdjust: js.UndefOr[Double | String] = js.undefined
  
  var fontStretch: js.UndefOr[Double | String] = js.undefined
  
  var fontStyle: js.UndefOr[Double | String] = js.undefined
  
  var fontVariant: js.UndefOr[Double | String] = js.undefined
  
  var fontWeight: js.UndefOr[Double | String] = js.undefined
  
  var format: js.UndefOr[Double | String] = js.undefined
  
  var from: js.UndefOr[Double | String] = js.undefined
  
  var fx: js.UndefOr[Double | String] = js.undefined
  
  var fy: js.UndefOr[Double | String] = js.undefined
  
  var g1: js.UndefOr[Double | String] = js.undefined
  
  var g2: js.UndefOr[Double | String] = js.undefined
  
  var glyphName: js.UndefOr[Double | String] = js.undefined
  
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.undefined
  
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.undefined
  
  var glyphRef: js.UndefOr[Double | String] = js.undefined
  
  var gradientTransform: js.UndefOr[String] = js.undefined
  
  var gradientUnits: js.UndefOr[String] = js.undefined
  
  var hanging: js.UndefOr[Double | String] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var horizAdvX: js.UndefOr[Double | String] = js.undefined
  
  var horizOriginX: js.UndefOr[Double | String] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ideographic: js.UndefOr[Double | String] = js.undefined
  
  var imageRendering: js.UndefOr[Double | String] = js.undefined
  
  var in: js.UndefOr[String] = js.undefined
  
  var in2: js.UndefOr[Double | String] = js.undefined
  
  var intercept: js.UndefOr[Double | String] = js.undefined
  
  var k: js.UndefOr[Double | String] = js.undefined
  
  var k1: js.UndefOr[Double | String] = js.undefined
  
  var k2: js.UndefOr[Double | String] = js.undefined
  
  var k3: js.UndefOr[Double | String] = js.undefined
  
  var k4: js.UndefOr[Double | String] = js.undefined
  
  var kernelMatrix: js.UndefOr[Double | String] = js.undefined
  
  var kernelUnitLength: js.UndefOr[Double | String] = js.undefined
  
  var kerning: js.UndefOr[Double | String] = js.undefined
  
  var keyPoints: js.UndefOr[Double | String] = js.undefined
  
  var keySplines: js.UndefOr[Double | String] = js.undefined
  
  var keyTimes: js.UndefOr[Double | String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var lengthAdjust: js.UndefOr[Double | String] = js.undefined
  
  var letterSpacing: js.UndefOr[Double | String] = js.undefined
  
  var lightingColor: js.UndefOr[Double | String] = js.undefined
  
  var limitingConeAngle: js.UndefOr[Double | String] = js.undefined
  
  var local: js.UndefOr[Double | String] = js.undefined
  
  var markerEnd: js.UndefOr[String] = js.undefined
  
  var markerHeight: js.UndefOr[Double | String] = js.undefined
  
  var markerMid: js.UndefOr[String] = js.undefined
  
  var markerStart: js.UndefOr[String] = js.undefined
  
  var markerUnits: js.UndefOr[Double | String] = js.undefined
  
  var markerWidth: js.UndefOr[Double | String] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var maskContentUnits: js.UndefOr[Double | String] = js.undefined
  
  var maskUnits: js.UndefOr[Double | String] = js.undefined
  
  var mathematical: js.UndefOr[Double | String] = js.undefined
  
  var max: js.UndefOr[Double | String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[Double | String] = js.undefined
  
  var mode: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var numOctaves: js.UndefOr[Double | String] = js.undefined
  
  var offset: js.UndefOr[Double | String] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onAbortCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAppear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onCanPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onDisappear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  
  var onDurationChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEmptied: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEncrypted: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEnded: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEndedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onError: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // also a Media Event
  var onErrorCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onInvalidCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  
  // Image Events
  var onLoad: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadStart: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedData: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Weex Common Events
  var onLongpress: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  
  var onPause: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPauseCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlaying: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlayingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  
  var onProgress: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onProgressCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onRateChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onSeeked: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeekedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeeking: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeekingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Selection Events
  var onSelect: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSelectCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onStalled: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onStalledCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSuspend: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSuspendCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  
  var onVolumeChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onWaiting: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onWaitingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
  
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
  
  var opacity: js.UndefOr[Double | String] = js.undefined
  
  var operator: js.UndefOr[Double | String] = js.undefined
  
  var order: js.UndefOr[Double | String] = js.undefined
  
  var orient: js.UndefOr[Double | String] = js.undefined
  
  var orientation: js.UndefOr[Double | String] = js.undefined
  
  var origin: js.UndefOr[Double | String] = js.undefined
  
  var overflow: js.UndefOr[Double | String] = js.undefined
  
  var overlinePosition: js.UndefOr[Double | String] = js.undefined
  
  var overlineThickness: js.UndefOr[Double | String] = js.undefined
  
  var paintOrder: js.UndefOr[Double | String] = js.undefined
  
  var panose1: js.UndefOr[Double | String] = js.undefined
  
  var pathLength: js.UndefOr[Double | String] = js.undefined
  
  var patternContentUnits: js.UndefOr[String] = js.undefined
  
  var patternTransform: js.UndefOr[Double | String] = js.undefined
  
  var patternUnits: js.UndefOr[String] = js.undefined
  
  var pointerEvents: js.UndefOr[Double | String] = js.undefined
  
  var points: js.UndefOr[String] = js.undefined
  
  var pointsAtX: js.UndefOr[Double | String] = js.undefined
  
  var pointsAtY: js.UndefOr[Double | String] = js.undefined
  
  var pointsAtZ: js.UndefOr[Double | String] = js.undefined
  
  var preserveAlpha: js.UndefOr[Double | String] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  
  var primitiveUnits: js.UndefOr[Double | String] = js.undefined
  
  var r: js.UndefOr[Double | String] = js.undefined
  
  var radius: js.UndefOr[Double | String] = js.undefined
  
  var refX: js.UndefOr[Double | String] = js.undefined
  
  var refY: js.UndefOr[Double | String] = js.undefined
  
  var renderingIntent: js.UndefOr[Double | String] = js.undefined
  
  var repeatCount: js.UndefOr[Double | String] = js.undefined
  
  var repeatDur: js.UndefOr[Double | String] = js.undefined
  
  var requiredExtensions: js.UndefOr[Double | String] = js.undefined
  
  var requiredFeatures: js.UndefOr[Double | String] = js.undefined
  
  var restart: js.UndefOr[Double | String] = js.undefined
  
  var result: js.UndefOr[String] = js.undefined
  
  // Other HTML properties supported by SVG elements in browsers
  var role: js.UndefOr[String] = js.undefined
  
  var rotate: js.UndefOr[Double | String] = js.undefined
  
  var rx: js.UndefOr[Double | String] = js.undefined
  
  var ry: js.UndefOr[Double | String] = js.undefined
  
  var scale: js.UndefOr[Double | String] = js.undefined
  
  var seed: js.UndefOr[Double | String] = js.undefined
  
  var shapeRendering: js.UndefOr[Double | String] = js.undefined
  
  var slope: js.UndefOr[Double | String] = js.undefined
  
  var spacing: js.UndefOr[Double | String] = js.undefined
  
  var specularConstant: js.UndefOr[Double | String] = js.undefined
  
  var specularExponent: js.UndefOr[Double | String] = js.undefined
  
  var speed: js.UndefOr[Double | String] = js.undefined
  
  var spreadMethod: js.UndefOr[String] = js.undefined
  
  var startOffset: js.UndefOr[Double | String] = js.undefined
  
  var stdDeviation: js.UndefOr[Double | String] = js.undefined
  
  var stemh: js.UndefOr[Double | String] = js.undefined
  
  var stemv: js.UndefOr[Double | String] = js.undefined
  
  var stitchTiles: js.UndefOr[Double | String] = js.undefined
  
  var stopColor: js.UndefOr[String] = js.undefined
  
  var stopOpacity: js.UndefOr[Double | String] = js.undefined
  
  var strikethroughPosition: js.UndefOr[Double | String] = js.undefined
  
  var strikethroughThickness: js.UndefOr[Double | String] = js.undefined
  
  var string: js.UndefOr[Double | String] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var strokeDasharray: js.UndefOr[String | Double] = js.undefined
  
  var strokeDashoffset: js.UndefOr[String | Double] = js.undefined
  
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.undefined
  
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.undefined
  
  var strokeMiterlimit: js.UndefOr[Double | String] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double | String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var surfaceScale: js.UndefOr[Double | String] = js.undefined
  
  var systemLanguage: js.UndefOr[Double | String] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var tableValues: js.UndefOr[Double | String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var targetX: js.UndefOr[Double | String] = js.undefined
  
  var targetY: js.UndefOr[Double | String] = js.undefined
  
  var textAnchor: js.UndefOr[String] = js.undefined
  
  var textDecoration: js.UndefOr[Double | String] = js.undefined
  
  var textLength: js.UndefOr[Double | String] = js.undefined
  
  var textRendering: js.UndefOr[Double | String] = js.undefined
  
  var to: js.UndefOr[Double | String] = js.undefined
  
  var transform: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var u1: js.UndefOr[Double | String] = js.undefined
  
  var u2: js.UndefOr[Double | String] = js.undefined
  
  var underlinePosition: js.UndefOr[Double | String] = js.undefined
  
  var underlineThickness: js.UndefOr[Double | String] = js.undefined
  
  var unicode: js.UndefOr[Double | String] = js.undefined
  
  var unicodeBidi: js.UndefOr[Double | String] = js.undefined
  
  var unicodeRange: js.UndefOr[Double | String] = js.undefined
  
  var unitsPerEm: js.UndefOr[Double | String] = js.undefined
  
  var vAlphabetic: js.UndefOr[Double | String] = js.undefined
  
  var vHanging: js.UndefOr[Double | String] = js.undefined
  
  var vIdeographic: js.UndefOr[Double | String] = js.undefined
  
  var vMathematical: js.UndefOr[Double | String] = js.undefined
  
  var values: js.UndefOr[String] = js.undefined
  
  var vectorEffect: js.UndefOr[Double | String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var vertAdvY: js.UndefOr[Double | String] = js.undefined
  
  var vertOriginX: js.UndefOr[Double | String] = js.undefined
  
  var vertOriginY: js.UndefOr[Double | String] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
  
  var viewTarget: js.UndefOr[Double | String] = js.undefined
  
  var visibility: js.UndefOr[Double | String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var widths: js.UndefOr[Double | String] = js.undefined
  
  var wordSpacing: js.UndefOr[Double | String] = js.undefined
  
  var writingMode: js.UndefOr[Double | String] = js.undefined
  
  var x: js.UndefOr[Double | String] = js.undefined
  
  var x1: js.UndefOr[Double | String] = js.undefined
  
  var x2: js.UndefOr[Double | String] = js.undefined
  
  var xChannelSelector: js.UndefOr[String] = js.undefined
  
  var xHeight: js.UndefOr[Double | String] = js.undefined
  
  var xlinkActuate: js.UndefOr[String] = js.undefined
  
  var xlinkArcrole: js.UndefOr[String] = js.undefined
  
  var xlinkHref: js.UndefOr[String] = js.undefined
  
  var xlinkRole: js.UndefOr[String] = js.undefined
  
  var xlinkShow: js.UndefOr[String] = js.undefined
  
  var xlinkTitle: js.UndefOr[String] = js.undefined
  
  var xlinkType: js.UndefOr[String] = js.undefined
  
  var xmlBase: js.UndefOr[String] = js.undefined
  
  var xmlLang: js.UndefOr[String] = js.undefined
  
  var xmlSpace: js.UndefOr[String] = js.undefined
  
  var xmlns: js.UndefOr[String] = js.undefined
  
  var xmlnsXlink: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[Double | String] = js.undefined
  
  var y1: js.UndefOr[Double | String] = js.undefined
  
  var y2: js.UndefOr[Double | String] = js.undefined
  
  var yChannelSelector: js.UndefOr[String] = js.undefined
  
  var z: js.UndefOr[Double | String] = js.undefined
  
  var zoomAndPan: js.UndefOr[String] = js.undefined
}
object SVGAttributes {
  
  @scala.inline
  def apply[T](): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  
  @scala.inline
  implicit class SVGAttributesMutableBuilder[Self <: SVGAttributes[?], T] (val x: Self & SVGAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
    
    @scala.inline
    def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
    
    @scala.inline
    def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    @scala.inline
    def setAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
    
    @scala.inline
    def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
    
    @scala.inline
    def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
    
    @scala.inline
    def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
    
    @scala.inline
    def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
    
    @scala.inline
    def setAutoReverse(value: Double | String): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
    
    @scala.inline
    def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    @scala.inline
    def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
    
    @scala.inline
    def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
    
    @scala.inline
    def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
    
    @scala.inline
    def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
    
    @scala.inline
    def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    @scala.inline
    def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
    
    @scala.inline
    def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
    
    @scala.inline
    def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
    
    @scala.inline
    def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
    
    @scala.inline
    def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
    
    @scala.inline
    def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
    
    @scala.inline
    def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
    
    @scala.inline
    def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    @scala.inline
    def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
    
    @scala.inline
    def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
    
    @scala.inline
    def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    @scala.inline
    def setExternalResourcesRequired(value: Double | String): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
    
    @scala.inline
    def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    @scala.inline
    def setFocusable(value: Double | String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
    
    @scala.inline
    def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
    
    @scala.inline
    def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
    
    @scala.inline
    def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
    
    @scala.inline
    def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
    
    @scala.inline
    def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    @scala.inline
    def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
    
    @scala.inline
    def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
    
    @scala.inline
    def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    @scala.inline
    def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    @scala.inline
    def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
    
    @scala.inline
    def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
    
    @scala.inline
    def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
    
    @scala.inline
    def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
    
    @scala.inline
    def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
    
    @scala.inline
    def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    @scala.inline
    def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
    
    @scala.inline
    def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
    
    @scala.inline
    def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    @scala.inline
    def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
    
    @scala.inline
    def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
    
    @scala.inline
    def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    @scala.inline
    def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
    
    @scala.inline
    def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
    
    @scala.inline
    def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationEndCapture(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationIterationCapture(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationStartCapture(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAppear(value: AppearEvent[T] => Unit): Self = StObject.set(x, "onAppear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuxClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    @scala.inline
    def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeInputCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurCapture(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnChange(value: FormEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionEndCapture(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionStartCapture(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionUpdateCapture(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCopyCapture(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCutCapture(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDisappear(value: AppearEvent[T] => Unit): Self = StObject.set(x, "onDisappear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDisappearUndefined: Self = StObject.set(x, "onDisappear", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnterCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragExitCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragOverCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEncryptedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusCapture(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnGotPointerCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGotPointerCaptureCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    @scala.inline
    def setOnInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInvalidCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    @scala.inline
    def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownCapture(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressCapture(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpCapture(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLongpress(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLongpress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLongpressUndefined: Self = StObject.set(x, "onLongpress", js.undefined)
    
    @scala.inline
    def setOnLostPointerCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLostPointerCaptureCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteCapture(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerCancelCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerDownCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerEnterCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerLeaveCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerMoveCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOutCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOverCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerUpCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: FormEvent[T] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResetCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    @scala.inline
    def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[T] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollCapture(value: UIEvent[T] => Unit): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: TransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndCapture(value: TransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    @scala.inline
    def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelCapture(value: WheelEvent[T] => Unit): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
    
    @scala.inline
    def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
    
    @scala.inline
    def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
    
    @scala.inline
    def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
    
    @scala.inline
    def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
    
    @scala.inline
    def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
    
    @scala.inline
    def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
    
    @scala.inline
    def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
    
    @scala.inline
    def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPreserveAlpha(value: Double | String): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
    
    @scala.inline
    def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
    
    @scala.inline
    def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
    
    @scala.inline
    def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
    
    @scala.inline
    def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
    
    @scala.inline
    def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    @scala.inline
    def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    @scala.inline
    def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
    
    @scala.inline
    def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
    
    @scala.inline
    def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
    
    @scala.inline
    def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
    
    @scala.inline
    def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
    
    @scala.inline
    def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
    
    @scala.inline
    def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    @scala.inline
    def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
    
    @scala.inline
    def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
    
    @scala.inline
    def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
    
    @scala.inline
    def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
    
    @scala.inline
    def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
    
    @scala.inline
    def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    @scala.inline
    def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
    
    @scala.inline
    def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
    
    @scala.inline
    def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
    
    @scala.inline
    def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
    
    @scala.inline
    def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
    
    @scala.inline
    def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
    
    @scala.inline
    def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
    
    @scala.inline
    def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
    
    @scala.inline
    def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
    
    @scala.inline
    def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
    
    @scala.inline
    def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
    
    @scala.inline
    def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    @scala.inline
    def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
    
    @scala.inline
    def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
    
    @scala.inline
    def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
    
    @scala.inline
    def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
    
    @scala.inline
    def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
    
    @scala.inline
    def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
    
    @scala.inline
    def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
    
    @scala.inline
    def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
    
    @scala.inline
    def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
    
    @scala.inline
    def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
    
    @scala.inline
    def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
    
    @scala.inline
    def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
    
    @scala.inline
    def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    
    @scala.inline
    def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    @scala.inline
    def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
  }
}

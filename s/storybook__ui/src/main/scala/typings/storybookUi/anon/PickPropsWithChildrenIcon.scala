package typings.storybookUi.anon

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.SVGSVGElement
import typings.storybookComponents.iconsMod.IconKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.PropsWithChildren<@storybook/components.@storybook/components.IconsProps>, 'string' | 'key' | 'className' | 'id' | 'lang' | 'style' | 'tabIndex' | 'role' | 'color' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'clipPath' | 'cursor' | 'direction' | 'display' | 'filter' | 'fontFamily' | 'fontSize' | 'fontSizeAdjust' | 'fontStretch' | 'fontStyle' | 'fontVariant' | 'fontWeight' | 'height' | 'imageRendering' | 'letterSpacing' | 'opacity' | 'order' | 'paintOrder' | 'pointerEvents' | 'rotate' | 'scale' | 'textRendering' | 'transform' | 'unicodeBidi' | 'visibility' | 'width' | 'wordSpacing' | 'writingMode' | 'mask' | 'offset' | 'overflow' | 'textDecoration' | 'clip' | 'alignmentBaseline' | 'baselineShift' | 'clipRule' | 'colorInterpolation' | 'colorRendering' | 'dominantBaseline' | 'fill' | 'fillOpacity' | 'fillRule' | 'floodColor' | 'floodOpacity' | 'glyphOrientationVertical' | 'lightingColor' | 'markerEnd' | 'markerMid' | 'markerStart' | 'shapeRendering' | 'stopColor' | 'stopOpacity' | 'stroke' | 'strokeDasharray' | 'strokeDashoffset' | 'strokeLinecap' | 'strokeLinejoin' | 'strokeMiterlimit' | 'strokeOpacity' | 'strokeWidth' | 'textAnchor' | 'vectorEffect' | 'inline' | 'end' | 'path' | 'theme' | 'local' | 'name' | 'type' | 'href' | 'media' | 'target' | 'x' | 'y' | 'crossOrigin' | 'origin' | 'icon' | 'max' | 'method' | 'min' | 'accentHeight' | 'accumulate' | 'additive' | 'allowReorder' | 'alphabetic' | 'amplitude' | 'arabicForm' | 'ascent' | 'attributeName' | 'attributeType' | 'autoReverse' | 'azimuth' | 'baseFrequency' | 'baseProfile' | 'bbox' | 'begin' | 'bias' | 'by' | 'calcMode' | 'capHeight' | 'clipPathUnits' | 'colorInterpolationFilters' | 'colorProfile' | 'contentScriptType' | 'contentStyleType' | 'cx' | 'cy' | 'd' | 'decelerate' | 'descent' | 'diffuseConstant' | 'divisor' | 'dur' | 'dx' | 'dy' | 'edgeMode' | 'elevation' | 'enableBackground' | 'exponent' | 'externalResourcesRequired' | 'filterRes' | 'filterUnits' | 'focusable' | 'format' | 'from' | 'fx' | 'fy' | 'g1' | 'g2' | 'glyphName' | 'glyphOrientationHorizontal' | 'glyphRef' | 'gradientTransform' | 'gradientUnits' | 'hanging' | 'horizAdvX' | 'horizOriginX' | 'ideographic' | 'in2' | 'in' | 'intercept' | 'k1' | 'k2' | 'k3' | 'k4' | 'k' | 'kernelMatrix' | 'kernelUnitLength' | 'kerning' | 'keyPoints' | 'keySplines' | 'keyTimes' | 'lengthAdjust' | 'limitingConeAngle' | 'markerHeight' | 'markerUnits' | 'markerWidth' | 'maskContentUnits' | 'maskUnits' | 'mathematical' | 'mode' | 'numOctaves' | 'operator' | 'orient' | 'orientation' | 'overlinePosition' | 'overlineThickness' | 'panose1' | 'pathLength' | 'patternContentUnits' | 'patternTransform' | 'patternUnits' | 'points' | 'pointsAtX' | 'pointsAtY' | 'pointsAtZ' | 'preserveAlpha' | 'preserveAspectRatio' | 'primitiveUnits' | 'r' | 'radius' | 'refX' | 'refY' | 'renderingIntent' | 'repeatCount' | 'repeatDur' | 'requiredExtensions' | 'requiredFeatures' | 'restart' | 'result' | 'rx' | 'ry' | 'seed' | 'slope' | 'spacing' | 'specularConstant' | 'specularExponent' | 'speed' | 'spreadMethod' | 'startOffset' | 'stdDeviation' | 'stemh' | 'stemv' | 'stitchTiles' | 'strikethroughPosition' | 'strikethroughThickness' | 'surfaceScale' | 'systemLanguage' | 'tableValues' | 'targetX' | 'targetY' | 'textLength' | 'to' | 'u1' | 'u2' | 'underlinePosition' | 'underlineThickness' | 'unicode' | 'unicodeRange' | 'unitsPerEm' | 'vAlphabetic' | 'values' | 'version' | 'vertAdvY' | 'vertOriginX' | 'vertOriginY' | 'vHanging' | 'vIdeographic' | 'viewBox' | 'viewTarget' | 'vMathematical' | 'widths' | 'x1' | 'x2' | 'xChannelSelector' | 'xHeight' | 'xlinkActuate' | 'xlinkArcrole' | 'xlinkHref' | 'xlinkRole' | 'xlinkShow' | 'xlinkTitle' | 'xlinkType' | 'xmlBase' | 'xmlLang' | 'xmlns' | 'xmlnsXlink' | 'xmlSpace' | 'y1' | 'y2' | 'yChannelSelector' | 'z' | 'zoomAndPan'> & {  ref :(instance : std.SVGSVGElement): void | react.react.RefObject<std.SVGSVGElement> | undefined} */
@js.native
trait PickPropsWithChildrenIcon extends js.Object {
  
  var accentHeight: js.UndefOr[js.Any] = js.native
  
  var accumulate: js.UndefOr[js.Any] = js.native
  
  var additive: js.UndefOr[js.Any] = js.native
  
  var alignmentBaseline: js.UndefOr[js.Any] = js.native
  
  var allowReorder: js.UndefOr[js.Any] = js.native
  
  var alphabetic: js.UndefOr[js.Any] = js.native
  
  var amplitude: js.UndefOr[js.Any] = js.native
  
  var arabicForm: js.UndefOr[js.Any] = js.native
  
  var `aria-activedescendant`: js.UndefOr[js.Any] = js.native
  
  var `aria-atomic`: js.UndefOr[js.Any] = js.native
  
  var `aria-autocomplete`: js.UndefOr[js.Any] = js.native
  
  var `aria-busy`: js.UndefOr[js.Any] = js.native
  
  var `aria-checked`: js.UndefOr[js.Any] = js.native
  
  var `aria-colcount`: js.UndefOr[js.Any] = js.native
  
  var `aria-colindex`: js.UndefOr[js.Any] = js.native
  
  var `aria-colspan`: js.UndefOr[js.Any] = js.native
  
  var `aria-controls`: js.UndefOr[js.Any] = js.native
  
  var `aria-current`: js.UndefOr[js.Any] = js.native
  
  var `aria-describedby`: js.UndefOr[js.Any] = js.native
  
  var `aria-details`: js.UndefOr[js.Any] = js.native
  
  var `aria-disabled`: js.UndefOr[js.Any] = js.native
  
  var `aria-dropeffect`: js.UndefOr[js.Any] = js.native
  
  var `aria-errormessage`: js.UndefOr[js.Any] = js.native
  
  var `aria-expanded`: js.UndefOr[js.Any] = js.native
  
  var `aria-flowto`: js.UndefOr[js.Any] = js.native
  
  var `aria-grabbed`: js.UndefOr[js.Any] = js.native
  
  var `aria-haspopup`: js.UndefOr[js.Any] = js.native
  
  var `aria-hidden`: js.UndefOr[js.Any] = js.native
  
  var `aria-invalid`: js.UndefOr[js.Any] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[js.Any] = js.native
  
  var `aria-label`: js.UndefOr[js.Any] = js.native
  
  var `aria-labelledby`: js.UndefOr[js.Any] = js.native
  
  var `aria-level`: js.UndefOr[js.Any] = js.native
  
  var `aria-live`: js.UndefOr[js.Any] = js.native
  
  var `aria-modal`: js.UndefOr[js.Any] = js.native
  
  var `aria-multiline`: js.UndefOr[js.Any] = js.native
  
  var `aria-multiselectable`: js.UndefOr[js.Any] = js.native
  
  var `aria-orientation`: js.UndefOr[js.Any] = js.native
  
  var `aria-owns`: js.UndefOr[js.Any] = js.native
  
  var `aria-placeholder`: js.UndefOr[js.Any] = js.native
  
  var `aria-posinset`: js.UndefOr[js.Any] = js.native
  
  var `aria-pressed`: js.UndefOr[js.Any] = js.native
  
  var `aria-readonly`: js.UndefOr[js.Any] = js.native
  
  var `aria-relevant`: js.UndefOr[js.Any] = js.native
  
  var `aria-required`: js.UndefOr[js.Any] = js.native
  
  var `aria-roledescription`: js.UndefOr[js.Any] = js.native
  
  var `aria-rowcount`: js.UndefOr[js.Any] = js.native
  
  var `aria-rowindex`: js.UndefOr[js.Any] = js.native
  
  var `aria-rowspan`: js.UndefOr[js.Any] = js.native
  
  var `aria-selected`: js.UndefOr[js.Any] = js.native
  
  var `aria-setsize`: js.UndefOr[js.Any] = js.native
  
  var `aria-sort`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuemax`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuemin`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuenow`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuetext`: js.UndefOr[js.Any] = js.native
  
  var ascent: js.UndefOr[js.Any] = js.native
  
  var attributeName: js.UndefOr[js.Any] = js.native
  
  var attributeType: js.UndefOr[js.Any] = js.native
  
  var autoReverse: js.UndefOr[js.Any] = js.native
  
  var azimuth: js.UndefOr[js.Any] = js.native
  
  var baseFrequency: js.UndefOr[js.Any] = js.native
  
  var baseProfile: js.UndefOr[js.Any] = js.native
  
  var baselineShift: js.UndefOr[js.Any] = js.native
  
  var bbox: js.UndefOr[js.Any] = js.native
  
  var begin: js.UndefOr[js.Any] = js.native
  
  var bias: js.UndefOr[js.Any] = js.native
  
  var by: js.UndefOr[js.Any] = js.native
  
  var calcMode: js.UndefOr[js.Any] = js.native
  
  var capHeight: js.UndefOr[js.Any] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[js.Any] = js.native
  
  var clip: js.UndefOr[js.Any] = js.native
  
  var clipPath: js.UndefOr[js.Any] = js.native
  
  var clipPathUnits: js.UndefOr[js.Any] = js.native
  
  var clipRule: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[js.Any] = js.native
  
  var colorInterpolation: js.UndefOr[js.Any] = js.native
  
  var colorInterpolationFilters: js.UndefOr[js.Any] = js.native
  
  var colorProfile: js.UndefOr[js.Any] = js.native
  
  var colorRendering: js.UndefOr[js.Any] = js.native
  
  var contentScriptType: js.UndefOr[js.Any] = js.native
  
  var contentStyleType: js.UndefOr[js.Any] = js.native
  
  var crossOrigin: js.UndefOr[js.Any] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var cursor: js.UndefOr[js.Any] = js.native
  
  var cx: js.UndefOr[js.Any] = js.native
  
  var cy: js.UndefOr[js.Any] = js.native
  
  var d: js.UndefOr[js.Any] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[js.Any] = js.native
  
  var decelerate: js.UndefOr[js.Any] = js.native
  
  var descent: js.UndefOr[js.Any] = js.native
  
  var diffuseConstant: js.UndefOr[js.Any] = js.native
  
  var direction: js.UndefOr[js.Any] = js.native
  
  var display: js.UndefOr[js.Any] = js.native
  
  var divisor: js.UndefOr[js.Any] = js.native
  
  var dominantBaseline: js.UndefOr[js.Any] = js.native
  
  var dur: js.UndefOr[js.Any] = js.native
  
  var dx: js.UndefOr[js.Any] = js.native
  
  var dy: js.UndefOr[js.Any] = js.native
  
  var edgeMode: js.UndefOr[js.Any] = js.native
  
  var elevation: js.UndefOr[js.Any] = js.native
  
  var enableBackground: js.UndefOr[js.Any] = js.native
  
  var end: js.UndefOr[js.Any] = js.native
  
  var exponent: js.UndefOr[js.Any] = js.native
  
  var externalResourcesRequired: js.UndefOr[js.Any] = js.native
  
  var fill: js.UndefOr[js.Any] = js.native
  
  var fillOpacity: js.UndefOr[js.Any] = js.native
  
  var fillRule: js.UndefOr[js.Any] = js.native
  
  var filter: js.UndefOr[js.Any] = js.native
  
  var filterRes: js.UndefOr[js.Any] = js.native
  
  var filterUnits: js.UndefOr[js.Any] = js.native
  
  var floodColor: js.UndefOr[js.Any] = js.native
  
  var floodOpacity: js.UndefOr[js.Any] = js.native
  
  var focusable: js.UndefOr[js.Any] = js.native
  
  var fontFamily: js.UndefOr[js.Any] = js.native
  
  var fontSize: js.UndefOr[js.Any] = js.native
  
  var fontSizeAdjust: js.UndefOr[js.Any] = js.native
  
  var fontStretch: js.UndefOr[js.Any] = js.native
  
  var fontStyle: js.UndefOr[js.Any] = js.native
  
  var fontVariant: js.UndefOr[js.Any] = js.native
  
  var fontWeight: js.UndefOr[js.Any] = js.native
  
  var format: js.UndefOr[js.Any] = js.native
  
  var from: js.UndefOr[js.Any] = js.native
  
  var fx: js.UndefOr[js.Any] = js.native
  
  var fy: js.UndefOr[js.Any] = js.native
  
  var g1: js.UndefOr[js.Any] = js.native
  
  var g2: js.UndefOr[js.Any] = js.native
  
  var glyphName: js.UndefOr[js.Any] = js.native
  
  var glyphOrientationHorizontal: js.UndefOr[js.Any] = js.native
  
  var glyphOrientationVertical: js.UndefOr[js.Any] = js.native
  
  var glyphRef: js.UndefOr[js.Any] = js.native
  
  var gradientTransform: js.UndefOr[js.Any] = js.native
  
  var gradientUnits: js.UndefOr[js.Any] = js.native
  
  var hanging: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[js.Any] = js.native
  
  var horizAdvX: js.UndefOr[js.Any] = js.native
  
  var horizOriginX: js.UndefOr[js.Any] = js.native
  
  var href: js.UndefOr[js.Any] = js.native
  
  var icon: IconKey = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var ideographic: js.UndefOr[js.Any] = js.native
  
  var imageRendering: js.UndefOr[js.Any] = js.native
  
  var in: js.UndefOr[js.Any] = js.native
  
  var in2: js.UndefOr[js.Any] = js.native
  
  var `inline`: js.UndefOr[js.Any] = js.native
  
  var intercept: js.UndefOr[js.Any] = js.native
  
  var k: js.UndefOr[js.Any] = js.native
  
  var k1: js.UndefOr[js.Any] = js.native
  
  var k2: js.UndefOr[js.Any] = js.native
  
  var k3: js.UndefOr[js.Any] = js.native
  
  var k4: js.UndefOr[js.Any] = js.native
  
  var kernelMatrix: js.UndefOr[js.Any] = js.native
  
  var kernelUnitLength: js.UndefOr[js.Any] = js.native
  
  var kerning: js.UndefOr[js.Any] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
  
  var keyPoints: js.UndefOr[js.Any] = js.native
  
  var keySplines: js.UndefOr[js.Any] = js.native
  
  var keyTimes: js.UndefOr[js.Any] = js.native
  
  var lang: js.UndefOr[js.Any] = js.native
  
  var lengthAdjust: js.UndefOr[js.Any] = js.native
  
  var letterSpacing: js.UndefOr[js.Any] = js.native
  
  var lightingColor: js.UndefOr[js.Any] = js.native
  
  var limitingConeAngle: js.UndefOr[js.Any] = js.native
  
  var local: js.UndefOr[js.Any] = js.native
  
  var markerEnd: js.UndefOr[js.Any] = js.native
  
  var markerHeight: js.UndefOr[js.Any] = js.native
  
  var markerMid: js.UndefOr[js.Any] = js.native
  
  var markerStart: js.UndefOr[js.Any] = js.native
  
  var markerUnits: js.UndefOr[js.Any] = js.native
  
  var markerWidth: js.UndefOr[js.Any] = js.native
  
  var mask: js.UndefOr[js.Any] = js.native
  
  var maskContentUnits: js.UndefOr[js.Any] = js.native
  
  var maskUnits: js.UndefOr[js.Any] = js.native
  
  var mathematical: js.UndefOr[js.Any] = js.native
  
  var max: js.UndefOr[js.Any] = js.native
  
  var media: js.UndefOr[js.Any] = js.native
  
  var method: js.UndefOr[js.Any] = js.native
  
  var min: js.UndefOr[js.Any] = js.native
  
  var mode: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[js.Any] = js.native
  
  var numOctaves: js.UndefOr[js.Any] = js.native
  
  var offset: js.UndefOr[js.Any] = js.native
  
  var onAbort: js.UndefOr[js.Any] = js.native
  
  var onAbortCapture: js.UndefOr[js.Any] = js.native
  
  var onAnimationEnd: js.UndefOr[js.Any] = js.native
  
  var onAnimationEndCapture: js.UndefOr[js.Any] = js.native
  
  var onAnimationIteration: js.UndefOr[js.Any] = js.native
  
  var onAnimationIterationCapture: js.UndefOr[js.Any] = js.native
  
  var onAnimationStart: js.UndefOr[js.Any] = js.native
  
  var onAnimationStartCapture: js.UndefOr[js.Any] = js.native
  
  var onAuxClick: js.UndefOr[js.Any] = js.native
  
  var onAuxClickCapture: js.UndefOr[js.Any] = js.native
  
  var onBeforeInput: js.UndefOr[js.Any] = js.native
  
  var onBeforeInputCapture: js.UndefOr[js.Any] = js.native
  
  var onBlur: js.UndefOr[js.Any] = js.native
  
  var onBlurCapture: js.UndefOr[js.Any] = js.native
  
  var onCanPlay: js.UndefOr[js.Any] = js.native
  
  var onCanPlayCapture: js.UndefOr[js.Any] = js.native
  
  var onCanPlayThrough: js.UndefOr[js.Any] = js.native
  
  var onCanPlayThroughCapture: js.UndefOr[js.Any] = js.native
  
  var onChange: js.UndefOr[js.Any] = js.native
  
  var onChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onClick: js.UndefOr[js.Any] = js.native
  
  var onClickCapture: js.UndefOr[js.Any] = js.native
  
  var onCompositionEnd: js.UndefOr[js.Any] = js.native
  
  var onCompositionEndCapture: js.UndefOr[js.Any] = js.native
  
  var onCompositionStart: js.UndefOr[js.Any] = js.native
  
  var onCompositionStartCapture: js.UndefOr[js.Any] = js.native
  
  var onCompositionUpdate: js.UndefOr[js.Any] = js.native
  
  var onCompositionUpdateCapture: js.UndefOr[js.Any] = js.native
  
  var onContextMenu: js.UndefOr[js.Any] = js.native
  
  var onContextMenuCapture: js.UndefOr[js.Any] = js.native
  
  var onCopy: js.UndefOr[js.Any] = js.native
  
  var onCopyCapture: js.UndefOr[js.Any] = js.native
  
  var onCut: js.UndefOr[js.Any] = js.native
  
  var onCutCapture: js.UndefOr[js.Any] = js.native
  
  var onDoubleClick: js.UndefOr[js.Any] = js.native
  
  var onDoubleClickCapture: js.UndefOr[js.Any] = js.native
  
  var onDrag: js.UndefOr[js.Any] = js.native
  
  var onDragCapture: js.UndefOr[js.Any] = js.native
  
  var onDragEnd: js.UndefOr[js.Any] = js.native
  
  var onDragEndCapture: js.UndefOr[js.Any] = js.native
  
  var onDragEnter: js.UndefOr[js.Any] = js.native
  
  var onDragEnterCapture: js.UndefOr[js.Any] = js.native
  
  var onDragExit: js.UndefOr[js.Any] = js.native
  
  var onDragExitCapture: js.UndefOr[js.Any] = js.native
  
  var onDragLeave: js.UndefOr[js.Any] = js.native
  
  var onDragLeaveCapture: js.UndefOr[js.Any] = js.native
  
  var onDragOver: js.UndefOr[js.Any] = js.native
  
  var onDragOverCapture: js.UndefOr[js.Any] = js.native
  
  var onDragStart: js.UndefOr[js.Any] = js.native
  
  var onDragStartCapture: js.UndefOr[js.Any] = js.native
  
  var onDrop: js.UndefOr[js.Any] = js.native
  
  var onDropCapture: js.UndefOr[js.Any] = js.native
  
  var onDurationChange: js.UndefOr[js.Any] = js.native
  
  var onDurationChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onEmptied: js.UndefOr[js.Any] = js.native
  
  var onEmptiedCapture: js.UndefOr[js.Any] = js.native
  
  var onEncrypted: js.UndefOr[js.Any] = js.native
  
  var onEncryptedCapture: js.UndefOr[js.Any] = js.native
  
  var onEnded: js.UndefOr[js.Any] = js.native
  
  var onEndedCapture: js.UndefOr[js.Any] = js.native
  
  var onError: js.UndefOr[js.Any] = js.native
  
  var onErrorCapture: js.UndefOr[js.Any] = js.native
  
  var onFocus: js.UndefOr[js.Any] = js.native
  
  var onFocusCapture: js.UndefOr[js.Any] = js.native
  
  var onGotPointerCapture: js.UndefOr[js.Any] = js.native
  
  var onGotPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  
  var onInput: js.UndefOr[js.Any] = js.native
  
  var onInputCapture: js.UndefOr[js.Any] = js.native
  
  var onInvalid: js.UndefOr[js.Any] = js.native
  
  var onInvalidCapture: js.UndefOr[js.Any] = js.native
  
  var onKeyDown: js.UndefOr[js.Any] = js.native
  
  var onKeyDownCapture: js.UndefOr[js.Any] = js.native
  
  var onKeyPress: js.UndefOr[js.Any] = js.native
  
  var onKeyPressCapture: js.UndefOr[js.Any] = js.native
  
  var onKeyUp: js.UndefOr[js.Any] = js.native
  
  var onKeyUpCapture: js.UndefOr[js.Any] = js.native
  
  var onLoad: js.UndefOr[js.Any] = js.native
  
  var onLoadCapture: js.UndefOr[js.Any] = js.native
  
  var onLoadStart: js.UndefOr[js.Any] = js.native
  
  var onLoadStartCapture: js.UndefOr[js.Any] = js.native
  
  var onLoadedData: js.UndefOr[js.Any] = js.native
  
  var onLoadedDataCapture: js.UndefOr[js.Any] = js.native
  
  var onLoadedMetadata: js.UndefOr[js.Any] = js.native
  
  var onLoadedMetadataCapture: js.UndefOr[js.Any] = js.native
  
  var onLostPointerCapture: js.UndefOr[js.Any] = js.native
  
  var onLostPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseDown: js.UndefOr[js.Any] = js.native
  
  var onMouseDownCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseEnter: js.UndefOr[js.Any] = js.native
  
  var onMouseLeave: js.UndefOr[js.Any] = js.native
  
  var onMouseMove: js.UndefOr[js.Any] = js.native
  
  var onMouseMoveCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseOut: js.UndefOr[js.Any] = js.native
  
  var onMouseOutCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseOver: js.UndefOr[js.Any] = js.native
  
  var onMouseOverCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseUp: js.UndefOr[js.Any] = js.native
  
  var onMouseUpCapture: js.UndefOr[js.Any] = js.native
  
  var onPaste: js.UndefOr[js.Any] = js.native
  
  var onPasteCapture: js.UndefOr[js.Any] = js.native
  
  var onPause: js.UndefOr[js.Any] = js.native
  
  var onPauseCapture: js.UndefOr[js.Any] = js.native
  
  var onPlay: js.UndefOr[js.Any] = js.native
  
  var onPlayCapture: js.UndefOr[js.Any] = js.native
  
  var onPlaying: js.UndefOr[js.Any] = js.native
  
  var onPlayingCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerCancel: js.UndefOr[js.Any] = js.native
  
  var onPointerCancelCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerDown: js.UndefOr[js.Any] = js.native
  
  var onPointerDownCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerEnter: js.UndefOr[js.Any] = js.native
  
  var onPointerEnterCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerLeave: js.UndefOr[js.Any] = js.native
  
  var onPointerLeaveCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerMove: js.UndefOr[js.Any] = js.native
  
  var onPointerMoveCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerOut: js.UndefOr[js.Any] = js.native
  
  var onPointerOutCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerOver: js.UndefOr[js.Any] = js.native
  
  var onPointerOverCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerUp: js.UndefOr[js.Any] = js.native
  
  var onPointerUpCapture: js.UndefOr[js.Any] = js.native
  
  var onProgress: js.UndefOr[js.Any] = js.native
  
  var onProgressCapture: js.UndefOr[js.Any] = js.native
  
  var onRateChange: js.UndefOr[js.Any] = js.native
  
  var onRateChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onReset: js.UndefOr[js.Any] = js.native
  
  var onResetCapture: js.UndefOr[js.Any] = js.native
  
  var onScroll: js.UndefOr[js.Any] = js.native
  
  var onScrollCapture: js.UndefOr[js.Any] = js.native
  
  var onSeeked: js.UndefOr[js.Any] = js.native
  
  var onSeekedCapture: js.UndefOr[js.Any] = js.native
  
  var onSeeking: js.UndefOr[js.Any] = js.native
  
  var onSeekingCapture: js.UndefOr[js.Any] = js.native
  
  var onSelect: js.UndefOr[js.Any] = js.native
  
  var onSelectCapture: js.UndefOr[js.Any] = js.native
  
  var onStalled: js.UndefOr[js.Any] = js.native
  
  var onStalledCapture: js.UndefOr[js.Any] = js.native
  
  var onSubmit: js.UndefOr[js.Any] = js.native
  
  var onSubmitCapture: js.UndefOr[js.Any] = js.native
  
  var onSuspend: js.UndefOr[js.Any] = js.native
  
  var onSuspendCapture: js.UndefOr[js.Any] = js.native
  
  var onTimeUpdate: js.UndefOr[js.Any] = js.native
  
  var onTimeUpdateCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchCancel: js.UndefOr[js.Any] = js.native
  
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchEnd: js.UndefOr[js.Any] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchMove: js.UndefOr[js.Any] = js.native
  
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchStart: js.UndefOr[js.Any] = js.native
  
  var onTouchStartCapture: js.UndefOr[js.Any] = js.native
  
  var onTransitionEnd: js.UndefOr[js.Any] = js.native
  
  var onTransitionEndCapture: js.UndefOr[js.Any] = js.native
  
  var onVolumeChange: js.UndefOr[js.Any] = js.native
  
  var onVolumeChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onWaiting: js.UndefOr[js.Any] = js.native
  
  var onWaitingCapture: js.UndefOr[js.Any] = js.native
  
  var onWheel: js.UndefOr[js.Any] = js.native
  
  var onWheelCapture: js.UndefOr[js.Any] = js.native
  
  var opacity: js.UndefOr[js.Any] = js.native
  
  var operator: js.UndefOr[js.Any] = js.native
  
  var order: js.UndefOr[js.Any] = js.native
  
  var orient: js.UndefOr[js.Any] = js.native
  
  var orientation: js.UndefOr[js.Any] = js.native
  
  var origin: js.UndefOr[js.Any] = js.native
  
  var overflow: js.UndefOr[js.Any] = js.native
  
  var overlinePosition: js.UndefOr[js.Any] = js.native
  
  var overlineThickness: js.UndefOr[js.Any] = js.native
  
  var paintOrder: js.UndefOr[js.Any] = js.native
  
  var panose1: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[js.Any] = js.native
  
  var pathLength: js.UndefOr[js.Any] = js.native
  
  var patternContentUnits: js.UndefOr[js.Any] = js.native
  
  var patternTransform: js.UndefOr[js.Any] = js.native
  
  var patternUnits: js.UndefOr[js.Any] = js.native
  
  var pointerEvents: js.UndefOr[js.Any] = js.native
  
  var points: js.UndefOr[js.Any] = js.native
  
  var pointsAtX: js.UndefOr[js.Any] = js.native
  
  var pointsAtY: js.UndefOr[js.Any] = js.native
  
  var pointsAtZ: js.UndefOr[js.Any] = js.native
  
  var preserveAlpha: js.UndefOr[js.Any] = js.native
  
  var preserveAspectRatio: js.UndefOr[js.Any] = js.native
  
  var primitiveUnits: js.UndefOr[js.Any] = js.native
  
  var r: js.UndefOr[js.Any] = js.native
  
  var radius: js.UndefOr[js.Any] = js.native
  
  var ref: js.UndefOr[(js.Function1[/* instance */ SVGSVGElement, Unit]) | RefObject[SVGSVGElement]] = js.native
  
  var refX: js.UndefOr[js.Any] = js.native
  
  var refY: js.UndefOr[js.Any] = js.native
  
  var renderingIntent: js.UndefOr[js.Any] = js.native
  
  var repeatCount: js.UndefOr[js.Any] = js.native
  
  var repeatDur: js.UndefOr[js.Any] = js.native
  
  var requiredExtensions: js.UndefOr[js.Any] = js.native
  
  var requiredFeatures: js.UndefOr[js.Any] = js.native
  
  var restart: js.UndefOr[js.Any] = js.native
  
  var result: js.UndefOr[js.Any] = js.native
  
  var role: js.UndefOr[js.Any] = js.native
  
  var rotate: js.UndefOr[js.Any] = js.native
  
  var rx: js.UndefOr[js.Any] = js.native
  
  var ry: js.UndefOr[js.Any] = js.native
  
  var scale: js.UndefOr[js.Any] = js.native
  
  var seed: js.UndefOr[js.Any] = js.native
  
  var shapeRendering: js.UndefOr[js.Any] = js.native
  
  var slope: js.UndefOr[js.Any] = js.native
  
  var spacing: js.UndefOr[js.Any] = js.native
  
  var specularConstant: js.UndefOr[js.Any] = js.native
  
  var specularExponent: js.UndefOr[js.Any] = js.native
  
  var speed: js.UndefOr[js.Any] = js.native
  
  var spreadMethod: js.UndefOr[js.Any] = js.native
  
  var startOffset: js.UndefOr[js.Any] = js.native
  
  var stdDeviation: js.UndefOr[js.Any] = js.native
  
  var stemh: js.UndefOr[js.Any] = js.native
  
  var stemv: js.UndefOr[js.Any] = js.native
  
  var stitchTiles: js.UndefOr[js.Any] = js.native
  
  var stopColor: js.UndefOr[js.Any] = js.native
  
  var stopOpacity: js.UndefOr[js.Any] = js.native
  
  var strikethroughPosition: js.UndefOr[js.Any] = js.native
  
  var strikethroughThickness: js.UndefOr[js.Any] = js.native
  
  var string: js.UndefOr[js.Any] = js.native
  
  var stroke: js.UndefOr[js.Any] = js.native
  
  var strokeDasharray: js.UndefOr[js.Any] = js.native
  
  var strokeDashoffset: js.UndefOr[js.Any] = js.native
  
  var strokeLinecap: js.UndefOr[js.Any] = js.native
  
  var strokeLinejoin: js.UndefOr[js.Any] = js.native
  
  var strokeMiterlimit: js.UndefOr[js.Any] = js.native
  
  var strokeOpacity: js.UndefOr[js.Any] = js.native
  
  var strokeWidth: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var surfaceScale: js.UndefOr[js.Any] = js.native
  
  var systemLanguage: js.UndefOr[js.Any] = js.native
  
  var tabIndex: js.UndefOr[js.Any] = js.native
  
  var tableValues: js.UndefOr[js.Any] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
  
  var targetX: js.UndefOr[js.Any] = js.native
  
  var targetY: js.UndefOr[js.Any] = js.native
  
  var textAnchor: js.UndefOr[js.Any] = js.native
  
  var textDecoration: js.UndefOr[js.Any] = js.native
  
  var textLength: js.UndefOr[js.Any] = js.native
  
  var textRendering: js.UndefOr[js.Any] = js.native
  
  var theme: js.UndefOr[js.Any] = js.native
  
  var to: js.UndefOr[js.Any] = js.native
  
  var transform: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[js.Any] = js.native
  
  var u1: js.UndefOr[js.Any] = js.native
  
  var u2: js.UndefOr[js.Any] = js.native
  
  var underlinePosition: js.UndefOr[js.Any] = js.native
  
  var underlineThickness: js.UndefOr[js.Any] = js.native
  
  var unicode: js.UndefOr[js.Any] = js.native
  
  var unicodeBidi: js.UndefOr[js.Any] = js.native
  
  var unicodeRange: js.UndefOr[js.Any] = js.native
  
  var unitsPerEm: js.UndefOr[js.Any] = js.native
  
  var vAlphabetic: js.UndefOr[js.Any] = js.native
  
  var vHanging: js.UndefOr[js.Any] = js.native
  
  var vIdeographic: js.UndefOr[js.Any] = js.native
  
  var vMathematical: js.UndefOr[js.Any] = js.native
  
  var values: js.UndefOr[js.Any] = js.native
  
  var vectorEffect: js.UndefOr[js.Any] = js.native
  
  var version: js.UndefOr[js.Any] = js.native
  
  var vertAdvY: js.UndefOr[js.Any] = js.native
  
  var vertOriginX: js.UndefOr[js.Any] = js.native
  
  var vertOriginY: js.UndefOr[js.Any] = js.native
  
  var viewBox: js.UndefOr[js.Any] = js.native
  
  var viewTarget: js.UndefOr[js.Any] = js.native
  
  var visibility: js.UndefOr[js.Any] = js.native
  
  var width: js.UndefOr[js.Any] = js.native
  
  var widths: js.UndefOr[js.Any] = js.native
  
  var wordSpacing: js.UndefOr[js.Any] = js.native
  
  var writingMode: js.UndefOr[js.Any] = js.native
  
  var x: js.UndefOr[js.Any] = js.native
  
  var x1: js.UndefOr[js.Any] = js.native
  
  var x2: js.UndefOr[js.Any] = js.native
  
  var xChannelSelector: js.UndefOr[js.Any] = js.native
  
  var xHeight: js.UndefOr[js.Any] = js.native
  
  var xlinkActuate: js.UndefOr[js.Any] = js.native
  
  var xlinkArcrole: js.UndefOr[js.Any] = js.native
  
  var xlinkHref: js.UndefOr[js.Any] = js.native
  
  var xlinkRole: js.UndefOr[js.Any] = js.native
  
  var xlinkShow: js.UndefOr[js.Any] = js.native
  
  var xlinkTitle: js.UndefOr[js.Any] = js.native
  
  var xlinkType: js.UndefOr[js.Any] = js.native
  
  var xmlBase: js.UndefOr[js.Any] = js.native
  
  var xmlLang: js.UndefOr[js.Any] = js.native
  
  var xmlSpace: js.UndefOr[js.Any] = js.native
  
  var xmlns: js.UndefOr[js.Any] = js.native
  
  var xmlnsXlink: js.UndefOr[js.Any] = js.native
  
  var y: js.UndefOr[js.Any] = js.native
  
  var y1: js.UndefOr[js.Any] = js.native
  
  var y2: js.UndefOr[js.Any] = js.native
  
  var yChannelSelector: js.UndefOr[js.Any] = js.native
  
  var z: js.UndefOr[js.Any] = js.native
  
  var zoomAndPan: js.UndefOr[js.Any] = js.native
}
object PickPropsWithChildrenIcon {
  
  @scala.inline
  def apply(icon: IconKey): PickPropsWithChildrenIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsWithChildrenIcon]
  }
  
  @scala.inline
  implicit class PickPropsWithChildrenIconOps[Self <: PickPropsWithChildrenIcon] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: IconKey): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentHeight(value: js.Any): Self = this.set("accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentHeight: Self = this.set("accentHeight", js.undefined)
    
    @scala.inline
    def setAccumulate(value: js.Any): Self = this.set("accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccumulate: Self = this.set("accumulate", js.undefined)
    
    @scala.inline
    def setAdditive(value: js.Any): Self = this.set("additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditive: Self = this.set("additive", js.undefined)
    
    @scala.inline
    def setAlignmentBaseline(value: js.Any): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAllowReorder(value: js.Any): Self = this.set("allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReorder: Self = this.set("allowReorder", js.undefined)
    
    @scala.inline
    def setAlphabetic(value: js.Any): Self = this.set("alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlphabetic: Self = this.set("alphabetic", js.undefined)
    
    @scala.inline
    def setAmplitude(value: js.Any): Self = this.set("amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmplitude: Self = this.set("amplitude", js.undefined)
    
    @scala.inline
    def setArabicForm(value: js.Any): Self = this.set("arabicForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArabicForm: Self = this.set("arabicForm", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: js.Any): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: js.Any): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: js.Any): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: js.Any): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: js.Any): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: js.Any): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: js.Any): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: js.Any): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: js.Any): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: js.Any): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: js.Any): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: js.Any): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: js.Any): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: js.Any): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: js.Any): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: js.Any): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: js.Any): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: js.Any): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: js.Any): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: js.Any): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: js.Any): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: js.Any): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: js.Any): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: js.Any): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: js.Any): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: js.Any): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: js.Any): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: js.Any): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: js.Any): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: js.Any): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: js.Any): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: js.Any): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: js.Any): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: js.Any): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: js.Any): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(value: js.Any): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: js.Any): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: js.Any): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: js.Any): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: js.Any): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: js.Any): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: js.Any): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: js.Any): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: js.Any): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: js.Any): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: js.Any): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: js.Any): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: js.Any): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAscent(value: js.Any): Self = this.set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscent: Self = this.set("ascent", js.undefined)
    
    @scala.inline
    def setAttributeName(value: js.Any): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: js.Any): Self = this.set("attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("attributeType", js.undefined)
    
    @scala.inline
    def setAutoReverse(value: js.Any): Self = this.set("autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReverse: Self = this.set("autoReverse", js.undefined)
    
    @scala.inline
    def setAzimuth(value: js.Any): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzimuth: Self = this.set("azimuth", js.undefined)
    
    @scala.inline
    def setBaseFrequency(value: js.Any): Self = this.set("baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFrequency: Self = this.set("baseFrequency", js.undefined)
    
    @scala.inline
    def setBaseProfile(value: js.Any): Self = this.set("baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseProfile: Self = this.set("baseProfile", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: js.Any): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setBbox(value: js.Any): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    
    @scala.inline
    def setBegin(value: js.Any): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setBias(value: js.Any): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setBy(value: js.Any): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    
    @scala.inline
    def setCalcMode(value: js.Any): Self = this.set("calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalcMode: Self = this.set("calcMode", js.undefined)
    
    @scala.inline
    def setCapHeight(value: js.Any): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapHeight: Self = this.set("capHeight", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClip(value: js.Any): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setClipPath(value: js.Any): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    
    @scala.inline
    def setClipPathUnits(value: js.Any): Self = this.set("clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPathUnits: Self = this.set("clipPathUnits", js.undefined)
    
    @scala.inline
    def setClipRule(value: js.Any): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: js.Any): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorInterpolationFilters(value: js.Any): Self = this.set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolationFilters: Self = this.set("colorInterpolationFilters", js.undefined)
    
    @scala.inline
    def setColorProfile(value: js.Any): Self = this.set("colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorProfile: Self = this.set("colorProfile", js.undefined)
    
    @scala.inline
    def setColorRendering(value: js.Any): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    
    @scala.inline
    def setContentScriptType(value: js.Any): Self = this.set("contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptType: Self = this.set("contentScriptType", js.undefined)
    
    @scala.inline
    def setContentStyleType(value: js.Any): Self = this.set("contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyleType: Self = this.set("contentStyleType", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: js.Any): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCursor(value: js.Any): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setCx(value: js.Any): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: js.Any): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setD(value: js.Any): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: js.Any): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDecelerate(value: js.Any): Self = this.set("decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecelerate: Self = this.set("decelerate", js.undefined)
    
    @scala.inline
    def setDescent(value: js.Any): Self = this.set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescent: Self = this.set("descent", js.undefined)
    
    @scala.inline
    def setDiffuseConstant(value: js.Any): Self = this.set("diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffuseConstant: Self = this.set("diffuseConstant", js.undefined)
    
    @scala.inline
    def setDirection(value: js.Any): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: js.Any): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDivisor(value: js.Any): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: js.Any): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    
    @scala.inline
    def setDur(value: js.Any): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDur: Self = this.set("dur", js.undefined)
    
    @scala.inline
    def setDx(value: js.Any): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDy(value: js.Any): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setEdgeMode(value: js.Any): Self = this.set("edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeMode: Self = this.set("edgeMode", js.undefined)
    
    @scala.inline
    def setElevation(value: js.Any): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setEnableBackground(value: js.Any): Self = this.set("enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBackground: Self = this.set("enableBackground", js.undefined)
    
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setExponent(value: js.Any): Self = this.set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    
    @scala.inline
    def setExternalResourcesRequired(value: js.Any): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalResourcesRequired: Self = this.set("externalResourcesRequired", js.undefined)
    
    @scala.inline
    def setFill(value: js.Any): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: js.Any): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: js.Any): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterRes(value: js.Any): Self = this.set("filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRes: Self = this.set("filterRes", js.undefined)
    
    @scala.inline
    def setFilterUnits(value: js.Any): Self = this.set("filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterUnits: Self = this.set("filterUnits", js.undefined)
    
    @scala.inline
    def setFloodColor(value: js.Any): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: js.Any): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    
    @scala.inline
    def setFocusable(value: js.Any): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setFontFamily(value: js.Any): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: js.Any): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeAdjust(value: js.Any): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontStretch(value: js.Any): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: js.Any): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: js.Any): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: js.Any): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Any): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrom(value: js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFx(value: js.Any): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setFy(value: js.Any): Self = this.set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    
    @scala.inline
    def setG1(value: js.Any): Self = this.set("g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG1: Self = this.set("g1", js.undefined)
    
    @scala.inline
    def setG2(value: js.Any): Self = this.set("g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteG2: Self = this.set("g2", js.undefined)
    
    @scala.inline
    def setGlyphName(value: js.Any): Self = this.set("glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphName: Self = this.set("glyphName", js.undefined)
    
    @scala.inline
    def setGlyphOrientationHorizontal(value: js.Any): Self = this.set("glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationHorizontal: Self = this.set("glyphOrientationHorizontal", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: js.Any): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setGlyphRef(value: js.Any): Self = this.set("glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphRef: Self = this.set("glyphRef", js.undefined)
    
    @scala.inline
    def setGradientTransform(value: js.Any): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: js.Any): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", js.undefined)
    
    @scala.inline
    def setHanging(value: js.Any): Self = this.set("hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHanging: Self = this.set("hanging", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizAdvX(value: js.Any): Self = this.set("horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizAdvX: Self = this.set("horizAdvX", js.undefined)
    
    @scala.inline
    def setHorizOriginX(value: js.Any): Self = this.set("horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizOriginX: Self = this.set("horizOriginX", js.undefined)
    
    @scala.inline
    def setHref(value: js.Any): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdeographic(value: js.Any): Self = this.set("ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdeographic: Self = this.set("ideographic", js.undefined)
    
    @scala.inline
    def setImageRendering(value: js.Any): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    
    @scala.inline
    def setIn(value: js.Any): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setIn2(value: js.Any): Self = this.set("in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn2: Self = this.set("in2", js.undefined)
    
    @scala.inline
    def setInline(value: js.Any): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setIntercept(value: js.Any): Self = this.set("intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    
    @scala.inline
    def setK(value: js.Any): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    
    @scala.inline
    def setK1(value: js.Any): Self = this.set("k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK1: Self = this.set("k1", js.undefined)
    
    @scala.inline
    def setK2(value: js.Any): Self = this.set("k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK2: Self = this.set("k2", js.undefined)
    
    @scala.inline
    def setK3(value: js.Any): Self = this.set("k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK3: Self = this.set("k3", js.undefined)
    
    @scala.inline
    def setK4(value: js.Any): Self = this.set("k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteK4: Self = this.set("k4", js.undefined)
    
    @scala.inline
    def setKernelMatrix(value: js.Any): Self = this.set("kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelMatrix: Self = this.set("kernelMatrix", js.undefined)
    
    @scala.inline
    def setKernelUnitLength(value: js.Any): Self = this.set("kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelUnitLength: Self = this.set("kernelUnitLength", js.undefined)
    
    @scala.inline
    def setKerning(value: js.Any): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyPoints(value: js.Any): Self = this.set("keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPoints: Self = this.set("keyPoints", js.undefined)
    
    @scala.inline
    def setKeySplines(value: js.Any): Self = this.set("keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySplines: Self = this.set("keySplines", js.undefined)
    
    @scala.inline
    def setKeyTimes(value: js.Any): Self = this.set("keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTimes: Self = this.set("keyTimes", js.undefined)
    
    @scala.inline
    def setLang(value: js.Any): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setLengthAdjust(value: js.Any): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: js.Any): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: js.Any): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    
    @scala.inline
    def setLimitingConeAngle(value: js.Any): Self = this.set("limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitingConeAngle: Self = this.set("limitingConeAngle", js.undefined)
    
    @scala.inline
    def setLocal(value: js.Any): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: js.Any): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: js.Any): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerHeight: Self = this.set("markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: js.Any): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: js.Any): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUnits(value: js.Any): Self = this.set("markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerUnits: Self = this.set("markerUnits", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: js.Any): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerWidth: Self = this.set("markerWidth", js.undefined)
    
    @scala.inline
    def setMask(value: js.Any): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskContentUnits(value: js.Any): Self = this.set("maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskContentUnits: Self = this.set("maskContentUnits", js.undefined)
    
    @scala.inline
    def setMaskUnits(value: js.Any): Self = this.set("maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskUnits: Self = this.set("maskUnits", js.undefined)
    
    @scala.inline
    def setMathematical(value: js.Any): Self = this.set("mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathematical: Self = this.set("mathematical", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMedia(value: js.Any): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMethod(value: js.Any): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumOctaves(value: js.Any): Self = this.set("numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumOctaves: Self = this.set("numOctaves", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnAbort(value: js.Any): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAbortCapture(value: js.Any): Self = this.set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: js.Any): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationEndCapture(value: js.Any): Self = this.set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEndCapture: Self = this.set("onAnimationEndCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: js.Any): Self = this.set("onAnimationIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationIterationCapture(value: js.Any): Self = this.set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationIterationCapture: Self = this.set("onAnimationIterationCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: js.Any): Self = this.set("onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAnimationStartCapture(value: js.Any): Self = this.set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationStartCapture: Self = this.set("onAnimationStartCapture", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: js.Any): Self = this.set("onAuxClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnAuxClickCapture(value: js.Any): Self = this.set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAuxClickCapture: Self = this.set("onAuxClickCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: js.Any): Self = this.set("onBeforeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBeforeInputCapture(value: js.Any): Self = this.set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeInputCapture: Self = this.set("onBeforeInputCapture", js.undefined)
    
    @scala.inline
    def setOnBlur(value: js.Any): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnBlurCapture(value: js.Any): Self = this.set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: js.Any): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayCapture(value: js.Any): Self = this.set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: js.Any): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: js.Any): Self = this.set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.Any): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeCapture(value: js.Any): Self = this.set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.Any): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClickCapture(value: js.Any): Self = this.set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: js.Any): Self = this.set("onCompositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionEndCapture(value: js.Any): Self = this.set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionEndCapture: Self = this.set("onCompositionEndCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: js.Any): Self = this.set("onCompositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionStartCapture(value: js.Any): Self = this.set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionStartCapture: Self = this.set("onCompositionStartCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: js.Any): Self = this.set("onCompositionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdateCapture(value: js.Any): Self = this.set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionUpdateCapture: Self = this.set("onCompositionUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: js.Any): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnContextMenuCapture(value: js.Any): Self = this.set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnCopy(value: js.Any): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCopyCapture(value: js.Any): Self = this.set("onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopyCapture: Self = this.set("onCopyCapture", js.undefined)
    
    @scala.inline
    def setOnCut(value: js.Any): Self = this.set("onCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnCutCapture(value: js.Any): Self = this.set("onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCutCapture: Self = this.set("onCutCapture", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: js.Any): Self = this.set("onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDoubleClickCapture(value: js.Any): Self = this.set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDoubleClickCapture: Self = this.set("onDoubleClickCapture", js.undefined)
    
    @scala.inline
    def setOnDrag(value: js.Any): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragCapture(value: js.Any): Self = this.set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: js.Any): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEndCapture(value: js.Any): Self = this.set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: js.Any): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragEnterCapture(value: js.Any): Self = this.set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: js.Any): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragExitCapture(value: js.Any): Self = this.set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragExitCapture: Self = this.set("onDragExitCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: js.Any): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragLeaveCapture(value: js.Any): Self = this.set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: js.Any): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragOverCapture(value: js.Any): Self = this.set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: js.Any): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStartCapture(value: js.Any): Self = this.set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDrop(value: js.Any): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDropCapture(value: js.Any): Self = this.set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: js.Any): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnDurationChangeCapture(value: js.Any): Self = this.set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: js.Any): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEmptiedCapture(value: js.Any): Self = this.set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: js.Any): Self = this.set("onEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEncryptedCapture(value: js.Any): Self = this.set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEncryptedCapture: Self = this.set("onEncryptedCapture", js.undefined)
    
    @scala.inline
    def setOnEnded(value: js.Any): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnEndedCapture(value: js.Any): Self = this.set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnError(value: js.Any): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnErrorCapture(value: js.Any): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnFocus(value: js.Any): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusCapture(value: js.Any): Self = this.set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCapture(value: js.Any): Self = this.set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnGotPointerCapture: Self = this.set("onGotPointerCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCaptureCapture(value: js.Any): Self = this.set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnGotPointerCaptureCapture: Self = this.set("onGotPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnInput(value: js.Any): Self = this.set("onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInputCapture(value: js.Any): Self = this.set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: js.Any): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnInvalidCapture(value: js.Any): Self = this.set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInvalidCapture: Self = this.set("onInvalidCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: js.Any): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownCapture(value: js.Any): Self = this.set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: js.Any): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyPressCapture(value: js.Any): Self = this.set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: js.Any): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnKeyUpCapture(value: js.Any): Self = this.set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.Any): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadCapture(value: js.Any): Self = this.set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: js.Any): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadStartCapture(value: js.Any): Self = this.set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: js.Any): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedDataCapture(value: js.Any): Self = this.set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: js.Any): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: js.Any): Self = this.set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCapture(value: js.Any): Self = this.set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLostPointerCapture: Self = this.set("onLostPointerCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCaptureCapture(value: js.Any): Self = this.set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLostPointerCaptureCapture: Self = this.set("onLostPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: js.Any): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseDownCapture(value: js.Any): Self = this.set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: js.Any): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: js.Any): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: js.Any): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseMoveCapture(value: js.Any): Self = this.set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: js.Any): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOutCapture(value: js.Any): Self = this.set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: js.Any): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseOverCapture(value: js.Any): Self = this.set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: js.Any): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnMouseUpCapture(value: js.Any): Self = this.set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnPaste(value: js.Any): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPasteCapture(value: js.Any): Self = this.set("onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPasteCapture: Self = this.set("onPasteCapture", js.undefined)
    
    @scala.inline
    def setOnPause(value: js.Any): Self = this.set("onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPauseCapture(value: js.Any): Self = this.set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPlay(value: js.Any): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayCapture(value: js.Any): Self = this.set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: js.Any): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPlayingCapture(value: js.Any): Self = this.set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: js.Any): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerCancelCapture(value: js.Any): Self = this.set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: js.Any): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerDownCapture(value: js.Any): Self = this.set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: js.Any): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerEnterCapture(value: js.Any): Self = this.set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: js.Any): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveCapture(value: js.Any): Self = this.set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: js.Any): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerMoveCapture(value: js.Any): Self = this.set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: js.Any): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOutCapture(value: js.Any): Self = this.set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: js.Any): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerOverCapture(value: js.Any): Self = this.set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: js.Any): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnPointerUpCapture(value: js.Any): Self = this.set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnProgress(value: js.Any): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnProgressCapture(value: js.Any): Self = this.set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: js.Any): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnRateChangeCapture(value: js.Any): Self = this.set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnReset(value: js.Any): Self = this.set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnResetCapture(value: js.Any): Self = this.set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    
    @scala.inline
    def setOnScroll(value: js.Any): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollCapture(value: js.Any): Self = this.set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: js.Any): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeekedCapture(value: js.Any): Self = this.set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: js.Any): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSeekingCapture(value: js.Any): Self = this.set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.Any): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSelectCapture(value: js.Any): Self = this.set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnStalled(value: js.Any): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnStalledCapture(value: js.Any): Self = this.set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: js.Any): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSubmitCapture(value: js.Any): Self = this.set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: js.Any): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnSuspendCapture(value: js.Any): Self = this.set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: js.Any): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateCapture(value: js.Any): Self = this.set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: js.Any): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchCancelCapture(value: js.Any): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: js.Any): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: js.Any): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: js.Any): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchMoveCapture(value: js.Any): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: js.Any): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTouchStartCapture(value: js.Any): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: js.Any): Self = this.set("onTransitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionEndCapture(value: js.Any): Self = this.set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTransitionEndCapture: Self = this.set("onTransitionEndCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: js.Any): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeCapture(value: js.Any): Self = this.set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: js.Any): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWaitingCapture(value: js.Any): Self = this.set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWheel(value: js.Any): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOnWheelCapture(value: js.Any): Self = this.set("onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
    
    @scala.inline
    def setOpacity(value: js.Any): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOperator(value: js.Any): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Any): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrient(value: js.Any): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setOrientation(value: js.Any): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOrigin(value: js.Any): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setOverflow(value: js.Any): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setOverlinePosition(value: js.Any): Self = this.set("overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlinePosition: Self = this.set("overlinePosition", js.undefined)
    
    @scala.inline
    def setOverlineThickness(value: js.Any): Self = this.set("overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlineThickness: Self = this.set("overlineThickness", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: js.Any): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", js.undefined)
    
    @scala.inline
    def setPanose1(value: js.Any): Self = this.set("panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanose1: Self = this.set("panose1", js.undefined)
    
    @scala.inline
    def setPath(value: js.Any): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathLength(value: js.Any): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathLength: Self = this.set("pathLength", js.undefined)
    
    @scala.inline
    def setPatternContentUnits(value: js.Any): Self = this.set("patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternContentUnits: Self = this.set("patternContentUnits", js.undefined)
    
    @scala.inline
    def setPatternTransform(value: js.Any): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", js.undefined)
    
    @scala.inline
    def setPatternUnits(value: js.Any): Self = this.set("patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternUnits: Self = this.set("patternUnits", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: js.Any): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Any): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setPointsAtX(value: js.Any): Self = this.set("pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtX: Self = this.set("pointsAtX", js.undefined)
    
    @scala.inline
    def setPointsAtY(value: js.Any): Self = this.set("pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtY: Self = this.set("pointsAtY", js.undefined)
    
    @scala.inline
    def setPointsAtZ(value: js.Any): Self = this.set("pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointsAtZ: Self = this.set("pointsAtZ", js.undefined)
    
    @scala.inline
    def setPreserveAlpha(value: js.Any): Self = this.set("preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAlpha: Self = this.set("preserveAlpha", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: js.Any): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setPrimitiveUnits(value: js.Any): Self = this.set("primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveUnits: Self = this.set("primitiveUnits", js.undefined)
    
    @scala.inline
    def setR(value: js.Any): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setRadius(value: js.Any): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ SVGSVGElement => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: (js.Function1[/* instance */ SVGSVGElement, Unit]) | RefObject[SVGSVGElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefX(value: js.Any): Self = this.set("refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefX: Self = this.set("refX", js.undefined)
    
    @scala.inline
    def setRefY(value: js.Any): Self = this.set("refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefY: Self = this.set("refY", js.undefined)
    
    @scala.inline
    def setRenderingIntent(value: js.Any): Self = this.set("renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingIntent: Self = this.set("renderingIntent", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: js.Any): Self = this.set("repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatCount: Self = this.set("repeatCount", js.undefined)
    
    @scala.inline
    def setRepeatDur(value: js.Any): Self = this.set("repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDur: Self = this.set("repeatDur", js.undefined)
    
    @scala.inline
    def setRequiredExtensions(value: js.Any): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredExtensions: Self = this.set("requiredExtensions", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: js.Any): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFeatures: Self = this.set("requiredFeatures", js.undefined)
    
    @scala.inline
    def setRestart(value: js.Any): Self = this.set("restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setRole(value: js.Any): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRotate(value: js.Any): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRx(value: js.Any): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: js.Any): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    
    @scala.inline
    def setScale(value: js.Any): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSeed(value: js.Any): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: js.Any): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    
    @scala.inline
    def setSlope(value: js.Any): Self = this.set("slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlope: Self = this.set("slope", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Any): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setSpecularConstant(value: js.Any): Self = this.set("specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularConstant: Self = this.set("specularConstant", js.undefined)
    
    @scala.inline
    def setSpecularExponent(value: js.Any): Self = this.set("specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularExponent: Self = this.set("specularExponent", js.undefined)
    
    @scala.inline
    def setSpeed(value: js.Any): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setSpreadMethod(value: js.Any): Self = this.set("spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadMethod: Self = this.set("spreadMethod", js.undefined)
    
    @scala.inline
    def setStartOffset(value: js.Any): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    
    @scala.inline
    def setStdDeviation(value: js.Any): Self = this.set("stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdDeviation: Self = this.set("stdDeviation", js.undefined)
    
    @scala.inline
    def setStemh(value: js.Any): Self = this.set("stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemh: Self = this.set("stemh", js.undefined)
    
    @scala.inline
    def setStemv(value: js.Any): Self = this.set("stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStemv: Self = this.set("stemv", js.undefined)
    
    @scala.inline
    def setStitchTiles(value: js.Any): Self = this.set("stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStitchTiles: Self = this.set("stitchTiles", js.undefined)
    
    @scala.inline
    def setStopColor(value: js.Any): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: js.Any): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    
    @scala.inline
    def setStrikethroughPosition(value: js.Any): Self = this.set("strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethroughPosition: Self = this.set("strikethroughPosition", js.undefined)
    
    @scala.inline
    def setStrikethroughThickness(value: js.Any): Self = this.set("strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethroughThickness: Self = this.set("strikethroughThickness", js.undefined)
    
    @scala.inline
    def setString(value: js.Any): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    
    @scala.inline
    def setStroke(value: js.Any): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeDasharray(value: js.Any): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: js.Any): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: js.Any): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: js.Any): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: js.Any): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: js.Any): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: js.Any): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSurfaceScale(value: js.Any): Self = this.set("surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurfaceScale: Self = this.set("surfaceScale", js.undefined)
    
    @scala.inline
    def setSystemLanguage(value: js.Any): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemLanguage: Self = this.set("systemLanguage", js.undefined)
    
    @scala.inline
    def setTabIndex(value: js.Any): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTableValues(value: js.Any): Self = this.set("tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableValues: Self = this.set("tableValues", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetX(value: js.Any): Self = this.set("targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetX: Self = this.set("targetX", js.undefined)
    
    @scala.inline
    def setTargetY(value: js.Any): Self = this.set("targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetY: Self = this.set("targetY", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: js.Any): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: js.Any): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextLength(value: js.Any): Self = this.set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
    
    @scala.inline
    def setTextRendering(value: js.Any): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    
    @scala.inline
    def setTheme(value: js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Any): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setU1(value: js.Any): Self = this.set("u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU1: Self = this.set("u1", js.undefined)
    
    @scala.inline
    def setU2(value: js.Any): Self = this.set("u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteU2: Self = this.set("u2", js.undefined)
    
    @scala.inline
    def setUnderlinePosition(value: js.Any): Self = this.set("underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlinePosition: Self = this.set("underlinePosition", js.undefined)
    
    @scala.inline
    def setUnderlineThickness(value: js.Any): Self = this.set("underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineThickness: Self = this.set("underlineThickness", js.undefined)
    
    @scala.inline
    def setUnicode(value: js.Any): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: js.Any): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: js.Any): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: js.Any): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitsPerEm: Self = this.set("unitsPerEm", js.undefined)
    
    @scala.inline
    def setVAlphabetic(value: js.Any): Self = this.set("vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVAlphabetic: Self = this.set("vAlphabetic", js.undefined)
    
    @scala.inline
    def setVHanging(value: js.Any): Self = this.set("vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVHanging: Self = this.set("vHanging", js.undefined)
    
    @scala.inline
    def setVIdeographic(value: js.Any): Self = this.set("vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVIdeographic: Self = this.set("vIdeographic", js.undefined)
    
    @scala.inline
    def setVMathematical(value: js.Any): Self = this.set("vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVMathematical: Self = this.set("vMathematical", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: js.Any): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVertAdvY(value: js.Any): Self = this.set("vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertAdvY: Self = this.set("vertAdvY", js.undefined)
    
    @scala.inline
    def setVertOriginX(value: js.Any): Self = this.set("vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertOriginX: Self = this.set("vertOriginX", js.undefined)
    
    @scala.inline
    def setVertOriginY(value: js.Any): Self = this.set("vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertOriginY: Self = this.set("vertOriginY", js.undefined)
    
    @scala.inline
    def setViewBox(value: js.Any): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    
    @scala.inline
    def setViewTarget(value: js.Any): Self = this.set("viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewTarget: Self = this.set("viewTarget", js.undefined)
    
    @scala.inline
    def setVisibility(value: js.Any): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidths(value: js.Any): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: js.Any): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: js.Any): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setX1(value: js.Any): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setX2(value: js.Any): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setXChannelSelector(value: js.Any): Self = this.set("xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXChannelSelector: Self = this.set("xChannelSelector", js.undefined)
    
    @scala.inline
    def setXHeight(value: js.Any): Self = this.set("xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXHeight: Self = this.set("xHeight", js.undefined)
    
    @scala.inline
    def setXlinkActuate(value: js.Any): Self = this.set("xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkActuate: Self = this.set("xlinkActuate", js.undefined)
    
    @scala.inline
    def setXlinkArcrole(value: js.Any): Self = this.set("xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkArcrole: Self = this.set("xlinkArcrole", js.undefined)
    
    @scala.inline
    def setXlinkHref(value: js.Any): Self = this.set("xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkHref: Self = this.set("xlinkHref", js.undefined)
    
    @scala.inline
    def setXlinkRole(value: js.Any): Self = this.set("xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkRole: Self = this.set("xlinkRole", js.undefined)
    
    @scala.inline
    def setXlinkShow(value: js.Any): Self = this.set("xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkShow: Self = this.set("xlinkShow", js.undefined)
    
    @scala.inline
    def setXlinkTitle(value: js.Any): Self = this.set("xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkTitle: Self = this.set("xlinkTitle", js.undefined)
    
    @scala.inline
    def setXlinkType(value: js.Any): Self = this.set("xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlinkType: Self = this.set("xlinkType", js.undefined)
    
    @scala.inline
    def setXmlBase(value: js.Any): Self = this.set("xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlBase: Self = this.set("xmlBase", js.undefined)
    
    @scala.inline
    def setXmlLang(value: js.Any): Self = this.set("xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlLang: Self = this.set("xmlLang", js.undefined)
    
    @scala.inline
    def setXmlSpace(value: js.Any): Self = this.set("xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlSpace: Self = this.set("xmlSpace", js.undefined)
    
    @scala.inline
    def setXmlns(value: js.Any): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
    
    @scala.inline
    def setXmlnsXlink(value: js.Any): Self = this.set("xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlnsXlink: Self = this.set("xmlnsXlink", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setY1(value: js.Any): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    
    @scala.inline
    def setY2(value: js.Any): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
    
    @scala.inline
    def setYChannelSelector(value: js.Any): Self = this.set("yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYChannelSelector: Self = this.set("yChannelSelector", js.undefined)
    
    @scala.inline
    def setZ(value: js.Any): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZoomAndPan(value: js.Any): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAndPan: Self = this.set("zoomAndPan", js.undefined)
  }
}

package typings.reactWebcam

import typings.react.anon.Html
import typings.react.mod.AnimationEventHandler
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.Component
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEventHandler
import typings.react.mod.Key
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEventHandler
import typings.react.mod.global.JSX.Element
import typings.reactWebcam.anon.Audio
import typings.reactWebcam.reactWebcamStrings.`additions removals`
import typings.reactWebcam.reactWebcamStrings.`additions text`
import typings.reactWebcam.reactWebcamStrings.`inline`
import typings.reactWebcam.reactWebcamStrings.`removals additions`
import typings.reactWebcam.reactWebcamStrings.`removals text`
import typings.reactWebcam.reactWebcamStrings.`text additions`
import typings.reactWebcam.reactWebcamStrings.`text removals`
import typings.reactWebcam.reactWebcamStrings.additions
import typings.reactWebcam.reactWebcamStrings.all
import typings.reactWebcam.reactWebcamStrings.ascending
import typings.reactWebcam.reactWebcamStrings.assertive
import typings.reactWebcam.reactWebcamStrings.both
import typings.reactWebcam.reactWebcamStrings.copy
import typings.reactWebcam.reactWebcamStrings.date
import typings.reactWebcam.reactWebcamStrings.decimal
import typings.reactWebcam.reactWebcamStrings.descending
import typings.reactWebcam.reactWebcamStrings.dialog
import typings.reactWebcam.reactWebcamStrings.email
import typings.reactWebcam.reactWebcamStrings.environment
import typings.reactWebcam.reactWebcamStrings.execute
import typings.reactWebcam.reactWebcamStrings.grammar
import typings.reactWebcam.reactWebcamStrings.grid
import typings.reactWebcam.reactWebcamStrings.horizontal
import typings.reactWebcam.reactWebcamStrings.imageSlashjpeg
import typings.reactWebcam.reactWebcamStrings.imageSlashpng
import typings.reactWebcam.reactWebcamStrings.imageSlashwebp
import typings.reactWebcam.reactWebcamStrings.inherit
import typings.reactWebcam.reactWebcamStrings.link
import typings.reactWebcam.reactWebcamStrings.list
import typings.reactWebcam.reactWebcamStrings.listbox
import typings.reactWebcam.reactWebcamStrings.location
import typings.reactWebcam.reactWebcamStrings.menu
import typings.reactWebcam.reactWebcamStrings.mixed
import typings.reactWebcam.reactWebcamStrings.move
import typings.reactWebcam.reactWebcamStrings.no
import typings.reactWebcam.reactWebcamStrings.none
import typings.reactWebcam.reactWebcamStrings.numeric
import typings.reactWebcam.reactWebcamStrings.off
import typings.reactWebcam.reactWebcamStrings.on
import typings.reactWebcam.reactWebcamStrings.other
import typings.reactWebcam.reactWebcamStrings.page
import typings.reactWebcam.reactWebcamStrings.polite
import typings.reactWebcam.reactWebcamStrings.popup
import typings.reactWebcam.reactWebcamStrings.removals
import typings.reactWebcam.reactWebcamStrings.search
import typings.reactWebcam.reactWebcamStrings.spelling
import typings.reactWebcam.reactWebcamStrings.step
import typings.reactWebcam.reactWebcamStrings.tel
import typings.reactWebcam.reactWebcamStrings.text
import typings.reactWebcam.reactWebcamStrings.time
import typings.reactWebcam.reactWebcamStrings.tree
import typings.reactWebcam.reactWebcamStrings.url
import typings.reactWebcam.reactWebcamStrings.user
import typings.reactWebcam.reactWebcamStrings.vertical
import typings.reactWebcam.reactWebcamStrings.yes
import typings.std.DOMException
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-webcam", JSImport.Default)
  @js.native
  open class default protected () extends Webcam {
    def this(props: WebcamProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-webcam", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-webcam", "default.defaultProps")
    @js.native
    def defaultProps: Audio = js.native
    inline def defaultProps_=(x: Audio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-webcam", "default.stopMediaStream")
    @js.native
    def stopMediaStream: Any = js.native
    inline def stopMediaStream_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopMediaStream")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ChildrenProps extends StObject {
    
    def getScreenshot(): String | Null = js.native
    def getScreenshot(screenshotDimensions: ScreenshotDimensions): String | Null = js.native
  }
  
  trait ScreenshotDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ScreenshotDimensions {
    
    inline def apply(height: Double, width: Double): ScreenshotDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenshotDimensions]
    }
    
    extension [Self <: ScreenshotDimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Webcam extends Component[WebcamProps, WebcamState, Any] {
    
    /* private */ var canvas: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MWebcam(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MWebcam(nextProps: WebcamProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MWebcam(): Unit = js.native
    
    /* private */ var ctx: Any = js.native
    
    def getCanvas(): HTMLCanvasElement | Null = js.native
    def getCanvas(screenshotDimensions: ScreenshotDimensions): HTMLCanvasElement | Null = js.native
    
    def getScreenshot(): String | Null = js.native
    def getScreenshot(screenshotDimensions: ScreenshotDimensions): String | Null = js.native
    
    /* private */ var handleUserMedia: Any = js.native
    
    /* private */ var requestUserMedia: Any = js.native
    
    /* private */ var requestUserMediaId: Any = js.native
    
    /* private */ var stopAndCleanup: Any = js.native
    
    var stream: MediaStream | Null = js.native
    
    /* private */ var unmounted: Any = js.native
    
    var video: HTMLVideoElement | Null = js.native
  }
  
  /* Inlined std.Omit<react.react.HTMLProps<std.HTMLVideoElement>, 'ref'> & {  audio :boolean,   audioConstraints :std.MediaStreamConstraints['audio'] | undefined,   forceScreenshotSourceSize :boolean,   imageSmoothing :boolean,   mirrored :boolean,   minScreenshotHeight :number | undefined,   minScreenshotWidth :number | undefined, onUserMedia (stream : std.MediaStream): void, onUserMediaError (error : string | std.DOMException): void,   screenshotFormat :'image/webp' | 'image/png' | 'image/jpeg',   screenshotQuality :number,   videoConstraints :std.MediaStreamConstraints['video'] | undefined,   children :(childrenProps : react-webcam.react-webcam.ChildrenProps): react.react.<global>.JSX.Element | undefined} */
  @js.native
  trait WebcamProps extends StObject {
    
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
    
    var audio: Boolean = js.native
    
    var audioConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
    
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
    
    var children: js.UndefOr[ReactNode] & (js.UndefOr[js.Function1[/* childrenProps */ ChildrenProps, Element]]) = js.native
    
    var cite: js.UndefOr[String] = js.native
    
    var classID: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
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
    
    var download: js.UndefOr[Any] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var encType: js.UndefOr[String] = js.native
    
    var forceScreenshotSourceSize: Boolean = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
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
    
    var imageSmoothing: Boolean = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var integrity: js.UndefOr[String] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var keyParams: js.UndefOr[String] = js.native
    
    var keyType: js.UndefOr[String] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
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
    
    var minScreenshotHeight: js.UndefOr[Double] = js.native
    
    var minScreenshotWidth: js.UndefOr[Double] = js.native
    
    var mirrored: Boolean = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var noValidate: js.UndefOr[Boolean] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLVideoElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLVideoElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLVideoElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLVideoElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLVideoElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLVideoElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLVideoElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLVideoElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLVideoElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLVideoElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLVideoElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLVideoElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLVideoElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLVideoElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLVideoElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLVideoElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLVideoElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLVideoElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLVideoElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLVideoElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLVideoElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLVideoElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLVideoElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLVideoElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLVideoElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLVideoElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLVideoElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLVideoElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLVideoElement]] = js.native
    
    def onUserMedia(stream: MediaStream): Unit = js.native
    
    def onUserMediaError(error: String): Unit = js.native
    def onUserMediaError(error: DOMException): Unit = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLVideoElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLVideoElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var optimum: js.UndefOr[Double] = js.native
    
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
    
    var screenshotFormat: imageSlashwebp | imageSlashpng | imageSlashjpeg = js.native
    
    var screenshotQuality: Double = js.native
    
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
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    var videoConstraints: js.UndefOr[Boolean | MediaTrackConstraints] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var wmode: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[String] = js.native
  }
  
  trait WebcamState extends StObject {
    
    var hasUserMedia: Boolean
    
    var src: js.UndefOr[String] = js.undefined
  }
  object WebcamState {
    
    inline def apply(hasUserMedia: Boolean): WebcamState = {
      val __obj = js.Dynamic.literal(hasUserMedia = hasUserMedia.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebcamState]
    }
    
    extension [Self <: WebcamState](x: Self) {
      
      inline def setHasUserMedia(value: Boolean): Self = StObject.set(x, "hasUserMedia", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}

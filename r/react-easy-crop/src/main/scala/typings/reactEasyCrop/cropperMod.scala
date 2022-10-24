package typings.reactEasyCrop

import typings.react.mod.Component
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.react.mod.VideoHTMLAttributes
import typings.reactEasyCrop.anon.ContainerClassName
import typings.reactEasyCrop.anon.ContainerStyle
import typings.reactEasyCrop.anon.CroppedAreaPercentages
import typings.reactEasyCrop.anon.ShouldUpdatePosition
import typings.reactEasyCrop.anon.X
import typings.reactEasyCrop.reactEasyCropStrings.`auto-cover`
import typings.reactEasyCrop.reactEasyCropStrings.`horizontal-cover`
import typings.reactEasyCrop.reactEasyCropStrings.`vertical-cover`
import typings.reactEasyCrop.reactEasyCropStrings.contain
import typings.reactEasyCrop.reactEasyCropStrings.rect
import typings.reactEasyCrop.reactEasyCropStrings.round
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Point
import typings.reactEasyCrop.typesMod.Size
import typings.reactEasyCrop.typesMod.VideoSrc
import typings.std.DOMRect
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLStyleElement
import typings.std.HTMLVideoElement
import typings.std.MouseEvent
import typings.std.Touch
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropperMod {
  
  @JSImport("react-easy-crop/Cropper", JSImport.Default)
  @js.native
  open class default () extends Cropper
  object default {
    
    @JSImport("react-easy-crop/Cropper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.aspect")
      @js.native
      def aspect: Double = js.native
      inline def aspect_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspect")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.cropShape")
      @js.native
      def cropShape: rect = js.native
      inline def cropShape_=(x: rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cropShape")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.maxZoom")
      @js.native
      def maxZoom: Double = js.native
      inline def maxZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.minZoom")
      @js.native
      def minZoom: Double = js.native
      inline def minZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.objectFit")
      @js.native
      def objectFit: contain = js.native
      inline def objectFit_=(x: contain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.restrictPosition")
      @js.native
      def restrictPosition: Boolean = js.native
      inline def restrictPosition_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.rotation")
      @js.native
      def rotation: Double = js.native
      inline def rotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotation")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.showGrid")
      @js.native
      def showGrid: Boolean = js.native
      inline def showGrid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.zoom")
      @js.native
      def zoom: Double = js.native
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.zoomSpeed")
      @js.native
      def zoomSpeed: Double = js.native
      inline def zoomSpeed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop/Cropper", "default.defaultProps.zoomWithScroll")
      @js.native
      def zoomWithScroll: Boolean = js.native
      inline def zoomWithScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomWithScroll")(x.asInstanceOf[js.Any])
      
      inline def zoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-easy-crop/Cropper", "default.getMousePoint")
    @js.native
    def getMousePoint: js.Function1[
        /* e */ MouseEvent | (typings.react.mod.MouseEvent[Element, NativeMouseEvent]) | GestureEvent, 
        X
      ] = js.native
    inline def getMousePoint_=(
      x: js.Function1[
          /* e */ MouseEvent | (typings.react.mod.MouseEvent[Element, NativeMouseEvent]) | GestureEvent, 
          X
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMousePoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("react-easy-crop/Cropper", "default.getTouchPoint")
    @js.native
    def getTouchPoint: js.Function1[/* touch */ Touch | typings.react.mod.Touch, X] = js.native
    inline def getTouchPoint_=(x: js.Function1[/* touch */ Touch | typings.react.mod.Touch, X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTouchPoint")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Cropper extends Component[CropperProps, State, Any] {
    
    def cleanEvents(): Unit = js.native
    
    def clearScrollEvent(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCropper(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCropper(prevProps: CropperProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCropper(): Unit = js.native
    
    def computeSizes(): js.UndefOr[Size] = js.native
    
    var containerRect: DOMRect | Null = js.native
    
    var containerRef: HTMLDivElement | Null = js.native
    
    var currentDoc: Document = js.native
    
    var currentWindow: Window = js.native
    
    var dragStartCrop: Point = js.native
    
    var dragStartPosition: Point = js.native
    
    def emitCropAreaChange(): Unit = js.native
    
    def emitCropData(): Unit = js.native
    
    var gestureRotationStart: Double = js.native
    
    var gestureZoomStart: Double = js.native
    
    def getAspect(): Double = js.native
    
    def getCropData(): CroppedAreaPercentages | Null = js.native
    
    def getPointOnContainer(param0: Point): X = js.native
    
    def getPointOnMedia(param0: Point): X = js.native
    
    var imageRef: RefObject[HTMLImageElement] = js.native
    
    var isTouching: Boolean = js.native
    
    var lastPinchDistance: Double = js.native
    
    var lastPinchRotation: Double = js.native
    
    var mediaSize: MediaSize = js.native
    
    def onDrag(param0: Point): Unit = js.native
    
    def onDragStart(param0: Point): Unit = js.native
    
    def onDragStopped(): Unit = js.native
    
    def onGestureEnd(e: GestureEvent): Unit = js.native
    
    def onGestureMove(e: GestureEvent): Unit = js.native
    
    def onGestureStart(e: GestureEvent): Unit = js.native
    
    def onMediaLoad(): Unit = js.native
    
    def onMouseDown(e: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onPinchMove(e: TouchEvent): Unit = js.native
    
    def onPinchStart(e: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onTouchStart(e: typings.react.mod.TouchEvent[HTMLDivElement]): Unit = js.native
    
    def onWheel(e: WheelEvent): Unit = js.native
    
    def preventZoomSafari(e: Event): Unit = js.native
    
    var rafDragTimeout: Double | Null = js.native
    
    var rafPinchTimeout: Double | Null = js.native
    
    def recomputeCropPosition(): Unit = js.native
    
    def setInitialCrop(cropSize: Size): Unit = js.native
    
    def setNewZoom(zoom: Double, point: Point): Unit = js.native
    def setNewZoom(zoom: Double, point: Point, param2: ShouldUpdatePosition): Unit = js.native
    
    var styleRef: HTMLStyleElement | Null = js.native
    
    var videoRef: RefObject[HTMLVideoElement] = js.native
    
    var wheelTimer: Double | Null = js.native
  }
  
  trait CropperProps extends StObject {
    
    var aspect: Double
    
    var classes: ContainerClassName
    
    var crop: Point
    
    var cropShape: rect | round
    
    var cropSize: js.UndefOr[Size] = js.undefined
    
    var disableAutomaticStylesInjection: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var initialCroppedAreaPercentages: js.UndefOr[Area] = js.undefined
    
    var initialCroppedAreaPixels: js.UndefOr[Area] = js.undefined
    
    var maxZoom: Double
    
    var mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement]
    
    var minZoom: Double
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var objectFit: js.UndefOr[contain | `horizontal-cover` | `vertical-cover` | `auto-cover`] = js.undefined
    
    var onCropAreaChange: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.undefined
    
    def onCropChange(location: Point): Unit
    
    var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.undefined
    
    var onCropSizeChange: js.UndefOr[js.Function1[/* cropSize */ Size, Unit]] = js.undefined
    
    var onInteractionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onInteractionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMediaLoaded: js.UndefOr[js.Function1[/* mediaSize */ MediaSize, Unit]] = js.undefined
    
    var onRotationChange: js.UndefOr[js.Function1[/* rotation */ Double, Unit]] = js.undefined
    
    var onTouchRequest: js.UndefOr[js.Function1[/* e */ typings.react.mod.TouchEvent[HTMLDivElement], Boolean]] = js.undefined
    
    var onWheelRequest: js.UndefOr[js.Function1[/* e */ WheelEvent, Boolean]] = js.undefined
    
    var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.undefined
    
    var restrictPosition: Boolean
    
    var rotation: Double
    
    var setCropSize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
    
    var setImageRef: js.UndefOr[js.Function1[/* ref */ RefObject[HTMLImageElement], Unit]] = js.undefined
    
    var setMediaSize: js.UndefOr[js.Function1[/* size */ MediaSize, Unit]] = js.undefined
    
    var setVideoRef: js.UndefOr[js.Function1[/* ref */ RefObject[HTMLVideoElement], Unit]] = js.undefined
    
    var showGrid: js.UndefOr[Boolean] = js.undefined
    
    var style: ContainerStyle
    
    var transform: js.UndefOr[String] = js.undefined
    
    var video: js.UndefOr[String | js.Array[VideoSrc]] = js.undefined
    
    var zoom: Double
    
    var zoomSpeed: Double
    
    var zoomWithScroll: js.UndefOr[Boolean] = js.undefined
  }
  object CropperProps {
    
    inline def apply(
      aspect: Double,
      classes: ContainerClassName,
      crop: Point,
      cropShape: rect | round,
      maxZoom: Double,
      mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement],
      minZoom: Double,
      onCropChange: Point => Unit,
      restrictPosition: Boolean,
      rotation: Double,
      style: ContainerStyle,
      zoom: Double,
      zoomSpeed: Double
    ): CropperProps = {
      val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], cropShape = cropShape.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], mediaProps = mediaProps.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange), restrictPosition = restrictPosition.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropperProps]
    }
    
    extension [Self <: CropperProps](x: Self) {
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: ContainerClassName): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setCrop(value: Point): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropShape(value: rect | round): Self = StObject.set(x, "cropShape", value.asInstanceOf[js.Any])
      
      inline def setCropSize(value: Size): Self = StObject.set(x, "cropSize", value.asInstanceOf[js.Any])
      
      inline def setCropSizeUndefined: Self = StObject.set(x, "cropSize", js.undefined)
      
      inline def setDisableAutomaticStylesInjection(value: Boolean): Self = StObject.set(x, "disableAutomaticStylesInjection", value.asInstanceOf[js.Any])
      
      inline def setDisableAutomaticStylesInjectionUndefined: Self = StObject.set(x, "disableAutomaticStylesInjection", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setInitialCroppedAreaPercentages(value: Area): Self = StObject.set(x, "initialCroppedAreaPercentages", value.asInstanceOf[js.Any])
      
      inline def setInitialCroppedAreaPercentagesUndefined: Self = StObject.set(x, "initialCroppedAreaPercentages", js.undefined)
      
      inline def setInitialCroppedAreaPixels(value: Area): Self = StObject.set(x, "initialCroppedAreaPixels", value.asInstanceOf[js.Any])
      
      inline def setInitialCroppedAreaPixelsUndefined: Self = StObject.set(x, "initialCroppedAreaPixels", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMediaProps(value: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement]): Self = StObject.set(x, "mediaProps", value.asInstanceOf[js.Any])
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setObjectFit(value: contain | `horizontal-cover` | `vertical-cover` | `auto-cover`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      inline def setOnCropAreaChange(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): Self = StObject.set(x, "onCropAreaChange", js.Any.fromFunction2(value))
      
      inline def setOnCropAreaChangeUndefined: Self = StObject.set(x, "onCropAreaChange", js.undefined)
      
      inline def setOnCropChange(value: Point => Unit): Self = StObject.set(x, "onCropChange", js.Any.fromFunction1(value))
      
      inline def setOnCropComplete(value: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit): Self = StObject.set(x, "onCropComplete", js.Any.fromFunction2(value))
      
      inline def setOnCropCompleteUndefined: Self = StObject.set(x, "onCropComplete", js.undefined)
      
      inline def setOnCropSizeChange(value: /* cropSize */ Size => Unit): Self = StObject.set(x, "onCropSizeChange", js.Any.fromFunction1(value))
      
      inline def setOnCropSizeChangeUndefined: Self = StObject.set(x, "onCropSizeChange", js.undefined)
      
      inline def setOnInteractionEnd(value: () => Unit): Self = StObject.set(x, "onInteractionEnd", js.Any.fromFunction0(value))
      
      inline def setOnInteractionEndUndefined: Self = StObject.set(x, "onInteractionEnd", js.undefined)
      
      inline def setOnInteractionStart(value: () => Unit): Self = StObject.set(x, "onInteractionStart", js.Any.fromFunction0(value))
      
      inline def setOnInteractionStartUndefined: Self = StObject.set(x, "onInteractionStart", js.undefined)
      
      inline def setOnMediaLoaded(value: /* mediaSize */ MediaSize => Unit): Self = StObject.set(x, "onMediaLoaded", js.Any.fromFunction1(value))
      
      inline def setOnMediaLoadedUndefined: Self = StObject.set(x, "onMediaLoaded", js.undefined)
      
      inline def setOnRotationChange(value: /* rotation */ Double => Unit): Self = StObject.set(x, "onRotationChange", js.Any.fromFunction1(value))
      
      inline def setOnRotationChangeUndefined: Self = StObject.set(x, "onRotationChange", js.undefined)
      
      inline def setOnTouchRequest(value: /* e */ typings.react.mod.TouchEvent[HTMLDivElement] => Boolean): Self = StObject.set(x, "onTouchRequest", js.Any.fromFunction1(value))
      
      inline def setOnTouchRequestUndefined: Self = StObject.set(x, "onTouchRequest", js.undefined)
      
      inline def setOnWheelRequest(value: /* e */ WheelEvent => Boolean): Self = StObject.set(x, "onWheelRequest", js.Any.fromFunction1(value))
      
      inline def setOnWheelRequestUndefined: Self = StObject.set(x, "onWheelRequest", js.undefined)
      
      inline def setOnZoomChange(value: /* zoom */ Double => Unit): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction1(value))
      
      inline def setOnZoomChangeUndefined: Self = StObject.set(x, "onZoomChange", js.undefined)
      
      inline def setRestrictPosition(value: Boolean): Self = StObject.set(x, "restrictPosition", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSetCropSize(value: /* size */ Size => Unit): Self = StObject.set(x, "setCropSize", js.Any.fromFunction1(value))
      
      inline def setSetCropSizeUndefined: Self = StObject.set(x, "setCropSize", js.undefined)
      
      inline def setSetImageRef(value: /* ref */ RefObject[HTMLImageElement] => Unit): Self = StObject.set(x, "setImageRef", js.Any.fromFunction1(value))
      
      inline def setSetImageRefUndefined: Self = StObject.set(x, "setImageRef", js.undefined)
      
      inline def setSetMediaSize(value: /* size */ MediaSize => Unit): Self = StObject.set(x, "setMediaSize", js.Any.fromFunction1(value))
      
      inline def setSetMediaSizeUndefined: Self = StObject.set(x, "setMediaSize", js.undefined)
      
      inline def setSetVideoRef(value: /* ref */ RefObject[HTMLVideoElement] => Unit): Self = StObject.set(x, "setVideoRef", js.Any.fromFunction1(value))
      
      inline def setSetVideoRefUndefined: Self = StObject.set(x, "setVideoRef", js.undefined)
      
      inline def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
      
      inline def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
      
      inline def setStyle(value: ContainerStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setVideo(value: String | js.Array[VideoSrc]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      inline def setVideoVarargs(value: VideoSrc*): Self = StObject.set(x, "video", js.Array(value*))
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
      
      inline def setZoomWithScroll(value: Boolean): Self = StObject.set(x, "zoomWithScroll", value.asInstanceOf[js.Any])
      
      inline def setZoomWithScrollUndefined: Self = StObject.set(x, "zoomWithScroll", js.undefined)
    }
  }
  
  @js.native
  trait GestureEvent
    extends StObject
       with UIEvent {
    
    var clientX: Double = js.native
    
    var clientY: Double = js.native
    
    var rotation: Double = js.native
    
    var scale: Double = js.native
  }
  
  trait State extends StObject {
    
    var cropSize: Size | Null
    
    var hasWheelJustStarted: Boolean
  }
  object State {
    
    inline def apply(hasWheelJustStarted: Boolean): State = {
      val __obj = js.Dynamic.literal(hasWheelJustStarted = hasWheelJustStarted.asInstanceOf[js.Any], cropSize = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCropSize(value: Size): Self = StObject.set(x, "cropSize", value.asInstanceOf[js.Any])
      
      inline def setCropSizeNull: Self = StObject.set(x, "cropSize", null)
      
      inline def setHasWheelJustStarted(value: Boolean): Self = StObject.set(x, "hasWheelJustStarted", value.asInstanceOf[js.Any])
    }
  }
}

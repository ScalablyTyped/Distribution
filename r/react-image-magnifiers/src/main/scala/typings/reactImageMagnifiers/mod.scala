package typings.reactImageMagnifiers

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactImageMagnifiers.anon.ClickMoveLimit
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.bottom
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.left
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.right
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.top
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-magnifiers", "GlassMagnifier")
  @js.native
  val GlassMagnifier: ComponentType[GlassMagnifierProps] = js.native
  
  object MOUSE_ACTIVATION {
    
    @JSImport("react-image-magnifiers", "MOUSE_ACTIVATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-image-magnifiers", "MOUSE_ACTIVATION.CLICK")
    @js.native
    def CLICK: MouseActivation = js.native
    inline def CLICK_=(x: MouseActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("react-image-magnifiers", "MOUSE_ACTIVATION.DOUBLE_CLICK")
    @js.native
    def DOUBLE_CLICK: MouseActivation = js.native
    inline def DOUBLE_CLICK_=(x: MouseActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_CLICK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-image-magnifiers", "Magnifier")
  @js.native
  val Magnifier: ComponentType[MagnifierProps] = js.native
  
  @JSImport("react-image-magnifiers", "MagnifierContainer")
  @js.native
  val MagnifierContainer: ComponentType[MagnifierContainerProps] = js.native
  
  @JSImport("react-image-magnifiers", "MagnifierPreview")
  @js.native
  val MagnifierPreview: ComponentType[MagnifierPreviewProps] = js.native
  
  @JSImport("react-image-magnifiers", "MagnifierZoom")
  @js.native
  val MagnifierZoom: ComponentType[MagnifierZoomProps] = js.native
  
  @JSImport("react-image-magnifiers", "PictureInPictureMagnifier")
  @js.native
  val PictureInPictureMagnifier: ComponentType[PictureInPictureMagnifierProps] = js.native
  
  @JSImport("react-image-magnifiers", "SideBySideMagnifier")
  @js.native
  val SideBySideMagnifier: ComponentType[SideBySideMagnifierProps] = js.native
  
  object TOUCH_ACTIVATION {
    
    @JSImport("react-image-magnifiers", "TOUCH_ACTIVATION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-image-magnifiers", "TOUCH_ACTIVATION.DOUBLE_TAP")
    @js.native
    def DOUBLE_TAP: TouchActivation = js.native
    inline def DOUBLE_TAP_=(x: TouchActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("react-image-magnifiers", "TOUCH_ACTIVATION.LONG_TOUCH")
    @js.native
    def LONG_TOUCH: TouchActivation = js.native
    inline def LONG_TOUCH_=(x: TouchActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG_TOUCH")(x.asInstanceOf[js.Any])
    
    @JSImport("react-image-magnifiers", "TOUCH_ACTIVATION.TAP")
    @js.native
    def TAP: TouchActivation = js.native
    inline def TAP_=(x: TouchActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAP")(x.asInstanceOf[js.Any])
  }
  
  trait CommonProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursorStyle: js.UndefOr[String] = js.undefined
    
    var imageAlt: js.UndefOr[String] = js.undefined
    
    var imageSrc: String
    
    var largeImageSrc: js.UndefOr[String] = js.undefined
    
    var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CommonProps {
    
    inline def apply(imageSrc: String): CommonProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursorStyle(value: String): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
      
      inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setLargeImageSrc(value: String): Self = StObject.set(x, "largeImageSrc", value.asInstanceOf[js.Any])
      
      inline def setLargeImageSrcUndefined: Self = StObject.set(x, "largeImageSrc", js.undefined)
      
      inline def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      inline def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      inline def setOnLargeImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onLargeImageLoad", js.Any.fromFunction1(value))
      
      inline def setOnLargeImageLoadUndefined: Self = StObject.set(x, "onLargeImageLoad", js.undefined)
      
      inline def setOnZoomEnd(value: () => Unit): Self = StObject.set(x, "onZoomEnd", js.Any.fromFunction0(value))
      
      inline def setOnZoomEndUndefined: Self = StObject.set(x, "onZoomEnd", js.undefined)
      
      inline def setOnZoomStart(value: () => Unit): Self = StObject.set(x, "onZoomStart", js.Any.fromFunction0(value))
      
      inline def setOnZoomStartUndefined: Self = StObject.set(x, "onZoomStart", js.undefined)
      
      inline def setRenderOverlay(value: /* state */ Boolean => ReactNode): Self = StObject.set(x, "renderOverlay", js.Any.fromFunction1(value))
      
      inline def setRenderOverlayUndefined: Self = StObject.set(x, "renderOverlay", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GlassMagnifierProps
    extends StObject
       with CommonProps {
    
    var allowOverflow: js.UndefOr[Boolean] = js.undefined
    
    var magnifierBackgroundColor: js.UndefOr[String] = js.undefined
    
    var magnifierBorderColor: js.UndefOr[String] = js.undefined
    
    var magnifierBorderSize: js.UndefOr[Double] = js.undefined
    
    var magnifierOffsetX: js.UndefOr[Double] = js.undefined
    
    var magnifierOffsetY: js.UndefOr[Double] = js.undefined
    
    var magnifierSize: js.UndefOr[String | Double] = js.undefined
    
    var square: js.UndefOr[Boolean] = js.undefined
  }
  object GlassMagnifierProps {
    
    inline def apply(imageSrc: String): GlassMagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlassMagnifierProps]
    }
    
    extension [Self <: GlassMagnifierProps](x: Self) {
      
      inline def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
      
      inline def setMagnifierBackgroundColor(value: String): Self = StObject.set(x, "magnifierBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setMagnifierBackgroundColorUndefined: Self = StObject.set(x, "magnifierBackgroundColor", js.undefined)
      
      inline def setMagnifierBorderColor(value: String): Self = StObject.set(x, "magnifierBorderColor", value.asInstanceOf[js.Any])
      
      inline def setMagnifierBorderColorUndefined: Self = StObject.set(x, "magnifierBorderColor", js.undefined)
      
      inline def setMagnifierBorderSize(value: Double): Self = StObject.set(x, "magnifierBorderSize", value.asInstanceOf[js.Any])
      
      inline def setMagnifierBorderSizeUndefined: Self = StObject.set(x, "magnifierBorderSize", js.undefined)
      
      inline def setMagnifierOffsetX(value: Double): Self = StObject.set(x, "magnifierOffsetX", value.asInstanceOf[js.Any])
      
      inline def setMagnifierOffsetXUndefined: Self = StObject.set(x, "magnifierOffsetX", js.undefined)
      
      inline def setMagnifierOffsetY(value: Double): Self = StObject.set(x, "magnifierOffsetY", value.asInstanceOf[js.Any])
      
      inline def setMagnifierOffsetYUndefined: Self = StObject.set(x, "magnifierOffsetY", js.undefined)
      
      inline def setMagnifierSize(value: String | Double): Self = StObject.set(x, "magnifierSize", value.asInstanceOf[js.Any])
      
      inline def setMagnifierSizeUndefined: Self = StObject.set(x, "magnifierSize", js.undefined)
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
  
  trait MagnifierContainerProps extends StObject {
    
    var autoInPlace: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var inPlaceMinBreakpoint: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
  }
  object MagnifierContainerProps {
    
    inline def apply(): MagnifierContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagnifierContainerProps]
    }
    
    extension [Self <: MagnifierContainerProps](x: Self) {
      
      inline def setAutoInPlace(value: Boolean): Self = StObject.set(x, "autoInPlace", value.asInstanceOf[js.Any])
      
      inline def setAutoInPlaceUndefined: Self = StObject.set(x, "autoInPlace", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInPlaceMinBreakpoint(value: Double): Self = StObject.set(x, "inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setInPlaceMinBreakpointUndefined: Self = StObject.set(x, "inPlaceMinBreakpoint", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait MagnifierPreviewProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursorStyle: js.UndefOr[String] = js.undefined
    
    var imageAlt: js.UndefOr[String] = js.undefined
    
    var imageSrc: String
    
    var largeImageSrc: js.UndefOr[String] = js.undefined
    
    var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var overlayBackgroundColor: js.UndefOr[Double] = js.undefined
    
    var overlayBoxColor: js.UndefOr[Double] = js.undefined
    
    var overlayBoxImage: js.UndefOr[Double] = js.undefined
    
    var overlayBoxImageSize: js.UndefOr[Double] = js.undefined
    
    var overlayBoxOpacity: js.UndefOr[Double] = js.undefined
    
    var overlayOpacity: js.UndefOr[Double] = js.undefined
    
    var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionSpeed: js.UndefOr[Double] = js.undefined
  }
  object MagnifierPreviewProps {
    
    inline def apply(imageSrc: String): MagnifierPreviewProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagnifierPreviewProps]
    }
    
    extension [Self <: MagnifierPreviewProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursorStyle(value: String): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
      
      inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setLargeImageSrc(value: String): Self = StObject.set(x, "largeImageSrc", value.asInstanceOf[js.Any])
      
      inline def setLargeImageSrcUndefined: Self = StObject.set(x, "largeImageSrc", js.undefined)
      
      inline def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      inline def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      inline def setOnLargeImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onLargeImageLoad", js.Any.fromFunction1(value))
      
      inline def setOnLargeImageLoadUndefined: Self = StObject.set(x, "onLargeImageLoad", js.undefined)
      
      inline def setOnZoomEnd(value: () => Unit): Self = StObject.set(x, "onZoomEnd", js.Any.fromFunction0(value))
      
      inline def setOnZoomEndUndefined: Self = StObject.set(x, "onZoomEnd", js.undefined)
      
      inline def setOnZoomStart(value: () => Unit): Self = StObject.set(x, "onZoomStart", js.Any.fromFunction0(value))
      
      inline def setOnZoomStartUndefined: Self = StObject.set(x, "onZoomStart", js.undefined)
      
      inline def setOverlayBackgroundColor(value: Double): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
      
      inline def setOverlayBoxColor(value: Double): Self = StObject.set(x, "overlayBoxColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxColorUndefined: Self = StObject.set(x, "overlayBoxColor", js.undefined)
      
      inline def setOverlayBoxImage(value: Double): Self = StObject.set(x, "overlayBoxImage", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxImageSize(value: Double): Self = StObject.set(x, "overlayBoxImageSize", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxImageSizeUndefined: Self = StObject.set(x, "overlayBoxImageSize", js.undefined)
      
      inline def setOverlayBoxImageUndefined: Self = StObject.set(x, "overlayBoxImage", js.undefined)
      
      inline def setOverlayBoxOpacity(value: Double): Self = StObject.set(x, "overlayBoxOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxOpacityUndefined: Self = StObject.set(x, "overlayBoxOpacity", js.undefined)
      
      inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      inline def setRenderOverlay(value: /* state */ Boolean => ReactNode): Self = StObject.set(x, "renderOverlay", js.Any.fromFunction1(value))
      
      inline def setRenderOverlayUndefined: Self = StObject.set(x, "renderOverlay", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  trait MagnifierProps
    extends StObject
       with CommonProps {
    
    var cursorStyleActive: js.UndefOr[String] = js.undefined
    
    var dragToMove: js.UndefOr[Boolean] = js.undefined
    
    var interactionSettings: js.UndefOr[ClickMoveLimit] = js.undefined
    
    var mouseActivation: js.UndefOr[MouseActivation] = js.undefined
    
    var touchActivation: js.UndefOr[TouchActivation] = js.undefined
  }
  object MagnifierProps {
    
    inline def apply(imageSrc: String): MagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagnifierProps]
    }
    
    extension [Self <: MagnifierProps](x: Self) {
      
      inline def setCursorStyleActive(value: String): Self = StObject.set(x, "cursorStyleActive", value.asInstanceOf[js.Any])
      
      inline def setCursorStyleActiveUndefined: Self = StObject.set(x, "cursorStyleActive", js.undefined)
      
      inline def setDragToMove(value: Boolean): Self = StObject.set(x, "dragToMove", value.asInstanceOf[js.Any])
      
      inline def setDragToMoveUndefined: Self = StObject.set(x, "dragToMove", js.undefined)
      
      inline def setInteractionSettings(value: ClickMoveLimit): Self = StObject.set(x, "interactionSettings", value.asInstanceOf[js.Any])
      
      inline def setInteractionSettingsUndefined: Self = StObject.set(x, "interactionSettings", js.undefined)
      
      inline def setMouseActivation(value: MouseActivation): Self = StObject.set(x, "mouseActivation", value.asInstanceOf[js.Any])
      
      inline def setMouseActivationUndefined: Self = StObject.set(x, "mouseActivation", js.undefined)
      
      inline def setTouchActivation(value: TouchActivation): Self = StObject.set(x, "touchActivation", value.asInstanceOf[js.Any])
      
      inline def setTouchActivationUndefined: Self = StObject.set(x, "touchActivation", js.undefined)
    }
  }
  
  trait MagnifierZoomProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var imageAlt: js.UndefOr[String] = js.undefined
    
    var imageSrc: String
    
    var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionSpeed: js.UndefOr[Double] = js.undefined
  }
  object MagnifierZoomProps {
    
    inline def apply(imageSrc: String): MagnifierZoomProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagnifierZoomProps]
    }
    
    extension [Self <: MagnifierZoomProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      inline def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.click
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleClick
  */
  trait MouseActivation extends StObject
  object MouseActivation {
    
    inline def click: typings.reactImageMagnifiers.reactImageMagnifiersStrings.click = "click".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.click]
    
    inline def doubleClick: typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleClick = "doubleClick".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleClick]
  }
  
  trait PictureInPictureMagnifierProps
    extends StObject
       with CommonProps {
    
    var cursorStyleActive: js.UndefOr[String] = js.undefined
    
    var previewHorizontalPos: js.UndefOr[left | right] = js.undefined
    
    var previewOpacity: js.UndefOr[Double] = js.undefined
    
    var previewOverlayBackgroundColor: js.UndefOr[String] = js.undefined
    
    var previewOverlayBoxColor: js.UndefOr[String] = js.undefined
    
    var previewOverlayBoxImage: js.UndefOr[String] = js.undefined
    
    var previewOverlayBoxImageSize: js.UndefOr[String] = js.undefined
    
    var previewOverlayBoxOpacity: js.UndefOr[Double] = js.undefined
    
    var previewOverlayOpacity: js.UndefOr[Double] = js.undefined
    
    var previewSizePercentage: js.UndefOr[Double] = js.undefined
    
    var previewVerticalPos: js.UndefOr[top | bottom] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var shadowColor: js.UndefOr[String] = js.undefined
  }
  object PictureInPictureMagnifierProps {
    
    inline def apply(imageSrc: String): PictureInPictureMagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[PictureInPictureMagnifierProps]
    }
    
    extension [Self <: PictureInPictureMagnifierProps](x: Self) {
      
      inline def setCursorStyleActive(value: String): Self = StObject.set(x, "cursorStyleActive", value.asInstanceOf[js.Any])
      
      inline def setCursorStyleActiveUndefined: Self = StObject.set(x, "cursorStyleActive", js.undefined)
      
      inline def setPreviewHorizontalPos(value: left | right): Self = StObject.set(x, "previewHorizontalPos", value.asInstanceOf[js.Any])
      
      inline def setPreviewHorizontalPosUndefined: Self = StObject.set(x, "previewHorizontalPos", js.undefined)
      
      inline def setPreviewOpacity(value: Double): Self = StObject.set(x, "previewOpacity", value.asInstanceOf[js.Any])
      
      inline def setPreviewOpacityUndefined: Self = StObject.set(x, "previewOpacity", js.undefined)
      
      inline def setPreviewOverlayBackgroundColor(value: String): Self = StObject.set(x, "previewOverlayBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setPreviewOverlayBackgroundColorUndefined: Self = StObject.set(x, "previewOverlayBackgroundColor", js.undefined)
      
      inline def setPreviewOverlayBoxColor(value: String): Self = StObject.set(x, "previewOverlayBoxColor", value.asInstanceOf[js.Any])
      
      inline def setPreviewOverlayBoxColorUndefined: Self = StObject.set(x, "previewOverlayBoxColor", js.undefined)
      
      inline def setPreviewOverlayBoxImage(value: String): Self = StObject.set(x, "previewOverlayBoxImage", value.asInstanceOf[js.Any])
      
      inline def setPreviewOverlayBoxImageSize(value: String): Self = StObject.set(x, "previewOverlayBoxImageSize", value.asInstanceOf[js.Any])
      
      inline def setPreviewOverlayBoxImageSizeUndefined: Self = StObject.set(x, "previewOverlayBoxImageSize", js.undefined)
      
      inline def setPreviewOverlayBoxImageUndefined: Self = StObject.set(x, "previewOverlayBoxImage", js.undefined)
      
      inline def setPreviewOverlayBoxOpacity(value: Double): Self = StObject.set(x, "previewOverlayBoxOpacity", value.asInstanceOf[js.Any])
      
      inline def setPreviewOverlayBoxOpacityUndefined: Self = StObject.set(x, "previewOverlayBoxOpacity", js.undefined)
      
      inline def setPreviewOverlayOpacity(value: Double): Self = StObject.set(x, "previewOverlayOpacity", value.asInstanceOf[js.Any])
      
      inline def setPreviewOverlayOpacityUndefined: Self = StObject.set(x, "previewOverlayOpacity", js.undefined)
      
      inline def setPreviewSizePercentage(value: Double): Self = StObject.set(x, "previewSizePercentage", value.asInstanceOf[js.Any])
      
      inline def setPreviewSizePercentageUndefined: Self = StObject.set(x, "previewSizePercentage", js.undefined)
      
      inline def setPreviewVerticalPos(value: top | bottom): Self = StObject.set(x, "previewVerticalPos", value.asInstanceOf[js.Any])
      
      inline def setPreviewVerticalPosUndefined: Self = StObject.set(x, "previewVerticalPos", js.undefined)
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    }
  }
  
  trait SideBySideMagnifierProps
    extends StObject
       with CommonProps {
    
    var alwaysInPlace: js.UndefOr[Boolean] = js.undefined
    
    var fillAlignTop: js.UndefOr[Boolean] = js.undefined
    
    var fillAvailableSpace: js.UndefOr[Boolean] = js.undefined
    
    var fillGapBottom: js.UndefOr[Double] = js.undefined
    
    var fillGapLeft: js.UndefOr[Double] = js.undefined
    
    var fillGapRight: js.UndefOr[Double] = js.undefined
    
    var fillGapTop: js.UndefOr[Double] = js.undefined
    
    var inPlaceMinBreakpoint: js.UndefOr[Double] = js.undefined
    
    var overlayBackgroundColor: js.UndefOr[String] = js.undefined
    
    var overlayBoxColor: js.UndefOr[String] = js.undefined
    
    var overlayBoxImage: js.UndefOr[String] = js.undefined
    
    var overlayBoxImageSize: js.UndefOr[String] = js.undefined
    
    var overlayBoxOpacity: js.UndefOr[Double] = js.undefined
    
    var overlayOpacity: js.UndefOr[Double] = js.undefined
    
    var switchSides: js.UndefOr[Boolean] = js.undefined
    
    var transitionSpeed: js.UndefOr[Double] = js.undefined
    
    var transitionSpeedInPlace: js.UndefOr[Double] = js.undefined
    
    var zoomContainerBorder: js.UndefOr[String] = js.undefined
    
    var zoomContainerBoxShadow: js.UndefOr[String] = js.undefined
  }
  object SideBySideMagnifierProps {
    
    inline def apply(imageSrc: String): SideBySideMagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideBySideMagnifierProps]
    }
    
    extension [Self <: SideBySideMagnifierProps](x: Self) {
      
      inline def setAlwaysInPlace(value: Boolean): Self = StObject.set(x, "alwaysInPlace", value.asInstanceOf[js.Any])
      
      inline def setAlwaysInPlaceUndefined: Self = StObject.set(x, "alwaysInPlace", js.undefined)
      
      inline def setFillAlignTop(value: Boolean): Self = StObject.set(x, "fillAlignTop", value.asInstanceOf[js.Any])
      
      inline def setFillAlignTopUndefined: Self = StObject.set(x, "fillAlignTop", js.undefined)
      
      inline def setFillAvailableSpace(value: Boolean): Self = StObject.set(x, "fillAvailableSpace", value.asInstanceOf[js.Any])
      
      inline def setFillAvailableSpaceUndefined: Self = StObject.set(x, "fillAvailableSpace", js.undefined)
      
      inline def setFillGapBottom(value: Double): Self = StObject.set(x, "fillGapBottom", value.asInstanceOf[js.Any])
      
      inline def setFillGapBottomUndefined: Self = StObject.set(x, "fillGapBottom", js.undefined)
      
      inline def setFillGapLeft(value: Double): Self = StObject.set(x, "fillGapLeft", value.asInstanceOf[js.Any])
      
      inline def setFillGapLeftUndefined: Self = StObject.set(x, "fillGapLeft", js.undefined)
      
      inline def setFillGapRight(value: Double): Self = StObject.set(x, "fillGapRight", value.asInstanceOf[js.Any])
      
      inline def setFillGapRightUndefined: Self = StObject.set(x, "fillGapRight", js.undefined)
      
      inline def setFillGapTop(value: Double): Self = StObject.set(x, "fillGapTop", value.asInstanceOf[js.Any])
      
      inline def setFillGapTopUndefined: Self = StObject.set(x, "fillGapTop", js.undefined)
      
      inline def setInPlaceMinBreakpoint(value: Double): Self = StObject.set(x, "inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setInPlaceMinBreakpointUndefined: Self = StObject.set(x, "inPlaceMinBreakpoint", js.undefined)
      
      inline def setOverlayBackgroundColor(value: String): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
      
      inline def setOverlayBoxColor(value: String): Self = StObject.set(x, "overlayBoxColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxColorUndefined: Self = StObject.set(x, "overlayBoxColor", js.undefined)
      
      inline def setOverlayBoxImage(value: String): Self = StObject.set(x, "overlayBoxImage", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxImageSize(value: String): Self = StObject.set(x, "overlayBoxImageSize", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxImageSizeUndefined: Self = StObject.set(x, "overlayBoxImageSize", js.undefined)
      
      inline def setOverlayBoxImageUndefined: Self = StObject.set(x, "overlayBoxImage", js.undefined)
      
      inline def setOverlayBoxOpacity(value: Double): Self = StObject.set(x, "overlayBoxOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayBoxOpacityUndefined: Self = StObject.set(x, "overlayBoxOpacity", js.undefined)
      
      inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      inline def setSwitchSides(value: Boolean): Self = StObject.set(x, "switchSides", value.asInstanceOf[js.Any])
      
      inline def setSwitchSidesUndefined: Self = StObject.set(x, "switchSides", js.undefined)
      
      inline def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedInPlace(value: Double): Self = StObject.set(x, "transitionSpeedInPlace", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedInPlaceUndefined: Self = StObject.set(x, "transitionSpeedInPlace", js.undefined)
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
      
      inline def setZoomContainerBorder(value: String): Self = StObject.set(x, "zoomContainerBorder", value.asInstanceOf[js.Any])
      
      inline def setZoomContainerBorderUndefined: Self = StObject.set(x, "zoomContainerBorder", js.undefined)
      
      inline def setZoomContainerBoxShadow(value: String): Self = StObject.set(x, "zoomContainerBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setZoomContainerBoxShadowUndefined: Self = StObject.set(x, "zoomContainerBoxShadow", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.tap
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleTap
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.longTouch
  */
  trait TouchActivation extends StObject
  object TouchActivation {
    
    inline def doubleTap: typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleTap = "doubleTap".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleTap]
    
    inline def longTouch: typings.reactImageMagnifiers.reactImageMagnifiersStrings.longTouch = "longTouch".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.longTouch]
    
    inline def tap: typings.reactImageMagnifiers.reactImageMagnifiersStrings.tap = "tap".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.tap]
  }
}

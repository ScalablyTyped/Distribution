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
import scala.scalajs.js.`|`
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
    @scala.inline
    def CLICK_=(x: MouseActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
    
    @JSImport("react-image-magnifiers", "MOUSE_ACTIVATION.DOUBLE_CLICK")
    @js.native
    def DOUBLE_CLICK: MouseActivation = js.native
    @scala.inline
    def DOUBLE_CLICK_=(x: MouseActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_CLICK")(x.asInstanceOf[js.Any])
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
    @scala.inline
    def DOUBLE_TAP_=(x: TouchActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP")(x.asInstanceOf[js.Any])
    
    @JSImport("react-image-magnifiers", "TOUCH_ACTIVATION.LONG_TOUCH")
    @js.native
    def LONG_TOUCH: TouchActivation = js.native
    @scala.inline
    def LONG_TOUCH_=(x: TouchActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG_TOUCH")(x.asInstanceOf[js.Any])
    
    @JSImport("react-image-magnifiers", "TOUCH_ACTIVATION.TAP")
    @js.native
    def TAP: TouchActivation = js.native
    @scala.inline
    def TAP_=(x: TouchActivation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAP")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CommonProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var cursorStyle: js.UndefOr[String] = js.native
    
    var imageAlt: js.UndefOr[String] = js.native
    
    var imageSrc: String = js.native
    
    var largeImageSrc: js.UndefOr[String] = js.native
    
    var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CommonProps {
    
    @scala.inline
    def apply(imageSrc: String): CommonProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursorStyle(value: String): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
      
      @scala.inline
      def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      @scala.inline
      def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageSrc(value: String): Self = StObject.set(x, "largeImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageSrcUndefined: Self = StObject.set(x, "largeImageSrc", js.undefined)
      
      @scala.inline
      def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      @scala.inline
      def setOnLargeImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onLargeImageLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLargeImageLoadUndefined: Self = StObject.set(x, "onLargeImageLoad", js.undefined)
      
      @scala.inline
      def setOnZoomEnd(value: () => Unit): Self = StObject.set(x, "onZoomEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnZoomEndUndefined: Self = StObject.set(x, "onZoomEnd", js.undefined)
      
      @scala.inline
      def setOnZoomStart(value: () => Unit): Self = StObject.set(x, "onZoomStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnZoomStartUndefined: Self = StObject.set(x, "onZoomStart", js.undefined)
      
      @scala.inline
      def setRenderOverlay(value: /* state */ Boolean => ReactNode): Self = StObject.set(x, "renderOverlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderOverlayUndefined: Self = StObject.set(x, "renderOverlay", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait GlassMagnifierProps extends CommonProps {
    
    var allowOverflow: js.UndefOr[Boolean] = js.native
    
    var magnifierBackgroundColor: js.UndefOr[String] = js.native
    
    var magnifierBorderColor: js.UndefOr[String] = js.native
    
    var magnifierBorderSize: js.UndefOr[Double] = js.native
    
    var magnifierOffsetX: js.UndefOr[Double] = js.native
    
    var magnifierOffsetY: js.UndefOr[Double] = js.native
    
    var magnifierSize: js.UndefOr[String | Double] = js.native
    
    var square: js.UndefOr[Boolean] = js.native
  }
  object GlassMagnifierProps {
    
    @scala.inline
    def apply(imageSrc: String): GlassMagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlassMagnifierProps]
    }
    
    @scala.inline
    implicit class GlassMagnifierPropsMutableBuilder[Self <: GlassMagnifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
      
      @scala.inline
      def setMagnifierBackgroundColor(value: String): Self = StObject.set(x, "magnifierBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifierBackgroundColorUndefined: Self = StObject.set(x, "magnifierBackgroundColor", js.undefined)
      
      @scala.inline
      def setMagnifierBorderColor(value: String): Self = StObject.set(x, "magnifierBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifierBorderColorUndefined: Self = StObject.set(x, "magnifierBorderColor", js.undefined)
      
      @scala.inline
      def setMagnifierBorderSize(value: Double): Self = StObject.set(x, "magnifierBorderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifierBorderSizeUndefined: Self = StObject.set(x, "magnifierBorderSize", js.undefined)
      
      @scala.inline
      def setMagnifierOffsetX(value: Double): Self = StObject.set(x, "magnifierOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifierOffsetXUndefined: Self = StObject.set(x, "magnifierOffsetX", js.undefined)
      
      @scala.inline
      def setMagnifierOffsetY(value: Double): Self = StObject.set(x, "magnifierOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifierOffsetYUndefined: Self = StObject.set(x, "magnifierOffsetY", js.undefined)
      
      @scala.inline
      def setMagnifierSize(value: String | Double): Self = StObject.set(x, "magnifierSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifierSizeUndefined: Self = StObject.set(x, "magnifierSize", js.undefined)
      
      @scala.inline
      def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
  
  @js.native
  trait MagnifierContainerProps extends StObject {
    
    var autoInPlace: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var inPlaceMinBreakpoint: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[String] = js.native
  }
  object MagnifierContainerProps {
    
    @scala.inline
    def apply(): MagnifierContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MagnifierContainerProps]
    }
    
    @scala.inline
    implicit class MagnifierContainerPropsMutableBuilder[Self <: MagnifierContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoInPlace(value: Boolean): Self = StObject.set(x, "autoInPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoInPlaceUndefined: Self = StObject.set(x, "autoInPlace", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setInPlaceMinBreakpoint(value: Double): Self = StObject.set(x, "inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInPlaceMinBreakpointUndefined: Self = StObject.set(x, "inPlaceMinBreakpoint", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait MagnifierPreviewProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var cursorStyle: js.UndefOr[String] = js.native
    
    var imageAlt: js.UndefOr[String] = js.native
    
    var imageSrc: String = js.native
    
    var largeImageSrc: js.UndefOr[String] = js.native
    
    var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var overlayBackgroundColor: js.UndefOr[Double] = js.native
    
    var overlayBoxColor: js.UndefOr[Double] = js.native
    
    var overlayBoxImage: js.UndefOr[Double] = js.native
    
    var overlayBoxImageSize: js.UndefOr[Double] = js.native
    
    var overlayBoxOpacity: js.UndefOr[Double] = js.native
    
    var overlayOpacity: js.UndefOr[Double] = js.native
    
    var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionSpeed: js.UndefOr[Double] = js.native
  }
  object MagnifierPreviewProps {
    
    @scala.inline
    def apply(imageSrc: String): MagnifierPreviewProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagnifierPreviewProps]
    }
    
    @scala.inline
    implicit class MagnifierPreviewPropsMutableBuilder[Self <: MagnifierPreviewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursorStyle(value: String): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
      
      @scala.inline
      def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      @scala.inline
      def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageSrc(value: String): Self = StObject.set(x, "largeImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageSrcUndefined: Self = StObject.set(x, "largeImageSrc", js.undefined)
      
      @scala.inline
      def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      @scala.inline
      def setOnLargeImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onLargeImageLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLargeImageLoadUndefined: Self = StObject.set(x, "onLargeImageLoad", js.undefined)
      
      @scala.inline
      def setOnZoomEnd(value: () => Unit): Self = StObject.set(x, "onZoomEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnZoomEndUndefined: Self = StObject.set(x, "onZoomEnd", js.undefined)
      
      @scala.inline
      def setOnZoomStart(value: () => Unit): Self = StObject.set(x, "onZoomStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnZoomStartUndefined: Self = StObject.set(x, "onZoomStart", js.undefined)
      
      @scala.inline
      def setOverlayBackgroundColor(value: Double): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
      
      @scala.inline
      def setOverlayBoxColor(value: Double): Self = StObject.set(x, "overlayBoxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxColorUndefined: Self = StObject.set(x, "overlayBoxColor", js.undefined)
      
      @scala.inline
      def setOverlayBoxImage(value: Double): Self = StObject.set(x, "overlayBoxImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxImageSize(value: Double): Self = StObject.set(x, "overlayBoxImageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxImageSizeUndefined: Self = StObject.set(x, "overlayBoxImageSize", js.undefined)
      
      @scala.inline
      def setOverlayBoxImageUndefined: Self = StObject.set(x, "overlayBoxImage", js.undefined)
      
      @scala.inline
      def setOverlayBoxOpacity(value: Double): Self = StObject.set(x, "overlayBoxOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxOpacityUndefined: Self = StObject.set(x, "overlayBoxOpacity", js.undefined)
      
      @scala.inline
      def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      @scala.inline
      def setRenderOverlay(value: /* state */ Boolean => ReactNode): Self = StObject.set(x, "renderOverlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderOverlayUndefined: Self = StObject.set(x, "renderOverlay", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  @js.native
  trait MagnifierProps extends CommonProps {
    
    var cursorStyleActive: js.UndefOr[String] = js.native
    
    var dragToMove: js.UndefOr[Boolean] = js.native
    
    var interactionSettings: js.UndefOr[ClickMoveLimit] = js.native
    
    var mouseActivation: js.UndefOr[MouseActivation] = js.native
    
    var touchActivation: js.UndefOr[TouchActivation] = js.native
  }
  object MagnifierProps {
    
    @scala.inline
    def apply(imageSrc: String): MagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagnifierProps]
    }
    
    @scala.inline
    implicit class MagnifierPropsMutableBuilder[Self <: MagnifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursorStyleActive(value: String): Self = StObject.set(x, "cursorStyleActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStyleActiveUndefined: Self = StObject.set(x, "cursorStyleActive", js.undefined)
      
      @scala.inline
      def setDragToMove(value: Boolean): Self = StObject.set(x, "dragToMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragToMoveUndefined: Self = StObject.set(x, "dragToMove", js.undefined)
      
      @scala.inline
      def setInteractionSettings(value: ClickMoveLimit): Self = StObject.set(x, "interactionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionSettingsUndefined: Self = StObject.set(x, "interactionSettings", js.undefined)
      
      @scala.inline
      def setMouseActivation(value: MouseActivation): Self = StObject.set(x, "mouseActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseActivationUndefined: Self = StObject.set(x, "mouseActivation", js.undefined)
      
      @scala.inline
      def setTouchActivation(value: TouchActivation): Self = StObject.set(x, "touchActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchActivationUndefined: Self = StObject.set(x, "touchActivation", js.undefined)
    }
  }
  
  @js.native
  trait MagnifierZoomProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var imageAlt: js.UndefOr[String] = js.native
    
    var imageSrc: String = js.native
    
    var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionSpeed: js.UndefOr[Double] = js.native
  }
  object MagnifierZoomProps {
    
    @scala.inline
    def apply(imageSrc: String): MagnifierZoomProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[MagnifierZoomProps]
    }
    
    @scala.inline
    implicit class MagnifierZoomPropsMutableBuilder[Self <: MagnifierZoomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      @scala.inline
      def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.click
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleClick
  */
  trait MouseActivation extends StObject
  object MouseActivation {
    
    @scala.inline
    def click: typings.reactImageMagnifiers.reactImageMagnifiersStrings.click = "click".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.click]
    
    @scala.inline
    def doubleClick: typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleClick = "doubleClick".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleClick]
  }
  
  @js.native
  trait PictureInPictureMagnifierProps extends CommonProps {
    
    var cursorStyleActive: js.UndefOr[String] = js.native
    
    var previewHorizontalPos: js.UndefOr[left | right] = js.native
    
    var previewOpacity: js.UndefOr[Double] = js.native
    
    var previewOverlayBackgroundColor: js.UndefOr[String] = js.native
    
    var previewOverlayBoxColor: js.UndefOr[String] = js.native
    
    var previewOverlayBoxImage: js.UndefOr[String] = js.native
    
    var previewOverlayBoxImageSize: js.UndefOr[String] = js.native
    
    var previewOverlayBoxOpacity: js.UndefOr[Double] = js.native
    
    var previewOverlayOpacity: js.UndefOr[Double] = js.native
    
    var previewSizePercentage: js.UndefOr[Double] = js.native
    
    var previewVerticalPos: js.UndefOr[top | bottom] = js.native
    
    var shadow: js.UndefOr[Boolean] = js.native
    
    var shadowColor: js.UndefOr[String] = js.native
  }
  object PictureInPictureMagnifierProps {
    
    @scala.inline
    def apply(imageSrc: String): PictureInPictureMagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[PictureInPictureMagnifierProps]
    }
    
    @scala.inline
    implicit class PictureInPictureMagnifierPropsMutableBuilder[Self <: PictureInPictureMagnifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursorStyleActive(value: String): Self = StObject.set(x, "cursorStyleActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStyleActiveUndefined: Self = StObject.set(x, "cursorStyleActive", js.undefined)
      
      @scala.inline
      def setPreviewHorizontalPos(value: left | right): Self = StObject.set(x, "previewHorizontalPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewHorizontalPosUndefined: Self = StObject.set(x, "previewHorizontalPos", js.undefined)
      
      @scala.inline
      def setPreviewOpacity(value: Double): Self = StObject.set(x, "previewOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOpacityUndefined: Self = StObject.set(x, "previewOpacity", js.undefined)
      
      @scala.inline
      def setPreviewOverlayBackgroundColor(value: String): Self = StObject.set(x, "previewOverlayBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOverlayBackgroundColorUndefined: Self = StObject.set(x, "previewOverlayBackgroundColor", js.undefined)
      
      @scala.inline
      def setPreviewOverlayBoxColor(value: String): Self = StObject.set(x, "previewOverlayBoxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOverlayBoxColorUndefined: Self = StObject.set(x, "previewOverlayBoxColor", js.undefined)
      
      @scala.inline
      def setPreviewOverlayBoxImage(value: String): Self = StObject.set(x, "previewOverlayBoxImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOverlayBoxImageSize(value: String): Self = StObject.set(x, "previewOverlayBoxImageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOverlayBoxImageSizeUndefined: Self = StObject.set(x, "previewOverlayBoxImageSize", js.undefined)
      
      @scala.inline
      def setPreviewOverlayBoxImageUndefined: Self = StObject.set(x, "previewOverlayBoxImage", js.undefined)
      
      @scala.inline
      def setPreviewOverlayBoxOpacity(value: Double): Self = StObject.set(x, "previewOverlayBoxOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOverlayBoxOpacityUndefined: Self = StObject.set(x, "previewOverlayBoxOpacity", js.undefined)
      
      @scala.inline
      def setPreviewOverlayOpacity(value: Double): Self = StObject.set(x, "previewOverlayOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOverlayOpacityUndefined: Self = StObject.set(x, "previewOverlayOpacity", js.undefined)
      
      @scala.inline
      def setPreviewSizePercentage(value: Double): Self = StObject.set(x, "previewSizePercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewSizePercentageUndefined: Self = StObject.set(x, "previewSizePercentage", js.undefined)
      
      @scala.inline
      def setPreviewVerticalPos(value: top | bottom): Self = StObject.set(x, "previewVerticalPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewVerticalPosUndefined: Self = StObject.set(x, "previewVerticalPos", js.undefined)
      
      @scala.inline
      def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    }
  }
  
  @js.native
  trait SideBySideMagnifierProps extends CommonProps {
    
    var alwaysInPlace: js.UndefOr[Boolean] = js.native
    
    var fillAlignTop: js.UndefOr[Boolean] = js.native
    
    var fillAvailableSpace: js.UndefOr[Boolean] = js.native
    
    var fillGapBottom: js.UndefOr[Double] = js.native
    
    var fillGapLeft: js.UndefOr[Double] = js.native
    
    var fillGapRight: js.UndefOr[Double] = js.native
    
    var fillGapTop: js.UndefOr[Double] = js.native
    
    var inPlaceMinBreakpoint: js.UndefOr[Double] = js.native
    
    var overlayBackgroundColor: js.UndefOr[String] = js.native
    
    var overlayBoxColor: js.UndefOr[String] = js.native
    
    var overlayBoxImage: js.UndefOr[String] = js.native
    
    var overlayBoxImageSize: js.UndefOr[String] = js.native
    
    var overlayBoxOpacity: js.UndefOr[Double] = js.native
    
    var overlayOpacity: js.UndefOr[Double] = js.native
    
    var switchSides: js.UndefOr[Boolean] = js.native
    
    var transitionSpeed: js.UndefOr[Double] = js.native
    
    var transitionSpeedInPlace: js.UndefOr[Double] = js.native
    
    var zoomContainerBorder: js.UndefOr[String] = js.native
    
    var zoomContainerBoxShadow: js.UndefOr[String] = js.native
  }
  object SideBySideMagnifierProps {
    
    @scala.inline
    def apply(imageSrc: String): SideBySideMagnifierProps = {
      val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideBySideMagnifierProps]
    }
    
    @scala.inline
    implicit class SideBySideMagnifierPropsMutableBuilder[Self <: SideBySideMagnifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysInPlace(value: Boolean): Self = StObject.set(x, "alwaysInPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysInPlaceUndefined: Self = StObject.set(x, "alwaysInPlace", js.undefined)
      
      @scala.inline
      def setFillAlignTop(value: Boolean): Self = StObject.set(x, "fillAlignTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAlignTopUndefined: Self = StObject.set(x, "fillAlignTop", js.undefined)
      
      @scala.inline
      def setFillAvailableSpace(value: Boolean): Self = StObject.set(x, "fillAvailableSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAvailableSpaceUndefined: Self = StObject.set(x, "fillAvailableSpace", js.undefined)
      
      @scala.inline
      def setFillGapBottom(value: Double): Self = StObject.set(x, "fillGapBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillGapBottomUndefined: Self = StObject.set(x, "fillGapBottom", js.undefined)
      
      @scala.inline
      def setFillGapLeft(value: Double): Self = StObject.set(x, "fillGapLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillGapLeftUndefined: Self = StObject.set(x, "fillGapLeft", js.undefined)
      
      @scala.inline
      def setFillGapRight(value: Double): Self = StObject.set(x, "fillGapRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillGapRightUndefined: Self = StObject.set(x, "fillGapRight", js.undefined)
      
      @scala.inline
      def setFillGapTop(value: Double): Self = StObject.set(x, "fillGapTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillGapTopUndefined: Self = StObject.set(x, "fillGapTop", js.undefined)
      
      @scala.inline
      def setInPlaceMinBreakpoint(value: Double): Self = StObject.set(x, "inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInPlaceMinBreakpointUndefined: Self = StObject.set(x, "inPlaceMinBreakpoint", js.undefined)
      
      @scala.inline
      def setOverlayBackgroundColor(value: String): Self = StObject.set(x, "overlayBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBackgroundColorUndefined: Self = StObject.set(x, "overlayBackgroundColor", js.undefined)
      
      @scala.inline
      def setOverlayBoxColor(value: String): Self = StObject.set(x, "overlayBoxColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxColorUndefined: Self = StObject.set(x, "overlayBoxColor", js.undefined)
      
      @scala.inline
      def setOverlayBoxImage(value: String): Self = StObject.set(x, "overlayBoxImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxImageSize(value: String): Self = StObject.set(x, "overlayBoxImageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxImageSizeUndefined: Self = StObject.set(x, "overlayBoxImageSize", js.undefined)
      
      @scala.inline
      def setOverlayBoxImageUndefined: Self = StObject.set(x, "overlayBoxImage", js.undefined)
      
      @scala.inline
      def setOverlayBoxOpacity(value: Double): Self = StObject.set(x, "overlayBoxOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayBoxOpacityUndefined: Self = StObject.set(x, "overlayBoxOpacity", js.undefined)
      
      @scala.inline
      def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      @scala.inline
      def setSwitchSides(value: Boolean): Self = StObject.set(x, "switchSides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchSidesUndefined: Self = StObject.set(x, "switchSides", js.undefined)
      
      @scala.inline
      def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedInPlace(value: Double): Self = StObject.set(x, "transitionSpeedInPlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedInPlaceUndefined: Self = StObject.set(x, "transitionSpeedInPlace", js.undefined)
      
      @scala.inline
      def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
      
      @scala.inline
      def setZoomContainerBorder(value: String): Self = StObject.set(x, "zoomContainerBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomContainerBorderUndefined: Self = StObject.set(x, "zoomContainerBorder", js.undefined)
      
      @scala.inline
      def setZoomContainerBoxShadow(value: String): Self = StObject.set(x, "zoomContainerBoxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomContainerBoxShadowUndefined: Self = StObject.set(x, "zoomContainerBoxShadow", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.tap
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleTap
    - typings.reactImageMagnifiers.reactImageMagnifiersStrings.longTouch
  */
  trait TouchActivation extends StObject
  object TouchActivation {
    
    @scala.inline
    def doubleTap: typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleTap = "doubleTap".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.doubleTap]
    
    @scala.inline
    def longTouch: typings.reactImageMagnifiers.reactImageMagnifiersStrings.longTouch = "longTouch".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.longTouch]
    
    @scala.inline
    def tap: typings.reactImageMagnifiers.reactImageMagnifiersStrings.tap = "tap".asInstanceOf[typings.reactImageMagnifiers.reactImageMagnifiersStrings.tap]
  }
}

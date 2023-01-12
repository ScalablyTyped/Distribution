package typings.reactImages

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactImages.anon.Blanket
import typings.reactImages.anon.Download
import typings.reactImages.anon.Props
import typings.reactImages.reactImagesBooleans.`false`
import typings.reactImages.reactImagesStrings.auto
import typings.reactImages.reactImagesStrings.height
import typings.reactImages.reactImagesStrings.mouse
import typings.reactImages.reactImagesStrings.touch
import typings.reactImages.reactImagesStrings.width
import typings.reactImages.reactImagesStrings.x
import typings.reactImages.reactImagesStrings.y
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-images", JSImport.Default)
  @js.native
  val default: ComponentType[CarouselProps] = js.native
  
  @JSImport("react-images", "Modal")
  @js.native
  val Modal: ComponentType[ModalProps] = js.native
  
  @JSImport("react-images", "ModalGateway")
  @js.native
  val ModalGateway: ComponentType[js.Object] = js.native
  
  trait CarouselModalProps extends StObject {
    
    var allowFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var isFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLButtonElement, Event], Unit]] = js.undefined
    
    var toggleFullscreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object CarouselModalProps {
    
    inline def apply(): CarouselModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselModalProps] (val x: Self) extends AnyVal {
      
      inline def setAllowFullscreen(value: Boolean): Self = StObject.set(x, "allowFullscreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullscreenUndefined: Self = StObject.set(x, "allowFullscreen", js.undefined)
      
      inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
      
      inline def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
      
      inline def setOnClose(value: /* event */ SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setToggleFullscreen(value: () => Unit): Self = StObject.set(x, "toggleFullscreen", js.Any.fromFunction0(value))
      
      inline def setToggleFullscreenUndefined: Self = StObject.set(x, "toggleFullscreen", js.undefined)
    }
  }
  
  trait CarouselProps extends StObject {
    
    var components: js.UndefOr[Components] = js.undefined
    
    var currentIndex: js.UndefOr[Double] = js.undefined
    
    var formatters: js.UndefOr[Formatters] = js.undefined
    
    var frameProps: js.UndefOr[FrameProps] = js.undefined
    
    var hideControlsWhenIdle: js.UndefOr[Double | `false`] = js.undefined
    
    var modalProps: js.UndefOr[CarouselModalProps] = js.undefined
    
    var styles: js.UndefOr[CarouselStyles] = js.undefined
    
    var trackProps: js.UndefOr[TrackProps] = js.undefined
    
    var views: js.Array[ViewType]
  }
  object CarouselProps {
    
    inline def apply(views: js.Array[ViewType]): CarouselProps = {
      val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndexUndefined: Self = StObject.set(x, "currentIndex", js.undefined)
      
      inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setFrameProps(value: FrameProps): Self = StObject.set(x, "frameProps", value.asInstanceOf[js.Any])
      
      inline def setFramePropsUndefined: Self = StObject.set(x, "frameProps", js.undefined)
      
      inline def setHideControlsWhenIdle(value: Double | `false`): Self = StObject.set(x, "hideControlsWhenIdle", value.asInstanceOf[js.Any])
      
      inline def setHideControlsWhenIdleUndefined: Self = StObject.set(x, "hideControlsWhenIdle", js.undefined)
      
      inline def setModalProps(value: CarouselModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
      
      inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
      
      inline def setStyles(value: CarouselStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTrackProps(value: TrackProps): Self = StObject.set(x, "trackProps", value.asInstanceOf[js.Any])
      
      inline def setTrackPropsUndefined: Self = StObject.set(x, "trackProps", js.undefined)
      
      inline def setViews(value: js.Array[ViewType]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsVarargs(value: ViewType*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
  
  trait CarouselState extends StObject {
    
    var interactionIsIdle: js.UndefOr[Boolean] = js.undefined
    
    var isFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var isModal: js.UndefOr[Boolean] = js.undefined
  }
  object CarouselState {
    
    inline def apply(): CarouselState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselState] (val x: Self) extends AnyVal {
      
      inline def setInteractionIsIdle(value: Boolean): Self = StObject.set(x, "interactionIsIdle", value.asInstanceOf[js.Any])
      
      inline def setInteractionIsIdleUndefined: Self = StObject.set(x, "interactionIsIdle", js.undefined)
      
      inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
      
      inline def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
      
      inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
      
      inline def setIsModalUndefined: Self = StObject.set(x, "isModal", js.undefined)
    }
  }
  
  trait CarouselStyles extends StObject {
    
    var container: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var footer: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var footerCaption: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var footerCount: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var header: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var headerClose: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var headerFullscreen: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var navigation: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var navigationNext: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var navigationPrev: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
    
    var view: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ CarouselState, CSSProperties]] = js.undefined
  }
  object CarouselStyles {
    
    inline def apply(): CarouselStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselStyles] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "container", js.Any.fromFunction2(value))
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFooter(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
      
      inline def setFooterCaption(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "footerCaption", js.Any.fromFunction2(value))
      
      inline def setFooterCaptionUndefined: Self = StObject.set(x, "footerCaption", js.undefined)
      
      inline def setFooterCount(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "footerCount", js.Any.fromFunction2(value))
      
      inline def setFooterCountUndefined: Self = StObject.set(x, "footerCount", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      inline def setHeaderClose(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "headerClose", js.Any.fromFunction2(value))
      
      inline def setHeaderCloseUndefined: Self = StObject.set(x, "headerClose", js.undefined)
      
      inline def setHeaderFullscreen(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "headerFullscreen", js.Any.fromFunction2(value))
      
      inline def setHeaderFullscreenUndefined: Self = StObject.set(x, "headerFullscreen", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setNavigation(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "navigation", js.Any.fromFunction2(value))
      
      inline def setNavigationNext(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "navigationNext", js.Any.fromFunction2(value))
      
      inline def setNavigationNextUndefined: Self = StObject.set(x, "navigationNext", js.undefined)
      
      inline def setNavigationPrev(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "navigationPrev", js.Any.fromFunction2(value))
      
      inline def setNavigationPrevUndefined: Self = StObject.set(x, "navigationPrev", js.undefined)
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setView(value: (/* base */ CSSProperties, /* state */ CarouselState) => CSSProperties): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait CommonProps extends StObject {
    
    var carouselProps: js.UndefOr[CarouselProps] = js.undefined
    
    var currentIndex: js.UndefOr[Double] = js.undefined
    
    var currentView: js.UndefOr[ViewType] = js.undefined
    
    var frameProps: js.UndefOr[FrameProps] = js.undefined
    
    var getStyles: js.UndefOr[js.Function2[/* base */ CSSProperties, /* state */ Any, CSSProperties]] = js.undefined
    
    var innerProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var interactionIsIdle: js.UndefOr[Boolean] = js.undefined
    
    var isFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var isModal: js.UndefOr[Boolean] = js.undefined
    
    var modalProps: js.UndefOr[CarouselModalProps] = js.undefined
    
    var trackProps: js.UndefOr[TrackProps] = js.undefined
    
    var views: js.UndefOr[js.Array[ViewType]] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setCarouselProps(value: CarouselProps): Self = StObject.set(x, "carouselProps", value.asInstanceOf[js.Any])
      
      inline def setCarouselPropsUndefined: Self = StObject.set(x, "carouselProps", js.undefined)
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndexUndefined: Self = StObject.set(x, "currentIndex", js.undefined)
      
      inline def setCurrentView(value: ViewType): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
      
      inline def setCurrentViewUndefined: Self = StObject.set(x, "currentView", js.undefined)
      
      inline def setFrameProps(value: FrameProps): Self = StObject.set(x, "frameProps", value.asInstanceOf[js.Any])
      
      inline def setFramePropsUndefined: Self = StObject.set(x, "frameProps", js.undefined)
      
      inline def setGetStyles(value: (/* base */ CSSProperties, /* state */ Any) => CSSProperties): Self = StObject.set(x, "getStyles", js.Any.fromFunction2(value))
      
      inline def setGetStylesUndefined: Self = StObject.set(x, "getStyles", js.undefined)
      
      inline def setInnerProps(value: StringDictionary[Any]): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      inline def setInnerPropsUndefined: Self = StObject.set(x, "innerProps", js.undefined)
      
      inline def setInteractionIsIdle(value: Boolean): Self = StObject.set(x, "interactionIsIdle", value.asInstanceOf[js.Any])
      
      inline def setInteractionIsIdleUndefined: Self = StObject.set(x, "interactionIsIdle", js.undefined)
      
      inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
      
      inline def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
      
      inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
      
      inline def setIsModalUndefined: Self = StObject.set(x, "isModal", js.undefined)
      
      inline def setModalProps(value: CarouselModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
      
      inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
      
      inline def setTrackProps(value: TrackProps): Self = StObject.set(x, "trackProps", value.asInstanceOf[js.Any])
      
      inline def setTrackPropsUndefined: Self = StObject.set(x, "trackProps", js.undefined)
      
      inline def setViews(value: js.Array[ViewType]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: ViewType*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
  
  trait Components extends StObject {
    
    var Container: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var Footer: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var FooterCaption: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var FooterCount: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var Header: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var HeaderClose: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var HeaderFullscreen: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var Navigation: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var NavigationNext: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var NavigationPrev: js.UndefOr[ComponentType[CommonProps]] = js.undefined
    
    var View: js.UndefOr[ComponentType[CommonProps]] = js.undefined
  }
  object Components {
    
    inline def apply(): Components = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Components]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: ComponentType[CommonProps]): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "Container", js.undefined)
      
      inline def setFooter(value: ComponentType[CommonProps]): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
      
      inline def setFooterCaption(value: ComponentType[CommonProps]): Self = StObject.set(x, "FooterCaption", value.asInstanceOf[js.Any])
      
      inline def setFooterCaptionUndefined: Self = StObject.set(x, "FooterCaption", js.undefined)
      
      inline def setFooterCount(value: ComponentType[CommonProps]): Self = StObject.set(x, "FooterCount", value.asInstanceOf[js.Any])
      
      inline def setFooterCountUndefined: Self = StObject.set(x, "FooterCount", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
      
      inline def setHeader(value: ComponentType[CommonProps]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClose(value: ComponentType[CommonProps]): Self = StObject.set(x, "HeaderClose", value.asInstanceOf[js.Any])
      
      inline def setHeaderCloseUndefined: Self = StObject.set(x, "HeaderClose", js.undefined)
      
      inline def setHeaderFullscreen(value: ComponentType[CommonProps]): Self = StObject.set(x, "HeaderFullscreen", value.asInstanceOf[js.Any])
      
      inline def setHeaderFullscreenUndefined: Self = StObject.set(x, "HeaderFullscreen", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
      
      inline def setNavigation(value: ComponentType[CommonProps]): Self = StObject.set(x, "Navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationNext(value: ComponentType[CommonProps]): Self = StObject.set(x, "NavigationNext", value.asInstanceOf[js.Any])
      
      inline def setNavigationNextUndefined: Self = StObject.set(x, "NavigationNext", js.undefined)
      
      inline def setNavigationPrev(value: ComponentType[CommonProps]): Self = StObject.set(x, "NavigationPrev", value.asInstanceOf[js.Any])
      
      inline def setNavigationPrevUndefined: Self = StObject.set(x, "NavigationPrev", js.undefined)
      
      inline def setNavigationUndefined: Self = StObject.set(x, "Navigation", js.undefined)
      
      inline def setView(value: ComponentType[CommonProps]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
    }
  }
  
  trait Formatters extends StObject {
    
    var getAltText: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
    
    var getCloseLabel: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
    
    var getFullscreenLabel: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
    
    var getNextLabel: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
    
    var getNextTitle: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
    
    var getPrevLabel: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
    
    var getPrevTitle: js.UndefOr[js.Function1[/* props */ CommonProps, String]] = js.undefined
  }
  object Formatters {
    
    inline def apply(): Formatters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Formatters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formatters] (val x: Self) extends AnyVal {
      
      inline def setGetAltText(value: /* props */ CommonProps => String): Self = StObject.set(x, "getAltText", js.Any.fromFunction1(value))
      
      inline def setGetAltTextUndefined: Self = StObject.set(x, "getAltText", js.undefined)
      
      inline def setGetCloseLabel(value: /* props */ CommonProps => String): Self = StObject.set(x, "getCloseLabel", js.Any.fromFunction1(value))
      
      inline def setGetCloseLabelUndefined: Self = StObject.set(x, "getCloseLabel", js.undefined)
      
      inline def setGetFullscreenLabel(value: /* props */ CommonProps => String): Self = StObject.set(x, "getFullscreenLabel", js.Any.fromFunction1(value))
      
      inline def setGetFullscreenLabelUndefined: Self = StObject.set(x, "getFullscreenLabel", js.undefined)
      
      inline def setGetNextLabel(value: /* props */ CommonProps => String): Self = StObject.set(x, "getNextLabel", js.Any.fromFunction1(value))
      
      inline def setGetNextLabelUndefined: Self = StObject.set(x, "getNextLabel", js.undefined)
      
      inline def setGetNextTitle(value: /* props */ CommonProps => String): Self = StObject.set(x, "getNextTitle", js.Any.fromFunction1(value))
      
      inline def setGetNextTitleUndefined: Self = StObject.set(x, "getNextTitle", js.undefined)
      
      inline def setGetPrevLabel(value: /* props */ CommonProps => String): Self = StObject.set(x, "getPrevLabel", js.Any.fromFunction1(value))
      
      inline def setGetPrevLabelUndefined: Self = StObject.set(x, "getPrevLabel", js.undefined)
      
      inline def setGetPrevTitle(value: /* props */ CommonProps => String): Self = StObject.set(x, "getPrevTitle", js.Any.fromFunction1(value))
      
      inline def setGetPrevTitleUndefined: Self = StObject.set(x, "getPrevTitle", js.undefined)
    }
  }
  
  trait FrameProps extends StObject {
    
    var accessibility: js.UndefOr[Boolean] = js.undefined
    
    var autoSize: js.UndefOr[Boolean | width | height] = js.undefined
    
    var springConfig: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object FrameProps {
    
    inline def apply(): FrameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FrameProps] (val x: Self) extends AnyVal {
      
      inline def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
      
      inline def setAutoSize(value: Boolean | width | height): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setSpringConfig(value: StringDictionary[Double]): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait ModalProps extends StObject {
    
    var allowFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var closeOnBackdropClick: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLButtonElement, Event], Unit]] = js.undefined
    
    var styles: js.UndefOr[Blanket] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      inline def setAllowFullscreen(value: Boolean): Self = StObject.set(x, "allowFullscreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullscreenUndefined: Self = StObject.set(x, "allowFullscreen", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseOnBackdropClick(value: Boolean): Self = StObject.set(x, "closeOnBackdropClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBackdropClickUndefined: Self = StObject.set(x, "closeOnBackdropClick", js.undefined)
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setOnClose(value: /* event */ SyntheticEvent[HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setStyles(value: Blanket): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait TrackProps extends StObject {
    
    var align: js.UndefOr[Double] = js.undefined
    
    var animations: js.UndefOr[js.Array[Props]] = js.undefined
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var contain: js.UndefOr[Boolean] = js.undefined
    
    var currentView: js.UndefOr[Any] = js.undefined
    
    var flickTimeout: js.UndefOr[Double] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var instant: js.UndefOr[Boolean] = js.undefined
    
    var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeMove: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onViewChange: js.UndefOr[js.Function1[/* view */ Double, Unit]] = js.undefined
    
    var springConfig: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var swipe: js.UndefOr[Boolean | mouse | touch] = js.undefined
    
    var swipeThreshold: js.UndefOr[Double] = js.undefined
    
    var tag: js.UndefOr[Any] = js.undefined
    
    var viewsToMove: js.UndefOr[Double] = js.undefined
    
    var viewsToShow: js.UndefOr[Double | auto] = js.undefined
  }
  object TrackProps {
    
    inline def apply(): TrackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimations(value: js.Array[Props]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      inline def setAnimationsVarargs(value: Props*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setAxis(value: typings.reactImages.reactImagesStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      inline def setCurrentView(value: Any): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
      
      inline def setCurrentViewUndefined: Self = StObject.set(x, "currentView", js.undefined)
      
      inline def setFlickTimeout(value: Double): Self = StObject.set(x, "flickTimeout", value.asInstanceOf[js.Any])
      
      inline def setFlickTimeoutUndefined: Self = StObject.set(x, "flickTimeout", js.undefined)
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      inline def setInstant(value: Boolean): Self = StObject.set(x, "instant", value.asInstanceOf[js.Any])
      
      inline def setInstantUndefined: Self = StObject.set(x, "instant", js.undefined)
      
      inline def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSwipeEnd(value: () => Unit): Self = StObject.set(x, "onSwipeEnd", js.Any.fromFunction0(value))
      
      inline def setOnSwipeEndUndefined: Self = StObject.set(x, "onSwipeEnd", js.undefined)
      
      inline def setOnSwipeMove(value: () => Unit): Self = StObject.set(x, "onSwipeMove", js.Any.fromFunction0(value))
      
      inline def setOnSwipeMoveUndefined: Self = StObject.set(x, "onSwipeMove", js.undefined)
      
      inline def setOnSwipeStart(value: () => Unit): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction0(value))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOnViewChange(value: /* view */ Double => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction1(value))
      
      inline def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      inline def setSpringConfig(value: StringDictionary[Double]): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setSwipe(value: Boolean | mouse | touch): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setViewsToMove(value: Double): Self = StObject.set(x, "viewsToMove", value.asInstanceOf[js.Any])
      
      inline def setViewsToMoveUndefined: Self = StObject.set(x, "viewsToMove", js.undefined)
      
      inline def setViewsToShow(value: Double | auto): Self = StObject.set(x, "viewsToShow", value.asInstanceOf[js.Any])
      
      inline def setViewsToShowUndefined: Self = StObject.set(x, "viewsToShow", js.undefined)
    }
  }
  
  trait ViewType extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var caption: js.UndefOr[ReactNode] = js.undefined
    
    var source: String | Download
  }
  object ViewType {
    
    inline def apply(source: String | Download): ViewType = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewType] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCaption(value: ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setSource(value: String | Download): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[CarouselProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentType[CarouselProps] = default
}

package typings.reactImageGallery

import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.reactImageGallery.anon.CurrentIndex
import typings.reactImageGallery.anon.Media
import typings.reactImageGallery.reactImageGalleryStrings.bottom
import typings.reactImageGallery.reactImageGalleryStrings.left
import typings.reactImageGallery.reactImageGalleryStrings.right
import typings.reactImageGallery.reactImageGalleryStrings.top
import typings.std.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-gallery", JSImport.Default)
  @js.native
  class default () extends ReactImageGallery
  
  @js.native
  trait ReactImageGallery
    extends Component[ReactImageGalleryProps, js.Object, js.Any] {
    
    def exitFullScreen(): Unit = js.native
    
    def fullScreen(): Unit = js.native
    
    def getCurrentIndex(): Double = js.native
    
    def pause(): Unit = js.native
    def pause(callback: Boolean): Unit = js.native
    
    def play(): Unit = js.native
    def play(callback: Boolean): Unit = js.native
    
    def slideToIndex(index: Double): Unit = js.native
  }
  
  type ReactImageGalleryImageSet = js.Array[Media]
  
  trait ReactImageGalleryItem extends StObject {
    
    var bulletClass: js.UndefOr[String] = js.undefined
    
    var bulletOnClick: js.UndefOr[js.Function1[/* hasItemItemIndexCurrentIndex */ CurrentIndex, Unit]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var fullscreen: js.UndefOr[String] = js.undefined
    
    var imageSet: js.UndefOr[ReactImageGalleryImageSet] = js.undefined
    
    var original: String
    
    var originalAlt: js.UndefOr[String] = js.undefined
    
    var originalClass: js.UndefOr[String] = js.undefined
    
    var originalTitle: js.UndefOr[String] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* item */ this.type, ReactNode]] = js.undefined
    
    var renderThumbInner: js.UndefOr[js.Function1[/* item */ this.type, ReactNode]] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
    
    var thumbnail: js.UndefOr[String] = js.undefined
    
    var thumbnailAlt: js.UndefOr[String] = js.undefined
    
    var thumbnailClass: js.UndefOr[String] = js.undefined
    
    var thumbnailLabel: js.UndefOr[String] = js.undefined
    
    var thumbnailTitle: js.UndefOr[String] = js.undefined
  }
  object ReactImageGalleryItem {
    
    @scala.inline
    def apply(original: String): ReactImageGalleryItem = {
      val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageGalleryItem]
    }
    
    @scala.inline
    implicit class ReactImageGalleryItemMutableBuilder[Self <: ReactImageGalleryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBulletClass(value: String): Self = StObject.set(x, "bulletClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletClassUndefined: Self = StObject.set(x, "bulletClass", js.undefined)
      
      @scala.inline
      def setBulletOnClick(value: /* hasItemItemIndexCurrentIndex */ CurrentIndex => Unit): Self = StObject.set(x, "bulletOnClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBulletOnClickUndefined: Self = StObject.set(x, "bulletOnClick", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFullscreen(value: String): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setImageSet(value: ReactImageGalleryImageSet): Self = StObject.set(x, "imageSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSetUndefined: Self = StObject.set(x, "imageSet", js.undefined)
      
      @scala.inline
      def setImageSetVarargs(value: Media*): Self = StObject.set(x, "imageSet", js.Array(value :_*))
      
      @scala.inline
      def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalAlt(value: String): Self = StObject.set(x, "originalAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalAltUndefined: Self = StObject.set(x, "originalAlt", js.undefined)
      
      @scala.inline
      def setOriginalClass(value: String): Self = StObject.set(x, "originalClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalClassUndefined: Self = StObject.set(x, "originalClass", js.undefined)
      
      @scala.inline
      def setOriginalTitle(value: String): Self = StObject.set(x, "originalTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalTitleUndefined: Self = StObject.set(x, "originalTitle", js.undefined)
      
      @scala.inline
      def setRenderItem(value: ReactImageGalleryItem => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setRenderThumbInner(value: ReactImageGalleryItem => ReactNode): Self = StObject.set(x, "renderThumbInner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderThumbInnerUndefined: Self = StObject.set(x, "renderThumbInner", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailAlt(value: String): Self = StObject.set(x, "thumbnailAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailAltUndefined: Self = StObject.set(x, "thumbnailAlt", js.undefined)
      
      @scala.inline
      def setThumbnailClass(value: String): Self = StObject.set(x, "thumbnailClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailClassUndefined: Self = StObject.set(x, "thumbnailClass", js.undefined)
      
      @scala.inline
      def setThumbnailLabel(value: String): Self = StObject.set(x, "thumbnailLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailLabelUndefined: Self = StObject.set(x, "thumbnailLabel", js.undefined)
      
      @scala.inline
      def setThumbnailTitle(value: String): Self = StObject.set(x, "thumbnailTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailTitleUndefined: Self = StObject.set(x, "thumbnailTitle", js.undefined)
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  trait ReactImageGalleryProps extends StObject {
    
    var additionalClass: js.UndefOr[String] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var disableKeyDown: js.UndefOr[Boolean] = js.undefined
    
    var disableSwipe: js.UndefOr[Boolean] = js.undefined
    
    var disableThumbnailScroll: js.UndefOr[Boolean] = js.undefined
    
    var flickThreshold: js.UndefOr[Double] = js.undefined
    
    var indexSeparator: js.UndefOr[String] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var isRTL: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[ReactImageGalleryItem]
    
    var lazyLoad: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.undefined
    
    var onErrorImageURL: js.UndefOr[String] = js.undefined
    
    var onImageError: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.undefined
    
    var onImageLoad: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.undefined
    
    var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onScreenChange: js.UndefOr[js.Function1[/* fullScreenElement */ Element, Unit]] = js.undefined
    
    var onSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
    
    var onThumbnailClick: js.UndefOr[
        js.Function2[/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double, Unit]
      ] = js.undefined
    
    var onThumbnailError: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.undefined
    
    var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined
    
    var renderCustomControls: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    var renderFullscreenButton: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean, ReactNode]
      ] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, ReactNode]] = js.undefined
    
    var renderLeftNav: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean, ReactNode]
      ] = js.undefined
    
    var renderPlayPauseButton: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean, ReactNode]
      ] = js.undefined
    
    var renderRightNav: js.UndefOr[
        js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean, ReactNode]
      ] = js.undefined
    
    var renderThumbInner: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, ReactNode]] = js.undefined
    
    var showBullets: js.UndefOr[Boolean] = js.undefined
    
    var showFullscreenButton: js.UndefOr[Boolean] = js.undefined
    
    var showIndex: js.UndefOr[Boolean] = js.undefined
    
    var showNav: js.UndefOr[Boolean] = js.undefined
    
    var showPlayButton: js.UndefOr[Boolean] = js.undefined
    
    var showThumbnails: js.UndefOr[Boolean] = js.undefined
    
    var slideDuration: js.UndefOr[Double] = js.undefined
    
    var slideInterval: js.UndefOr[Double] = js.undefined
    
    var slideOnThumbnailOver: js.UndefOr[Boolean] = js.undefined
    
    var startIndex: js.UndefOr[Double] = js.undefined
    
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
    
    var swipeThreshold: js.UndefOr[Double] = js.undefined
    
    var swipingTransitionDuration: js.UndefOr[Double] = js.undefined
    
    var thumbnailPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var useBrowserFullscreen: js.UndefOr[Boolean] = js.undefined
    
    var useTranslate3D: js.UndefOr[Boolean] = js.undefined
  }
  object ReactImageGalleryProps {
    
    @scala.inline
    def apply(items: js.Array[ReactImageGalleryItem]): ReactImageGalleryProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageGalleryProps]
    }
    
    @scala.inline
    implicit class ReactImageGalleryPropsMutableBuilder[Self <: ReactImageGalleryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalClass(value: String): Self = StObject.set(x, "additionalClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalClassUndefined: Self = StObject.set(x, "additionalClass", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setDisableKeyDown(value: Boolean): Self = StObject.set(x, "disableKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableKeyDownUndefined: Self = StObject.set(x, "disableKeyDown", js.undefined)
      
      @scala.inline
      def setDisableSwipe(value: Boolean): Self = StObject.set(x, "disableSwipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSwipeUndefined: Self = StObject.set(x, "disableSwipe", js.undefined)
      
      @scala.inline
      def setDisableThumbnailScroll(value: Boolean): Self = StObject.set(x, "disableThumbnailScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableThumbnailScrollUndefined: Self = StObject.set(x, "disableThumbnailScroll", js.undefined)
      
      @scala.inline
      def setFlickThreshold(value: Double): Self = StObject.set(x, "flickThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlickThresholdUndefined: Self = StObject.set(x, "flickThreshold", js.undefined)
      
      @scala.inline
      def setIndexSeparator(value: String): Self = StObject.set(x, "indexSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexSeparatorUndefined: Self = StObject.set(x, "indexSeparator", js.undefined)
      
      @scala.inline
      def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[ReactImageGalleryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ReactImageGalleryItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      @scala.inline
      def setOnBeforeSlide(value: /* currentIndex */ Double => Unit): Self = StObject.set(x, "onBeforeSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeSlideUndefined: Self = StObject.set(x, "onBeforeSlide", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnErrorImageURL(value: String): Self = StObject.set(x, "onErrorImageURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorImageURLUndefined: Self = StObject.set(x, "onErrorImageURL", js.undefined)
      
      @scala.inline
      def setOnImageError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = StObject.set(x, "onImageError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageErrorUndefined: Self = StObject.set(x, "onImageError", js.undefined)
      
      @scala.inline
      def setOnImageLoad(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnPause(value: /* currentIndex */ Double => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: /* currentIndex */ Double => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnScreenChange(value: /* fullScreenElement */ Element => Unit): Self = StObject.set(x, "onScreenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScreenChangeUndefined: Self = StObject.set(x, "onScreenChange", js.undefined)
      
      @scala.inline
      def setOnSlide(value: /* currentIndex */ Double => Unit): Self = StObject.set(x, "onSlide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSlideUndefined: Self = StObject.set(x, "onSlide", js.undefined)
      
      @scala.inline
      def setOnThumbnailClick(value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double) => Unit): Self = StObject.set(x, "onThumbnailClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnThumbnailClickUndefined: Self = StObject.set(x, "onThumbnailClick", js.undefined)
      
      @scala.inline
      def setOnThumbnailError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = StObject.set(x, "onThumbnailError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnThumbnailErrorUndefined: Self = StObject.set(x, "onThumbnailError", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultTouchmoveEventUndefined: Self = StObject.set(x, "preventDefaultTouchmoveEvent", js.undefined)
      
      @scala.inline
      def setRenderCustomControls(value: () => ReactNode): Self = StObject.set(x, "renderCustomControls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderCustomControlsUndefined: Self = StObject.set(x, "renderCustomControls", js.undefined)
      
      @scala.inline
      def setRenderFullscreenButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => ReactNode): Self = StObject.set(x, "renderFullscreenButton", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderFullscreenButtonUndefined: Self = StObject.set(x, "renderFullscreenButton", js.undefined)
      
      @scala.inline
      def setRenderItem(value: /* item */ ReactImageGalleryItem => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setRenderLeftNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => ReactNode): Self = StObject.set(x, "renderLeftNav", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderLeftNavUndefined: Self = StObject.set(x, "renderLeftNav", js.undefined)
      
      @scala.inline
      def setRenderPlayPauseButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => ReactNode): Self = StObject.set(x, "renderPlayPauseButton", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderPlayPauseButtonUndefined: Self = StObject.set(x, "renderPlayPauseButton", js.undefined)
      
      @scala.inline
      def setRenderRightNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => ReactNode): Self = StObject.set(x, "renderRightNav", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderRightNavUndefined: Self = StObject.set(x, "renderRightNav", js.undefined)
      
      @scala.inline
      def setRenderThumbInner(value: /* item */ ReactImageGalleryItem => ReactNode): Self = StObject.set(x, "renderThumbInner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderThumbInnerUndefined: Self = StObject.set(x, "renderThumbInner", js.undefined)
      
      @scala.inline
      def setShowBullets(value: Boolean): Self = StObject.set(x, "showBullets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBulletsUndefined: Self = StObject.set(x, "showBullets", js.undefined)
      
      @scala.inline
      def setShowFullscreenButton(value: Boolean): Self = StObject.set(x, "showFullscreenButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFullscreenButtonUndefined: Self = StObject.set(x, "showFullscreenButton", js.undefined)
      
      @scala.inline
      def setShowIndex(value: Boolean): Self = StObject.set(x, "showIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIndexUndefined: Self = StObject.set(x, "showIndex", js.undefined)
      
      @scala.inline
      def setShowNav(value: Boolean): Self = StObject.set(x, "showNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavUndefined: Self = StObject.set(x, "showNav", js.undefined)
      
      @scala.inline
      def setShowPlayButton(value: Boolean): Self = StObject.set(x, "showPlayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPlayButtonUndefined: Self = StObject.set(x, "showPlayButton", js.undefined)
      
      @scala.inline
      def setShowThumbnails(value: Boolean): Self = StObject.set(x, "showThumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowThumbnailsUndefined: Self = StObject.set(x, "showThumbnails", js.undefined)
      
      @scala.inline
      def setSlideDuration(value: Double): Self = StObject.set(x, "slideDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideDurationUndefined: Self = StObject.set(x, "slideDuration", js.undefined)
      
      @scala.inline
      def setSlideInterval(value: Double): Self = StObject.set(x, "slideInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideIntervalUndefined: Self = StObject.set(x, "slideInterval", js.undefined)
      
      @scala.inline
      def setSlideOnThumbnailOver(value: Boolean): Self = StObject.set(x, "slideOnThumbnailOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideOnThumbnailOverUndefined: Self = StObject.set(x, "slideOnThumbnailOver", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      @scala.inline
      def setSwipingTransitionDuration(value: Double): Self = StObject.set(x, "swipingTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipingTransitionDurationUndefined: Self = StObject.set(x, "swipingTransitionDuration", js.undefined)
      
      @scala.inline
      def setThumbnailPosition(value: top | right | bottom | left): Self = StObject.set(x, "thumbnailPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailPositionUndefined: Self = StObject.set(x, "thumbnailPosition", js.undefined)
      
      @scala.inline
      def setUseBrowserFullscreen(value: Boolean): Self = StObject.set(x, "useBrowserFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBrowserFullscreenUndefined: Self = StObject.set(x, "useBrowserFullscreen", js.undefined)
      
      @scala.inline
      def setUseTranslate3D(value: Boolean): Self = StObject.set(x, "useTranslate3D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTranslate3DUndefined: Self = StObject.set(x, "useTranslate3D", js.undefined)
    }
  }
}

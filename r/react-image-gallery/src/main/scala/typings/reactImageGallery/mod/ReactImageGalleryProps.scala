package typings.reactImageGallery.mod

import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.TouchEventHandler
import typings.reactImageGallery.reactImageGalleryStrings.bottom
import typings.reactImageGallery.reactImageGalleryStrings.left
import typings.reactImageGallery.reactImageGalleryStrings.right
import typings.reactImageGallery.reactImageGalleryStrings.top
import typings.std.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactImageGalleryProps extends js.Object {
  
  var additionalClass: js.UndefOr[String] = js.native
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var disableKeyDown: js.UndefOr[Boolean] = js.native
  
  var disableSwipe: js.UndefOr[Boolean] = js.native
  
  var disableThumbnailScroll: js.UndefOr[Boolean] = js.native
  
  var flickThreshold: js.UndefOr[Double] = js.native
  
  var indexSeparator: js.UndefOr[String] = js.native
  
  var infinite: js.UndefOr[Boolean] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[ReactImageGalleryItem] = js.native
  
  var lazyLoad: js.UndefOr[Boolean] = js.native
  
  var onBeforeSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.native
  
  var onErrorImageURL: js.UndefOr[String] = js.native
  
  var onImageError: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.native
  
  var onImageLoad: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.native
  
  var onMouseOver: js.UndefOr[js.Function1[/* event */ MouseEventHandler[HTMLDivElement], Unit]] = js.native
  
  var onPause: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  
  var onPlay: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  
  var onScreenChange: js.UndefOr[js.Function1[/* fullScreenElement */ Element, Unit]] = js.native
  
  var onSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  
  var onThumbnailClick: js.UndefOr[
    js.Function2[/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double, Unit]
  ] = js.native
  
  var onThumbnailError: js.UndefOr[js.Function1[/* event */ ReactEventHandler[HTMLImageElement], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ TouchEventHandler[HTMLDivElement], Unit]] = js.native
  
  var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
  
  var renderCustomControls: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var renderFullscreenButton: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean, ReactNode]
  ] = js.native
  
  var renderItem: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, ReactNode]] = js.native
  
  var renderLeftNav: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean, ReactNode]
  ] = js.native
  
  var renderPlayPauseButton: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean, ReactNode]
  ] = js.native
  
  var renderRightNav: js.UndefOr[
    js.Function2[/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean, ReactNode]
  ] = js.native
  
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ ReactImageGalleryItem, ReactNode]] = js.native
  
  var showBullets: js.UndefOr[Boolean] = js.native
  
  var showFullscreenButton: js.UndefOr[Boolean] = js.native
  
  var showIndex: js.UndefOr[Boolean] = js.native
  
  var showNav: js.UndefOr[Boolean] = js.native
  
  var showPlayButton: js.UndefOr[Boolean] = js.native
  
  var showThumbnails: js.UndefOr[Boolean] = js.native
  
  var slideDuration: js.UndefOr[Double] = js.native
  
  var slideInterval: js.UndefOr[Double] = js.native
  
  var slideOnThumbnailOver: js.UndefOr[Boolean] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var stopPropagation: js.UndefOr[Boolean] = js.native
  
  var swipeThreshold: js.UndefOr[Double] = js.native
  
  var swipingTransitionDuration: js.UndefOr[Double] = js.native
  
  var thumbnailPosition: js.UndefOr[top | right | bottom | left] = js.native
  
  var useBrowserFullscreen: js.UndefOr[Boolean] = js.native
  
  var useTranslate3D: js.UndefOr[Boolean] = js.native
}
object ReactImageGalleryProps {
  
  @scala.inline
  def apply(items: js.Array[ReactImageGalleryItem]): ReactImageGalleryProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageGalleryProps]
  }
  
  @scala.inline
  implicit class ReactImageGalleryPropsOps[Self <: ReactImageGalleryProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ReactImageGalleryItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ReactImageGalleryItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalClass(value: String): Self = this.set("additionalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalClass: Self = this.set("additionalClass", js.undefined)
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setDisableKeyDown(value: Boolean): Self = this.set("disableKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableKeyDown: Self = this.set("disableKeyDown", js.undefined)
    
    @scala.inline
    def setDisableSwipe(value: Boolean): Self = this.set("disableSwipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSwipe: Self = this.set("disableSwipe", js.undefined)
    
    @scala.inline
    def setDisableThumbnailScroll(value: Boolean): Self = this.set("disableThumbnailScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableThumbnailScroll: Self = this.set("disableThumbnailScroll", js.undefined)
    
    @scala.inline
    def setFlickThreshold(value: Double): Self = this.set("flickThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlickThreshold: Self = this.set("flickThreshold", js.undefined)
    
    @scala.inline
    def setIndexSeparator(value: String): Self = this.set("indexSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexSeparator: Self = this.set("indexSeparator", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRTL: Self = this.set("isRTL", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: Boolean): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    
    @scala.inline
    def setOnBeforeSlide(value: /* currentIndex */ Double => Unit): Self = this.set("onBeforeSlide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeSlide: Self = this.set("onBeforeSlide", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnErrorImageURL(value: String): Self = this.set("onErrorImageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnErrorImageURL: Self = this.set("onErrorImageURL", js.undefined)
    
    @scala.inline
    def setOnImageError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = this.set("onImageError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnImageError: Self = this.set("onImageError", js.undefined)
    
    @scala.inline
    def setOnImageLoad(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = this.set("onImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnImageLoad: Self = this.set("onImageLoad", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: /* event */ MouseEventHandler[HTMLDivElement] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnPause(value: /* currentIndex */ Double => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: /* currentIndex */ Double => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnScreenChange(value: /* fullScreenElement */ Element => Unit): Self = this.set("onScreenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScreenChange: Self = this.set("onScreenChange", js.undefined)
    
    @scala.inline
    def setOnSlide(value: /* currentIndex */ Double => Unit): Self = this.set("onSlide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlide: Self = this.set("onSlide", js.undefined)
    
    @scala.inline
    def setOnThumbnailClick(value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* index */ Double) => Unit): Self = this.set("onThumbnailClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnThumbnailClick: Self = this.set("onThumbnailClick", js.undefined)
    
    @scala.inline
    def setOnThumbnailError(value: /* event */ ReactEventHandler[HTMLImageElement] => Unit): Self = this.set("onThumbnailError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnThumbnailError: Self = this.set("onThumbnailError", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* event */ TouchEventHandler[HTMLDivElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setPreventDefaultTouchmoveEvent(value: Boolean): Self = this.set("preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultTouchmoveEvent: Self = this.set("preventDefaultTouchmoveEvent", js.undefined)
    
    @scala.inline
    def setRenderCustomControls(value: () => ReactNode): Self = this.set("renderCustomControls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderCustomControls: Self = this.set("renderCustomControls", js.undefined)
    
    @scala.inline
    def setRenderFullscreenButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isFullscreen */ Boolean) => ReactNode): Self = this.set("renderFullscreenButton", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderFullscreenButton: Self = this.set("renderFullscreenButton", js.undefined)
    
    @scala.inline
    def setRenderItem(value: /* item */ ReactImageGalleryItem => ReactNode): Self = this.set("renderItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    
    @scala.inline
    def setRenderLeftNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => ReactNode): Self = this.set("renderLeftNav", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderLeftNav: Self = this.set("renderLeftNav", js.undefined)
    
    @scala.inline
    def setRenderPlayPauseButton(value: (/* onClick */ MouseEventHandler[HTMLElement], /* isPlaying */ Boolean) => ReactNode): Self = this.set("renderPlayPauseButton", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderPlayPauseButton: Self = this.set("renderPlayPauseButton", js.undefined)
    
    @scala.inline
    def setRenderRightNav(value: (/* onClick */ MouseEventHandler[HTMLElement], /* disabled */ Boolean) => ReactNode): Self = this.set("renderRightNav", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderRightNav: Self = this.set("renderRightNav", js.undefined)
    
    @scala.inline
    def setRenderThumbInner(value: /* item */ ReactImageGalleryItem => ReactNode): Self = this.set("renderThumbInner", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderThumbInner: Self = this.set("renderThumbInner", js.undefined)
    
    @scala.inline
    def setShowBullets(value: Boolean): Self = this.set("showBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBullets: Self = this.set("showBullets", js.undefined)
    
    @scala.inline
    def setShowFullscreenButton(value: Boolean): Self = this.set("showFullscreenButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFullscreenButton: Self = this.set("showFullscreenButton", js.undefined)
    
    @scala.inline
    def setShowIndex(value: Boolean): Self = this.set("showIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndex: Self = this.set("showIndex", js.undefined)
    
    @scala.inline
    def setShowNav(value: Boolean): Self = this.set("showNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNav: Self = this.set("showNav", js.undefined)
    
    @scala.inline
    def setShowPlayButton(value: Boolean): Self = this.set("showPlayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPlayButton: Self = this.set("showPlayButton", js.undefined)
    
    @scala.inline
    def setShowThumbnails(value: Boolean): Self = this.set("showThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowThumbnails: Self = this.set("showThumbnails", js.undefined)
    
    @scala.inline
    def setSlideDuration(value: Double): Self = this.set("slideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideDuration: Self = this.set("slideDuration", js.undefined)
    
    @scala.inline
    def setSlideInterval(value: Double): Self = this.set("slideInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideInterval: Self = this.set("slideInterval", js.undefined)
    
    @scala.inline
    def setSlideOnThumbnailOver(value: Boolean): Self = this.set("slideOnThumbnailOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideOnThumbnailOver: Self = this.set("slideOnThumbnailOver", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
    
    @scala.inline
    def setSwipingTransitionDuration(value: Double): Self = this.set("swipingTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipingTransitionDuration: Self = this.set("swipingTransitionDuration", js.undefined)
    
    @scala.inline
    def setThumbnailPosition(value: top | right | bottom | left): Self = this.set("thumbnailPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailPosition: Self = this.set("thumbnailPosition", js.undefined)
    
    @scala.inline
    def setUseBrowserFullscreen(value: Boolean): Self = this.set("useBrowserFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBrowserFullscreen: Self = this.set("useBrowserFullscreen", js.undefined)
    
    @scala.inline
    def setUseTranslate3D(value: Boolean): Self = this.set("useTranslate3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTranslate3D: Self = this.set("useTranslate3D", js.undefined)
  }
}

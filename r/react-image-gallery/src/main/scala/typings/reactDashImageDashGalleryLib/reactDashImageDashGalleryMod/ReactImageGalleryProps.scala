package typings
package reactDashImageDashGalleryLib.reactDashImageDashGalleryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageGalleryProps extends js.Object {
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  var defaultImage: js.UndefOr[java.lang.String] = js.undefined
  var disableArrowKeys: js.UndefOr[scala.Boolean] = js.undefined
  var disableSwipe: js.UndefOr[scala.Boolean] = js.undefined
  var disableThumbnailScroll: js.UndefOr[scala.Boolean] = js.undefined
  var flickThreshold: js.UndefOr[scala.Double] = js.undefined
  var indexSeparator: js.UndefOr[java.lang.String] = js.undefined
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  var items: js.Array[ReactImageGalleryItem]
  var lazyLoad: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onImageError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLImageElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onImageLoad: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLImageElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseOver: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* currentIndex */ scala.Double, scala.Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* currentIndex */ scala.Double, scala.Unit]] = js.undefined
  var onScreenChange: js.UndefOr[js.Function1[/* fullScreenElement */ reactLib.Element, scala.Unit]] = js.undefined
  var onSlide: js.UndefOr[js.Function1[/* currentIndex */ scala.Double, scala.Unit]] = js.undefined
  var onThumbnailClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement], 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onThumbnailError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLImageElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchMove: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ]
  ] = js.undefined
  var preventDefaultTouchmoveEvent: js.UndefOr[scala.Boolean] = js.undefined
  var renderCustomControls: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderFullscreenButton: js.UndefOr[
    js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isFullscreen */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderItem: js.UndefOr[
    js.Function1[/* item */ ReactImageGalleryItem, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var renderLeftNav: js.UndefOr[
    js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isDisabled */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderPlayPauseButton: js.UndefOr[
    js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isPlaying */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderRightNav: js.UndefOr[
    js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isDisabled */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var renderThumbInner: js.UndefOr[
    js.Function1[/* item */ ReactImageGalleryItem, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var showBullets: js.UndefOr[scala.Boolean] = js.undefined
  var showFullscreenButton: js.UndefOr[scala.Boolean] = js.undefined
  var showIndex: js.UndefOr[scala.Boolean] = js.undefined
  var showNav: js.UndefOr[scala.Boolean] = js.undefined
  var showPlayButton: js.UndefOr[scala.Boolean] = js.undefined
  var showThumbnails: js.UndefOr[scala.Boolean] = js.undefined
  var slideDuration: js.UndefOr[scala.Double] = js.undefined
  var slideInterval: js.UndefOr[scala.Double] = js.undefined
  var slideOnThumbnailHover: js.UndefOr[scala.Boolean] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  var swipingTransitionDuration: js.UndefOr[scala.Double] = js.undefined
  var thumbnailPosition: js.UndefOr[
    reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.top | reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.right | reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.bottom | reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.left
  ] = js.undefined
  var useBrowserFullscreen: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactImageGalleryProps {
  @scala.inline
  def apply(
    items: js.Array[ReactImageGalleryItem],
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    defaultImage: java.lang.String = null,
    disableArrowKeys: js.UndefOr[scala.Boolean] = js.undefined,
    disableSwipe: js.UndefOr[scala.Boolean] = js.undefined,
    disableThumbnailScroll: js.UndefOr[scala.Boolean] = js.undefined,
    flickThreshold: scala.Int | scala.Double = null,
    indexSeparator: java.lang.String = null,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    lazyLoad: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onImageError: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLImageElement], 
      scala.Unit
    ] = null,
    onImageLoad: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLImageElement], 
      scala.Unit
    ] = null,
    onMouseLeave: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onMouseOver: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onPause: js.Function1[/* currentIndex */ scala.Double, scala.Unit] = null,
    onPlay: js.Function1[/* currentIndex */ scala.Double, scala.Unit] = null,
    onScreenChange: js.Function1[/* fullScreenElement */ reactLib.Element, scala.Unit] = null,
    onSlide: js.Function1[/* currentIndex */ scala.Double, scala.Unit] = null,
    onThumbnailClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement], 
      /* index */ scala.Double, 
      scala.Unit
    ] = null,
    onThumbnailError: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ReactEventHandler[reactLib.HTMLImageElement], 
      scala.Unit
    ] = null,
    onTouchEnd: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onTouchMove: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    onTouchStart: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.TouchEventHandler[reactLib.HTMLDivElement], 
      scala.Unit
    ] = null,
    preventDefaultTouchmoveEvent: js.UndefOr[scala.Boolean] = js.undefined,
    renderCustomControls: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    renderFullscreenButton: js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isFullscreen */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderItem: js.Function1[/* item */ ReactImageGalleryItem, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderLeftNav: js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isDisabled */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderPlayPauseButton: js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isPlaying */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderRightNav: js.Function2[
      /* onClick */ reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement], 
      /* isDisabled */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderThumbInner: js.Function1[/* item */ ReactImageGalleryItem, reactLib.reactMod.ReactNs.ReactNode] = null,
    showBullets: js.UndefOr[scala.Boolean] = js.undefined,
    showFullscreenButton: js.UndefOr[scala.Boolean] = js.undefined,
    showIndex: js.UndefOr[scala.Boolean] = js.undefined,
    showNav: js.UndefOr[scala.Boolean] = js.undefined,
    showPlayButton: js.UndefOr[scala.Boolean] = js.undefined,
    showThumbnails: js.UndefOr[scala.Boolean] = js.undefined,
    slideDuration: scala.Int | scala.Double = null,
    slideInterval: scala.Int | scala.Double = null,
    slideOnThumbnailHover: js.UndefOr[scala.Boolean] = js.undefined,
    startIndex: scala.Int | scala.Double = null,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    swipeThreshold: scala.Int | scala.Double = null,
    swipingTransitionDuration: scala.Int | scala.Double = null,
    thumbnailPosition: reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.top | reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.right | reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.bottom | reactDashImageDashGalleryLib.reactDashImageDashGalleryLibStrings.left = null,
    useBrowserFullscreen: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactImageGalleryProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (defaultImage != null) __obj.updateDynamic("defaultImage")(defaultImage)
    if (!js.isUndefined(disableArrowKeys)) __obj.updateDynamic("disableArrowKeys")(disableArrowKeys)
    if (!js.isUndefined(disableSwipe)) __obj.updateDynamic("disableSwipe")(disableSwipe)
    if (!js.isUndefined(disableThumbnailScroll)) __obj.updateDynamic("disableThumbnailScroll")(disableThumbnailScroll)
    if (flickThreshold != null) __obj.updateDynamic("flickThreshold")(flickThreshold.asInstanceOf[js.Any])
    if (indexSeparator != null) __obj.updateDynamic("indexSeparator")(indexSeparator)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onImageError != null) __obj.updateDynamic("onImageError")(onImageError)
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(onImageLoad)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onScreenChange != null) __obj.updateDynamic("onScreenChange")(onScreenChange)
    if (onSlide != null) __obj.updateDynamic("onSlide")(onSlide)
    if (onThumbnailClick != null) __obj.updateDynamic("onThumbnailClick")(onThumbnailClick)
    if (onThumbnailError != null) __obj.updateDynamic("onThumbnailError")(onThumbnailError)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent)
    if (renderCustomControls != null) __obj.updateDynamic("renderCustomControls")(renderCustomControls)
    if (renderFullscreenButton != null) __obj.updateDynamic("renderFullscreenButton")(renderFullscreenButton)
    if (renderItem != null) __obj.updateDynamic("renderItem")(renderItem)
    if (renderLeftNav != null) __obj.updateDynamic("renderLeftNav")(renderLeftNav)
    if (renderPlayPauseButton != null) __obj.updateDynamic("renderPlayPauseButton")(renderPlayPauseButton)
    if (renderRightNav != null) __obj.updateDynamic("renderRightNav")(renderRightNav)
    if (renderThumbInner != null) __obj.updateDynamic("renderThumbInner")(renderThumbInner)
    if (!js.isUndefined(showBullets)) __obj.updateDynamic("showBullets")(showBullets)
    if (!js.isUndefined(showFullscreenButton)) __obj.updateDynamic("showFullscreenButton")(showFullscreenButton)
    if (!js.isUndefined(showIndex)) __obj.updateDynamic("showIndex")(showIndex)
    if (!js.isUndefined(showNav)) __obj.updateDynamic("showNav")(showNav)
    if (!js.isUndefined(showPlayButton)) __obj.updateDynamic("showPlayButton")(showPlayButton)
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails)
    if (slideDuration != null) __obj.updateDynamic("slideDuration")(slideDuration.asInstanceOf[js.Any])
    if (slideInterval != null) __obj.updateDynamic("slideInterval")(slideInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(slideOnThumbnailHover)) __obj.updateDynamic("slideOnThumbnailHover")(slideOnThumbnailHover)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (swipingTransitionDuration != null) __obj.updateDynamic("swipingTransitionDuration")(swipingTransitionDuration.asInstanceOf[js.Any])
    if (thumbnailPosition != null) __obj.updateDynamic("thumbnailPosition")(thumbnailPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserFullscreen)) __obj.updateDynamic("useBrowserFullscreen")(useBrowserFullscreen)
    __obj.asInstanceOf[ReactImageGalleryProps]
  }
}


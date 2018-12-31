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


package typings.reactPhotoswipe.mod

import typings.photoswipe.mod.Item
import typings.photoswipe.mod.Options
import typings.react.mod.ReactNode
import typings.reactPhotoswipe.anon.Prevent
import typings.reactPhotoswipe.anon.X
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-photoswipe.react-photoswipe.PhotoSwipeProps, 'isOpen'> */
trait PhotoSwipeGalleryProps extends js.Object {
  var afterChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var beforeChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * class name
    * @default pswp-gallery
    */
  var className: js.UndefOr[String] = js.undefined
  var close: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var destroy: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var gettingData: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageLoadComplete: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.undefined
  var initialZoomIn: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var initialZoomInEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var initialZoomOut: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var initialZoomOutEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * is open
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * photoswipe item
    * {@link http://photoswipe.com/documentation/getting-started.html}
    */
  var items: js.Array[PhotoSwipeGalleryItem]
  var mouseUsed: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var parseVerticalMargin: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* item */ Item, Unit]] = js.undefined
  var preventDragEvent: js.UndefOr[
    js.Function4[
      /* instance */ PhotoSwipe, 
      /* e */ MouseEvent, 
      /* isDown */ Boolean, 
      /* preventObj */ Prevent, 
      Unit
    ]
  ] = js.undefined
  var resize: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var shareLinkClick: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item, Unit]
  ] = js.undefined
  var unbindEvents: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ X, Unit]] = js.undefined
  /**
    * Thumbnail content
    * @default <img src={item.src} width='100' height='100'/>
    */
  def thumbnailContent(item: PhotoSwipeGalleryItem): ReactNode
}

object PhotoSwipeGalleryProps {
  @scala.inline
  def apply(
    items: js.Array[PhotoSwipeGalleryItem],
    thumbnailContent: PhotoSwipeGalleryItem => ReactNode,
    afterChange: /* instance */ PhotoSwipe => Unit = null,
    beforeChange: /* instance */ PhotoSwipe => Unit = null,
    className: String = null,
    close: /* instance */ PhotoSwipe => Unit = null,
    destroy: /* instance */ PhotoSwipe => Unit = null,
    gettingData: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit = null,
    id: String = null,
    imageLoadComplete: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit = null,
    initialZoomIn: /* instance */ PhotoSwipe => Unit = null,
    initialZoomInEnd: /* instance */ PhotoSwipe => Unit = null,
    initialZoomOut: /* instance */ PhotoSwipe => Unit = null,
    initialZoomOutEnd: /* instance */ PhotoSwipe => Unit = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mouseUsed: /* instance */ PhotoSwipe => Unit = null,
    onClose: () => Unit = null,
    options: Options = null,
    parseVerticalMargin: (/* instance */ PhotoSwipe, /* item */ Item) => Unit = null,
    preventDragEvent: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent) => Unit = null,
    resize: /* instance */ PhotoSwipe => Unit = null,
    shareLinkClick: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit = null,
    unbindEvents: /* instance */ PhotoSwipe => Unit = null,
    updateScrollOffset: (/* instance */ PhotoSwipe, /* _offset */ X) => Unit = null
  ): PhotoSwipeGalleryProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (gettingData != null) __obj.updateDynamic("gettingData")(js.Any.fromFunction3(gettingData))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageLoadComplete != null) __obj.updateDynamic("imageLoadComplete")(js.Any.fromFunction3(imageLoadComplete))
    if (initialZoomIn != null) __obj.updateDynamic("initialZoomIn")(js.Any.fromFunction1(initialZoomIn))
    if (initialZoomInEnd != null) __obj.updateDynamic("initialZoomInEnd")(js.Any.fromFunction1(initialZoomInEnd))
    if (initialZoomOut != null) __obj.updateDynamic("initialZoomOut")(js.Any.fromFunction1(initialZoomOut))
    if (initialZoomOutEnd != null) __obj.updateDynamic("initialZoomOutEnd")(js.Any.fromFunction1(initialZoomOutEnd))
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (mouseUsed != null) __obj.updateDynamic("mouseUsed")(js.Any.fromFunction1(mouseUsed))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parseVerticalMargin != null) __obj.updateDynamic("parseVerticalMargin")(js.Any.fromFunction2(parseVerticalMargin))
    if (preventDragEvent != null) __obj.updateDynamic("preventDragEvent")(js.Any.fromFunction4(preventDragEvent))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (shareLinkClick != null) __obj.updateDynamic("shareLinkClick")(js.Any.fromFunction3(shareLinkClick))
    if (unbindEvents != null) __obj.updateDynamic("unbindEvents")(js.Any.fromFunction1(unbindEvents))
    if (updateScrollOffset != null) __obj.updateDynamic("updateScrollOffset")(js.Any.fromFunction2(updateScrollOffset))
    __obj.asInstanceOf[PhotoSwipeGalleryProps]
  }
}


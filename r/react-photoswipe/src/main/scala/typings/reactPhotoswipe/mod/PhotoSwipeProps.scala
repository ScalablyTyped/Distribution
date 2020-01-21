package typings.reactPhotoswipe.mod

import typings.photoswipe.mod.Item
import typings.photoswipe.mod.Options
import typings.reactPhotoswipe.AnonPrevent
import typings.reactPhotoswipe.AnonX
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSwipeProps extends js.Object {
  /**
    * Photoswipe event listener
    * After slides change
    * (after content changed)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var afterChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Before slides change
    * (before the content is changed, but after navigation)
    * Update UI here (like "1 of X" indicator)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var beforeChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * class name
    * @default pswp
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Photoswipe event listener
    * Gallery starts closing
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var close: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * After gallery is closed and closing animation finished.
    * Clean up your stuff here.
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var destroy: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Triggers when PhotoSwipe "reads" slide object data,
    * which happens before content is set, or before lazy-loading is initiated.
    * Use it to dynamically change properties
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var gettingData: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.undefined
  /**
    * id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Photoswipe event listener
    * Image loaded
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var imageLoadComplete: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.undefined
  /**
    * Photoswipe event listener
    * Opening zoom in animation starting
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomIn: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Opening zoom in animation finished
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomInEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Closing zoom out animation started
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomOut: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Closing zoom out animation finished
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var initialZoomOutEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * is open
    */
  var isOpen: Boolean
  /**
    * photoswipe item
    * {@link http://photoswipe.com/documentation/getting-started.html}
    */
  var items: js.Array[Item]
  /**
    * Photoswipe event listener
    * Mouse was used (triggers only once)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var mouseUsed: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Callback after PhotoSwipe close
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * photoswipe options
    * {@link http://photoswipe.com/documentation/options.html}
    * @default {}
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * Photoswipe event listener
    * Allows overriding vertical margin for individual items
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var parseVerticalMargin: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* item */ Item, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Allow to call preventDefault on down and up events
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var preventDragEvent: js.UndefOr[
    js.Function4[
      /* instance */ PhotoSwipe, 
      /* e */ MouseEvent, 
      /* isDown */ Boolean, 
      /* preventObj */ AnonPrevent, 
      Unit
    ]
  ] = js.undefined
  /**
    * Photoswipe event listener
    * Viewport size changed
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var resize: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Share link clicked
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var shareLinkClick: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item, Unit]
  ] = js.undefined
  /**
    * Photoswipe event listener
    * Gallery unbinds events
    * (triggers before closing animation)
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var unbindEvents: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
  /**
    * Photoswipe event listener
    * Called when the page scrolls.
    * The callback is passed an offset with properties {x: number, y: number}.
    *
    * PhotoSwipe uses the offset to determine the top-left of the template,
    * which by default is the top-left of the viewport. When using modal: false,
    * you should listen to this event (before calling .init()) and modify the offset
    * with the template's getBoundingClientRect().
    *
    * Look at the "Implementing inline gallery display" FAQ section for more info.
    * {@link https://photoswipe.com/documentation/api.html}
    */
  var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ AnonX, Unit]] = js.undefined
}

object PhotoSwipeProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    items: js.Array[Item],
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
    mouseUsed: /* instance */ PhotoSwipe => Unit = null,
    onClose: () => Unit = null,
    options: Options = null,
    parseVerticalMargin: (/* instance */ PhotoSwipe, /* item */ Item) => Unit = null,
    preventDragEvent: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ AnonPrevent) => Unit = null,
    resize: /* instance */ PhotoSwipe => Unit = null,
    shareLinkClick: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit = null,
    unbindEvents: /* instance */ PhotoSwipe => Unit = null,
    updateScrollOffset: (/* instance */ PhotoSwipe, /* _offset */ AnonX) => Unit = null
  ): PhotoSwipeProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
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
    if (mouseUsed != null) __obj.updateDynamic("mouseUsed")(js.Any.fromFunction1(mouseUsed))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (parseVerticalMargin != null) __obj.updateDynamic("parseVerticalMargin")(js.Any.fromFunction2(parseVerticalMargin))
    if (preventDragEvent != null) __obj.updateDynamic("preventDragEvent")(js.Any.fromFunction4(preventDragEvent))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (shareLinkClick != null) __obj.updateDynamic("shareLinkClick")(js.Any.fromFunction3(shareLinkClick))
    if (unbindEvents != null) __obj.updateDynamic("unbindEvents")(js.Any.fromFunction1(unbindEvents))
    if (updateScrollOffset != null) __obj.updateDynamic("updateScrollOffset")(js.Any.fromFunction2(updateScrollOffset))
    __obj.asInstanceOf[PhotoSwipeProps]
  }
}


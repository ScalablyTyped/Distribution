package typings.reactPhotoswipe.mod

import typings.photoswipe.mod.Item
import typings.photoswipe.mod.Options
import typings.react.mod.ReactNode
import typings.reactPhotoswipe.anon.Prevent
import typings.reactPhotoswipe.anon.X
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-photoswipe.react-photoswipe.PhotoSwipeProps, 'isOpen'> */
@js.native
trait PhotoSwipeGalleryProps extends js.Object {
  
  var afterChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var beforeChange: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  /**
    * class name
    * @default pswp-gallery
    */
  var className: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var destroy: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var gettingData: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var imageLoadComplete: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item, Unit]
  ] = js.native
  
  var initialZoomIn: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var initialZoomInEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var initialZoomOut: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var initialZoomOutEnd: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  /**
    * is open
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * photoswipe item
    * {@link http://photoswipe.com/documentation/getting-started.html}
    */
  var items: js.Array[PhotoSwipeGalleryItem] = js.native
  
  var mouseUsed: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var options: js.UndefOr[Options] = js.native
  
  var parseVerticalMargin: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* item */ Item, Unit]] = js.native
  
  var preventDragEvent: js.UndefOr[
    js.Function4[
      /* instance */ PhotoSwipe, 
      /* e */ MouseEvent, 
      /* isDown */ Boolean, 
      /* preventObj */ Prevent, 
      Unit
    ]
  ] = js.native
  
  var resize: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var shareLinkClick: js.UndefOr[
    js.Function3[/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item, Unit]
  ] = js.native
  
  /**
    * Thumbnail content
    * @default <img src={item.src} width='100' height='100'/>
    */
  def thumbnailContent(item: PhotoSwipeGalleryItem): ReactNode = js.native
  
  var unbindEvents: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.native
  
  var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ X, Unit]] = js.native
}
object PhotoSwipeGalleryProps {
  
  @scala.inline
  def apply(items: js.Array[PhotoSwipeGalleryItem], thumbnailContent: PhotoSwipeGalleryItem => ReactNode): PhotoSwipeGalleryProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    __obj.asInstanceOf[PhotoSwipeGalleryProps]
  }
  
  @scala.inline
  implicit class PhotoSwipeGalleryPropsOps[Self <: PhotoSwipeGalleryProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: PhotoSwipeGalleryItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[PhotoSwipeGalleryItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailContent(value: PhotoSwipeGalleryItem => ReactNode): Self = this.set("thumbnailContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterChange(value: /* instance */ PhotoSwipe => Unit): Self = this.set("afterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    
    @scala.inline
    def setBeforeChange(value: /* instance */ PhotoSwipe => Unit): Self = this.set("beforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClose(value: /* instance */ PhotoSwipe => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* instance */ PhotoSwipe => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setGettingData(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = this.set("gettingData", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGettingData: Self = this.set("gettingData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageLoadComplete(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = this.set("imageLoadComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteImageLoadComplete: Self = this.set("imageLoadComplete", js.undefined)
    
    @scala.inline
    def setInitialZoomIn(value: /* instance */ PhotoSwipe => Unit): Self = this.set("initialZoomIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitialZoomIn: Self = this.set("initialZoomIn", js.undefined)
    
    @scala.inline
    def setInitialZoomInEnd(value: /* instance */ PhotoSwipe => Unit): Self = this.set("initialZoomInEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitialZoomInEnd: Self = this.set("initialZoomInEnd", js.undefined)
    
    @scala.inline
    def setInitialZoomOut(value: /* instance */ PhotoSwipe => Unit): Self = this.set("initialZoomOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitialZoomOut: Self = this.set("initialZoomOut", js.undefined)
    
    @scala.inline
    def setInitialZoomOutEnd(value: /* instance */ PhotoSwipe => Unit): Self = this.set("initialZoomOutEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitialZoomOutEnd: Self = this.set("initialZoomOutEnd", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setMouseUsed(value: /* instance */ PhotoSwipe => Unit): Self = this.set("mouseUsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseUsed: Self = this.set("mouseUsed", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParseVerticalMargin(value: (/* instance */ PhotoSwipe, /* item */ Item) => Unit): Self = this.set("parseVerticalMargin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteParseVerticalMargin: Self = this.set("parseVerticalMargin", js.undefined)
    
    @scala.inline
    def setPreventDragEvent(
      value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent) => Unit
    ): Self = this.set("preventDragEvent", js.Any.fromFunction4(value))
    
    @scala.inline
    def deletePreventDragEvent: Self = this.set("preventDragEvent", js.undefined)
    
    @scala.inline
    def setResize(value: /* instance */ PhotoSwipe => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setShareLinkClick(value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit): Self = this.set("shareLinkClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteShareLinkClick: Self = this.set("shareLinkClick", js.undefined)
    
    @scala.inline
    def setUnbindEvents(value: /* instance */ PhotoSwipe => Unit): Self = this.set("unbindEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnbindEvents: Self = this.set("unbindEvents", js.undefined)
    
    @scala.inline
    def setUpdateScrollOffset(value: (/* instance */ PhotoSwipe, /* _offset */ X) => Unit): Self = this.set("updateScrollOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateScrollOffset: Self = this.set("updateScrollOffset", js.undefined)
  }
}

package typings.reactPhotoswipe

import typings.photoswipe.mod.Item
import typings.photoswipe.mod.Options
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactPhotoswipe.anon.Prevent
import typings.reactPhotoswipe.anon.X
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-photoswipe", "PhotoSwipe")
  @js.native
  class PhotoSwipe protected ()
    extends Component[PhotoSwipeProps, js.Object, js.Any] {
    def this(props: PhotoSwipeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PhotoSwipeProps, context: js.Any) = this()
  }
  
  @JSImport("react-photoswipe", "PhotoSwipeGallery")
  @js.native
  class PhotoSwipeGallery protected ()
    extends Component[PhotoSwipeGalleryProps, js.Object, js.Any] {
    def this(props: PhotoSwipeGalleryProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PhotoSwipeGalleryProps, context: js.Any) = this()
  }
  
  trait PhotoSwipeGalleryItem
    extends StObject
       with Item {
    
    var thumbnail: String
  }
  object PhotoSwipeGalleryItem {
    
    @scala.inline
    def apply(thumbnail: String): PhotoSwipeGalleryItem = {
      val __obj = js.Dynamic.literal(thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoSwipeGalleryItem]
    }
    
    @scala.inline
    implicit class PhotoSwipeGalleryItemMutableBuilder[Self <: PhotoSwipeGalleryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<react-photoswipe.react-photoswipe.PhotoSwipeProps, 'isOpen'> */
  trait PhotoSwipeGalleryProps extends StObject {
    
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
    
    /**
      * Thumbnail content
      * @default <img src={item.src} width='100' height='100'/>
      */
    def thumbnailContent(item: PhotoSwipeGalleryItem): ReactNode
    
    var unbindEvents: js.UndefOr[js.Function1[/* instance */ PhotoSwipe, Unit]] = js.undefined
    
    var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ X, Unit]] = js.undefined
  }
  object PhotoSwipeGalleryProps {
    
    @scala.inline
    def apply(items: js.Array[PhotoSwipeGalleryItem], thumbnailContent: PhotoSwipeGalleryItem => ReactNode): PhotoSwipeGalleryProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
      __obj.asInstanceOf[PhotoSwipeGalleryProps]
    }
    
    @scala.inline
    implicit class PhotoSwipeGalleryPropsMutableBuilder[Self <: PhotoSwipeGalleryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterChange(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClose(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGettingData(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = StObject.set(x, "gettingData", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGettingDataUndefined: Self = StObject.set(x, "gettingData", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageLoadComplete(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = StObject.set(x, "imageLoadComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImageLoadCompleteUndefined: Self = StObject.set(x, "imageLoadComplete", js.undefined)
      
      @scala.inline
      def setInitialZoomIn(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomInEnd(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomInEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomInEndUndefined: Self = StObject.set(x, "initialZoomInEnd", js.undefined)
      
      @scala.inline
      def setInitialZoomInUndefined: Self = StObject.set(x, "initialZoomIn", js.undefined)
      
      @scala.inline
      def setInitialZoomOut(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomOutEnd(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomOutEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomOutEndUndefined: Self = StObject.set(x, "initialZoomOutEnd", js.undefined)
      
      @scala.inline
      def setInitialZoomOutUndefined: Self = StObject.set(x, "initialZoomOut", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[PhotoSwipeGalleryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: PhotoSwipeGalleryItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMouseUsed(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "mouseUsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseUsedUndefined: Self = StObject.set(x, "mouseUsed", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setParseVerticalMargin(value: (/* instance */ PhotoSwipe, /* item */ Item) => Unit): Self = StObject.set(x, "parseVerticalMargin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseVerticalMarginUndefined: Self = StObject.set(x, "parseVerticalMargin", js.undefined)
      
      @scala.inline
      def setPreventDragEvent(
        value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent) => Unit
      ): Self = StObject.set(x, "preventDragEvent", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPreventDragEventUndefined: Self = StObject.set(x, "preventDragEvent", js.undefined)
      
      @scala.inline
      def setResize(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setShareLinkClick(value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit): Self = StObject.set(x, "shareLinkClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShareLinkClickUndefined: Self = StObject.set(x, "shareLinkClick", js.undefined)
      
      @scala.inline
      def setThumbnailContent(value: PhotoSwipeGalleryItem => ReactNode): Self = StObject.set(x, "thumbnailContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnbindEvents(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "unbindEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnbindEventsUndefined: Self = StObject.set(x, "unbindEvents", js.undefined)
      
      @scala.inline
      def setUpdateScrollOffset(value: (/* instance */ PhotoSwipe, /* _offset */ X) => Unit): Self = StObject.set(x, "updateScrollOffset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateScrollOffsetUndefined: Self = StObject.set(x, "updateScrollOffset", js.undefined)
    }
  }
  
  trait PhotoSwipeProps extends StObject {
    
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
          /* preventObj */ Prevent, 
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
    var updateScrollOffset: js.UndefOr[js.Function2[/* instance */ PhotoSwipe, /* _offset */ X, Unit]] = js.undefined
  }
  object PhotoSwipeProps {
    
    @scala.inline
    def apply(isOpen: Boolean, items: js.Array[Item]): PhotoSwipeProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoSwipeProps]
    }
    
    @scala.inline
    implicit class PhotoSwipePropsMutableBuilder[Self <: PhotoSwipeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterChange(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClose(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGettingData(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = StObject.set(x, "gettingData", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGettingDataUndefined: Self = StObject.set(x, "gettingData", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImageLoadComplete(value: (/* instance */ PhotoSwipe, /* index */ Double, /* item */ Item) => Unit): Self = StObject.set(x, "imageLoadComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImageLoadCompleteUndefined: Self = StObject.set(x, "imageLoadComplete", js.undefined)
      
      @scala.inline
      def setInitialZoomIn(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomInEnd(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomInEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomInEndUndefined: Self = StObject.set(x, "initialZoomInEnd", js.undefined)
      
      @scala.inline
      def setInitialZoomInUndefined: Self = StObject.set(x, "initialZoomIn", js.undefined)
      
      @scala.inline
      def setInitialZoomOut(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomOutEnd(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "initialZoomOutEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialZoomOutEndUndefined: Self = StObject.set(x, "initialZoomOutEnd", js.undefined)
      
      @scala.inline
      def setInitialZoomOutUndefined: Self = StObject.set(x, "initialZoomOut", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMouseUsed(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "mouseUsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseUsedUndefined: Self = StObject.set(x, "mouseUsed", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setParseVerticalMargin(value: (/* instance */ PhotoSwipe, /* item */ Item) => Unit): Self = StObject.set(x, "parseVerticalMargin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseVerticalMarginUndefined: Self = StObject.set(x, "parseVerticalMargin", js.undefined)
      
      @scala.inline
      def setPreventDragEvent(
        value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent) => Unit
      ): Self = StObject.set(x, "preventDragEvent", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPreventDragEventUndefined: Self = StObject.set(x, "preventDragEvent", js.undefined)
      
      @scala.inline
      def setResize(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setShareLinkClick(value: (/* instance */ PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Unit): Self = StObject.set(x, "shareLinkClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setShareLinkClickUndefined: Self = StObject.set(x, "shareLinkClick", js.undefined)
      
      @scala.inline
      def setUnbindEvents(value: /* instance */ PhotoSwipe => Unit): Self = StObject.set(x, "unbindEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnbindEventsUndefined: Self = StObject.set(x, "unbindEvents", js.undefined)
      
      @scala.inline
      def setUpdateScrollOffset(value: (/* instance */ PhotoSwipe, /* _offset */ X) => Unit): Self = StObject.set(x, "updateScrollOffset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateScrollOffsetUndefined: Self = StObject.set(x, "updateScrollOffset", js.undefined)
    }
  }
}

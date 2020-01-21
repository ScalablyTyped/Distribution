package typings.reactPhotoswipe.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-photoswipe.react-photoswipe.PhotoSwipeProps, 'isOpen'> ]: react-photoswipe.react-photoswipe.PhotoSwipeProps[P]} */ trait PhotoSwipeGalleryProps extends js.Object {
  /**
    * class name
    * @default pswp-gallery
    */
  var className: js.UndefOr[String] = js.undefined
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
    className: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined
  ): PhotoSwipeGalleryProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSwipeGalleryProps]
  }
}


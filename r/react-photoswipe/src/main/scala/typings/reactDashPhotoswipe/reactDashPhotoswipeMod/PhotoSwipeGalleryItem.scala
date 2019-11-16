package typings.reactDashPhotoswipe.reactDashPhotoswipeMod

import typings.photoswipe.Anon_BottomTop
import typings.photoswipe.photoswipeMod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSwipeGalleryItem extends Item {
  var thumbnail: String
}

object PhotoSwipeGalleryItem {
  @scala.inline
  def apply(
    h: Double,
    src: String,
    thumbnail: String,
    w: Double,
    bounds: js.Any = null,
    fitRatio: Int | Double = null,
    initialPosition: js.Any = null,
    initialZoomLevel: Int | Double = null,
    loadError: js.UndefOr[Boolean] = js.undefined,
    msrc: String = null,
    vGap: Anon_BottomTop = null
  ): PhotoSwipeGalleryItem = {
    val __obj = js.Dynamic.literal(h = h, src = src, thumbnail = thumbnail, w = w)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (fitRatio != null) __obj.updateDynamic("fitRatio")(fitRatio.asInstanceOf[js.Any])
    if (initialPosition != null) __obj.updateDynamic("initialPosition")(initialPosition)
    if (initialZoomLevel != null) __obj.updateDynamic("initialZoomLevel")(initialZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loadError)) __obj.updateDynamic("loadError")(loadError)
    if (msrc != null) __obj.updateDynamic("msrc")(msrc)
    if (vGap != null) __obj.updateDynamic("vGap")(vGap)
    __obj.asInstanceOf[PhotoSwipeGalleryItem]
  }
}


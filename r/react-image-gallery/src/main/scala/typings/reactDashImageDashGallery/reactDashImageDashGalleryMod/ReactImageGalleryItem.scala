package typings.reactDashImageDashGallery.reactDashImageDashGalleryMod

import typings.react.reactMod.ReactNode
import typings.reactDashImageDashGallery.Anon_CurrentIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageGalleryItem extends js.Object {
  var bulletClass: js.UndefOr[String] = js.undefined
  var bulletOnClick: js.UndefOr[js.Function1[/* hasItemItemIndexCurrentIndex */ Anon_CurrentIndex, Unit]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var original: js.UndefOr[String] = js.undefined
  var originalAlt: js.UndefOr[String] = js.undefined
  var originalClass: js.UndefOr[String] = js.undefined
  var originalTitle: js.UndefOr[String] = js.undefined
  var renderItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], ReactNode]] = js.undefined
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], ReactNode]] = js.undefined
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
  def apply(
    bulletClass: String = null,
    bulletOnClick: /* hasItemItemIndexCurrentIndex */ Anon_CurrentIndex => Unit = null,
    description: String = null,
    original: String = null,
    originalAlt: String = null,
    originalClass: String = null,
    originalTitle: String = null,
    renderItem: /* item */ js.UndefOr[ReactImageGalleryItem] => ReactNode = null,
    renderThumbInner: /* item */ js.UndefOr[ReactImageGalleryItem] => ReactNode = null,
    sizes: String = null,
    srcSet: String = null,
    thumbnail: String = null,
    thumbnailAlt: String = null,
    thumbnailClass: String = null,
    thumbnailLabel: String = null,
    thumbnailTitle: String = null
  ): ReactImageGalleryItem = {
    val __obj = js.Dynamic.literal()
    if (bulletClass != null) __obj.updateDynamic("bulletClass")(bulletClass)
    if (bulletOnClick != null) __obj.updateDynamic("bulletOnClick")(js.Any.fromFunction1(bulletOnClick))
    if (description != null) __obj.updateDynamic("description")(description)
    if (original != null) __obj.updateDynamic("original")(original)
    if (originalAlt != null) __obj.updateDynamic("originalAlt")(originalAlt)
    if (originalClass != null) __obj.updateDynamic("originalClass")(originalClass)
    if (originalTitle != null) __obj.updateDynamic("originalTitle")(originalTitle)
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1(renderItem))
    if (renderThumbInner != null) __obj.updateDynamic("renderThumbInner")(js.Any.fromFunction1(renderThumbInner))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (thumbnailAlt != null) __obj.updateDynamic("thumbnailAlt")(thumbnailAlt)
    if (thumbnailClass != null) __obj.updateDynamic("thumbnailClass")(thumbnailClass)
    if (thumbnailLabel != null) __obj.updateDynamic("thumbnailLabel")(thumbnailLabel)
    if (thumbnailTitle != null) __obj.updateDynamic("thumbnailTitle")(thumbnailTitle)
    __obj.asInstanceOf[ReactImageGalleryItem]
  }
}


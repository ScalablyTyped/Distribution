package typings
package reactDashImageDashGalleryLib.reactDashImageDashGalleryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageGalleryItem extends js.Object {
  var bulletClass: js.UndefOr[java.lang.String] = js.undefined
  var bulletOnClick: js.UndefOr[
    js.Function1[
      /* hasItemItemIndexCurrentIndex */ reactDashImageDashGalleryLib.Anon_CurrentIndex, 
      scala.Unit
    ]
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var original: js.UndefOr[java.lang.String] = js.undefined
  var originalAlt: js.UndefOr[java.lang.String] = js.undefined
  var originalClass: js.UndefOr[java.lang.String] = js.undefined
  var originalTitle: js.UndefOr[java.lang.String] = js.undefined
  var renderItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], reactLib.reactMod.ReactNode]] = js.undefined
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], reactLib.reactMod.ReactNode]] = js.undefined
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailAlt: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailClass: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailLabel: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailTitle: js.UndefOr[java.lang.String] = js.undefined
}

object ReactImageGalleryItem {
  @scala.inline
  def apply(
    bulletClass: java.lang.String = null,
    bulletOnClick: /* hasItemItemIndexCurrentIndex */ reactDashImageDashGalleryLib.Anon_CurrentIndex => scala.Unit = null,
    description: java.lang.String = null,
    original: java.lang.String = null,
    originalAlt: java.lang.String = null,
    originalClass: java.lang.String = null,
    originalTitle: java.lang.String = null,
    renderItem: /* item */ js.UndefOr[ReactImageGalleryItem] => reactLib.reactMod.ReactNode = null,
    renderThumbInner: /* item */ js.UndefOr[ReactImageGalleryItem] => reactLib.reactMod.ReactNode = null,
    sizes: java.lang.String = null,
    srcSet: java.lang.String = null,
    thumbnail: java.lang.String = null,
    thumbnailAlt: java.lang.String = null,
    thumbnailClass: java.lang.String = null,
    thumbnailLabel: java.lang.String = null,
    thumbnailTitle: java.lang.String = null
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


package typings.primereact.galleriaMod

import typings.primereact.anon.IndexNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleriaProps extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var captionTemplate: js.UndefOr[js.Any] = js.undefined
  var changePreviewOnIndicatorHover: js.UndefOr[Boolean] = js.undefined
  var circular: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var indicatorItemTemplate: js.UndefOr[js.Any] = js.undefined
  var indicatorsPosition: js.UndefOr[String] = js.undefined
  var numVisible: js.UndefOr[Double] = js.undefined
  var onItemChange: js.UndefOr[js.Function1[/* e */ IndexNumber, Unit]] = js.undefined
  var previewItemTemplate: js.UndefOr[js.Any] = js.undefined
  var responsiveOptions: js.UndefOr[js.Any] = js.undefined
  var showIndicators: js.UndefOr[Boolean] = js.undefined
  var showIndicatorsOnPreview: js.UndefOr[Boolean] = js.undefined
  var showNavButtonsOnPreviewHover: js.UndefOr[Boolean] = js.undefined
  var showPreviewNavButtons: js.UndefOr[Boolean] = js.undefined
  var showThumbnailNavButtons: js.UndefOr[Boolean] = js.undefined
  var showThumbnails: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var thumbnailItemTemplate: js.UndefOr[js.Any] = js.undefined
  var thumbnailsPosition: js.UndefOr[String] = js.undefined
  var transitionInterval: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object GalleriaProps {
  @scala.inline
  def apply(
    activeIndex: js.UndefOr[Double] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    baseZIndex: js.UndefOr[Double] = js.undefined,
    captionTemplate: js.Any = null,
    changePreviewOnIndicatorHover: js.UndefOr[Boolean] = js.undefined,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    footer: js.Any = null,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    id: String = null,
    indicatorItemTemplate: js.Any = null,
    indicatorsPosition: String = null,
    numVisible: js.UndefOr[Double] = js.undefined,
    onItemChange: /* e */ IndexNumber => Unit = null,
    previewItemTemplate: js.Any = null,
    responsiveOptions: js.Any = null,
    showIndicators: js.UndefOr[Boolean] = js.undefined,
    showIndicatorsOnPreview: js.UndefOr[Boolean] = js.undefined,
    showNavButtonsOnPreviewHover: js.UndefOr[Boolean] = js.undefined,
    showPreviewNavButtons: js.UndefOr[Boolean] = js.undefined,
    showThumbnailNavButtons: js.UndefOr[Boolean] = js.undefined,
    showThumbnails: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    thumbnailItemTemplate: js.Any = null,
    thumbnailsPosition: String = null,
    transitionInterval: js.UndefOr[Double] = js.undefined,
    value: js.Array[_] = null
  ): GalleriaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseZIndex)) __obj.updateDynamic("baseZIndex")(baseZIndex.get.asInstanceOf[js.Any])
    if (captionTemplate != null) __obj.updateDynamic("captionTemplate")(captionTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(changePreviewOnIndicatorHover)) __obj.updateDynamic("changePreviewOnIndicatorHover")(changePreviewOnIndicatorHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (indicatorItemTemplate != null) __obj.updateDynamic("indicatorItemTemplate")(indicatorItemTemplate.asInstanceOf[js.Any])
    if (indicatorsPosition != null) __obj.updateDynamic("indicatorsPosition")(indicatorsPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(numVisible)) __obj.updateDynamic("numVisible")(numVisible.get.asInstanceOf[js.Any])
    if (onItemChange != null) __obj.updateDynamic("onItemChange")(js.Any.fromFunction1(onItemChange))
    if (previewItemTemplate != null) __obj.updateDynamic("previewItemTemplate")(previewItemTemplate.asInstanceOf[js.Any])
    if (responsiveOptions != null) __obj.updateDynamic("responsiveOptions")(responsiveOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicators)) __obj.updateDynamic("showIndicators")(showIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicatorsOnPreview)) __obj.updateDynamic("showIndicatorsOnPreview")(showIndicatorsOnPreview.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavButtonsOnPreviewHover)) __obj.updateDynamic("showNavButtonsOnPreviewHover")(showNavButtonsOnPreviewHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviewNavButtons)) __obj.updateDynamic("showPreviewNavButtons")(showPreviewNavButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnailNavButtons)) __obj.updateDynamic("showThumbnailNavButtons")(showThumbnailNavButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnails)) __obj.updateDynamic("showThumbnails")(showThumbnails.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbnailItemTemplate != null) __obj.updateDynamic("thumbnailItemTemplate")(thumbnailItemTemplate.asInstanceOf[js.Any])
    if (thumbnailsPosition != null) __obj.updateDynamic("thumbnailsPosition")(thumbnailsPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionInterval)) __obj.updateDynamic("transitionInterval")(transitionInterval.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleriaProps]
  }
}


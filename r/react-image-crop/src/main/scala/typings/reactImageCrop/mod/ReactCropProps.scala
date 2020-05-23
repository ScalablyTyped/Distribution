package typings.reactImageCrop.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactImageCrop.reactImageCropStrings.`use-credentials`
import typings.reactImageCrop.reactImageCropStrings.anonymous
import typings.std.Event
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCropProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var circularCrop: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var crop: js.UndefOr[Crop] = js.undefined
  var crossorigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var imageAlt: js.UndefOr[String] = js.undefined
  var imageStyle: js.UndefOr[CSSProperties] = js.undefined
  var keepSelection: js.UndefOr[Boolean] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* percentCrop */ PercentCrop, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onImageError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
  var onImageLoaded: js.UndefOr[js.Function1[/* target */ HTMLImageElement, Unit]] = js.undefined
  var renderComponent: js.UndefOr[ReactNode] = js.undefined
  var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ js.Any, ReactNode]] = js.undefined
  var ruleOfThirds: js.UndefOr[Boolean] = js.undefined
  var src: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  def onChange(crop: Crop, percentCrop: PercentCrop): Unit
}

object ReactCropProps {
  @scala.inline
  def apply(
    onChange: (Crop, PercentCrop) => Unit,
    src: String,
    children: ReactNode = null,
    circularCrop: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crop: Crop = null,
    crossorigin: anonymous | `use-credentials` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    imageAlt: String = null,
    imageStyle: CSSProperties = null,
    keepSelection: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    onComplete: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Unit = null,
    onDragEnd: () => Unit = null,
    onDragStart: () => Unit = null,
    onImageError: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit = null,
    onImageLoaded: /* target */ HTMLImageElement => Unit = null,
    renderComponent: ReactNode = null,
    renderSelectionAddon: /* state */ js.Any => ReactNode = null,
    ruleOfThirds: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ReactCropProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), src = src.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circularCrop)) __obj.updateDynamic("circularCrop")(circularCrop.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSelection)) __obj.updateDynamic("keepSelection")(keepSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2(onComplete))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onImageError != null) __obj.updateDynamic("onImageError")(js.Any.fromFunction1(onImageError))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1(onImageLoaded))
    if (renderComponent != null) __obj.updateDynamic("renderComponent")(renderComponent.asInstanceOf[js.Any])
    if (renderSelectionAddon != null) __obj.updateDynamic("renderSelectionAddon")(js.Any.fromFunction1(renderSelectionAddon))
    if (!js.isUndefined(ruleOfThirds)) __obj.updateDynamic("ruleOfThirds")(ruleOfThirds.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCropProps]
  }
}


package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCropProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var crop: js.UndefOr[Crop] = js.undefined
  var crossorigin: js.UndefOr[
    reactDashImageDashCropLib.reactDashImageDashCropLibStrings.anonymous | reactDashImageDashCropLib.reactDashImageDashCropLibStrings.`use-credentials`
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var imageAlt: js.UndefOr[java.lang.String] = js.undefined
  var imageStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var keepSelection: js.UndefOr[scala.Boolean] = js.undefined
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* crop */ Crop, scala.Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onImageError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onImageLoaded: js.UndefOr[js.Function1[/* target */ stdLib.HTMLImageElement, scala.Unit]] = js.undefined
  var renderComponent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var src: java.lang.String
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  def onChange(crop: Crop): scala.Unit
}

object ReactCropProps {
  @scala.inline
  def apply(
    onChange: Crop => scala.Unit,
    src: java.lang.String,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    crop: Crop = null,
    crossorigin: reactDashImageDashCropLib.reactDashImageDashCropLibStrings.anonymous | reactDashImageDashCropLib.reactDashImageDashCropLibStrings.`use-credentials` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    imageAlt: java.lang.String = null,
    imageStyle: reactLib.reactMod.CSSProperties = null,
    keepSelection: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    onComplete: /* crop */ Crop => scala.Unit = null,
    onDragEnd: () => scala.Unit = null,
    onDragStart: () => scala.Unit = null,
    onImageError: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLImageElement, reactLib.Event] => scala.Unit = null,
    onImageLoaded: /* target */ stdLib.HTMLImageElement => scala.Unit = null,
    renderComponent: reactLib.reactMod.ReactNode = null,
    renderSelectionAddon: /* state */ js.Any => reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ReactCropProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), src = src)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (crop != null) __obj.updateDynamic("crop")(crop)
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt)
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle)
    if (!js.isUndefined(keepSelection)) __obj.updateDynamic("keepSelection")(keepSelection)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onImageError != null) __obj.updateDynamic("onImageError")(js.Any.fromFunction1(onImageError))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1(onImageLoaded))
    if (renderComponent != null) __obj.updateDynamic("renderComponent")(renderComponent.asInstanceOf[js.Any])
    if (renderSelectionAddon != null) __obj.updateDynamic("renderSelectionAddon")(js.Any.fromFunction1(renderSelectionAddon))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ReactCropProps]
  }
}


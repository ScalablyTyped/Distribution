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

@js.native
trait ReactCropProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var circularCrop: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var crop: js.UndefOr[Crop] = js.native
  var crossorigin: js.UndefOr[anonymous | `use-credentials`] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var imageAlt: js.UndefOr[String] = js.native
  var imageStyle: js.UndefOr[CSSProperties] = js.native
  var keepSelection: js.UndefOr[Boolean] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* percentCrop */ PercentCrop, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onImageError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.native
  var onImageLoaded: js.UndefOr[js.Function1[/* target */ HTMLImageElement, Unit]] = js.native
  var renderComponent: js.UndefOr[ReactNode] = js.native
  var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ js.Any, ReactNode]] = js.native
  var ruleOfThirds: js.UndefOr[Boolean] = js.native
  var src: String = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def onChange(crop: Crop, percentCrop: PercentCrop): Unit = js.native
}

object ReactCropProps {
  @scala.inline
  def apply(onChange: (Crop, PercentCrop) => Unit, src: String): ReactCropProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCropProps]
  }
  @scala.inline
  implicit class ReactCropPropsOps[Self <: ReactCropProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: (Crop, PercentCrop) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCircularCrop(value: Boolean): Self = this.set("circularCrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircularCrop: Self = this.set("circularCrop", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCrop(value: Crop): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setCrossorigin(value: anonymous | `use-credentials`): Self = this.set("crossorigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossorigin: Self = this.set("crossorigin", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setImageAlt(value: String): Self = this.set("imageAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageAlt: Self = this.set("imageAlt", js.undefined)
    @scala.inline
    def setImageStyle(value: CSSProperties): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    @scala.inline
    def setKeepSelection(value: Boolean): Self = this.set("keepSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepSelection: Self = this.set("keepSelection", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnComplete(value: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Unit): Self = this.set("onComplete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnImageError(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = this.set("onImageError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnImageError: Self = this.set("onImageError", js.undefined)
    @scala.inline
    def setOnImageLoaded(value: /* target */ HTMLImageElement => Unit): Self = this.set("onImageLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnImageLoaded: Self = this.set("onImageLoaded", js.undefined)
    @scala.inline
    def setRenderComponent(value: ReactNode): Self = this.set("renderComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderComponent: Self = this.set("renderComponent", js.undefined)
    @scala.inline
    def setRenderSelectionAddon(value: /* state */ js.Any => ReactNode): Self = this.set("renderSelectionAddon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderSelectionAddon: Self = this.set("renderSelectionAddon", js.undefined)
    @scala.inline
    def setRuleOfThirds(value: Boolean): Self = this.set("ruleOfThirds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleOfThirds: Self = this.set("ruleOfThirds", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


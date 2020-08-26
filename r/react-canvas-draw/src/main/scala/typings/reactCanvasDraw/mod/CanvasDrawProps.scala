package typings.reactCanvasDraw.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasDrawProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var brushColor: js.UndefOr[String] = js.native
  var brushRadius: js.UndefOr[Double] = js.native
  var canvasHeight: js.UndefOr[Double | String] = js.native
  var canvasWidth: js.UndefOr[Double | String] = js.native
  var catenaryColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var gridColor: js.UndefOr[String] = js.native
  var hideGrid: js.UndefOr[Boolean] = js.native
  var hideInterface: js.UndefOr[Boolean] = js.native
  var imgSrc: js.UndefOr[String] = js.native
  var immediateLoading: js.UndefOr[Boolean] = js.native
  var lazyRadius: js.UndefOr[Double] = js.native
  var loadTimeOffset: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[(js.Function1[/* canvas */ CanvasDraw, Unit]) | Null] = js.native
  var saveData: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CanvasDrawProps {
  @scala.inline
  def apply(): CanvasDrawProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasDrawProps]
  }
  @scala.inline
  implicit class CanvasDrawPropsOps[Self <: CanvasDrawProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBrushColor(value: String): Self = this.set("brushColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrushColor: Self = this.set("brushColor", js.undefined)
    @scala.inline
    def setBrushRadius(value: Double): Self = this.set("brushRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrushRadius: Self = this.set("brushRadius", js.undefined)
    @scala.inline
    def setCanvasHeight(value: Double | String): Self = this.set("canvasHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasHeight: Self = this.set("canvasHeight", js.undefined)
    @scala.inline
    def setCanvasWidth(value: Double | String): Self = this.set("canvasWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasWidth: Self = this.set("canvasWidth", js.undefined)
    @scala.inline
    def setCatenaryColor(value: String): Self = this.set("catenaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatenaryColor: Self = this.set("catenaryColor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGridColor(value: String): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColor: Self = this.set("gridColor", js.undefined)
    @scala.inline
    def setHideGrid(value: Boolean): Self = this.set("hideGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideGrid: Self = this.set("hideGrid", js.undefined)
    @scala.inline
    def setHideInterface(value: Boolean): Self = this.set("hideInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideInterface: Self = this.set("hideInterface", js.undefined)
    @scala.inline
    def setImgSrc(value: String): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgSrc: Self = this.set("imgSrc", js.undefined)
    @scala.inline
    def setImmediateLoading(value: Boolean): Self = this.set("immediateLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediateLoading: Self = this.set("immediateLoading", js.undefined)
    @scala.inline
    def setLazyRadius(value: Double): Self = this.set("lazyRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyRadius: Self = this.set("lazyRadius", js.undefined)
    @scala.inline
    def setLoadTimeOffset(value: Double): Self = this.set("loadTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadTimeOffset: Self = this.set("loadTimeOffset", js.undefined)
    @scala.inline
    def setOnChange(value: /* canvas */ CanvasDraw => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeNull: Self = this.set("onChange", null)
    @scala.inline
    def setSaveData(value: String): Self = this.set("saveData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveData: Self = this.set("saveData", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}


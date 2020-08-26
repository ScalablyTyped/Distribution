package typings.reactVirtualized.esCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellMeasurerCacheParams extends js.Object {
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var fixedHeight: js.UndefOr[Boolean] = js.native
  var fixedWidth: js.UndefOr[Boolean] = js.native
  var keyMapper: js.UndefOr[KeyMapper] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
}

object CellMeasurerCacheParams {
  @scala.inline
  def apply(): CellMeasurerCacheParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellMeasurerCacheParams]
  }
  @scala.inline
  implicit class CellMeasurerCacheParamsOps[Self <: CellMeasurerCacheParams] (val x: Self) extends AnyVal {
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
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setFixedHeight(value: Boolean): Self = this.set("fixedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedHeight: Self = this.set("fixedHeight", js.undefined)
    @scala.inline
    def setFixedWidth(value: Boolean): Self = this.set("fixedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedWidth: Self = this.set("fixedWidth", js.undefined)
    @scala.inline
    def setKeyMapper(value: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any): Self = this.set("keyMapper", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeyMapper: Self = this.set("keyMapper", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}


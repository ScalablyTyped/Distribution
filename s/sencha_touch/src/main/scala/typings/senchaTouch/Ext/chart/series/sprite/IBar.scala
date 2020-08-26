package typings.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBar extends IStackedCartesian {
  /** [Config Option] (Number) */
  var inGroupGapWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxBarWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minBarWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minGapWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Method] Render the given visible clip range
    * @param surface Object
    * @param ctx Object
    * @param clip Object
    */
  @JSName("renderClipped")
  var renderClipped_IBar: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IBar {
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
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
    def setInGroupGapWidth(value: Double): Self = this.set("inGroupGapWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInGroupGapWidth: Self = this.set("inGroupGapWidth", js.undefined)
    @scala.inline
    def setMaxBarWidth(value: Double): Self = this.set("maxBarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBarWidth: Self = this.set("maxBarWidth", js.undefined)
    @scala.inline
    def setMinBarWidth(value: Double): Self = this.set("minBarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinBarWidth: Self = this.set("minBarWidth", js.undefined)
    @scala.inline
    def setMinGapWidth(value: Double): Self = this.set("minGapWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinGapWidth: Self = this.set("minGapWidth", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRenderClipped(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("renderClipped", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderClipped: Self = this.set("renderClipped", js.undefined)
  }
  
}


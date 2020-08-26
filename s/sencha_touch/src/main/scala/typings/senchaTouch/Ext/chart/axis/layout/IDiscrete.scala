package typings.senchaTouch.Ext.chart.axis.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiscrete extends ILayout {
  /** [Method] Processes the data of the series bound to the axis  */
  @JSName("processData")
  var processData_IDiscrete: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Snaps the data bound to the axis to meaningful tick marks
    * @param context Object
    * @param min Object
    * @param max Object
    * @param estStepSize Object
    */
  @JSName("snapEnds")
  var snapEnds_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* min */ js.UndefOr[js.Any], 
      /* max */ js.UndefOr[js.Any], 
      /* estStepSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Trims the layout of the axis by the defined minimum and maximum
    * @param context Object
    * @param out Object
    * @param trimMin Object
    * @param trimMax Object
    */
  @JSName("trimByRange")
  var trimByRange_IDiscrete: js.UndefOr[
    js.Function4[
      /* context */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* trimMin */ js.UndefOr[js.Any], 
      /* trimMax */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IDiscrete {
  @scala.inline
  def apply(): IDiscrete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiscrete]
  }
  @scala.inline
  implicit class IDiscreteOps[Self <: IDiscrete] (val x: Self) extends AnyVal {
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
    def setProcessData(value: () => Unit): Self = this.set("processData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteProcessData: Self = this.set("processData", js.undefined)
    @scala.inline
    def setSnapEnds(
      value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("snapEnds", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSnapEnds: Self = this.set("snapEnds", js.undefined)
    @scala.inline
    def setTrimByRange(
      value: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[js.Any], /* trimMax */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("trimByRange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTrimByRange: Self = this.set("trimByRange", js.undefined)
  }
  
}


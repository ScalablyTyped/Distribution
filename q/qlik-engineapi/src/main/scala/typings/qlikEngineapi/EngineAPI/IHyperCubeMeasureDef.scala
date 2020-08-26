package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeMeasureDef width extend NxMeasure
  */
@js.native
trait IHyperCubeMeasureDef extends INxMeasure {
  @JSName("qDef")
  var qDef_IHyperCubeMeasureDef: IHyperCubeMeasureqDef = js.native
}

object IHyperCubeMeasureDef {
  @scala.inline
  def apply(qDef: IHyperCubeMeasureqDef): IHyperCubeMeasureDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureDef]
  }
  @scala.inline
  implicit class IHyperCubeMeasureDefOps[Self <: IHyperCubeMeasureDef] (val x: Self) extends AnyVal {
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
    def setQDef(value: IHyperCubeMeasureqDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
  }
  
}


package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHyperCubeDimensionDef extends INxDimension {
  @JSName("qDef")
  var qDef_IHyperCubeDimensionDef: IHyperCubeDimensionqDef = js.native
}

object IHyperCubeDimensionDef {
  @scala.inline
  def apply(qDef: IHyperCubeDimensionqDef): IHyperCubeDimensionDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeDimensionDef]
  }
  @scala.inline
  implicit class IHyperCubeDimensionDefOps[Self <: IHyperCubeDimensionDef] (val x: Self) extends AnyVal {
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
    def setQDef(value: IHyperCubeDimensionqDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
  }
  
}


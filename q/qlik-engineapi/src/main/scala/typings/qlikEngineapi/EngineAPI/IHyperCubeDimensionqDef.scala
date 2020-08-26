package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeDimensionqDef width extend NxInlineDimensionDef
  */
@js.native
trait IHyperCubeDimensionqDef extends INxInlineDimensionDef {
  var autoSort: js.UndefOr[Boolean] = js.native
  var cId: js.UndefOr[String] = js.native
  var othersLabel: js.UndefOr[IStringExpressionContainer] = js.native
}

object IHyperCubeDimensionqDef {
  @scala.inline
  def apply(): IHyperCubeDimensionqDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHyperCubeDimensionqDef]
  }
  @scala.inline
  implicit class IHyperCubeDimensionqDefOps[Self <: IHyperCubeDimensionqDef] (val x: Self) extends AnyVal {
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
    def setAutoSort(value: Boolean): Self = this.set("autoSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSort: Self = this.set("autoSort", js.undefined)
    @scala.inline
    def setCId(value: String): Self = this.set("cId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCId: Self = this.set("cId", js.undefined)
    @scala.inline
    def setOthersLabel(value: IStringExpressionContainer): Self = this.set("othersLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOthersLabel: Self = this.set("othersLabel", js.undefined)
  }
  
}


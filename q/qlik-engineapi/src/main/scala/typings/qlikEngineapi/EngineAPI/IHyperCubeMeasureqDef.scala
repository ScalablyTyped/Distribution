package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeMeasureqDef with extend of NxInlineMeasureDef
  */
@js.native
trait IHyperCubeMeasureqDef extends INxInlineMeasureDef {
  
  var autoSort: js.UndefOr[Boolean] = js.native
  
  var cId: js.UndefOr[String] = js.native
  
  var numFormatFromTemplate: js.UndefOr[Boolean] = js.native
}
object IHyperCubeMeasureqDef {
  
  @scala.inline
  def apply(qDef: String): IHyperCubeMeasureqDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeMeasureqDef]
  }
  
  @scala.inline
  implicit class IHyperCubeMeasureqDefOps[Self <: IHyperCubeMeasureqDef] (val x: Self) extends AnyVal {
    
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
    def setNumFormatFromTemplate(value: Boolean): Self = this.set("numFormatFromTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFormatFromTemplate: Self = this.set("numFormatFromTemplate", js.undefined)
  }
}

package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionListLayout width extend GenericBaseLayout
  */
@js.native
trait IGenericDimensionListLayout extends IGenericBaseLayout {
  
  var qDimensionList: IDimensionList = js.native
}
object IGenericDimensionListLayout {
  
  @scala.inline
  def apply(qDimensionList: IDimensionList, qInfo: INxInfo, qMeta: INxMeta): IGenericDimensionListLayout = {
    val __obj = js.Dynamic.literal(qDimensionList = qDimensionList.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionListLayout]
  }
  
  @scala.inline
  implicit class IGenericDimensionListLayoutOps[Self <: IGenericDimensionListLayout] (val x: Self) extends AnyVal {
    
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
    def setQDimensionList(value: IDimensionList): Self = this.set("qDimensionList", value.asInstanceOf[js.Any])
  }
}

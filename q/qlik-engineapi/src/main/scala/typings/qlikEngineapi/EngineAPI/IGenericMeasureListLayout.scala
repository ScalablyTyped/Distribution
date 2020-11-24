package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IGenericMeasureListLayout
  */
@js.native
trait IGenericMeasureListLayout extends IGenericBaseLayout {
  
  var qMeassureListObject: IMeassureList = js.native
}
object IGenericMeasureListLayout {
  
  @scala.inline
  def apply(qInfo: INxInfo, qMeassureListObject: IMeassureList, qMeta: INxMeta): IGenericMeasureListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeassureListObject = qMeassureListObject.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListLayout]
  }
  
  @scala.inline
  implicit class IGenericMeasureListLayoutOps[Self <: IGenericMeasureListLayout] (val x: Self) extends AnyVal {
    
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
    def setQMeassureListObject(value: IMeassureList): Self = this.set("qMeassureListObject", value.asInstanceOf[js.Any])
  }
}

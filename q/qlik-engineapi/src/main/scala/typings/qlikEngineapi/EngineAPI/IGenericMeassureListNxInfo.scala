package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.MeasureList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IGenericMeassureListNxInfo
  */
@js.native
trait IGenericMeassureListNxInfo extends INxInfo {
  
  @JSName("qType")
  var qType_IGenericMeassureListNxInfo: MeasureList = js.native
}
object IGenericMeassureListNxInfo {
  
  @scala.inline
  def apply(qType: MeasureList): IGenericMeassureListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
  
  @scala.inline
  implicit class IGenericMeassureListNxInfoOps[Self <: IGenericMeassureListNxInfo] (val x: Self) extends AnyVal {
    
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
    def setQType(value: MeasureList): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
}

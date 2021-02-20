package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.MeasureList
import org.scalablytyped.runtime.StObject
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
  implicit class IGenericMeassureListNxInfoMutableBuilder[Self <: IGenericMeassureListNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: MeasureList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

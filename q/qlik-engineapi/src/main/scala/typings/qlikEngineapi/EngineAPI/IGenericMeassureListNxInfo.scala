package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.MeasureList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IGenericMeassureListNxInfo
  */
trait IGenericMeassureListNxInfo
  extends StObject
     with INxInfo {
  
  @JSName("qType")
  var qType_IGenericMeassureListNxInfo: MeasureList
}
object IGenericMeassureListNxInfo {
  
  @scala.inline
  def apply(): IGenericMeassureListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "MeasureList")
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
  
  @scala.inline
  implicit class IGenericMeassureListNxInfoMutableBuilder[Self <: IGenericMeassureListNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: MeasureList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

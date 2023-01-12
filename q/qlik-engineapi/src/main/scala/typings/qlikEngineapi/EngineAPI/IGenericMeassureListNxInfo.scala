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
  
  inline def apply(): IGenericMeassureListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "MeasureList")
    __obj.asInstanceOf[IGenericMeassureListNxInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericMeassureListNxInfo] (val x: Self) extends AnyVal {
    
    inline def setQType(value: MeasureList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

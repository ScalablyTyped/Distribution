package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.DimensionList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionListNxInfo width extend NxInfo
  */
trait IGenericDimensionListNxInfo
  extends StObject
     with INxInfo {
  
  @JSName("qType")
  var qType_IGenericDimensionListNxInfo: DimensionList
}
object IGenericDimensionListNxInfo {
  
  inline def apply(): IGenericDimensionListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "DimensionList")
    __obj.asInstanceOf[IGenericDimensionListNxInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericDimensionListNxInfo] (val x: Self) extends AnyVal {
    
    inline def setQType(value: DimensionList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

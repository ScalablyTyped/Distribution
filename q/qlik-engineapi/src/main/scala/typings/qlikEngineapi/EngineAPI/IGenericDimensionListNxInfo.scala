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
  
  @scala.inline
  def apply(): IGenericDimensionListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "DimensionList")
    __obj.asInstanceOf[IGenericDimensionListNxInfo]
  }
  
  @scala.inline
  implicit class IGenericDimensionListNxInfoMutableBuilder[Self <: IGenericDimensionListNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: DimensionList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

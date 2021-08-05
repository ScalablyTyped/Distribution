package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.CurrentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericSelectionNxInfo width extend NxInfo
  */
trait IGenericSelectionNxInfo
  extends StObject
     with INxInfo {
  
  @JSName("qType")
  var qType_IGenericSelectionNxInfo: CurrentSelection
}
object IGenericSelectionNxInfo {
  
  inline def apply(): IGenericSelectionNxInfo = {
    val __obj = js.Dynamic.literal(qType = "CurrentSelection")
    __obj.asInstanceOf[IGenericSelectionNxInfo]
  }
  
  extension [Self <: IGenericSelectionNxInfo](x: Self) {
    
    inline def setQType(value: CurrentSelection): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

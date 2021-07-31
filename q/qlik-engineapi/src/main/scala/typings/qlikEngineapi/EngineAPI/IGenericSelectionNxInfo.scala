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
  
  @scala.inline
  def apply(): IGenericSelectionNxInfo = {
    val __obj = js.Dynamic.literal(qType = "CurrentSelection")
    __obj.asInstanceOf[IGenericSelectionNxInfo]
  }
  
  @scala.inline
  implicit class IGenericSelectionNxInfoMutableBuilder[Self <: IGenericSelectionNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: CurrentSelection): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

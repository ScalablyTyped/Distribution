package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.CurrentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericSelectionNxInfo width extend NxInfo
  */
@js.native
trait IGenericSelectionNxInfo extends INxInfo {
  
  @JSName("qType")
  var qType_IGenericSelectionNxInfo: CurrentSelection = js.native
}
object IGenericSelectionNxInfo {
  
  @scala.inline
  def apply(qType: CurrentSelection): IGenericSelectionNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionNxInfo]
  }
  
  @scala.inline
  implicit class IGenericSelectionNxInfoMutableBuilder[Self <: IGenericSelectionNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: CurrentSelection): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}

package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.validateFinish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateFinishInfo
  extends StObject
     with NotifyInfo {
  
  var `type`: validateFinish
}
object ValidateFinishInfo {
  
  inline def apply(): ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("validateFinish")
    __obj.asInstanceOf[ValidateFinishInfo]
  }
  
  extension [Self <: ValidateFinishInfo](x: Self) {
    
    inline def setType(value: validateFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

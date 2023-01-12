package typings.rcFieldForm.esInterfaceMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateFinishInfo] (val x: Self) extends AnyVal {
    
    inline def setType(value: validateFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

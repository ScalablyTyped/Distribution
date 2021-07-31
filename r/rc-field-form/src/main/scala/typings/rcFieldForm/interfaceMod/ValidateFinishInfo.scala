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
  
  @scala.inline
  def apply(): ValidateFinishInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("validateFinish")
    __obj.asInstanceOf[ValidateFinishInfo]
  }
  
  @scala.inline
  implicit class ValidateFinishInfoMutableBuilder[Self <: ValidateFinishInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: validateFinish): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

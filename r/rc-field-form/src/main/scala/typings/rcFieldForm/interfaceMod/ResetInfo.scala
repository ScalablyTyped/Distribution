package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.reset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetInfo
  extends StObject
     with NotifyInfo {
  
  var `type`: reset
}
object ResetInfo {
  
  @scala.inline
  def apply(): ResetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reset")
    __obj.asInstanceOf[ResetInfo]
  }
  
  @scala.inline
  implicit class ResetInfoMutableBuilder[Self <: ResetInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

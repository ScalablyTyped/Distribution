package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportKey
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var deviceId: js.UndefOr[Id] = js.undefined
  
  var testId: js.UndefOr[Id] = js.undefined
}
object ReportKey {
  
  @scala.inline
  def apply(): ReportKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportKey]
  }
  
  @scala.inline
  implicit class ReportKeyMutableBuilder[Self <: ReportKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: Id): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setTestId(value: Id): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
  }
}

package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiTestStatus
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var passed: js.UndefOr[Boolean] = js.undefined
}
object ApiTestStatus {
  
  @scala.inline
  def apply(): ApiTestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiTestStatus]
  }
  
  @scala.inline
  implicit class ApiTestStatusMutableBuilder[Self <: ApiTestStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
  }
}

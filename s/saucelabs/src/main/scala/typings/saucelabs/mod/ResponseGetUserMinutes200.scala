package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseGetUserMinutes200
  extends /* key */ StringDictionary[js.Any] {
  
  var automated: js.UndefOr[String] = js.native
  
  var manual: js.UndefOr[String] = js.native
}
object ResponseGetUserMinutes200 {
  
  @scala.inline
  def apply(): ResponseGetUserMinutes200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetUserMinutes200]
  }
  
  @scala.inline
  implicit class ResponseGetUserMinutes200MutableBuilder[Self <: ResponseGetUserMinutes200] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomated(value: String): Self = StObject.set(x, "automated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedUndefined: Self = StObject.set(x, "automated", js.undefined)
    
    @scala.inline
    def setManual(value: String): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
  }
}

package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetUserMinutes200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var automated: js.UndefOr[String] = js.undefined
  
  var manual: js.UndefOr[String] = js.undefined
}
object ResponseGetUserMinutes200 {
  
  inline def apply(): ResponseGetUserMinutes200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetUserMinutes200]
  }
  
  extension [Self <: ResponseGetUserMinutes200](x: Self) {
    
    inline def setAutomated(value: String): Self = StObject.set(x, "automated", value.asInstanceOf[js.Any])
    
    inline def setAutomatedUndefined: Self = StObject.set(x, "automated", js.undefined)
    
    inline def setManual(value: String): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
  }
}

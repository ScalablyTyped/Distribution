package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppId extends StObject {
  
  var appId: js.UndefOr[Double] = js.undefined
}
object AppId {
  
  inline def apply(): AppId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppId]
  }
  
  extension [Self <: AppId](x: Self) {
    
    inline def setAppId(value: Double): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}

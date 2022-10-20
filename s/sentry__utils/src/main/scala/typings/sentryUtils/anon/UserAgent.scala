package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgent extends StObject {
  
  var userAgent: js.UndefOr[String] = js.undefined
}
object UserAgent {
  
  inline def apply(): UserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgent]
  }
  
  extension [Self <: UserAgent](x: Self) {
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}

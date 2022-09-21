package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[String | Null] {
  
  var `retry-after`: String | Null
  
  var `x-sentry-rate-limits`: String | Null
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("retry-after")(null)
    __obj.updateDynamic("x-sentry-rate-limits")(null)
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def `setRetry-after`(value: String): Self = StObject.set(x, "retry-after", value.asInstanceOf[js.Any])
    
    inline def `setRetry-afterNull`: Self = StObject.set(x, "retry-after", null)
    
    inline def `setX-sentry-rate-limits`(value: String): Self = StObject.set(x, "x-sentry-rate-limits", value.asInstanceOf[js.Any])
    
    inline def `setX-sentry-rate-limitsNull`: Self = StObject.set(x, "x-sentry-rate-limits", null)
  }
}

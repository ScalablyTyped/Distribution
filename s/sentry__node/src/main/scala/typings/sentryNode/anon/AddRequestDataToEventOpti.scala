package typings.sentryNode.anon

import typings.sentryUtils.anon.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @sentry/utils.@sentry/utils.AddRequestDataToEventOptions & {  flushTimeout :number | undefined} */
trait AddRequestDataToEventOpti extends StObject {
  
  /** Injected platform-specific dependencies */
  var deps: js.UndefOr[Cookie] = js.undefined
  
  var flushTimeout: js.UndefOr[Double] = js.undefined
  
  /** Flags controlling whether each type of data should be added to the event */
  var include: js.UndefOr[typings.sentryUtils.anon.Ip] = js.undefined
}
object AddRequestDataToEventOpti {
  
  inline def apply(): AddRequestDataToEventOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddRequestDataToEventOpti]
  }
  
  extension [Self <: AddRequestDataToEventOpti](x: Self) {
    
    inline def setDeps(value: Cookie): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setFlushTimeout(value: Double): Self = StObject.set(x, "flushTimeout", value.asInstanceOf[js.Any])
    
    inline def setFlushTimeoutUndefined: Self = StObject.set(x, "flushTimeout", js.undefined)
    
    inline def setInclude(value: typings.sentryUtils.anon.Ip): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
  }
}

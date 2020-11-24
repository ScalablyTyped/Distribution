package typings.rollingRateLimiter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncLimiter = typings.rollingRateLimiter.mod.AsyncLimiterWithToken
  
  type AsyncLimiterCallback = js.Function3[
    /* err */ js.Any, 
    /* timeLeft */ scala.Double, 
    /* actionsLeft */ scala.Double, 
    scala.Unit
  ]
  
  type AsyncLimiterWithToken = js.Function2[
    /* token */ java.lang.String, 
    /* callback */ typings.rollingRateLimiter.mod.AsyncLimiterCallback, 
    scala.Unit
  ]
  
  type AsyncLimiterWithoutToken = js.Function1[/* callback */ typings.rollingRateLimiter.mod.AsyncLimiterCallback, scala.Unit]
  
  type InMemoryOptions = typings.rollingRateLimiter.mod.GeneralOptions
  
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[java.lang.String], scala.Double]
  
  type SyncOrAsyncLimiter = typings.rollingRateLimiter.mod.SyncLimiter with typings.rollingRateLimiter.mod.AsyncLimiter
}

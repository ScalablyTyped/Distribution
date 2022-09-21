package typings.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@redis/client/dist/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseTimeout(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseTimeout")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}

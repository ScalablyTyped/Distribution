package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafOptions
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsRetryBusyMod {
  
  @JSImport("rimraf/dist/mjs/retry-busy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rimraf/dist/mjs/retry-busy", "MAXBACKOFF")
  @js.native
  val MAXBACKOFF: /* 200 */ Double = js.native
  
  @JSImport("rimraf/dist/mjs/retry-busy", "MAXRETRIES")
  @js.native
  val MAXRETRIES: /* 10 */ Double = js.native
  
  @JSImport("rimraf/dist/mjs/retry-busy", "RATE")
  @js.native
  val RATE: /* 1.2 */ Double = js.native
  
  @JSImport("rimraf/dist/mjs/retry-busy", "codes")
  @js.native
  val codes: Set[String] = js.native
  
  inline def retryBusy(fn: js.Function1[/* path */ String, js.Promise[Any]]): js.Function4[
    /* path */ String, 
    /* opt */ RimrafAsyncOptions, 
    /* backoff */ js.UndefOr[Double], 
    /* total */ js.UndefOr[Double], 
    js.Promise[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryBusy")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* path */ String, 
    /* opt */ RimrafAsyncOptions, 
    /* backoff */ js.UndefOr[Double], 
    /* total */ js.UndefOr[Double], 
    js.Promise[Any]
  ]]
  
  inline def retryBusySync(fn: js.Function1[/* path */ String, Any]): js.Function2[/* path */ String, /* opt */ RimrafOptions, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryBusySync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* path */ String, /* opt */ RimrafOptions, Any]]
}

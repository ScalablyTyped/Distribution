package typings.sentryBrowser

import typings.sentryTypes.typesTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProfilingHubextensionsMod {
  
  @JSImport("@sentry/browser/types/profiling/hubextensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addProfilingExtensionMethods(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProfilingExtensionMethods")().asInstanceOf[Unit]
  
  inline def onProfilingStartRouteTransaction(): js.UndefOr[Transaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("onProfilingStartRouteTransaction")().asInstanceOf[js.UndefOr[Transaction]]
  inline def onProfilingStartRouteTransaction(transaction: Transaction): js.UndefOr[Transaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("onProfilingStartRouteTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Transaction]]
}

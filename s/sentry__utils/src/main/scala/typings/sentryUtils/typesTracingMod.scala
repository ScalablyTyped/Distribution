package typings.sentryUtils

import typings.sentryTypes.typesTransactionMod.TraceparentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingMod {
  
  @JSImport("@sentry/utils/types/tracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/tracing", "TRACEPARENT_REGEXP")
  @js.native
  val TRACEPARENT_REGEXP: js.RegExp = js.native
  
  inline def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTraceparentData")(traceparent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TraceparentData]]
}

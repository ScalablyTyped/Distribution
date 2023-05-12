package typings.sentryCore

import typings.sentryCore.typesHubMod.Hub
import typings.sentryTypes.typesTransactionMod.TraceparentData
import typings.sentryTypes.typesTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingUtilsMod {
  
  @JSImport("@sentry/core/types/tracing/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/tracing/utils", "TRACEPARENT_REGEXP")
  @js.native
  val TRACEPARENT_REGEXP: js.RegExp = js.native
  
  inline def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTraceparentData")(traceparent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TraceparentData]]
  
  inline def getActiveTransaction[T /* <: Transaction */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")().asInstanceOf[js.UndefOr[T]]
  inline def getActiveTransaction[T /* <: Transaction */](maybeHub: Hub): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTransaction")(maybeHub.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
}

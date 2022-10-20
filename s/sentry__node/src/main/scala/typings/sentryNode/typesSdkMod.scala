package typings.sentryNode

import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import typings.sentryNode.typesClientMod.NodeClient
import typings.sentryNode.typesIntegrationsMod.Console
import typings.sentryNode.typesIntegrationsMod.Context
import typings.sentryNode.typesIntegrationsMod.ContextLines
import typings.sentryNode.typesIntegrationsMod.Http
import typings.sentryNode.typesIntegrationsMod.LinkedErrors
import typings.sentryNode.typesIntegrationsMod.Modules
import typings.sentryNode.typesIntegrationsMod.OnUncaughtException
import typings.sentryNode.typesIntegrationsMod.OnUnhandledRejection
import typings.sentryNode.typesTypesMod.NodeOptions
import typings.sentryTypes.typesStacktraceMod.StackParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSdkMod {
  
  @JSImport("@sentry/node/types/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
  inline def close(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@sentry/node/types/sdk", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    Console | Http | OnUncaughtException | OnUnhandledRejection | ContextLines | LinkedErrors | Modules | Context | InboundFilters | FunctionToString
  ] = js.native
  
  @JSImport("@sentry/node/types/sdk", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def flush(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Promise[Boolean]]
  inline def flush(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getSentryRelease(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")().asInstanceOf[js.UndefOr[String]]
  inline def getSentryRelease(fallback: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")(fallback.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: NodeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isAutoSessionTrackingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoSessionTrackingEnabled")().asInstanceOf[Boolean]
  inline def isAutoSessionTrackingEnabled(client: NodeClient): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoSessionTrackingEnabled")(client.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
}

package typings.sentryInternalTracing

import typings.sentryTypes.typesHubMod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeIntegrationsUtilsNodeUtilsMod {
  
  @JSImport("@sentry-internal/tracing/types/node/integrations/utils/node-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldDisableAutoInstrumentation(getCurrentHub: js.Function0[Hub]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldDisableAutoInstrumentation")(getCurrentHub.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

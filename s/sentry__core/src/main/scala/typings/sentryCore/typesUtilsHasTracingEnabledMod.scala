package typings.sentryCore

import typings.sentryCore.anon.PickOptionsBaseTransportO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsHasTracingEnabledMod {
  
  @JSImport("@sentry/core/types/utils/hasTracingEnabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasTracingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTracingEnabled")().asInstanceOf[Boolean]
  inline def hasTracingEnabled(maybeOptions: PickOptionsBaseTransportO): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasTracingEnabled")(maybeOptions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

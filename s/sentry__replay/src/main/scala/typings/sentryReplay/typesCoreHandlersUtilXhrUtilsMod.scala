package typings.sentryReplay

import typings.sentryReplay.anon.BreadcrumbdataXhrBreadcru
import typings.sentryReplay.anon.ReplayNetworkOptionsrepla
import typings.sentryReplay.anon.TextEncoder
import typings.sentryReplay.typesTypesReplayMod.XhrHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilXhrUtilsMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/xhrUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captureXhrBreadcrumbToReplay(breadcrumb: BreadcrumbdataXhrBreadcru, hint: XhrHint, options: ReplayNetworkOptionsrepla): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureXhrBreadcrumbToReplay")(breadcrumb.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enrichXhrBreadcrumb(breadcrumb: BreadcrumbdataXhrBreadcru, hint: XhrHint, options: TextEncoder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enrichXhrBreadcrumb")(breadcrumb.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

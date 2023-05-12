package typings.sentryReplay

import typings.sentryReplay.anon.BreadcrumbdataFetchBreadc
import typings.sentryReplay.anon.ReplayNetworkOptionstextE
import typings.sentryReplay.anon.TextEncoder
import typings.sentryReplay.typesTypesMod.FetchHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilFetchUtilsMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/fetchUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captureFetchBreadcrumbToReplay(breadcrumb: BreadcrumbdataFetchBreadc, hint: FetchHint, options: ReplayNetworkOptionstextE): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("captureFetchBreadcrumbToReplay")(breadcrumb.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def enrichFetchBreadcrumb(breadcrumb: BreadcrumbdataFetchBreadc, hint: FetchHint, options: TextEncoder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enrichFetchBreadcrumb")(breadcrumb.asInstanceOf[js.Any], hint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.sentryBrowser

import typings.sentryBrowser.backendMod.BrowserOptions
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryBrowser.integrationsMod.Breadcrumbs
import typings.sentryBrowser.integrationsMod.GlobalHandlers
import typings.sentryBrowser.integrationsMod.LinkedErrors
import typings.sentryBrowser.integrationsMod.TryCatch
import typings.sentryBrowser.integrationsMod.UserAgent
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/sdk", JSImport.Namespace)
@js.native
object sdkMod extends js.Object {
  
  def close(): js.Thenable[Boolean] = js.native
  def close(timeout: Double): js.Thenable[Boolean] = js.native
  
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  def flush(): js.Thenable[Boolean] = js.native
  def flush(timeout: Double): js.Thenable[Boolean] = js.native
  
  def forceLoad(): Unit = js.native
  
  def init(): Unit = js.native
  def init(options: BrowserOptions): Unit = js.native
  
  def lastEventId(): js.UndefOr[String] = js.native
  
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  
  def showReportDialog(): Unit = js.native
  def showReportDialog(options: ReportDialogOptions): Unit = js.native
  
  def wrap(fn: js.Function1[/* args */ js.Any, _]): js.Any = js.native
}

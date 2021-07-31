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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkMod {
  
  @JSImport("@sentry/browser/dist/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def close(): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Thenable[Boolean]]
  @scala.inline
  def close(timeout: Double): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Boolean]]
  
  @JSImport("@sentry/browser/dist/sdk", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  @scala.inline
  def flush(): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Thenable[Boolean]]
  @scala.inline
  def flush(timeout: Double): js.Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[Boolean]]
  
  @scala.inline
  def forceLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLoad")().asInstanceOf[Unit]
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  @scala.inline
  def init(options: BrowserOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def onLoad(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def showReportDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")().asInstanceOf[Unit]
  @scala.inline
  def showReportDialog(options: ReportDialogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def wrap(fn: js.Function1[/* args */ js.Any, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}

package typings.reduxSentryMiddleware.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.sentryBrowser.backendMod.BrowserOptions
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryBrowser.integrationsMod.GlobalHandlers
import typings.sentryBrowser.integrationsMod.LinkedErrors
import typings.sentryBrowser.integrationsMod.TryCatch
import typings.sentryBrowser.integrationsMod.UserAgent
import typings.sentryCore.mod.Integrations.FunctionToString
import typings.sentryCore.mod.Integrations.InboundFilters
import typings.sentryHub.hubMod.Hub
import typings.sentryHub.interfacesMod.Carrier
import typings.sentryHub.mod.Scope
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extra
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.optionsMod.Options
import typings.sentryTypes.scopeMod.CaptureContext
import typings.sentryTypes.transactionMod.CustomSamplingContext
import typings.sentryTypes.transactionMod.Transaction
import typings.sentryTypes.transactionMod.TransactionContext
import typings.sentryTypes.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSentry extends js.Object {
  
  var BrowserClient: Instantiable0[typings.sentryBrowser.mod.BrowserClient] = js.native
  
  var Hub: Instantiable0[typings.sentryBrowser.mod.Hub] = js.native
  
  val Integrations: Breadcrumbs = js.native
  
  val SDK_NAME: /* "sentry.javascript.browser" */ String = js.native
  
  val SDK_VERSION: /* "5.27.4" */ String = js.native
  
  var Scope: TypeofScope = js.native
  
  val Severity: TypeofSeverity = js.native
  
  val Status: TypeofStatus = js.native
  
  val Transports: TypeofTransports = js.native
  
  def addBreadcrumb(breadcrumb: Breadcrumb): Unit = js.native
  
  def addGlobalEventProcessor(callback: EventProcessor): Unit = js.native
  
  def captureEvent(event: Event): String = js.native
  
  def captureException(exception: js.Any): String = js.native
  def captureException(exception: js.Any, captureContext: CaptureContext): String = js.native
  
  def captureMessage(message: String): String = js.native
  def captureMessage(message: String, captureContext: CaptureContext): String = js.native
  def captureMessage(message: String, captureContext: typings.sentryTypes.severityMod.Severity): String = js.native
  
  def close(): js.Thenable[Boolean] = js.native
  def close(timeout: Double): js.Thenable[Boolean] = js.native
  
  def configureScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = js.native
  
  val defaultIntegrations: js.Array[
    FunctionToString | InboundFilters | GlobalHandlers | TryCatch | typings.sentryBrowser.integrationsMod.Breadcrumbs | LinkedErrors | UserAgent
  ] = js.native
  
  def eventFromException(options: Options, exception: js.Any): js.Thenable[Event] = js.native
  def eventFromException(options: Options, exception: js.Any, hint: EventHint): js.Thenable[Event] = js.native
  
  def eventFromMessage(options: Options, message: String): js.Thenable[Event] = js.native
  def eventFromMessage(options: Options, message: String, level: js.UndefOr[scala.Nothing], hint: EventHint): js.Thenable[Event] = js.native
  def eventFromMessage(options: Options, message: String, level: typings.sentryTypes.severityMod.Severity): js.Thenable[Event] = js.native
  def eventFromMessage(
    options: Options,
    message: String,
    level: typings.sentryTypes.severityMod.Severity,
    hint: EventHint
  ): js.Thenable[Event] = js.native
  
  def flush(): js.Thenable[Boolean] = js.native
  def flush(timeout: Double): js.Thenable[Boolean] = js.native
  
  def forceLoad(): Unit = js.native
  
  def getCurrentHub(): Hub = js.native
  
  def getHubFromCarrier(carrier: Carrier): Hub = js.native
  
  def init(): Unit = js.native
  def init(options: BrowserOptions): Unit = js.native
  
  def injectReportDialog(): Unit = js.native
  def injectReportDialog(options: ReportDialogOptions): Unit = js.native
  
  def lastEventId(): js.UndefOr[String] = js.native
  
  def makeMain(hub: Hub): Hub = js.native
  
  def onLoad(callback: js.Function0[Unit]): Unit = js.native
  
  def setContext(name: String): Unit = js.native
  def setContext(name: String, context: StringDictionary[js.Any]): Unit = js.native
  
  def setExtra(key: String, extra: Extra): Unit = js.native
  
  def setExtras(extras: Extras): Unit = js.native
  
  def setTag(key: String, value: String): Unit = js.native
  
  def setTags(tags: StringDictionary[String]): Unit = js.native
  
  def setUser(): Unit = js.native
  def setUser(user: User): Unit = js.native
  
  def showReportDialog(): Unit = js.native
  def showReportDialog(options: ReportDialogOptions): Unit = js.native
  
  def startTransaction(context: TransactionContext): Transaction = js.native
  def startTransaction(context: TransactionContext, customSamplingContext: CustomSamplingContext): Transaction = js.native
  
  def withScope(callback: js.Function1[/* scope */ Scope, Unit]): Unit = js.native
  
  def wrap(fn: js.Function1[/* args */ js.Any, _]): js.Any = js.native
}

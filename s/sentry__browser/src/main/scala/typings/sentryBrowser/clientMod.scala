package typings.sentryBrowser

import typings.sentryBrowser.backendMod.BrowserBackend
import typings.sentryBrowser.backendMod.BrowserOptions
import typings.sentryBrowser.helpersMod.ReportDialogOptions
import typings.sentryCore.mod.BaseClient
import typings.sentryCore.mod.Scope
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("@sentry/browser/dist/client", "BrowserClient")
  @js.native
  /**
    * Creates a new Browser SDK instance.
    *
    * @param options Configuration options for this SDK.
    */
  class BrowserClient () extends BaseClient[BrowserBackend, BrowserOptions] {
    def this(options: BrowserOptions) = this()
    
    /* protected */ def _prepareEvent(event: Event, scope: Scope): js.Thenable[Event | Null] = js.native
    /* protected */ def _prepareEvent(event: Event, scope: Scope, hint: EventHint): js.Thenable[Event | Null] = js.native
    
    /**
      * Show a report dialog to the user to send feedback to a specific event.
      *
      * @param options Set individual options for the dialog
      */
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: ReportDialogOptions): Unit = js.native
  }
}

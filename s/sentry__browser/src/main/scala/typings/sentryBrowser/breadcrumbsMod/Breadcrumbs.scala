package typings.sentryBrowser.breadcrumbsMod

import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.integrationMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/browser/dist/integrations/breadcrumbs", "Breadcrumbs")
@js.native
/**
  * @inheritDoc
  */
class Breadcrumbs () extends Integration {
  def this(options: PartialBreadcrumbsOptions) = this()
  
  /**
    * Creates breadcrumbs from console API calls
    */
  var _consoleBreadcrumb: js.Any = js.native
  
  /**
    * Creates breadcrumbs from DOM API calls
    */
  var _domBreadcrumb: js.Any = js.native
  
  /**
    * Creates breadcrumbs from fetch API calls
    */
  var _fetchBreadcrumb: js.Any = js.native
  
  /**
    * Creates breadcrumbs from history API calls
    */
  var _historyBreadcrumb: js.Any = js.native
  
  /** JSDoc */
  val _options: js.Any = js.native
  
  /**
    * Creates breadcrumbs from XHR API calls
    */
  var _xhrBreadcrumb: js.Any = js.native
  
  /**
    * Create a breadcrumb of `sentry` from the events themselves
    */
  def addSentryBreadcrumb(event: Event): Unit = js.native
  
  /**
    * Instrument browser built-ins w/ breadcrumb capturing
    *  - Console API
    *  - DOM API (click/typing)
    *  - XMLHttpRequest API
    *  - Fetch API
    *  - History API
    */
  def setupOnce(): Unit = js.native
}
/* static members */
@JSImport("@sentry/browser/dist/integrations/breadcrumbs", "Breadcrumbs")
@js.native
object Breadcrumbs extends js.Object {
  
  /**
    * @inheritDoc
    */
  var id: String = js.native
}

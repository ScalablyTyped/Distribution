package typings.raygun4js.mod

import typings.raygun4js.anon.Path
import typings.raygun4js.raygun4jsStrings.Clicks
import typings.raygun4js.raygun4jsStrings.Console
import typings.raygun4js.raygun4jsStrings.Navigation
import typings.raygun4js.raygun4jsStrings.XHR
import typings.raygun4js.raygun4jsStrings.all
import typings.raygun4js.raygun4jsStrings.breadcrumbsLevel
import typings.raygun4js.raygun4jsStrings.customData
import typings.raygun4js.raygun4jsStrings.debug
import typings.raygun4js.raygun4jsStrings.error
import typings.raygun4js.raygun4jsStrings.info
import typings.raygun4js.raygun4jsStrings.pageView
import typings.raygun4js.raygun4jsStrings.warning
import typings.std.Error
import typings.std.RegExp
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunStatic extends js.Object {
  /**
    * Attaches to the `window.onerror` handler. Enables unhandled errors to be automatically tracked.
    */
  def attach(): RaygunStatic = js.native
  /**
    * Creates a new Raygun object. Allows the sending of errors to different applications.
    */
  def constructNewRaygun(): RaygunStatic = js.native
  /**
    * Detaches the handler from the window.onerror method. Unhandled errors will no longer be tracked.
    */
  def detach(): RaygunStatic = js.native
  /**
    * Disables all breadcrumbs or a type can be passed to disable only that one.
    */
  def disableAutoBreadcrumbs(): Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_Clicks(`type`: Clicks): Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_Console(`type`: Console): Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_Navigation(`type`: Navigation): Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_XHR(`type`: XHR): Unit = js.native
  /**
    * Enables all breadcrumbs level or a type can be passed which will enable only that passed one.
    */
  def enableAutoBreadcrumbs(): Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_Clicks(`type`: Clicks): Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_Console(`type`: Console): Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_Navigation(`type`: Navigation): Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_XHR(`type`: XHR): Unit = js.native
  def endSession(): Unit = js.native
  /**
    * Blacklist keys to prevent their values from being sent to Raygun.
    */
  def filterSensitiveData(filteredKeys: js.Array[String | RegExp]): RaygunStatic = js.native
  /**
    * Overrides the default automatic grouping and instead group errors together by the string returned by the callback.
    */
  def groupingKey(
    callback: js.Function3[
      /* payload */ RaygunPayload, 
      /* stackTrace */ TracekitStackTrace, 
      /* options */ js.Any, 
      String | Unit
    ]
  ): RaygunStatic = js.native
  /**
    * Configures the Raygun provider.
    */
  def init(apiKey: String): RaygunStatic = js.native
  def init(apiKey: String, options: RaygunOptions): RaygunStatic = js.native
  def init(apiKey: String, options: RaygunOptions, customdata: js.Any): RaygunStatic = js.native
  /**
    * Prevents Raygun from overwriting anything bound to `window.Raygun`.
    */
  def noConflict(): RaygunStatic = js.native
  def onAfterSend(callback: js.Function1[/* response */ XMLHttpRequest, Unit]): RaygunStatic = js.native
  /**
    * Executed before the payload is sent. If a truthy object is returned, Raygun will attempt to use that as the payload. Raygun will abort the send if `false` is returned.
    */
  def onBeforeSend(callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | Boolean]): RaygunStatic = js.native
  def onBeforeXHR(callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): RaygunStatic = js.native
  /**
    * Records a manual breadcrumb with the given message and metadata passed.
    */
  def recordBreadcrumb(message: String): Unit = js.native
  def recordBreadcrumb(message: String, metadata: js.Any): Unit = js.native
  /**
    * Resets the information about the current user.
    */
  def resetAnonymousUser(): Unit = js.native
  /**
    * Whether caught errors should be saved in Local Storage when there is no network activity. Saved errors will be send when another error occurs, and activity is regained. Disabled by default.
    */
  def saveIfOffline(enableOffline: Boolean): RaygunStatic = js.native
  /**
    * Sends an error/exception to the Raygun Api.
    */
  def send(ex: Error): RaygunStatic = js.native
  def send(ex: Error, customData: js.Any): RaygunStatic = js.native
  def send(ex: Error, customData: js.Any, tags: js.Array[String]): RaygunStatic = js.native
  /**
    * Pass "breadcrumbsLevel" alongside a valid breadcrumbs level to set the current level. Passing options other than "breadcrumbsLevel" will set xhr hosts to ignore being
    */
  def setBreadcrumbOption(): Unit = js.native
  def setBreadcrumbOption(option: String): Unit = js.native
  def setBreadcrumbOption(option: String, value: String): Unit = js.native
  def setBreadcrumbOption(option: breadcrumbsLevel, value: debug): Unit = js.native
  def setBreadcrumbOption(option: breadcrumbsLevel, value: error): Unit = js.native
  def setBreadcrumbOption(option: breadcrumbsLevel, value: info): Unit = js.native
  def setBreadcrumbOption(option: breadcrumbsLevel, value: warning): Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_breadcrumbsLevel(option: breadcrumbsLevel): Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_breadcrumbsLevel(option: breadcrumbsLevel, value: String): Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_debug(option: String, value: debug): Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_error(option: String, value: error): Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_info(option: String, value: info): Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_warning(option: String, value: warning): Unit = js.native
  /**
    * Change the scope at which filters are applied. Defaults to `customData` by default.
    */
  @JSName("setFilterScope")
  def setFilterScope_all(scope: all): RaygunStatic = js.native
  @JSName("setFilterScope")
  def setFilterScope_customData(scope: customData): RaygunStatic = js.native
  /**
    * Provides additional information about the current user.
    */
  def setUser(user: String): RaygunStatic = js.native
  def setUser(user: String, isAnonymous: Boolean): RaygunStatic = js.native
  def setUser(user: String, isAnonymous: Boolean, email: String): RaygunStatic = js.native
  def setUser(user: String, isAnonymous: Boolean, email: String, fullName: String): RaygunStatic = js.native
  def setUser(user: String, isAnonymous: Boolean, email: String, fullName: String, firstName: String): RaygunStatic = js.native
  def setUser(
    user: String,
    isAnonymous: Boolean,
    email: String,
    fullName: String,
    firstName: String,
    uuid: String
  ): RaygunStatic = js.native
  /**
    * Allows errors to be filtered by version in the Raygun Dashboard. Versions should be in the format `x.x.x`
    */
  def setVersion(version: String): RaygunStatic = js.native
  /**
    * Track Single Page Application route events.
    */
  @JSName("trackEvent")
  def trackEvent_pageView(`type`: pageView, options: Path): Unit = js.native
  /**
    * Whitelist damains which should transmit errors to Raygun.
    */
  def whitelistCrossOriginDomains(whitelist: js.Array[String]): RaygunStatic = js.native
  /**
    * Attaches custom data to any errors sent to Raygun.
    */
  def withCustomData(customdata: js.Any): RaygunStatic = js.native
  /**
    * Allows errors to be filtered by tag in the Raygun Dashboard.
    */
  def withTags(tags: js.Array[String]): RaygunStatic = js.native
}


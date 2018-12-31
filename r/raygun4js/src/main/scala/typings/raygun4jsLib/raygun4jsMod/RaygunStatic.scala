package typings
package raygun4jsLib.raygun4jsMod

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
  def disableAutoBreadcrumbs(): scala.Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_Clicks(`type`: raygun4jsLib.raygun4jsLibStrings.Clicks): scala.Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_Console(`type`: raygun4jsLib.raygun4jsLibStrings.Console): scala.Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_Navigation(`type`: raygun4jsLib.raygun4jsLibStrings.Navigation): scala.Unit = js.native
  @JSName("disableAutoBreadcrumbs")
  def disableAutoBreadcrumbs_XHR(`type`: raygun4jsLib.raygun4jsLibStrings.XHR): scala.Unit = js.native
  /**
    * Enables all breadcrumbs level or a type can be passed which will enable only that passed one.
    */
  def enableAutoBreadcrumbs(): scala.Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_Clicks(`type`: raygun4jsLib.raygun4jsLibStrings.Clicks): scala.Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_Console(`type`: raygun4jsLib.raygun4jsLibStrings.Console): scala.Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_Navigation(`type`: raygun4jsLib.raygun4jsLibStrings.Navigation): scala.Unit = js.native
  @JSName("enableAutoBreadcrumbs")
  def enableAutoBreadcrumbs_XHR(`type`: raygun4jsLib.raygun4jsLibStrings.XHR): scala.Unit = js.native
  def endSession(): scala.Unit = js.native
  /**
    * Blacklist keys to prevent their values from being sent to Raygun.
    */
  def filterSensitiveData(filteredKeys: js.Array[java.lang.String | stdLib.RegExp]): RaygunStatic = js.native
  /**
    * Overrides the default automatic grouping and instead group errors together by the string returned by the callback.
    */
  def groupingKey(
    callback: js.Function3[
      /* payload */ RaygunPayload, 
      /* stackTrace */ TracekitStackTrace, 
      /* options */ js.Any, 
      java.lang.String | scala.Unit
    ]
  ): RaygunStatic = js.native
  /**
    * Configures the Raygun provider.
    */
  def init(apiKey: java.lang.String): RaygunStatic = js.native
  def init(apiKey: java.lang.String, options: RaygunOptions): RaygunStatic = js.native
  def init(apiKey: java.lang.String, options: RaygunOptions, customdata: js.Any): RaygunStatic = js.native
  /**
    * Prevents Raygun from overwriting anything bound to `window.Raygun`.
    */
  def noConflict(): RaygunStatic = js.native
  def onAfterSend(callback: js.Function1[/* response */ stdLib.XMLHttpRequest, scala.Unit]): RaygunStatic = js.native
  /**
    * Executed before the payload is sent. If a truthy object is returned, Raygun will attempt to use that as the payload. Raygun will abort the send if `false` is returned.
    */
  def onBeforeSend(callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | scala.Boolean]): RaygunStatic = js.native
  def onBeforeXHR(callback: js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]): RaygunStatic = js.native
  /**
    * Records a manual breadcrumb with the given message and metadata passed.
    */
  def recordBreadcrumb(message: java.lang.String): scala.Unit = js.native
  def recordBreadcrumb(message: java.lang.String, metadata: js.Any): scala.Unit = js.native
  /**
    * Resets the information about the current user.
    */
  def resetAnonymousUser(): scala.Unit = js.native
  /**
    * Whether caught errors should be saved in Local Storage when there is no network activity. Saved errors will be send when another error occurs, and activity is regained. Disabled by default.
    */
  def saveIfOffline(enableOffline: scala.Boolean): RaygunStatic = js.native
  /**
    * Sends an error/exception to the Raygun Api.
    */
  def send(ex: stdLib.Error): RaygunStatic = js.native
  def send(ex: stdLib.Error, customData: js.Any): RaygunStatic = js.native
  def send(ex: stdLib.Error, customData: js.Any, tags: js.Array[java.lang.String]): RaygunStatic = js.native
  /**
    * Pass "breadcrumbsLevel" alongside a valid breadcrumbs level to set the current level. Passing options other than "breadcrumbsLevel" will set xhr hosts to ignore being
    */
  def setBreadcrumbOption(): scala.Unit = js.native
  def setBreadcrumbOption(option: java.lang.String): scala.Unit = js.native
  def setBreadcrumbOption(option: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setBreadcrumbOption(
    option: raygun4jsLib.raygun4jsLibStrings.breadcrumbsLevel,
    value: raygun4jsLib.raygun4jsLibStrings.debug
  ): scala.Unit = js.native
  def setBreadcrumbOption(
    option: raygun4jsLib.raygun4jsLibStrings.breadcrumbsLevel,
    value: raygun4jsLib.raygun4jsLibStrings.error
  ): scala.Unit = js.native
  def setBreadcrumbOption(
    option: raygun4jsLib.raygun4jsLibStrings.breadcrumbsLevel,
    value: raygun4jsLib.raygun4jsLibStrings.info
  ): scala.Unit = js.native
  def setBreadcrumbOption(
    option: raygun4jsLib.raygun4jsLibStrings.breadcrumbsLevel,
    value: raygun4jsLib.raygun4jsLibStrings.warning
  ): scala.Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_breadcrumbsLevel(option: raygun4jsLib.raygun4jsLibStrings.breadcrumbsLevel): scala.Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_breadcrumbsLevel(option: raygun4jsLib.raygun4jsLibStrings.breadcrumbsLevel, value: java.lang.String): scala.Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_debug(option: java.lang.String, value: raygun4jsLib.raygun4jsLibStrings.debug): scala.Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_error(option: java.lang.String, value: raygun4jsLib.raygun4jsLibStrings.error): scala.Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_info(option: java.lang.String, value: raygun4jsLib.raygun4jsLibStrings.info): scala.Unit = js.native
  @JSName("setBreadcrumbOption")
  def setBreadcrumbOption_warning(option: java.lang.String, value: raygun4jsLib.raygun4jsLibStrings.warning): scala.Unit = js.native
  /**
    * Change the scope at which filters are applied. Defaults to `customData` by default.
    */
  @JSName("setFilterScope")
  def setFilterScope_all(scope: raygun4jsLib.raygun4jsLibStrings.all): RaygunStatic = js.native
  @JSName("setFilterScope")
  def setFilterScope_customData(scope: raygun4jsLib.raygun4jsLibStrings.customData): RaygunStatic = js.native
  /**
    * Provides additional information about the current user.
    */
  def setUser(user: java.lang.String): RaygunStatic = js.native
  def setUser(user: java.lang.String, isAnonymous: scala.Boolean): RaygunStatic = js.native
  def setUser(user: java.lang.String, isAnonymous: scala.Boolean, email: java.lang.String): RaygunStatic = js.native
  def setUser(
    user: java.lang.String,
    isAnonymous: scala.Boolean,
    email: java.lang.String,
    fullName: java.lang.String
  ): RaygunStatic = js.native
  def setUser(
    user: java.lang.String,
    isAnonymous: scala.Boolean,
    email: java.lang.String,
    fullName: java.lang.String,
    firstName: java.lang.String
  ): RaygunStatic = js.native
  def setUser(
    user: java.lang.String,
    isAnonymous: scala.Boolean,
    email: java.lang.String,
    fullName: java.lang.String,
    firstName: java.lang.String,
    uuid: java.lang.String
  ): RaygunStatic = js.native
  /**
    * Allows errors to be filtered by version in the Raygun Dashboard. Versions should be in the format `x.x.x`
    */
  def setVersion(version: java.lang.String): RaygunStatic = js.native
  /**
    * Track Single Page Application route events.
    */
  @JSName("trackEvent")
  def trackEvent_pageView(`type`: raygun4jsLib.raygun4jsLibStrings.pageView, options: raygun4jsLib.Anon_Path): scala.Unit = js.native
  /**
    * Whitelist damains which should transmit errors to Raygun.
    */
  def whitelistCrossOriginDomains(whitelist: js.Array[java.lang.String]): RaygunStatic = js.native
  /**
    * Attaches custom data to any errors sent to Raygun.
    */
  def withCustomData(customdata: js.Any): RaygunStatic = js.native
  /**
    * Allows errors to be filtered by tag in the Raygun Dashboard.
    */
  def withTags(tags: js.Array[java.lang.String]): RaygunStatic = js.native
}


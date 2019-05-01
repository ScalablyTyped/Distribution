package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunV2 extends js.Object {
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.detach | raygun4jsLib.raygun4jsLibStrings.disableAutoBreadcrumbs | raygun4jsLib.raygun4jsLibStrings.enableAutoBreadcrumbs | raygun4jsLib.raygun4jsLibStrings.disableAutoBreadcrumbsConsole | raygun4jsLib.raygun4jsLibStrings.enableAutoBreadcrumbsConsole | raygun4jsLib.raygun4jsLibStrings.disableAutoBreadcrumbsNavigation | raygun4jsLib.raygun4jsLibStrings.enableAutoBreadcrumbsNavigation | raygun4jsLib.raygun4jsLibStrings.disableAutoBreadcrumbsClicks | raygun4jsLib.raygun4jsLibStrings.enableAutoBreadcrumbsClicks | raygun4jsLib.raygun4jsLibStrings.disableAutoBreadcrumbsXHR | raygun4jsLib.raygun4jsLibStrings.enableAutoBreadcrumbsXHR | raygun4jsLib.raygun4jsLibStrings.setAutoBreadcrumbsXHRIgnoredHosts
  ): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.apiKey, value: java.lang.String): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.attach, value: scala.Boolean): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.enableCrashReporting, value: scala.Boolean): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.enablePulse, value: scala.Boolean): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.filterSensitiveData, values: js.Array[java.lang.String]): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.getRaygunInstance): RaygunStatic = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.groupingKey,
    value: js.Function3[
      /* payload */ RaygunPayload, 
      /* stackTrace */ TracekitStackTrace, 
      /* options */ js.Any, 
      java.lang.String | scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.noConflict, value: scala.Boolean): scala.Unit = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.onAfterSend,
    callback: js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.onBeforeSend,
    callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | scala.Boolean]
  ): scala.Unit = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.onBeforeXHR,
    callback: js.Function1[/* xhr */ stdLib.XMLHttpRequest, scala.Unit]
  ): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.options, value: RaygunOptions): scala.Unit = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.recordBreadcrumb,
    message: java.lang.String,
    metadata: js.Object
  ): scala.Unit = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.recordBreadcrumb,
    message: raygun4jsLib.Anon_Level,
    metadata: js.Object
  ): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.saveIfOffline, value: scala.Boolean): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.send, value: js.Any): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.setBreadcrumbLevel, level: BreadcrumbLevel): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.setFilterScope, value: java.lang.String): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.setUser, value: RaygunV2UserDetails): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.setVersion, value: java.lang.String): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.trackEvent, value: raygun4jsLib.Anon_PathType): scala.Unit = js.native
  def apply(
    key: raygun4jsLib.raygun4jsLibStrings.whitelistCrossOriginDomains,
    values: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.withCustomData, value: js.Any): scala.Unit = js.native
  def apply(key: raygun4jsLib.raygun4jsLibStrings.withTags, values: js.Array[java.lang.String]): scala.Unit = js.native
}


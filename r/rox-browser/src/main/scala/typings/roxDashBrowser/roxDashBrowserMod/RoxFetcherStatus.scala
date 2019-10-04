package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxFetcherStatus extends js.Object

@JSImport("rox-browser", "RoxFetcherStatus")
@js.native
object RoxFetcherStatus extends js.Object {
  @js.native
  sealed trait AppliedFromCache extends RoxFetcherStatus
  
  @js.native
  sealed trait AppliedFromEmbedded extends RoxFetcherStatus
  
  @js.native
  sealed trait AppliedFromNetwork extends RoxFetcherStatus
  
  @js.native
  sealed trait ErrorFetchFailed extends RoxFetcherStatus
  
  /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.AppliedFromCache with String = js.native
  /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.AppliedFromEmbedded with String = js.native
  /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.AppliedFromNetwork with String = js.native
  /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxDashBrowser.roxDashBrowserMod.RoxFetcherStatus.ErrorFetchFailed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
}


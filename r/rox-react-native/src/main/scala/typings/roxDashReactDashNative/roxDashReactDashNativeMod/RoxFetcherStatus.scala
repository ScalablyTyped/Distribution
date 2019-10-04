package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxFetcherStatus extends js.Object

@JSImport("rox-react-native", "RoxFetcherStatus")
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
  
  /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxDashReactDashNative.roxDashReactDashNativeMod.RoxFetcherStatus.AppliedFromCache with String = js.native
  /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxDashReactDashNative.roxDashReactDashNativeMod.RoxFetcherStatus.AppliedFromEmbedded with String = js.native
  /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxDashReactDashNative.roxDashReactDashNativeMod.RoxFetcherStatus.AppliedFromNetwork with String = js.native
  /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxDashReactDashNative.roxDashReactDashNativeMod.RoxFetcherStatus.ErrorFetchFailed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
}


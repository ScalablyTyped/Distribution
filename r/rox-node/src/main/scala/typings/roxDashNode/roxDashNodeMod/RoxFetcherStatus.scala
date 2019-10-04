package typings.roxDashNode.roxDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxFetcherStatus extends js.Object

@JSImport("rox-node", "RoxFetcherStatus")
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
  
  /* "APPLIED_FROM_CACHE" */ val AppliedFromCache: typings.roxDashNode.roxDashNodeMod.RoxFetcherStatus.AppliedFromCache with String = js.native
  /* "APPLIED_FROM_EMBEDDED" */ val AppliedFromEmbedded: typings.roxDashNode.roxDashNodeMod.RoxFetcherStatus.AppliedFromEmbedded with String = js.native
  /* "APPLIED_FROM_NETWORK" */ val AppliedFromNetwork: typings.roxDashNode.roxDashNodeMod.RoxFetcherStatus.AppliedFromNetwork with String = js.native
  /* "ERROR_FETCH_FAILED" */ val ErrorFetchFailed: typings.roxDashNode.roxDashNodeMod.RoxFetcherStatus.ErrorFetchFailed with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
}


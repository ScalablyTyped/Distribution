package typings.roxNode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoxFetcherStatus extends js.Object
@JSImport("rox-node", "RoxFetcherStatus")
@js.native
object RoxFetcherStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
  
  @js.native
  sealed trait AppliedFromCache extends RoxFetcherStatus
  /* "APPLIED_FROM_CACHE" */ @js.native
  object AppliedFromCache extends TopLevel[AppliedFromCache with String]
  
  @js.native
  sealed trait AppliedFromEmbedded extends RoxFetcherStatus
  /* "APPLIED_FROM_EMBEDDED" */ @js.native
  object AppliedFromEmbedded extends TopLevel[AppliedFromEmbedded with String]
  
  @js.native
  sealed trait AppliedFromNetwork extends RoxFetcherStatus
  /* "APPLIED_FROM_NETWORK" */ @js.native
  object AppliedFromNetwork extends TopLevel[AppliedFromNetwork with String]
  
  @js.native
  sealed trait ErrorFetchFailed extends RoxFetcherStatus
  /* "ERROR_FETCH_FAILED" */ @js.native
  object ErrorFetchFailed extends TopLevel[ErrorFetchFailed with String]
}

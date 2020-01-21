package typings.roxReactNative.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFetcherStatus with String] = js.native
  /* "APPLIED_FROM_CACHE" */ @js.native
  object AppliedFromCache extends TopLevel[AppliedFromCache with String]
  
  /* "APPLIED_FROM_EMBEDDED" */ @js.native
  object AppliedFromEmbedded extends TopLevel[AppliedFromEmbedded with String]
  
  /* "APPLIED_FROM_NETWORK" */ @js.native
  object AppliedFromNetwork extends TopLevel[AppliedFromNetwork with String]
  
  /* "ERROR_FETCH_FAILED" */ @js.native
  object ErrorFetchFailed extends TopLevel[ErrorFetchFailed with String]
  
}


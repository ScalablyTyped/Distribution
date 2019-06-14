package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RequestExecutorErrors extends js.Object

@JSGlobal("SP.RequestExecutorErrors")
@js.native
object RequestExecutorErrors extends js.Object {
  @js.native
  sealed trait domainDoesNotMatch
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  @js.native
  sealed trait httpError
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  @js.native
  sealed trait iFrameLoadError
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  @js.native
  sealed trait noAppWeb
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  @js.native
  sealed trait noTrustedOrigins
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  @js.native
  sealed trait requestAbortedOrTimedout
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  @js.native
  sealed trait unexpectedResponse
    extends sharepointLib.SPNs.RequestExecutorErrors
  
  /* 4 */ val domainDoesNotMatch: domainDoesNotMatch with scala.Double = js.native
  /* 2 */ val httpError: httpError with scala.Double = js.native
  /* 6 */ val iFrameLoadError: iFrameLoadError with scala.Double = js.native
  /* 3 */ val noAppWeb: noAppWeb with scala.Double = js.native
  /* 5 */ val noTrustedOrigins: noTrustedOrigins with scala.Double = js.native
  /* 0 */ val requestAbortedOrTimedout: requestAbortedOrTimedout with scala.Double = js.native
  /* 1 */ val unexpectedResponse: unexpectedResponse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.RequestExecutorErrors with scala.Double] = js.native
}


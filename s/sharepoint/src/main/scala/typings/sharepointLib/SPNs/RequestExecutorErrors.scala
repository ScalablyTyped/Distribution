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
  
  val domainDoesNotMatch: domainDoesNotMatch with java.lang.String = js.native
  val httpError: httpError with java.lang.String = js.native
  val iFrameLoadError: iFrameLoadError with java.lang.String = js.native
  val noAppWeb: noAppWeb with java.lang.String = js.native
  val noTrustedOrigins: noTrustedOrigins with java.lang.String = js.native
  val requestAbortedOrTimedout: requestAbortedOrTimedout with java.lang.String = js.native
  val unexpectedResponse: unexpectedResponse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.RequestExecutorErrors with java.lang.String] = js.native
}


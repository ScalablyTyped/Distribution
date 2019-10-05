package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RequestExecutorErrors extends js.Object

@JSGlobal("SP.RequestExecutorErrors")
@js.native
object RequestExecutorErrors extends js.Object {
  @js.native
  sealed trait domainDoesNotMatch extends RequestExecutorErrors
  
  @js.native
  sealed trait httpError extends RequestExecutorErrors
  
  @js.native
  sealed trait iFrameLoadError extends RequestExecutorErrors
  
  @js.native
  sealed trait noAppWeb extends RequestExecutorErrors
  
  @js.native
  sealed trait noTrustedOrigins extends RequestExecutorErrors
  
  @js.native
  sealed trait requestAbortedOrTimedout extends RequestExecutorErrors
  
  @js.native
  sealed trait unexpectedResponse extends RequestExecutorErrors
  
  /* 4 */ val domainDoesNotMatch: typings.sharepoint.SP.RequestExecutorErrors.domainDoesNotMatch with Double = js.native
  /* 2 */ val httpError: typings.sharepoint.SP.RequestExecutorErrors.httpError with Double = js.native
  /* 6 */ val iFrameLoadError: typings.sharepoint.SP.RequestExecutorErrors.iFrameLoadError with Double = js.native
  /* 3 */ val noAppWeb: typings.sharepoint.SP.RequestExecutorErrors.noAppWeb with Double = js.native
  /* 5 */ val noTrustedOrigins: typings.sharepoint.SP.RequestExecutorErrors.noTrustedOrigins with Double = js.native
  /* 0 */ val requestAbortedOrTimedout: typings.sharepoint.SP.RequestExecutorErrors.requestAbortedOrTimedout with Double = js.native
  /* 1 */ val unexpectedResponse: typings.sharepoint.SP.RequestExecutorErrors.unexpectedResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestExecutorErrors with Double] = js.native
}


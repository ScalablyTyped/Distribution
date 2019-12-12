package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.RequestExecutorErrors.domainDoesNotMatch
import typings.sharepoint.SP.RequestExecutorErrors.httpError
import typings.sharepoint.SP.RequestExecutorErrors.iFrameLoadError
import typings.sharepoint.SP.RequestExecutorErrors.noAppWeb
import typings.sharepoint.SP.RequestExecutorErrors.noTrustedOrigins
import typings.sharepoint.SP.RequestExecutorErrors.requestAbortedOrTimedout
import typings.sharepoint.SP.RequestExecutorErrors.unexpectedResponse
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RequestExecutorErrors with Double] = js.native
  /* 4 */ @js.native
  object domainDoesNotMatch extends TopLevel[domainDoesNotMatch with Double]
  
  /* 2 */ @js.native
  object httpError extends TopLevel[httpError with Double]
  
  /* 6 */ @js.native
  object iFrameLoadError extends TopLevel[iFrameLoadError with Double]
  
  /* 3 */ @js.native
  object noAppWeb extends TopLevel[noAppWeb with Double]
  
  /* 5 */ @js.native
  object noTrustedOrigins extends TopLevel[noTrustedOrigins with Double]
  
  /* 0 */ @js.native
  object requestAbortedOrTimedout extends TopLevel[requestAbortedOrTimedout with Double]
  
  /* 1 */ @js.native
  object unexpectedResponse extends TopLevel[unexpectedResponse with Double]
  
}


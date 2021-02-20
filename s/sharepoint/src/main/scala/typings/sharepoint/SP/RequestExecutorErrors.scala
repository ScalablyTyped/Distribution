package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestExecutorErrors extends StObject
@JSGlobal("SP.RequestExecutorErrors")
@js.native
object RequestExecutorErrors extends StObject {
  
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
}

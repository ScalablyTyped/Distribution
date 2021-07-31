package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestExecutorErrors extends StObject
@JSGlobal("SP.RequestExecutorErrors")
@js.native
object RequestExecutorErrors extends StObject {
  
  @js.native
  sealed trait domainDoesNotMatch
    extends StObject
       with RequestExecutorErrors
  
  @js.native
  sealed trait httpError
    extends StObject
       with RequestExecutorErrors
  
  @js.native
  sealed trait iFrameLoadError
    extends StObject
       with RequestExecutorErrors
  
  @js.native
  sealed trait noAppWeb
    extends StObject
       with RequestExecutorErrors
  
  @js.native
  sealed trait noTrustedOrigins
    extends StObject
       with RequestExecutorErrors
  
  @js.native
  sealed trait requestAbortedOrTimedout
    extends StObject
       with RequestExecutorErrors
  
  @js.native
  sealed trait unexpectedResponse
    extends StObject
       with RequestExecutorErrors
}

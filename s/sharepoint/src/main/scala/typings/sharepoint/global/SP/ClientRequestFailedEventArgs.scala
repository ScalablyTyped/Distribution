package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientRequestFailedEventArgs")
@js.native
open class ClientRequestFailedEventArgs protected ()
  extends StObject
     with typings.sharepoint.SP.ClientRequestFailedEventArgs {
  def this(
    request: typings.sharepoint.SP.ClientRequest,
    message: String,
    stackTrace: String,
    errorCode: Double,
    errorValue: String,
    errorTypeName: String,
    errorDetails: Any
  ) = this()
  def this(
    request: typings.sharepoint.SP.ClientRequest,
    message: String,
    stackTrace: String,
    errorCode: Double,
    errorValue: String,
    errorTypeName: String,
    errorDetails: Any,
    errorTraceCorrelationId: String
  ) = this()
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: EventArgs = js.native
  
  /* CompleteClass */
  override def get_errorCode(): Double = js.native
  
  /* CompleteClass */
  override def get_errorDetails(): Any = js.native
  
  /* CompleteClass */
  override def get_errorTraceCorrelationId(): String = js.native
  
  /* CompleteClass */
  override def get_errorTypeName(): String = js.native
  
  /* CompleteClass */
  override def get_errorValue(): String = js.native
  
  /* CompleteClass */
  override def get_message(): String = js.native
  
  /* CompleteClass */
  override def get_request(): typings.sharepoint.SP.ClientRequest = js.native
  
  /* CompleteClass */
  override def get_stackTrace(): String = js.native
}

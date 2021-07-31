package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestExecutor extends StObject {
  
  def attemptLogin(returnUrl: String, success: js.Function1[/* response */ ResponseInfo, Unit]): Unit = js.native
  def attemptLogin(
    returnUrl: String,
    success: js.Function1[/* response */ ResponseInfo, Unit],
    error: js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ String, 
      Unit
    ]
  ): Unit = js.native
  
  def executeAsync(requestInfo: RequestInfo): Unit = js.native
  
  def get_formDigestHandlingEnabled(): Boolean = js.native
  
  def get_iFrameSourceUrl(): String = js.native
  
  def set_formDigestHandlingEnabled(value: Boolean): Unit = js.native
  
  def set_iFrameSourceUrl(value: String): Unit = js.native
}

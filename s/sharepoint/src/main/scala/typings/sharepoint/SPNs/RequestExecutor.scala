package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RequestExecutor")
@js.native
class RequestExecutor protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, options: js.Any) = this()
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


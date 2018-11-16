package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RequestExecutor")
@js.native
class RequestExecutor protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, options: js.Any) = this()
  def attemptLogin(returnUrl: java.lang.String, success: js.Function1[/* response */ ResponseInfo, scala.Unit]): scala.Unit = js.native
  def attemptLogin(
    returnUrl: java.lang.String,
    success: js.Function1[/* response */ ResponseInfo, scala.Unit],
    error: js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def executeAsync(requestInfo: RequestInfo): scala.Unit = js.native
  def get_formDigestHandlingEnabled(): scala.Boolean = js.native
  def get_iFrameSourceUrl(): java.lang.String = js.native
  def set_formDigestHandlingEnabled(value: scala.Boolean): scala.Unit = js.native
  def set_iFrameSourceUrl(value: java.lang.String): scala.Unit = js.native
}


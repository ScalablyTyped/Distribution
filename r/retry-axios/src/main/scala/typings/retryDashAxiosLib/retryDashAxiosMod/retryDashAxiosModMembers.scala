package typings
package retryDashAxiosLib.retryDashAxiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry-axios", JSImport.Namespace)
@js.native
object retryDashAxiosModMembers extends js.Object {
  def attach(): scala.Double = js.native
  def attach(instance: axiosLib.axiosMod.AxiosInstance): scala.Double = js.native
  def detach(interceptorId: scala.Double): scala.Unit = js.native
  def detach(interceptorId: scala.Double, instance: axiosLib.axiosMod.AxiosInstance): scala.Unit = js.native
  def getConfig(err: axiosLib.axiosMod.AxiosError): js.UndefOr[RetryConfig] = js.native
}


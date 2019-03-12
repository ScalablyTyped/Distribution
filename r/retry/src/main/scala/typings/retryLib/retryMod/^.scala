package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTimeout(attempt: scala.Double): scala.Double = js.native
  def createTimeout(attempt: scala.Double, options: CreateTimeoutOptions): scala.Double = js.native
  def operation(): RetryOperation = js.native
  def operation(options: OperationOptions): RetryOperation = js.native
  def timeouts(): js.Array[scala.Double] = js.native
  def timeouts(options: TimeoutsOptions): js.Array[scala.Double] = js.native
  def wrap(`object`: js.Object): scala.Unit = js.native
  def wrap(`object`: js.Object, methods: js.Array[java.lang.String]): scala.Unit = js.native
  def wrap(`object`: js.Object, options: OperationOptions): scala.Unit = js.native
  def wrap(`object`: js.Object, options: OperationOptions, methods: js.Array[java.lang.String]): scala.Unit = js.native
}


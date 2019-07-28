package typings.retry.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTimeout(attempt: Double): Double = js.native
  def createTimeout(attempt: Double, options: CreateTimeoutOptions): Double = js.native
  def operation(): RetryOperation = js.native
  def operation(options: OperationOptions): RetryOperation = js.native
  def timeouts(): js.Array[Double] = js.native
  def timeouts(options: TimeoutsOptions): js.Array[Double] = js.native
  def wrap(`object`: js.Object): Unit = js.native
  def wrap(`object`: js.Object, methods: js.Array[String]): Unit = js.native
  def wrap(`object`: js.Object, options: OperationOptions): Unit = js.native
  def wrap(`object`: js.Object, options: OperationOptions, methods: js.Array[String]): Unit = js.native
}


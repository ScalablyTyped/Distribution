package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Sliding extends js.Object {
  def dropping[T](): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def dropping[T](limit: scala.Double): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def expanding[T](): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def expanding[T](limit: scala.Double): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def fixed[T](): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def fixed[T](limit: scala.Double): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def none[T](): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def sliding[T](): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
  def sliding[T](limit: scala.Double): reduxDashSagaLib.reduxDashSagaMod.Buffer[T] = js.native
}


package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Buffer[T] extends js.Object {
  def flush(): scala.Unit
  def isEmpty(): scala.Boolean
  def put(message: T): scala.Unit
  def take(): js.UndefOr[T]
}


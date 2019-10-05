package typings.rxDashLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInterval[T] extends js.Object {
  var interval: Double
  var value: T
}

object TimeInterval {
  @scala.inline
  def apply[T](interval: Double, value: T): TimeInterval[T] = {
    val __obj = js.Dynamic.literal(interval = interval, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeInterval[T]]
  }
}


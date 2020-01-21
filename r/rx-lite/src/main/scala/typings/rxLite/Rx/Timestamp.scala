package typings.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp[T] extends js.Object {
  var timestamp: Double
  var value: T
}

object Timestamp {
  @scala.inline
  def apply[T](timestamp: Double, value: T): Timestamp[T] = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Timestamp[T]]
  }
}


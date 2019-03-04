package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp[T] extends js.Object {
  var timestamp: scala.Double
  var value: T
}

object Timestamp {
  @scala.inline
  def apply[T](timestamp: scala.Double, value: T): Timestamp[T] = {
    val __obj = js.Dynamic.literal(timestamp = timestamp, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Timestamp[T]]
  }
}


package typings.rotJs.minHeapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapWrapper[T] extends js.Object {
  var key: Double
  var timestamp: Double
  var value: T
}

object HeapWrapper {
  @scala.inline
  def apply[T](key: Double, timestamp: Double, value: T): HeapWrapper[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapWrapper[T]]
  }
}


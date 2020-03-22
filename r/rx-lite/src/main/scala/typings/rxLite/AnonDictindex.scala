package typings.rxLite

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictindex[T] extends /* index */ NumberDictionary[T] {
  var length: Double
}

object AnonDictindex {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): AnonDictindex[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[AnonDictindex[T]]
  }
}


package typings.rxDashLite

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends /* index */ NumberDictionary[T] {
  var length: Double
}

object Anon_Index {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): Anon_Index[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Anon_Index[T]]
  }
}


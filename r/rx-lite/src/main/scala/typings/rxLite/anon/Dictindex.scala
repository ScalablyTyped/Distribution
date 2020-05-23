package typings.rxLite.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictindex[T] extends /* index */ NumberDictionary[T] {
  var length: Double
}

object Dictindex {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* n */ NumberDictionary[T] = null): Dictindex[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[Dictindex[T]]
  }
}


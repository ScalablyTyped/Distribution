package typings.reactcss.reactcssMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes[T] extends /* scope */ StringDictionary[Partial[T]] {
  var default: Partial[T]
}

object Classes {
  @scala.inline
  def apply[T](default: Partial[T], StringDictionary: /* scope */ StringDictionary[Partial[T]] = null): Classes[T] = {
    val __obj = js.Dynamic.literal(default = default)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Classes[T]]
  }
}


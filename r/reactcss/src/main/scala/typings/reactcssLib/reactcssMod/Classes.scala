package typings
package reactcssLib.reactcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes[T]
  extends /* scope */ org.scalablytyped.runtime.StringDictionary[stdLib.Partial[T]] {
  var default: stdLib.Partial[T]
}

object Classes {
  @scala.inline
  def apply[T](
    default: stdLib.Partial[T],
    StringDictionary: /* scope */ org.scalablytyped.runtime.StringDictionary[stdLib.Partial[T]] = null
  ): Classes[T] = {
    val __obj = js.Dynamic.literal(default = default)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Classes[T]]
  }
}


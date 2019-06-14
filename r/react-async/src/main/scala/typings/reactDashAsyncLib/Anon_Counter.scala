package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counter
  extends /* meta */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var counter: scala.Double
}

object Anon_Counter {
  @scala.inline
  def apply(
    counter: scala.Double,
    StringDictionary: /* meta */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Counter = {
    val __obj = js.Dynamic.literal(counter = counter)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Counter]
  }
}


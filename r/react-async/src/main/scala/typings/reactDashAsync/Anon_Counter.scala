package typings.reactDashAsync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counter
  extends /* meta */ StringDictionary[js.Any] {
  var counter: Double
}

object Anon_Counter {
  @scala.inline
  def apply(counter: Double, StringDictionary: /* meta */ StringDictionary[js.Any] = null): Anon_Counter = {
    val __obj = js.Dynamic.literal(counter = counter)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Counter]
  }
}


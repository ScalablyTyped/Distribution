package typings.reactAsync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounter
  extends /* meta */ StringDictionary[js.Any] {
  var counter: Double
}

object AnonCounter {
  @scala.inline
  def apply(counter: Double, StringDictionary: /* meta */ StringDictionary[js.Any] = null): AnonCounter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCounter]
  }
}


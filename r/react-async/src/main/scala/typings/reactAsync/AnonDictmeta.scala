package typings.reactAsync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictmeta
  extends /* meta */ StringDictionary[js.Any] {
  var counter: Double
}

object AnonDictmeta {
  @scala.inline
  def apply(counter: Double, StringDictionary: /* meta */ StringDictionary[js.Any] = null): AnonDictmeta = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictmeta]
  }
}


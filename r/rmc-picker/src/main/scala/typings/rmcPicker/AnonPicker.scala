package typings.rmcPicker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPicker
  extends /* x */ StringDictionary[js.Any] {
  def ref(picker: js.Any): Unit
}

object AnonPicker {
  @scala.inline
  def apply(ref: js.Any => Unit, StringDictionary: /* x */ StringDictionary[js.Any] = null): AnonPicker = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPicker]
  }
}


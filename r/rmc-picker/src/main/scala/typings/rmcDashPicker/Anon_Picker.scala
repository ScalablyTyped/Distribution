package typings.rmcDashPicker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Picker
  extends /* x */ StringDictionary[js.Any] {
  def ref(picker: js.Any): Unit
}

object Anon_Picker {
  @scala.inline
  def apply(ref: js.Any => Unit, StringDictionary: /* x */ StringDictionary[js.Any] = null): Anon_Picker = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Picker]
  }
}


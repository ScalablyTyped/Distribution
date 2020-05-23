package typings.rmcPicker.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictx
  extends /* x */ StringDictionary[js.Any] {
  def ref(picker: js.Any): Unit
}

object Dictx {
  @scala.inline
  def apply(ref: js.Any => Unit, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictx = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictx]
  }
}


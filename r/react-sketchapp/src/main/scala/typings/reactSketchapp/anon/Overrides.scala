package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends js.Object {
  var overrides: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(overrides: StringDictionary[js.Any] = null): Overrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}


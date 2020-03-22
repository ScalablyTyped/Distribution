package typings.reactSketchapp

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverrides extends js.Object {
  var overrides: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AnonOverrides {
  @scala.inline
  def apply(overrides: StringDictionary[js.Any] = null): AnonOverrides = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrides]
  }
}


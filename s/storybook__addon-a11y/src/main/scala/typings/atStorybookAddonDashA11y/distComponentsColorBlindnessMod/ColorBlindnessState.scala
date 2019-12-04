package typings.atStorybookAddonDashA11y.distComponentsColorBlindnessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBlindnessState extends js.Object {
  var active: String | Null
}

object ColorBlindnessState {
  @scala.inline
  def apply(active: String = null): ColorBlindnessState = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBlindnessState]
  }
}


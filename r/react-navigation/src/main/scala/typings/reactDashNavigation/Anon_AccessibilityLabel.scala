package typings.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessibilityLabel extends js.Object {
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

object Anon_AccessibilityLabel {
  @scala.inline
  def apply(accessibilityLabel: String = null, testID: String = null): Anon_AccessibilityLabel = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    __obj.asInstanceOf[Anon_AccessibilityLabel]
  }
}


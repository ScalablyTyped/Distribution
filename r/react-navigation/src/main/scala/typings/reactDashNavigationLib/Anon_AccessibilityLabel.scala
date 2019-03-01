package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessibilityLabel extends js.Object {
  var accessibilityLabel: js.UndefOr[java.lang.String] = js.undefined
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccessibilityLabel {
  @scala.inline
  def apply(accessibilityLabel: java.lang.String = null, testID: java.lang.String = null): Anon_AccessibilityLabel = {
    val __obj = js.Dynamic.literal()
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    __obj.asInstanceOf[Anon_AccessibilityLabel]
  }
}


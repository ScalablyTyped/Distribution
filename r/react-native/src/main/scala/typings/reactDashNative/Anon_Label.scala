package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.AccessibilityActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var name: AccessibilityActionName
}

object Anon_Label {
  @scala.inline
  def apply(name: AccessibilityActionName, label: String = null): Anon_Label = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}


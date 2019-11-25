package typings.protonDashNative.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  /**
    * Label for Form and Tab children
    */
  var label: js.UndefOr[String] = js.undefined
}

object Label {
  @scala.inline
  def apply(label: String = null): Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}


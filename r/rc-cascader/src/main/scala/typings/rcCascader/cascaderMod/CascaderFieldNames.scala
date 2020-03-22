package typings.rcCascader.cascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderFieldNames extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CascaderFieldNames {
  @scala.inline
  def apply(children: String = null, label: String = null, value: String = null): CascaderFieldNames = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderFieldNames]
  }
}


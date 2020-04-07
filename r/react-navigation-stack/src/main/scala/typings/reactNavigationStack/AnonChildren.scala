package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: String = null, tintColor: String = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}


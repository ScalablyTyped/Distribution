package typings.reactNavigationMaterialBottomTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused extends js.Object {
  var focused: Boolean
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
}

object Focused {
  @scala.inline
  def apply(focused: Boolean, horizontal: js.UndefOr[Boolean] = js.undefined, tintColor: String = null): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
}


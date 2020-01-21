package typings.rcTable

import typings.rcTable.rcTableStrings.horizontal
import typings.rcTable.rcTableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: horizontal | vertical
  var prefixCls: js.UndefOr[String] = js.undefined
}

object AnonDirection {
  @scala.inline
  def apply(direction: horizontal | vertical, prefixCls: String = null): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}


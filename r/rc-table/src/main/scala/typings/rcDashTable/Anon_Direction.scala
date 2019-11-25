package typings.rcDashTable

import typings.rcDashTable.rcDashTableStrings.horizontal
import typings.rcDashTable.rcDashTableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: horizontal | vertical
  var prefixCls: js.UndefOr[String] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(direction: horizontal | vertical, prefixCls: String = null): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Direction]
  }
}


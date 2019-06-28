package typings
package atReachTabsLib.atReachTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends TabPanelProps

object TabProps {
  @scala.inline
  def apply(TabPanelProps: TabPanelProps = null, disabled: js.UndefOr[scala.Boolean] = js.undefined): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TabPanelProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[TabProps]
  }
}


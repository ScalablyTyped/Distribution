package typings.reachTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends TabPanelProps

object TabProps {
  @scala.inline
  def apply(TabPanelProps: TabPanelProps = null): TabProps = {
    val __obj = js.Dynamic.literal()
    if (TabPanelProps != null) js.Dynamic.global.Object.assign(__obj, TabPanelProps)
    __obj.asInstanceOf[TabProps]
  }
}


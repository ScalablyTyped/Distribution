package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItem
  extends /* x */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[TreeItem]] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object TreeItem {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    children: js.Array[TreeItem] = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    subtitle: ReactNode = null,
    title: ReactNode = null
  ): TreeItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItem]
  }
}


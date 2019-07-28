package typings.reactDashTabsDashRedux.tabContentMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var `for`: String | Double
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visibleClassName: js.UndefOr[String] = js.undefined
  var visibleStyle: js.UndefOr[js.Object] = js.undefined
}

object TabContentProps {
  @scala.inline
  def apply(
    `for`: String | Double,
    children: ReactNode = null,
    className: String = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visibleClassName: String = null,
    visibleStyle: js.Object = null
  ): TabContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles)
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible)
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (visibleClassName != null) __obj.updateDynamic("visibleClassName")(visibleClassName)
    if (visibleStyle != null) __obj.updateDynamic("visibleStyle")(visibleStyle)
    __obj.asInstanceOf[TabContentProps]
  }
}


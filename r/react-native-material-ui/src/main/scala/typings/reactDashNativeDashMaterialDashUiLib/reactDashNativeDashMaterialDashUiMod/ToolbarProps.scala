package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarProps extends js.Object {
  var centerElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var isSearchActive: js.UndefOr[scala.Boolean] = js.undefined
  var leftElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = js.undefined
  var onLeftElementPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRightElementPress: js.UndefOr[js.Function1[/* e */ RightElementPressEvent, scala.Unit]] = js.undefined
  var rightElement: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | java.lang.String | js.Array[java.lang.String] | ToolBarRightElement
  ] = js.undefined
  var searchable: js.UndefOr[Searchable] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[ToolbarStyle] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    centerElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    isSearchActive: js.UndefOr[scala.Boolean] = js.undefined,
    leftElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String = null,
    onLeftElementPress: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    onRightElementPress: /* e */ RightElementPressEvent => scala.Unit = null,
    rightElement: reactLib.reactMod.Global.JSXNs.Element | java.lang.String | js.Array[java.lang.String] | ToolBarRightElement = null,
    searchable: Searchable = null,
    size: scala.Int | scala.Double = null,
    style: ToolbarStyle = null
  ): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (centerElement != null) __obj.updateDynamic("centerElement")(centerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(isSearchActive)) __obj.updateDynamic("isSearchActive")(isSearchActive)
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (onLeftElementPress != null) __obj.updateDynamic("onLeftElementPress")(js.Any.fromFunction0(onLeftElementPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onRightElementPress != null) __obj.updateDynamic("onRightElementPress")(js.Any.fromFunction1(onRightElementPress))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (searchable != null) __obj.updateDynamic("searchable")(searchable)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ToolbarProps]
  }
}


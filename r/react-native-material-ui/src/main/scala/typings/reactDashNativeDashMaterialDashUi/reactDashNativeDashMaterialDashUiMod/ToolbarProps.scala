package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarProps extends js.Object {
  var centerElement: js.UndefOr[Element | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isSearchActive: js.UndefOr[Boolean] = js.undefined
  var leftElement: js.UndefOr[Element | String] = js.undefined
  var onLeftElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRightElementPress: js.UndefOr[js.Function1[/* e */ RightElementPressEvent, Unit]] = js.undefined
  var rightElement: js.UndefOr[Element | String | js.Array[String] | ToolBarRightElement] = js.undefined
  var searchable: js.UndefOr[Searchable] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[ToolbarStyle] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    centerElement: Element | String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isSearchActive: js.UndefOr[Boolean] = js.undefined,
    leftElement: Element | String = null,
    onLeftElementPress: () => Unit = null,
    onPress: () => Unit = null,
    onRightElementPress: /* e */ RightElementPressEvent => Unit = null,
    rightElement: Element | String | js.Array[String] | ToolBarRightElement = null,
    searchable: Searchable = null,
    size: Int | Double = null,
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


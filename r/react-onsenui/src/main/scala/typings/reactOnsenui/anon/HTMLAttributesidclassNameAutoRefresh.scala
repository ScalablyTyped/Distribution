package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.reactOnsenuiStrings.horizontal
import typings.reactOnsenui.reactOnsenuiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  direction ? :'horizontal' | 'vertical',   fullscreen ? :boolean,   overscrollable ? :boolean,   centered ? :boolean,   itemWidth ? :number | string,   itemHeight ? :number | string,   autoScroll ? :boolean,   autoScrollRatio ? :number,   swipeable ? :boolean,   disabled ? :boolean,   index ? :number,   autoRefresh ? :boolean,   onPostChange ? :(): void,   onRefresh ? :(): void,   onOverscroll ? :(): void,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions} */
trait HTMLAttributesidclassNameAutoRefresh extends js.Object {
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  var autoScrollRatio: js.UndefOr[Double] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var itemHeight: js.UndefOr[Double | String] = js.undefined
  var itemWidth: js.UndefOr[Double | String] = js.undefined
  var onOverscroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overscrollable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
}

object HTMLAttributesidclassNameAutoRefresh {
  @scala.inline
  def apply(
    animationOptions: AnimationOptions = null,
    autoRefresh: js.UndefOr[Boolean] = js.undefined,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    autoScrollRatio: js.UndefOr[Double] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    direction: horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    index: js.UndefOr[Double] = js.undefined,
    itemHeight: Double | String = null,
    itemWidth: Double | String = null,
    onOverscroll: () => Unit = null,
    onPostChange: () => Unit = null,
    onRefresh: () => Unit = null,
    overscrollable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    swipeable: js.UndefOr[Boolean] = js.undefined
  ): HTMLAttributesidclassNameAutoRefresh = {
    val __obj = js.Dynamic.literal()
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRefresh)) __obj.updateDynamic("autoRefresh")(autoRefresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrollRatio)) __obj.updateDynamic("autoScrollRatio")(autoScrollRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (onOverscroll != null) __obj.updateDynamic("onOverscroll")(js.Any.fromFunction0(onOverscroll))
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(js.Any.fromFunction0(onPostChange))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction0(onRefresh))
    if (!js.isUndefined(overscrollable)) __obj.updateDynamic("overscrollable")(overscrollable.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameAutoRefresh]
  }
}


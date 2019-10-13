package typings.reactDashBootstrap.libPagerItemMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerItemProps
  extends AllHTMLAttributes[PagerItem]
     with ClassAttributes[PagerItem] {
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var next: js.UndefOr[Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_PagerItemProps: js.UndefOr[SelectCallback] = js.undefined
  var previous: js.UndefOr[Boolean] = js.undefined
}

object PagerItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PagerItem] = null,
    ClassAttributes: ClassAttributes[PagerItem] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    next: js.UndefOr[Boolean] = js.undefined,
    onSelect: SelectCallback = null,
    previous: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): PagerItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PagerItemProps]
  }
}


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
    eventKey: js.Any = null,
    next: js.UndefOr[Boolean] = js.undefined,
    onSelect: SelectCallback = null,
    previous: js.UndefOr[Boolean] = js.undefined
  ): PagerItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerItemProps]
  }
}


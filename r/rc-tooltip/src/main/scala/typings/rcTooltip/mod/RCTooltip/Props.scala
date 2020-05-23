package typings.rcTooltip.mod.RCTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactChild
import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typings.react.mod.Props[js.Any] {
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], Unit]] = js.undefined
  var align: js.UndefOr[js.Object] = js.undefined
  var arrowContent: js.UndefOr[ReactNode] = js.undefined
  var defaultVisible: js.UndefOr[Boolean] = js.undefined
  var destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function0[Element]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mouseEnterDelay: js.UndefOr[Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var onPopupAlign: js.UndefOr[js.Function2[/* popupDomNode */ Element, /* align */ js.Object, Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], Unit]] = js.undefined
  var overlay: js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var placement: js.UndefOr[Placement | js.Object] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    overlay: js.Function0[ReactChild] | ReactChild | ReactFragment | ReactPortal,
    afterVisibleChange: /* visible */ js.UndefOr[Boolean] => Unit = null,
    align: js.Object = null,
    arrowContent: ReactNode = null,
    children: ReactNode = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getTooltipContainer: () => Element = null,
    id: String = null,
    key: Key = null,
    mouseEnterDelay: js.UndefOr[Double] = js.undefined,
    mouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    onPopupAlign: (/* popupDomNode */ Element, /* align */ js.Object) => Unit = null,
    onVisibleChange: /* visible */ js.UndefOr[Boolean] => Unit = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: Placement | js.Object = null,
    prefixCls: String = null,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined,
    transitionName: String = null,
    trigger: js.Array[Trigger] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrowContent != null) __obj.updateDynamic("arrowContent")(arrowContent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.get.asInstanceOf[js.Any])
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(js.Any.fromFunction0(getTooltipContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEnterDelay)) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseLeaveDelay)) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.get.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(js.Any.fromFunction2(onPopupAlign))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


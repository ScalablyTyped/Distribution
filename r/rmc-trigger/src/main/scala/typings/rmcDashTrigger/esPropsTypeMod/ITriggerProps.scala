package typings.rmcDashTrigger.esPropsTypeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggerProps extends js.Object {
  var afterPopupVisibleChange: js.UndefOr[js.Function] = js.undefined
  var builtinPlacements: js.UndefOr[js.Any] = js.undefined
  var defaultPopupVisible: js.UndefOr[Boolean] = js.undefined
  var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
  var getDocument: js.UndefOr[js.Function] = js.undefined
  var getPopupClassNameFromAlign: js.UndefOr[js.Any] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var maskAnimation: js.UndefOr[String] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskTransitionName: js.UndefOr[String | js.Object] = js.undefined
  var onPopupAlign: js.UndefOr[js.Function] = js.undefined
  var onPopupVisibleChange: js.UndefOr[js.Function] = js.undefined
  var popup: ReactNode | js.Function
  var popupAlign: js.UndefOr[js.Any] = js.undefined
  var popupAnimation: js.UndefOr[js.Any] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupPlacement: js.UndefOr[String] = js.undefined
  var popupStyle: js.UndefOr[js.Any] = js.undefined
  var popupTransitionName: js.UndefOr[String | js.Object] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ITriggerProps {
  @scala.inline
  def apply(
    afterPopupVisibleChange: js.Function = null,
    builtinPlacements: js.Any = null,
    defaultPopupVisible: js.UndefOr[Boolean] = js.undefined,
    destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined,
    getDocument: js.Function = null,
    getPopupClassNameFromAlign: js.Any = null,
    getPopupContainer: js.Function = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    maskAnimation: String = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String | js.Object = null,
    onPopupAlign: js.Function = null,
    onPopupVisibleChange: js.Function = null,
    popup: ReactNode | js.Function = null,
    popupAlign: js.Any = null,
    popupAnimation: js.Any = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupStyle: js.Any = null,
    popupTransitionName: String | js.Object = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    zIndex: Int | Double = null
  ): ITriggerProps = {
    val __obj = js.Dynamic.literal()
    if (afterPopupVisibleChange != null) __obj.updateDynamic("afterPopupVisibleChange")(afterPopupVisibleChange.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPopupVisible)) __obj.updateDynamic("defaultPopupVisible")(defaultPopupVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyPopupOnHide)) __obj.updateDynamic("destroyPopupOnHide")(destroyPopupOnHide.asInstanceOf[js.Any])
    if (getDocument != null) __obj.updateDynamic("getDocument")(getDocument.asInstanceOf[js.Any])
    if (getPopupClassNameFromAlign != null) __obj.updateDynamic("getPopupClassNameFromAlign")(getPopupClassNameFromAlign.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskAnimation != null) __obj.updateDynamic("maskAnimation")(maskAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (onPopupAlign != null) __obj.updateDynamic("onPopupAlign")(onPopupAlign.asInstanceOf[js.Any])
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(onPopupVisibleChange.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupAlign != null) __obj.updateDynamic("popupAlign")(popupAlign.asInstanceOf[js.Any])
    if (popupAnimation != null) __obj.updateDynamic("popupAnimation")(popupAnimation.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITriggerProps]
  }
}


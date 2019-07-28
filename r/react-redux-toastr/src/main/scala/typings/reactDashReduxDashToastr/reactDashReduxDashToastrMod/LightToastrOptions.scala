package typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightToastrOptions extends js.Object {
  var attention: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[Element] = js.undefined
  var icon: js.UndefOr[iconType | Element] = js.undefined
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var progressBar: js.UndefOr[Boolean] = js.undefined
  var removeOnHover: js.UndefOr[Boolean] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[iconType] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object LightToastrOptions {
  @scala.inline
  def apply(
    attention: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    component: Element = null,
    icon: iconType | Element = null,
    onCloseButtonClick: () => Unit = null,
    onHideComplete: () => Unit = null,
    onShowComplete: () => Unit = null,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    removeOnHover: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    status: iconType = null,
    timeOut: Int | Double = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): LightToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention)
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onCloseButtonClick != null) __obj.updateDynamic("onCloseButtonClick")(js.Any.fromFunction0(onCloseButtonClick))
    if (onHideComplete != null) __obj.updateDynamic("onHideComplete")(js.Any.fromFunction0(onHideComplete))
    if (onShowComplete != null) __obj.updateDynamic("onShowComplete")(js.Any.fromFunction0(onShowComplete))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (!js.isUndefined(removeOnHover)) __obj.updateDynamic("removeOnHover")(removeOnHover)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (status != null) __obj.updateDynamic("status")(status)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn)
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut)
    __obj.asInstanceOf[LightToastrOptions]
  }
}


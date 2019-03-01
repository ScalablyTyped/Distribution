package typings
package reactDashReduxDashToastrLib.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightToastrOptions extends js.Object {
  var attention: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var icon: js.UndefOr[iconType | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onCloseButtonClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHideComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShowComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var progressBar: js.UndefOr[scala.Boolean] = js.undefined
  var removeOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[iconType] = js.undefined
  var timeOut: js.UndefOr[scala.Double] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object LightToastrOptions {
  @scala.inline
  def apply(
    attention: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    component: reactLib.reactMod.Global.JSXNs.Element = null,
    icon: iconType | reactLib.reactMod.Global.JSXNs.Element = null,
    onCloseButtonClick: js.Function0[scala.Unit] = null,
    onHideComplete: js.Function0[scala.Unit] = null,
    onShowComplete: js.Function0[scala.Unit] = null,
    progressBar: js.UndefOr[scala.Boolean] = js.undefined,
    removeOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    status: iconType = null,
    timeOut: scala.Int | scala.Double = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): LightToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention)
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onCloseButtonClick != null) __obj.updateDynamic("onCloseButtonClick")(onCloseButtonClick)
    if (onHideComplete != null) __obj.updateDynamic("onHideComplete")(onHideComplete)
    if (onShowComplete != null) __obj.updateDynamic("onShowComplete")(onShowComplete)
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


package typings.reactDashReduxDashToastr.reactDashReduxDashToastrMod

import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicToastrOptions extends js.Object {
  var attention: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[(Component[js.Object, js.Object, _]) | Element] = js.undefined
  var getState: js.UndefOr[js.Function1[/* state */ ToastrState, ToastrState]] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onToastrClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var progressBar: js.UndefOr[Boolean] = js.undefined
  var removeOnHover: js.UndefOr[Boolean] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object BasicToastrOptions {
  @scala.inline
  def apply(
    attention: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    component: (Component[js.Object, js.Object, _]) | Element = null,
    getState: /* state */ ToastrState => ToastrState = null,
    icon: Element = null,
    onCloseButtonClick: () => Unit = null,
    onHideComplete: () => Unit = null,
    onShowComplete: () => Unit = null,
    onToastrClick: () => Unit = null,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    removeOnHover: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    timeOut: Int | Double = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): BasicToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention)
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction1(getState))
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onCloseButtonClick != null) __obj.updateDynamic("onCloseButtonClick")(js.Any.fromFunction0(onCloseButtonClick))
    if (onHideComplete != null) __obj.updateDynamic("onHideComplete")(js.Any.fromFunction0(onHideComplete))
    if (onShowComplete != null) __obj.updateDynamic("onShowComplete")(js.Any.fromFunction0(onShowComplete))
    if (onToastrClick != null) __obj.updateDynamic("onToastrClick")(js.Any.fromFunction0(onToastrClick))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (!js.isUndefined(removeOnHover)) __obj.updateDynamic("removeOnHover")(removeOnHover)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn)
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut)
    __obj.asInstanceOf[BasicToastrOptions]
  }
}


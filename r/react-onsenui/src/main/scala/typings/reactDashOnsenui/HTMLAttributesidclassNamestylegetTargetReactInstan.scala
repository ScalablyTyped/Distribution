package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactInstance
import typings.reactDashOnsenui.reactDashOnsenuiMod.AnimationOptions
import typings.reactDashOnsenui.reactDashOnsenuiStrings.default
import typings.reactDashOnsenui.reactDashOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  getTarget ? :(): react.react.ReactInstance,   onCancel ? :(): void,   isOpen ? :boolean,   isCancelable ? :boolean,   isDisabled ? :boolean,   animation ? :'none' | 'default',   modifier ? :string,   maskColor ? :string,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   onPreShow ? :(): void,   onPostShow ? :(): void,   onPreHide ? :(): void,   onPostHide ? :(): void} */
trait HTMLAttributesidclassNamestylegetTargetReactInstan extends js.Object {
  var animation: js.UndefOr[none | default] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getTarget: js.UndefOr[js.Function0[ReactInstance]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isCancelable: js.UndefOr[Boolean] = js.undefined
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var maskColor: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylegetTargetReactInstan {
  @scala.inline
  def apply(
    animation: none | default = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    getTarget: () => ReactInstance = null,
    id: String = null,
    isCancelable: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maskColor: String = null,
    modifier: String = null,
    onCancel: () => Unit = null,
    onPostHide: () => Unit = null,
    onPostShow: () => Unit = null,
    onPreHide: () => Unit = null,
    onPreShow: () => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylegetTargetReactInstan = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions)
    if (className != null) __obj.updateDynamic("className")(className)
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isCancelable)) __obj.updateDynamic("isCancelable")(isCancelable)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onPostHide != null) __obj.updateDynamic("onPostHide")(js.Any.fromFunction0(onPostHide))
    if (onPostShow != null) __obj.updateDynamic("onPostShow")(js.Any.fromFunction0(onPostShow))
    if (onPreHide != null) __obj.updateDynamic("onPreHide")(js.Any.fromFunction0(onPreHide))
    if (onPreShow != null) __obj.updateDynamic("onPreShow")(js.Any.fromFunction0(onPreShow))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylegetTargetReactInstan]
  }
}


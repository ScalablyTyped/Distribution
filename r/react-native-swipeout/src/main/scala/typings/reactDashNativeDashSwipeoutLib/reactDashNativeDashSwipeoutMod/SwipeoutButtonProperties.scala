package typings
package reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProperties extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var text: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var `type`: js.UndefOr[
    reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.default | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.delete | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.primary | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.secondary
  ] = js.undefined
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

object SwipeoutButtonProperties {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    component: reactLib.reactMod.Global.JSXNs.Element = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onPress: () => scala.Unit = null,
    text: reactLib.reactMod.ReactNs.ReactNode = null,
    `type`: reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.default | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.delete | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.primary | reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutLibStrings.secondary = null,
    underlayColor: java.lang.String = null
  ): SwipeoutButtonProperties = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[SwipeoutButtonProperties]
  }
}


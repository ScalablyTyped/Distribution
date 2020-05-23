package typings.reactNativeSwipeout.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typings.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutButtonProperties extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[Element] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[ReactNode] = js.undefined
  var `type`: js.UndefOr[
    typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
  ] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object SwipeoutButtonProperties {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    component: Element = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onPress: () => Unit = null,
    text: ReactNode = null,
    `type`: typings.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary = null,
    underlayColor: String = null
  ): SwipeoutButtonProperties = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeoutButtonProperties]
  }
}


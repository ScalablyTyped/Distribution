package typings.reactDashAddonsDashTransitionDashGroup.reactDashAddonsDashTransitionDashGroupMod.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTransitionGroupProps[T] extends HTMLAttributes[T] {
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.undefined
  var component: js.UndefOr[ReactType[_]] = js.undefined
}

object HTMLTransitionGroupProps {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    childFactory: /* child */ ReactElement => ReactElement = null,
    component: ReactType[_] = null
  ): HTMLTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
  }
}


package typings
package reactDashAddonsDashTransitionDashGroupLib.reactDashAddonsDashTransitionDashGroupMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTransitionGroupProps[T]
  extends reactLib.reactMod.HTMLAttributes[T] {
  var childFactory: js.UndefOr[
    js.Function1[/* child */ reactLib.reactMod.ReactElement, reactLib.reactMod.ReactElement]
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object HTMLTransitionGroupProps {
  @scala.inline
  def apply[T](
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[T] = null,
    childFactory: /* child */ reactLib.reactMod.ReactElement => reactLib.reactMod.ReactElement = null,
    component: reactLib.reactMod.ReactType[_] = null
  ): HTMLTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (childFactory != null) __obj.updateDynamic("childFactory")(js.Any.fromFunction1(childFactory))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
  }
}


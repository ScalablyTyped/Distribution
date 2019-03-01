package typings
package reactDashAddonsDashTransitionDashGroupLib.reactDashAddonsDashTransitionDashGroupMod.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLTransitionGroupProps[T]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[T] {
  var childFactory: js.UndefOr[
    js.Function1[
      /* child */ reactLib.reactMod.ReactNs.ReactElement[_], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object HTMLTransitionGroupProps {
  @scala.inline
  def apply[T](
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[T] = null,
    childFactory: js.Function1[
      /* child */ reactLib.reactMod.ReactNs.ReactElement[_], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ] = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): HTMLTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (childFactory != null) __obj.updateDynamic("childFactory")(childFactory)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
  }
}


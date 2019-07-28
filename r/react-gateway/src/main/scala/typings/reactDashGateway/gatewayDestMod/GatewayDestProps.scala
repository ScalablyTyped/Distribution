package typings.reactDashGateway.gatewayDestMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayDestProps extends js.Object {
  var component: js.UndefOr[String | (ComponentClass[js.Object, ComponentState])] = js.undefined
  var name: String
  var tagName: js.UndefOr[String] = js.undefined
}

object GatewayDestProps {
  @scala.inline
  def apply(
    name: String,
    component: String | (ComponentClass[js.Object, ComponentState]) = null,
    tagName: String = null
  ): GatewayDestProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[GatewayDestProps]
  }
}


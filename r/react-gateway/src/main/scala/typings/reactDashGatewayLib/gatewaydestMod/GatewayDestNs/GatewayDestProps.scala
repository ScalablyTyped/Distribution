package typings
package reactDashGatewayLib.gatewaydestMod.GatewayDestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayDestProps extends js.Object {
  var component: js.UndefOr[
    java.lang.String | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState])
  ] = js.undefined
  var name: java.lang.String
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

object GatewayDestProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    component: java.lang.String | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) = null,
    tagName: java.lang.String = null
  ): GatewayDestProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[GatewayDestProps]
  }
}


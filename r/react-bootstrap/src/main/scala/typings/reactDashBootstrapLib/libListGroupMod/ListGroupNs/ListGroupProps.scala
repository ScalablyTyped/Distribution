package typings
package reactDashBootstrapLib.libListGroupMod.ListGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libListGroupMod.ListGroup] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
   // Added since v0.30.0
  // TODO: Add more specific type
  var fill: js.UndefOr[scala.Boolean] = js.undefined
}

object ListGroupProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libListGroupMod.ListGroup] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined
  ): ListGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[ListGroupProps]
  }
}


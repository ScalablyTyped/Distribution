package typings
package reactDashBootstrapLib.libListGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupProps
  extends reactLib.reactMod.HTMLProps[ListGroup] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
   // Added since v0.30.0
  // TODO: Add more specific type
  var fill: js.UndefOr[scala.Boolean] = js.undefined
}

object ListGroupProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[ListGroup] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactType[_] = null,
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


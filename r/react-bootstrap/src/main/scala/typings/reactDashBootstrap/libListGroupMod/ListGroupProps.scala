package typings.reactDashBootstrap.libListGroupMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupProps extends HTMLProps[ListGroup] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
   // Added since v0.30.0
  // TODO: Add more specific type
  var fill: js.UndefOr[Boolean] = js.undefined
}

object ListGroupProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[ListGroup] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    fill: js.UndefOr[Boolean] = js.undefined
  ): ListGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    __obj.asInstanceOf[ListGroupProps]
  }
}


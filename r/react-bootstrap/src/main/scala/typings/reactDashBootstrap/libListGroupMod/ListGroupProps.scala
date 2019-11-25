package typings.reactDashBootstrap.libListGroupMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupProps
  extends AllHTMLAttributes[ListGroup]
     with ClassAttributes[ListGroup] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
   // Added since v0.30.0
  // TODO: Add more specific type
  var fill: js.UndefOr[Boolean] = js.undefined
}

object ListGroupProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ListGroup] = null,
    ClassAttributes: ClassAttributes[ListGroup] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    fill: js.UndefOr[Boolean] = js.undefined
  ): ListGroupProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupProps]
  }
}


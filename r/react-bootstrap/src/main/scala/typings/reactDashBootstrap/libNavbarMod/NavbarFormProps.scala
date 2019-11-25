package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarFormProps
  extends AllHTMLAttributes[NavbarForm]
     with ClassAttributes[NavbarForm] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var pullLeft: js.UndefOr[Boolean] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object NavbarFormProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[NavbarForm] = null,
    ClassAttributes: ClassAttributes[NavbarForm] = null,
    componentClass: ReactType[_] = null,
    pullLeft: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): NavbarFormProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(pullLeft)) __obj.updateDynamic("pullLeft")(pullLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarFormProps]
  }
}


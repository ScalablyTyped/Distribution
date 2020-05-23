package typings.reactBootstrap.navbarMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarTextProps
  extends AllHTMLAttributes[NavbarText]
     with ClassAttributes[NavbarText] {
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object NavbarTextProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[NavbarText] = null,
    ClassAttributes: ClassAttributes[NavbarText] = null,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): NavbarTextProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarTextProps]
  }
}


package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    __obj.asInstanceOf[NavbarTextProps]
  }
}


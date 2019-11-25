package typings.reactDashBootstrap.libInputGroupAddonMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupAddonProps
  extends AllHTMLAttributes[InputGroupAddon]
     with ClassAttributes[InputGroupAddon] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object InputGroupAddonProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[InputGroupAddon] = null,
    ClassAttributes: ClassAttributes[InputGroupAddon] = null,
    bsClass: String = null
  ): InputGroupAddonProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputGroupAddonProps]
  }
}


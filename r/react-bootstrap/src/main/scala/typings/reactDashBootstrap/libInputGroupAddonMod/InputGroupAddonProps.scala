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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[InputGroupAddonProps]
  }
}


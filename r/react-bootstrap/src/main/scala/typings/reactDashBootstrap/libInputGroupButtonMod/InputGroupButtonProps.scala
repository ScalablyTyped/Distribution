package typings.reactDashBootstrap.libInputGroupButtonMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupButtonProps
  extends AllHTMLAttributes[InputGroupButton]
     with ClassAttributes[InputGroupButton] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object InputGroupButtonProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[InputGroupButton] = null,
    ClassAttributes: ClassAttributes[InputGroupButton] = null,
    bsClass: String = null
  ): InputGroupButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[InputGroupButtonProps]
  }
}


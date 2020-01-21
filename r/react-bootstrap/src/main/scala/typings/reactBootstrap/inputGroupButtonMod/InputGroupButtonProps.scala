package typings.reactBootstrap.inputGroupButtonMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputGroupButtonProps]
  }
}


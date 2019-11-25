package typings.reactDashBootstrap.libFormControlFeedbackMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlFeedbackProps
  extends AllHTMLAttributes[FormControlFeedback]
     with ClassAttributes[FormControlFeedback] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object FormControlFeedbackProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[FormControlFeedback] = null,
    ClassAttributes: ClassAttributes[FormControlFeedback] = null,
    bsClass: String = null
  ): FormControlFeedbackProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlFeedbackProps]
  }
}


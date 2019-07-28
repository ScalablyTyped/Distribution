package typings.reactDashBootstrap.libFormControlFeedbackMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlFeedbackProps extends HTMLProps[FormControlFeedback] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object FormControlFeedbackProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[FormControlFeedback] = null, bsClass: String = null): FormControlFeedbackProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[FormControlFeedbackProps]
  }
}


package typings.reactDashToggled.reactDashToggledMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetButtonPropsOptions
  extends AllHTMLAttributes[HTMLButtonElement]
     with ClassAttributes[HTMLButtonElement]

object GetButtonPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLButtonElement] = null,
    ClassAttributes: ClassAttributes[HTMLButtonElement] = null
  ): GetButtonPropsOptions = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[GetButtonPropsOptions]
  }
}


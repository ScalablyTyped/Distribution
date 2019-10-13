package typings.reactDashToggled.reactDashToggledMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInputPropsOptions
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]

object GetInputPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLInputElement] = null,
    ClassAttributes: ClassAttributes[HTMLInputElement] = null
  ): GetInputPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[GetInputPropsOptions]
  }
}


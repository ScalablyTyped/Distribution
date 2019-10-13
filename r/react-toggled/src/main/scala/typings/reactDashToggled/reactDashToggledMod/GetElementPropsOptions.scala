package typings.reactDashToggled.reactDashToggledMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetElementPropsOptions
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]

object GetElementPropsOptions {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null
  ): GetElementPropsOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[GetElementPropsOptions]
  }
}


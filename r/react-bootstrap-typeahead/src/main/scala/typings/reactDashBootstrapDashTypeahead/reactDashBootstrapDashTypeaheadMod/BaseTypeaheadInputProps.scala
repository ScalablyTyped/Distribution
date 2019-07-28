package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.InputHTMLAttributes
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.input
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTypeaheadInputProps extends InputHTMLAttributes[input] {
  @JSName("type")
  var type_BaseTypeaheadInputProps: text
}

object BaseTypeaheadInputProps {
  @scala.inline
  def apply(`type`: text, InputHTMLAttributes: InputHTMLAttributes[input] = null): BaseTypeaheadInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    __obj.asInstanceOf[BaseTypeaheadInputProps]
  }
}


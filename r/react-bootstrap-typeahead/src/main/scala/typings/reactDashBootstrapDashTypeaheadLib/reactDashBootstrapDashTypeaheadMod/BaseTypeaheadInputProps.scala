package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTypeaheadInputProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.input
    ] {
  @JSName("type")
  var type_BaseTypeaheadInputProps: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.text
}

object BaseTypeaheadInputProps {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.text,
    InputHTMLAttributes: reactLib.reactMod.ReactNs.InputHTMLAttributes[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.input
    ] = null
  ): BaseTypeaheadInputProps = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    __obj.asInstanceOf[BaseTypeaheadInputProps]
  }
}


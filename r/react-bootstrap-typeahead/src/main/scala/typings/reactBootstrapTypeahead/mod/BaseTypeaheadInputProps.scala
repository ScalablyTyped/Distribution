package typings.reactBootstrapTypeahead.mod

import typings.react.mod.InputHTMLAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.input
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTypeaheadInputProps extends InputHTMLAttributes[input] {
  @JSName("type")
  var type_BaseTypeaheadInputProps: text = js.native
}

object BaseTypeaheadInputProps {
  @scala.inline
  def apply(`type`: text): BaseTypeaheadInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTypeaheadInputProps]
  }
  @scala.inline
  implicit class BaseTypeaheadInputPropsOps[Self <: BaseTypeaheadInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


package typings.qlik.mod

import typings.qlik.qlikStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyText
  extends CustomPropertyCommon
     with CustomProperty {
  var component: text = js.native
}

object CustomPropertyText {
  @scala.inline
  def apply(component: text): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyText]
  }
  @scala.inline
  implicit class CustomPropertyTextOps[Self <: CustomPropertyText] (val x: Self) extends AnyVal {
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
    def setComponent(value: text): Self = this.set("component", value.asInstanceOf[js.Any])
  }
  
}


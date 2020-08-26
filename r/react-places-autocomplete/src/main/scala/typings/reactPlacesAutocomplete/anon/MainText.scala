package typings.reactPlacesAutocomplete.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainText extends js.Object {
  var mainText: String = js.native
  var secondaryText: String = js.native
}

object MainText {
  @scala.inline
  def apply(mainText: String, secondaryText: String): MainText = {
    val __obj = js.Dynamic.literal(mainText = mainText.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainText]
  }
  @scala.inline
  implicit class MainTextOps[Self <: MainText] (val x: Self) extends AnyVal {
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
    def setMainText(value: String): Self = this.set("mainText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
  }
  
}


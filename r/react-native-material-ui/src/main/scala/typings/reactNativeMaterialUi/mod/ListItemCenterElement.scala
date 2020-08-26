package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemCenterElement extends js.Object {
  var primaryText: String | Element = js.native
  var secondaryText: js.UndefOr[String] = js.native
  var tertiaryText: js.UndefOr[String] = js.native
}

object ListItemCenterElement {
  @scala.inline
  def apply(primaryText: String | Element): ListItemCenterElement = {
    val __obj = js.Dynamic.literal(primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCenterElement]
  }
  @scala.inline
  implicit class ListItemCenterElementOps[Self <: ListItemCenterElement] (val x: Self) extends AnyVal {
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
    def setPrimaryText(value: String | Element): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setTertiaryText(value: String): Self = this.set("tertiaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiaryText: Self = this.set("tertiaryText", js.undefined)
  }
  
}


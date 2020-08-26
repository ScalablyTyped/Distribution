package typings.reactToolbox.chipChipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChipTheme extends js.Object {
  /**
    * Added to the root element when the component includes an avatar.
    */
  var avatar: js.UndefOr[String] = js.native
  /**
    * Used for the root element.
    */
  var chip: js.UndefOr[String] = js.native
  /**
    * Added to the root element when the component is deletable.
    */
  var deletable: js.UndefOr[String] = js.native
  /**
    * Used for the delete element wrapper.
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * Used for the delete icon.
    */
  var deleteIcon: js.UndefOr[String] = js.native
  /**
    * Used for the delete svg inner layer.
    */
  var deleteX: js.UndefOr[String] = js.native
}

object ChipTheme {
  @scala.inline
  def apply(): ChipTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipTheme]
  }
  @scala.inline
  implicit class ChipThemeOps[Self <: ChipTheme] (val x: Self) extends AnyVal {
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
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setChip(value: String): Self = this.set("chip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChip: Self = this.set("chip", js.undefined)
    @scala.inline
    def setDeletable(value: String): Self = this.set("deletable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletable: Self = this.set("deletable", js.undefined)
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setDeleteIcon(value: String): Self = this.set("deleteIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIcon: Self = this.set("deleteIcon", js.undefined)
    @scala.inline
    def setDeleteX(value: String): Self = this.set("deleteX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteX: Self = this.set("deleteX", js.undefined)
  }
  
}


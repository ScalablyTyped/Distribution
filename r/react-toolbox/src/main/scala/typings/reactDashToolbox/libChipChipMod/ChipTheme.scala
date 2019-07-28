package typings.reactDashToolbox.libChipChipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipTheme extends js.Object {
  /**
    * Added to the root element when the component includes an avatar.
    */
  var avatar: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element.
    */
  var chip: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when the component is deletable.
    */
  var deletable: js.UndefOr[String] = js.undefined
  /**
    * Used for the delete element wrapper.
    */
  var delete: js.UndefOr[String] = js.undefined
  /**
    * Used for the delete icon.
    */
  var deleteIcon: js.UndefOr[String] = js.undefined
  /**
    * Used for the delete svg inner layer.
    */
  var deleteX: js.UndefOr[String] = js.undefined
}

object ChipTheme {
  @scala.inline
  def apply(
    avatar: String = null,
    chip: String = null,
    deletable: String = null,
    delete: String = null,
    deleteIcon: String = null,
    deleteX: String = null
  ): ChipTheme = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (chip != null) __obj.updateDynamic("chip")(chip)
    if (deletable != null) __obj.updateDynamic("deletable")(deletable)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (deleteIcon != null) __obj.updateDynamic("deleteIcon")(deleteIcon)
    if (deleteX != null) __obj.updateDynamic("deleteX")(deleteX)
    __obj.asInstanceOf[ChipTheme]
  }
}


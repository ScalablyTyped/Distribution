package typings.reactMdSheet.sheetMod

import typings.reactMdSheet.reactMdSheetStrings.dialog
import typings.reactMdSheet.reactMdSheetStrings.menu
import typings.reactMdSheet.reactMdSheetStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetProps extends AllowedDialogProps {
  /**
    * The size to use for sheets that have been positioned left or right. The
    * default supported values are:
    *
    * - none - the size is based on content, but is still limited to the viewport
    *   width so that the horizontal scrolling will not occur within the page. No
    *   limits added to sizing.
    * - touch - the `min-width` is set to be the entire viewport width minus a
    *   touchable area and `max-width` is set to `20rem` and is normally
    *   recommended for mobile devices.
    * - static - the width is set to a static `16rem` and generally used for
    *   landscape tablets and desktops.
    * - media - automatically switches between "touch" and "static" based on css
    *   media queries. (this is the default)
    */
  var horizontalSize: js.UndefOr[SheetHorizontalSize] = js.native
  /**
    * The location that the sheet should be located within the viewport.
    */
  var position: js.UndefOr[SheetPosition] = js.native
  /**
    * The role that the sheet should be rendered as. You'll normally want to keep
    * this as the default of `"dialog"` unless you are implementing a mobile
    * sheet menu.
    *
    * Note: Setting this to `"menu"` **will not** provide the menu keyboard
    * accessibility automatically.
    */
  var role: js.UndefOr[dialog | menu | none] = js.native
  /**
    * The size to use for sheets that have been positioned top or bottom. The
    * supported sizes are:
    *
    * - none - the size is based on content and is limited to the viewport
    *   height.
    * - touch - the size is based on content and is limited to the viewport
    *   height with a touchable area to close the sheet.
    * - recommended - the material design recommended sizing that forces a
    *   max-height of 50vh and min-height of 3.5rem
    */
  var verticalSize: js.UndefOr[SheetVerticalSize] = js.native
}

object SheetProps {
  @scala.inline
  def apply(id: String, onRequestClose: () => Unit, visible: Boolean): SheetProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProps]
  }
  @scala.inline
  implicit class SheetPropsOps[Self <: SheetProps] (val x: Self) extends AnyVal {
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
    def setHorizontalSize(value: SheetHorizontalSize): Self = this.set("horizontalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalSize: Self = this.set("horizontalSize", js.undefined)
    @scala.inline
    def setPosition(value: SheetPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRole(value: dialog | menu | none): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setVerticalSize(value: SheetVerticalSize): Self = this.set("verticalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSize: Self = this.set("verticalSize", js.undefined)
  }
  
}


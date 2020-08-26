package typings.reactToolbox.dialogDialogMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.large
import typings.reactToolbox.reactToolboxStrings.normal
import typings.reactToolbox.reactToolboxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogProps extends Props {
  /**
    * A array of objects representing the buttons for the dialog navigation area. The properties will be transferred to the buttons.
    */
  var actions: js.UndefOr[js.Array[DialogActionProps]] = js.native
  /**
    * If true, the dialog will be active.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Callback called when the ESC key is pressed with the overlay active.
    */
  var onEscKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * Callback to be invoked when the dialog overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse button is pressed on the overlay.
    */
  var onOverlayMouseDown: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse is moving over the overlay.
    */
  var onOverlayMouseMove: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse button is released over the overlay.
    */
  var onOverlayMouseUp: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DialogTheme] = js.native
  /**
    * The text string to use as standar title of the dialog.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Used to determine the size of the dialog. It can be small, normal or large.
    * @default "normal"
    */
  var `type`: js.UndefOr[small | normal | large | String] = js.native
}

object DialogProps {
  @scala.inline
  def apply(): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogProps]
  }
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: DialogActionProps*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[DialogActionProps]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnEscKeyDown(value: js.Function): Self = this.set("onEscKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEscKeyDown: Self = this.set("onEscKeyDown", js.undefined)
    @scala.inline
    def setOnOverlayClick(value: js.Function): Self = this.set("onOverlayClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOverlayClick: Self = this.set("onOverlayClick", js.undefined)
    @scala.inline
    def setOnOverlayMouseDown(value: js.Function): Self = this.set("onOverlayMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOverlayMouseDown: Self = this.set("onOverlayMouseDown", js.undefined)
    @scala.inline
    def setOnOverlayMouseMove(value: js.Function): Self = this.set("onOverlayMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOverlayMouseMove: Self = this.set("onOverlayMouseMove", js.undefined)
    @scala.inline
    def setOnOverlayMouseUp(value: js.Function): Self = this.set("onOverlayMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOverlayMouseUp: Self = this.set("onOverlayMouseUp", js.undefined)
    @scala.inline
    def setTheme(value: DialogTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: small | normal | large | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


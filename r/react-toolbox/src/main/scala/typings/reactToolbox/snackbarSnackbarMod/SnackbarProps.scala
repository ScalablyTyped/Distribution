package typings.reactToolbox.snackbarSnackbarMod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.accept
import typings.reactToolbox.reactToolboxStrings.cancel
import typings.reactToolbox.reactToolboxStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarProps extends Props {
  /**
    * Label for the action component inside the Snackbar.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * If true, the snackbar will be active.
    * @default true
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Text to display in the content.
    */
  var label: js.UndefOr[String | Element] = js.native
  /**
    * Callback function when finish the set timeout.
    */
  var onTimeout: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SnackbarTheme] = js.native
  /**
    * Amount of time in milliseconds after the Snackbar will be automatically hidden.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Indicates the action type. Can be accept, warning or cancel
    */
  var `type`: js.UndefOr[accept | cancel | warning] = js.native
}

object SnackbarProps {
  @scala.inline
  def apply(): SnackbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnackbarProps]
  }
  @scala.inline
  implicit class SnackbarPropsOps[Self <: SnackbarProps] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setLabel(value: String | Element): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnTimeout(value: js.Function): Self = this.set("onTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTimeout: Self = this.set("onTimeout", js.undefined)
    @scala.inline
    def setTheme(value: SnackbarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: accept | cancel | warning): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


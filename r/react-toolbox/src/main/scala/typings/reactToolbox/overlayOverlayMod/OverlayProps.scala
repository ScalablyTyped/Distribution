package typings.reactToolbox.overlayOverlayMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps extends js.Object {
  /**
    * Whether overlay is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Nodes to be nested inside Overlay.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Additional class name(s) for root container.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether Overlay should have 'invisible' styles.
    * @default false
    */
  var invisible: js.UndefOr[Boolean] = js.native
  /**
    * Callback invoked on Overlay click.
    */
  var onClick: js.UndefOr[js.Function] = js.native
  /**
    * Callback invoked on ESC key.
    */
  var onEscKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * Overlay theme.
    */
  var theme: js.UndefOr[OverlayTheme] = js.native
}

object OverlayProps {
  @scala.inline
  def apply(): OverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnEscKeyDown(value: js.Function): Self = this.set("onEscKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEscKeyDown: Self = this.set("onEscKeyDown", js.undefined)
    @scala.inline
    def setTheme(value: OverlayTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}


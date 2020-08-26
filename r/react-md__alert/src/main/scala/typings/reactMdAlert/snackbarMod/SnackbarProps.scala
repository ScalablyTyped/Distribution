package typings.reactMdAlert.snackbarMod

import typings.react.mod.HTMLAttributes
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarProps
  extends HTMLAttributes[HTMLDivElement]
     with RenderConditionalPortalProps {
  /**
    * The id for the snackbar element. This is required for a11y.
    */
  @JSName("id")
  var id_SnackbarProps: String = js.native
  /**
    * The position for the snackbar to be fixed within the viewport or a
    * container element.
    */
  var position: js.UndefOr[SnackbarPosition] = js.native
}

object SnackbarProps {
  @scala.inline
  def apply(id: String): SnackbarProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: SnackbarPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}


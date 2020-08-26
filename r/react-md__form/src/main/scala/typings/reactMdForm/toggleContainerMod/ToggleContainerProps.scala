package typings.reactMdForm.toggleContainerMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleContainerProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Boolean if the input toggle should be rendered as `inline-flex` instead of
    * `flex`.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the label should be stacked above/below the input toggle instead
    * of being rendered on the same line.
    */
  var stacked: js.UndefOr[Boolean] = js.native
}

object ToggleContainerProps {
  @scala.inline
  def apply(): ToggleContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleContainerProps]
  }
  @scala.inline
  implicit class ToggleContainerPropsOps[Self <: ToggleContainerProps] (val x: Self) extends AnyVal {
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
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
  }
  
}


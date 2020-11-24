package typings.reactMdDivider.dividerMod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DividerProps extends HTMLAttributes[DividerElement] {
  
  /**
    * Boolean if the divider should appear inset instead of full width. This
    * really just applied a margin-left (or margin-right when dir="rtl").
    *
    * If you want to create a divider that is centered, you most likely want to
    * use the `rmd-divider-theme-update-var` mixin instead to update the
    * `max-size` of the divider.
    */
  var inset: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the divider should be vertical instead of horizontal. This will
    * change the divider to be rendered as a `<div>` instead of an `<hr>`.
    *
    * Note: If your parent element of the divider does not have a static height
    * set, you **must** manually set the height of the divider to a static
    * non-percentage number OR use the `VerticalDivider` component instead to
    * automagically create a valid percentage height.
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object DividerProps {
  
  @scala.inline
  def apply(): DividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerProps]
  }
  
  @scala.inline
  implicit class DividerPropsOps[Self <: DividerProps] (val x: Self) extends AnyVal {
    
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
    def setInset(value: Boolean): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}

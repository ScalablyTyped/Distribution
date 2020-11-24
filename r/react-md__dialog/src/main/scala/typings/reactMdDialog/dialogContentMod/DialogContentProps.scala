package typings.reactMdDialog.dialogContentMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogContentProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Boolean if the default padding for the content should be removed. This is
    * helpful when the child elements already have the required padding (such as
    * lists).  In all other cases, it is recommended to apply a custom className
    * with the padding overrides instead.
    */
  var disablePadding: js.UndefOr[Boolean] = js.native
}
object DialogContentProps {
  
  @scala.inline
  def apply(): DialogContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogContentProps]
  }
  
  @scala.inline
  implicit class DialogContentPropsOps[Self <: DialogContentProps] (val x: Self) extends AnyVal {
    
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
    def setDisablePadding(value: Boolean): Self = this.set("disablePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePadding: Self = this.set("disablePadding", js.undefined)
  }
}

package typings.reactMdTree.typesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItemExpansionIcon extends js.Object {
  
  /**
    * The icon to show within each item within the tree that helps show that
    * there are child items.
    *
    * NOTE: This will override the `rightAddon` prop if defined on each item by
    * default so they can't be used. If the `expanderLeft` prop is enabled, the
    * `leftAddon` will be overridden instead.
    */
  var expanderIcon: js.UndefOr[ReactNode] = js.native
  
  /**
    * Boolean if the expander icon should appear to the left instead of the
    * right.
    */
  var expanderLeft: js.UndefOr[Boolean] = js.native
}
object TreeItemExpansionIcon {
  
  @scala.inline
  def apply(): TreeItemExpansionIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeItemExpansionIcon]
  }
  
  @scala.inline
  implicit class TreeItemExpansionIconOps[Self <: TreeItemExpansionIcon] (val x: Self) extends AnyVal {
    
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
    def setExpanderIcon(value: ReactNode): Self = this.set("expanderIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanderIcon: Self = this.set("expanderIcon", js.undefined)
    
    @scala.inline
    def setExpanderLeft(value: Boolean): Self = this.set("expanderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanderLeft: Self = this.set("expanderLeft", js.undefined)
  }
}

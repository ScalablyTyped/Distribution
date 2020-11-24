package typings.reactBootstrap.mediaListItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaListItemProps
  extends AllHTMLAttributes[MediaListItem]
     with ClassAttributes[MediaListItem] {
  
  var componentClass: js.UndefOr[ReactType[_]] = js.native
}
object MediaListItemProps {
  
  @scala.inline
  def apply(): MediaListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaListItemProps]
  }
  
  @scala.inline
  implicit class MediaListItemPropsOps[Self <: MediaListItemProps] (val x: Self) extends AnyVal {
    
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
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
  }
}

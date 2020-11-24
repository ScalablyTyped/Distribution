package typings.reactMdUtils.mediaOnlyMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaOnlyProps extends js.Object {
  
  /**
    * The children to display.
    */
  var children: ReactElement | Null = js.native
  
  /**
    * An optional fallback element to show when the media queries do not match.
    */
  var fallback: js.UndefOr[ReactElement | Null] = js.native
}
object MediaOnlyProps {
  
  @scala.inline
  def apply(): MediaOnlyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaOnlyProps]
  }
  
  @scala.inline
  implicit class MediaOnlyPropsOps[Self <: MediaOnlyProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setFallback(value: ReactElement): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setFallbackNull: Self = this.set("fallback", null)
  }
}

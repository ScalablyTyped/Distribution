package typings.semanticUiReact.modalDimmerMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictModalDimmerProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** A dimmer can be blurred. */
  var blurring: js.UndefOr[Boolean] = js.native
  
  /** A dimmer can center its contents in the viewport. */
  var centered: js.UndefOr[Boolean] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** A dimmer can be inverted. */
  var inverted: js.UndefOr[Boolean] = js.native
  
  /** The node where the modal should mount. Defaults to document.body. */
  var mountNode: js.UndefOr[js.Any] = js.native
  
  /** A dimmer can make body scrollable. */
  var scrolling: js.UndefOr[Boolean] = js.native
}
object StrictModalDimmerProps {
  
  @scala.inline
  def apply(): StrictModalDimmerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictModalDimmerProps]
  }
  
  @scala.inline
  implicit class StrictModalDimmerPropsOps[Self <: StrictModalDimmerProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBlurring(value: Boolean): Self = this.set("blurring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurring: Self = this.set("blurring", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setMountNode(value: js.Any): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setScrolling(value: Boolean): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
  }
}

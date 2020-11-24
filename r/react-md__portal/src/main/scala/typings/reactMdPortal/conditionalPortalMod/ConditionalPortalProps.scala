package typings.reactMdPortal.conditionalPortalMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalPortalProps extends RenderConditionalPortalProps {
  
  /**
    * This children to render.
    */
  var children: ReactElement | Null = js.native
}
object ConditionalPortalProps {
  
  @scala.inline
  def apply(): ConditionalPortalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalPortalProps]
  }
  
  @scala.inline
  implicit class ConditionalPortalPropsOps[Self <: ConditionalPortalProps] (val x: Self) extends AnyVal {
    
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
  }
}

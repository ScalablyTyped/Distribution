package typings.reactMdIcon.iconRotatorMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconRotatorProps extends IconRotatorBaseProps {
  
  /**
    * The icon that should be rotated. If this is a valid React Element, the
    * class names will be cloned into that icon, otherwise the icon will be
    * wrapped in a span with the correct class names applied.
    */
  @JSName("children")
  var children_IconRotatorProps: ReactNode = js.native
}
object IconRotatorProps {
  
  @scala.inline
  def apply(rotated: Boolean): IconRotatorProps = {
    val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconRotatorProps]
  }
  
  @scala.inline
  implicit class IconRotatorPropsOps[Self <: IconRotatorProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}

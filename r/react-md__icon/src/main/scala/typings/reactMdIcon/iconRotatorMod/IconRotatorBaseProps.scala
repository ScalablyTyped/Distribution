package typings.reactMdIcon.iconRotatorMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconRotatorBaseProps extends HTMLAttributes[HTMLSpanElement] {
  
  /**
    * Boolean if the rotation should be animated instead of static.
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the child icon should be "forcefully" wrapped in a `<span>`
    * element. This should be enabled if you have a custom icon that does not
    * pass the `className` prop down.
    */
  var forceIconWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the icon is currently rotated.
    */
  var rotated: Boolean = js.native
}
object IconRotatorBaseProps {
  
  @scala.inline
  def apply(rotated: Boolean): IconRotatorBaseProps = {
    val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconRotatorBaseProps]
  }
  
  @scala.inline
  implicit class IconRotatorBasePropsOps[Self <: IconRotatorBaseProps] (val x: Self) extends AnyVal {
    
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
    def setRotated(value: Boolean): Self = this.set("rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setForceIconWrap(value: Boolean): Self = this.set("forceIconWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIconWrap: Self = this.set("forceIconWrap", js.undefined)
  }
}

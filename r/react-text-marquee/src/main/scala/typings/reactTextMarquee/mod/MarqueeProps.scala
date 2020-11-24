package typings.reactTextMarquee.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarqueeProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement] {
  
  var hoverToStop: js.UndefOr[Boolean] = js.native
  
  var leading: js.UndefOr[Double] = js.native
  
  var text: String = js.native
  
  var trailing: js.UndefOr[Double] = js.native
}
object MarqueeProps {
  
  @scala.inline
  def apply(text: String): MarqueeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarqueeProps]
  }
  
  @scala.inline
  implicit class MarqueePropsOps[Self <: MarqueeProps] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverToStop(value: Boolean): Self = this.set("hoverToStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverToStop: Self = this.set("hoverToStop", js.undefined)
    
    @scala.inline
    def setLeading(value: Double): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    
    @scala.inline
    def setTrailing(value: Double): Self = this.set("trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailing: Self = this.set("trailing", js.undefined)
  }
}

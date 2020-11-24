package typings.reactSticky.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyChildArgs extends js.Object {
  
  var calculatedHeight: Double = js.native
  
  var distanceFromBottom: Double = js.native
  
  var distanceFromTop: Double = js.native
  
  var isSticky: Boolean = js.native
  
  var style: CSSProperties = js.native
  
  var wasSticky: Boolean = js.native
}
object StickyChildArgs {
  
  @scala.inline
  def apply(
    calculatedHeight: Double,
    distanceFromBottom: Double,
    distanceFromTop: Double,
    isSticky: Boolean,
    style: CSSProperties,
    wasSticky: Boolean
  ): StickyChildArgs = {
    val __obj = js.Dynamic.literal(calculatedHeight = calculatedHeight.asInstanceOf[js.Any], distanceFromBottom = distanceFromBottom.asInstanceOf[js.Any], distanceFromTop = distanceFromTop.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], wasSticky = wasSticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyChildArgs]
  }
  
  @scala.inline
  implicit class StickyChildArgsOps[Self <: StickyChildArgs] (val x: Self) extends AnyVal {
    
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
    def setCalculatedHeight(value: Double): Self = this.set("calculatedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromBottom(value: Double): Self = this.set("distanceFromBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromTop(value: Double): Self = this.set("distanceFromTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSticky(value: Boolean): Self = this.set("isSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasSticky(value: Boolean): Self = this.set("wasSticky", value.asInstanceOf[js.Any])
  }
}

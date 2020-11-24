package typings.reactSketchapp.typesMod

import typings.reactSketchapp.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchShadow extends js.Object {
  
  var shadowColor: Color = js.native
  
  var shadowInner: Boolean = js.native
  
  var shadowOffset: Width = js.native
  
  var shadowOpacity: Double = js.native
  
  var shadowRadius: Double = js.native
  
  var shadowSpread: Double = js.native
}
object SketchShadow {
  
  @scala.inline
  def apply(
    shadowColor: Color,
    shadowInner: Boolean,
    shadowOffset: Width,
    shadowOpacity: Double,
    shadowRadius: Double,
    shadowSpread: Double
  ): SketchShadow = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowInner = shadowInner.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], shadowSpread = shadowSpread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchShadow]
  }
  
  @scala.inline
  implicit class SketchShadowOps[Self <: SketchShadow] (val x: Self) extends AnyVal {
    
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
    def setShadowColor(value: Color): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowInner(value: Boolean): Self = this.set("shadowInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Width): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacity(value: Double): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRadius(value: Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowSpread(value: Double): Self = this.set("shadowSpread", value.asInstanceOf[js.Any])
  }
}

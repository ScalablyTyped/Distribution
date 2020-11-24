package typings.reactMdUtils.createVerticalPositionMod

import typings.reactMdUtils.getCoordMod.YCoordConfig
import typings.std.ClientRect
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixConfig extends YCoordConfig {
  
  var disableSwapping: Boolean = js.native
  
  var disableVHBounds: Boolean = js.native
  
  var preventOverlap: Boolean = js.native
  
  var screenBottom: Double = js.native
  
  var vhMargin: Double = js.native
}
object FixConfig {
  
  @scala.inline
  def apply(
    containerRect: DOMRect | ClientRect,
    disableSwapping: Boolean,
    disableVHBounds: Boolean,
    elHeight: Double,
    preventOverlap: Boolean,
    screenBottom: Double,
    vhMargin: Double,
    yMargin: Double
  ): FixConfig = {
    val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], disableVHBounds = disableVHBounds.asInstanceOf[js.Any], elHeight = elHeight.asInstanceOf[js.Any], preventOverlap = preventOverlap.asInstanceOf[js.Any], screenBottom = screenBottom.asInstanceOf[js.Any], vhMargin = vhMargin.asInstanceOf[js.Any], yMargin = yMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixConfig]
  }
  
  @scala.inline
  implicit class FixConfigOps[Self <: FixConfig] (val x: Self) extends AnyVal {
    
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
    def setDisableSwapping(value: Boolean): Self = this.set("disableSwapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVHBounds(value: Boolean): Self = this.set("disableVHBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventOverlap(value: Boolean): Self = this.set("preventOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenBottom(value: Double): Self = this.set("screenBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhMargin(value: Double): Self = this.set("vhMargin", value.asInstanceOf[js.Any])
  }
}

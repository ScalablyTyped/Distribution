package typings.reactMdUtils.createVerticalPositionMod

import typings.reactMdUtils.typesMod.VerticalPosition
import typings.std.ClientRect
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  */
/* Inlined parent std.Required<std.Pick<@react-md/utils.@react-md/utils/types/positioning/types.FixedPositionOptions, 'yMargin' | 'vhMargin' | 'preventOverlap' | 'disableSwapping' | 'disableVHBounds'>> */
@js.native
trait Options extends js.Object {
  
  var containerRect: DOMRect | ClientRect = js.native
  
  var disableSwapping: Boolean = js.native
  
  var disableVHBounds: Boolean = js.native
  
  var elHeight: Double = js.native
  
  var initialY: js.UndefOr[Double] = js.native
  
  var preventOverlap: Boolean = js.native
  
  var vh: Double = js.native
  
  var vhMargin: Double = js.native
  
  var y: VerticalPosition = js.native
  
  var yMargin: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(
    containerRect: DOMRect | ClientRect,
    disableSwapping: Boolean,
    disableVHBounds: Boolean,
    elHeight: Double,
    preventOverlap: Boolean,
    vh: Double,
    vhMargin: Double,
    y: VerticalPosition,
    yMargin: Double
  ): Options = {
    val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], disableVHBounds = disableVHBounds.asInstanceOf[js.Any], elHeight = elHeight.asInstanceOf[js.Any], preventOverlap = preventOverlap.asInstanceOf[js.Any], vh = vh.asInstanceOf[js.Any], vhMargin = vhMargin.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yMargin = yMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setContainerRect(value: DOMRect | ClientRect): Self = this.set("containerRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSwapping(value: Boolean): Self = this.set("disableSwapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVHBounds(value: Boolean): Self = this.set("disableVHBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElHeight(value: Double): Self = this.set("elHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventOverlap(value: Boolean): Self = this.set("preventOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVh(value: Double): Self = this.set("vh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhMargin(value: Double): Self = this.set("vhMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: VerticalPosition): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMargin(value: Double): Self = this.set("yMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialY: Self = this.set("initialY", js.undefined)
  }
}

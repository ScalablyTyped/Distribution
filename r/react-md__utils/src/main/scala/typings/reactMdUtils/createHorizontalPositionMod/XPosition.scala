package typings.reactMdUtils.createHorizontalPositionMod

import typings.reactMdUtils.typesMod.HorizontalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @private
  */
@js.native
trait XPosition extends js.Object {
  
  var actualX: HorizontalPosition = js.native
  
  var left: Double = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var right: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object XPosition {
  
  @scala.inline
  def apply(actualX: HorizontalPosition, left: Double): XPosition = {
    val __obj = js.Dynamic.literal(actualX = actualX.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[XPosition]
  }
  
  @scala.inline
  implicit class XPositionOps[Self <: XPosition] (val x: Self) extends AnyVal {
    
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
    def setActualX(value: HorizontalPosition): Self = this.set("actualX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

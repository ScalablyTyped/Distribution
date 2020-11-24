package typings.reactScrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerHeight extends js.Object {
  
  var containerHeight: Double = js.native
  
  var containerWidth: Double = js.native
  
  var leftPosition: Double = js.native
  
  var realHeight: Double = js.native
  
  var realWidth: Double = js.native
  
  var topPosition: Double = js.native
}
object ContainerHeight {
  
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    leftPosition: Double,
    realHeight: Double,
    realWidth: Double,
    topPosition: Double
  ): ContainerHeight = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], leftPosition = leftPosition.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerHeight]
  }
  
  @scala.inline
  implicit class ContainerHeightOps[Self <: ContainerHeight] (val x: Self) extends AnyVal {
    
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
    def setContainerHeight(value: Double): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPosition(value: Double): Self = this.set("leftPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealHeight(value: Double): Self = this.set("realHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealWidth(value: Double): Self = this.set("realWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopPosition(value: Double): Self = this.set("topPosition", value.asInstanceOf[js.Any])
  }
}

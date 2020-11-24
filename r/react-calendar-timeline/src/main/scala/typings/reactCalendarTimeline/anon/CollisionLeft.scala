package typings.reactCalendarTimeline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollisionLeft extends js.Object {
  
  var collisionLeft: Double = js.native
  
  var collisionWidth: Double = js.native
  
  var height: Double = js.native
  
  var isDragging: Boolean = js.native
  
  var left: Double = js.native
  
  var order: Group = js.native
  
  var originalLeft: Double = js.native
  
  var stack: Boolean = js.native
  
  var top: Double | Null = js.native
  
  var width: Double = js.native
}
object CollisionLeft {
  
  @scala.inline
  def apply(
    collisionLeft: Double,
    collisionWidth: Double,
    height: Double,
    isDragging: Boolean,
    left: Double,
    order: Group,
    originalLeft: Double,
    stack: Boolean,
    width: Double
  ): CollisionLeft = {
    val __obj = js.Dynamic.literal(collisionLeft = collisionLeft.asInstanceOf[js.Any], collisionWidth = collisionWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], originalLeft = originalLeft.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionLeft]
  }
  
  @scala.inline
  implicit class CollisionLeftOps[Self <: CollisionLeft] (val x: Self) extends AnyVal {
    
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
    def setCollisionLeft(value: Double): Self = this.set("collisionLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionWidth(value: Double): Self = this.set("collisionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Group): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalLeft(value: Double): Self = this.set("originalLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopNull: Self = this.set("top", null)
  }
}

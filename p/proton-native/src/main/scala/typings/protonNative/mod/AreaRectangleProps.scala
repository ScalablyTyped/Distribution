package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaRectangleProps extends AreaBaseProps {
  
  /**
    * The height of the rectangle.
    */
  var height: Double | String = js.native
  
  /**
    * The width of the rectangle.
    */
  var width: Double | String = js.native
  
  /**
    * The x coordinate of the rectangles top left corner.
    */
  var x: Double | String = js.native
  
  /**
    * The y coordinate of the rectangles top left corner.
    */
  var y: Double | String = js.native
}
object AreaRectangleProps {
  
  @scala.inline
  def apply(height: Double | String, width: Double | String, x: Double | String, y: Double | String): AreaRectangleProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaRectangleProps]
  }
  
  @scala.inline
  implicit class AreaRectanglePropsOps[Self <: AreaRectangleProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}

package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaCircleProps extends AreaBaseProps {
  /**
    * The circle's radius. Percentage values use the Area's width.
    */
  var r: Double | String = js.native
  /**
    * The x coordinate of the center of the cirle.
    */
  var x: Double | String = js.native
  /**
    * The y coordinate of the center of the cirle.
    */
  var y: Double | String = js.native
}

object AreaCircleProps {
  @scala.inline
  def apply(r: Double | String, x: Double | String, y: Double | String): AreaCircleProps = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaCircleProps]
  }
  @scala.inline
  implicit class AreaCirclePropsOps[Self <: AreaCircleProps] (val x: Self) extends AnyVal {
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
    def setR(value: Double | String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}


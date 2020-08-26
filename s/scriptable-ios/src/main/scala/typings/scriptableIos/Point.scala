package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a point._
  * @see https://docs.scriptable.app/point/#-new-point
  */
@js.native
trait Point extends js.Object {
  /**
    * _X value._
    * @see https://docs.scriptable.app/point/#x
    */
  var x: Double = js.native
  /**
    * _Y value._
    * @see https://docs.scriptable.app/point/#y
    */
  var y: Double = js.native
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}


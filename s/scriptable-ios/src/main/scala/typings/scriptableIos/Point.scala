package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a point._
  * @see https://docs.scriptable.app/point/#-new-point
  */
trait Point extends js.Object {
  /**
    * _X value._
    * @see https://docs.scriptable.app/point/#x
    */
  var x: Double
  /**
    * _Y value._
    * @see https://docs.scriptable.app/point/#y
    */
  var y: Double
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}


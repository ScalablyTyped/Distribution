package typings.reactDashMeasure.reactDashMeasureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  val height: Double
  val width: Double
}

object Dimensions {
  @scala.inline
  def apply(height: Double, width: Double): Dimensions = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Dimensions]
  }
}


package typings.reactDashScrollbarDashSize.reactDashScrollbarDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measurement extends js.Object {
  var scrollbarHeight: Double
  var scrollbarWidth: Double
}

object Measurement {
  @scala.inline
  def apply(scrollbarHeight: Double, scrollbarWidth: Double): Measurement = {
    val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight, scrollbarWidth = scrollbarWidth)
  
    __obj.asInstanceOf[Measurement]
  }
}


package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSize extends js.Object {
  var scrollHeight: Double
  var scrollWidth: Double
}

object ScrollSize {
  @scala.inline
  def apply(scrollHeight: Double, scrollWidth: Double): ScrollSize = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollSize]
  }
}


package typings.smoothDashScrollbar.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollIntoViewOptions extends js.Object {
  var alignToTop: Boolean
  var offsetBottom: Double
  var offsetLeft: Double
  var offsetTop: Double
  var onlyScrollIfNeeded: Boolean
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(
    alignToTop: Boolean,
    offsetBottom: Double,
    offsetLeft: Double,
    offsetTop: Double,
    onlyScrollIfNeeded: Boolean
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(alignToTop = alignToTop, offsetBottom = offsetBottom, offsetLeft = offsetLeft, offsetTop = offsetTop, onlyScrollIfNeeded = onlyScrollIfNeeded)
  
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
}


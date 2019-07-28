package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgePadding extends js.Object {
  var bottom: Number
  var left: Number
  var right: Number
  var top: Number
}

object EdgePadding {
  @scala.inline
  def apply(bottom: Number, left: Number, right: Number, top: Number): EdgePadding = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[EdgePadding]
  }
}


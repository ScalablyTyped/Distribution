package typings.reDashResizable.reDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSSize extends js.Object {
  var height: String
  var width: String
}

object CSSSize {
  @scala.inline
  def apply(height: String, width: String): CSSSize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[CSSSize]
  }
}


package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorOnLine extends js.Object {
  val onLine: scala.Boolean
}

object NavigatorOnLine {
  @scala.inline
  def apply(onLine: scala.Boolean): NavigatorOnLine = {
    val __obj = js.Dynamic.literal(onLine = onLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOnLine]
  }
}


package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object Rect {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Rect]
  }
}


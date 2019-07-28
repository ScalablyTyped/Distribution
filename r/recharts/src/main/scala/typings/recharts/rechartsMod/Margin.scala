package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object Margin {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Margin = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Margin]
  }
}


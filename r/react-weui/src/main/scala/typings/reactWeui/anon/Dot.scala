package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dot extends js.Object {
  var dot: Boolean
  var preset: String
}

object Dot {
  @scala.inline
  def apply(dot: Boolean, preset: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
}


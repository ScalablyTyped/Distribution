package typings.reactScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Smooth extends js.Object {
  var smooth: Boolean | String
}

object Smooth {
  @scala.inline
  def apply(smooth: Boolean | String): Smooth = {
    val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Smooth]
  }
}


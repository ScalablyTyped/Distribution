package typings.ranjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cv extends js.Object {
  var cv: Double
  var mean: Double
  var std: Double
}

object Cv {
  @scala.inline
  def apply(cv: Double, mean: Double, std: Double): Cv = {
    val __obj = js.Dynamic.literal(cv = cv.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], std = std.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cv]
  }
}


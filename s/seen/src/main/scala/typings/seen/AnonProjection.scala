package typings.seen

import typings.seen.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjection extends js.Object {
  var projection: Matrix
}

object AnonProjection {
  @scala.inline
  def apply(projection: Matrix): AnonProjection = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProjection]
  }
}


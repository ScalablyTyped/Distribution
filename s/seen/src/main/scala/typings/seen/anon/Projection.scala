package typings.seen.anon

import typings.seen.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var projection: Matrix
}

object Projection {
  @scala.inline
  def apply(projection: Matrix): Projection = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}


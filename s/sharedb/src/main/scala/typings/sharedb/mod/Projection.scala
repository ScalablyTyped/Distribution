package typings.sharedb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  var fields: ProjectionFields
  var target: String
}

object Projection {
  @scala.inline
  def apply(fields: ProjectionFields, target: String): Projection = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}


package typings.restIo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreatedAt extends js.Object {
  var createdAt: Date
  var id: js.Any
}

object AnonCreatedAt {
  @scala.inline
  def apply(createdAt: Date, id: js.Any): AnonCreatedAt = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreatedAt]
  }
}


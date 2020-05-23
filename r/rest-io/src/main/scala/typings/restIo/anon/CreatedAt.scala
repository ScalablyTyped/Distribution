package typings.restIo.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedAt extends js.Object {
  var createdAt: Date
  var id: js.Any
}

object CreatedAt {
  @scala.inline
  def apply(createdAt: Date, id: js.Any): CreatedAt = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedAt]
  }
}


package typings.shapefile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Done[RecordType] extends js.Object {
  var done: Boolean
  var value: RecordType
}

object Done {
  @scala.inline
  def apply[RecordType](done: Boolean, value: RecordType): Done[RecordType] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[RecordType]]
  }
}


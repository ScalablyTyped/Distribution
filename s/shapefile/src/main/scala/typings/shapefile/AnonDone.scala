package typings.shapefile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone[RecordType] extends js.Object {
  var done: Boolean
  var value: RecordType
}

object AnonDone {
  @scala.inline
  def apply[RecordType](done: Boolean, value: RecordType): AnonDone[RecordType] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone[RecordType]]
  }
}


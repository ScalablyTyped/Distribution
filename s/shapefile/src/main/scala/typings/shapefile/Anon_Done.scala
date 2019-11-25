package typings.shapefile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[RecordType] extends js.Object {
  var done: Boolean
  var value: RecordType
}

object Anon_Done {
  @scala.inline
  def apply[RecordType](done: Boolean, value: RecordType): Anon_Done[RecordType] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Done[RecordType]]
  }
}


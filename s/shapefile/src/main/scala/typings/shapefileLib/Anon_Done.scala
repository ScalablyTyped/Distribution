package typings
package shapefileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[RecordType] extends js.Object {
  var done: scala.Boolean
  var value: RecordType
}

object Anon_Done {
  @scala.inline
  def apply[RecordType](done: scala.Boolean, value: RecordType): Anon_Done[RecordType] = {
    val __obj = js.Dynamic.literal(done = done, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Done[RecordType]]
  }
}


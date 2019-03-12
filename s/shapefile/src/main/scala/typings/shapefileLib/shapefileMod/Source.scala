package typings
package shapefileLib.shapefileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source[RecordType] extends js.Object {
  var bbox: js.Array[scala.Double]
  def cancel(): js.Promise[scala.Unit]
  def read(): js.Promise[shapefileLib.Anon_Done[RecordType]]
}

object Source {
  @scala.inline
  def apply[RecordType](
    bbox: js.Array[scala.Double],
    cancel: () => js.Promise[scala.Unit],
    read: () => js.Promise[shapefileLib.Anon_Done[RecordType]]
  ): Source[RecordType] = {
    val __obj = js.Dynamic.literal(bbox = bbox, cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read))
  
    __obj.asInstanceOf[Source[RecordType]]
  }
}


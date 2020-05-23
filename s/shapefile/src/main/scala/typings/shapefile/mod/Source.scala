package typings.shapefile.mod

import typings.shapefile.anon.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source[RecordType] extends js.Object {
  var bbox: js.Array[Double]
  def cancel(): js.Promise[Unit]
  def read(): js.Promise[Done[RecordType]]
}

object Source {
  @scala.inline
  def apply[RecordType](bbox: js.Array[Double], cancel: () => js.Promise[Unit], read: () => js.Promise[Done[RecordType]]): Source[RecordType] = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[Source[RecordType]]
  }
}


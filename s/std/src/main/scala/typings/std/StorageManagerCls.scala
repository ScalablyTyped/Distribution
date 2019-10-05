package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StorageManager")
@js.native
class StorageManagerCls () extends StorageManager {
  /* CompleteClass */
  override def estimate(): js.Promise[StorageEstimate] = js.native
  /* CompleteClass */
  override def persist(): js.Promise[scala.Boolean] = js.native
  /* CompleteClass */
  override def persisted(): js.Promise[scala.Boolean] = js.native
}


package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.StorageEstimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StorageManager")
@js.native
class StorageManager ()
  extends typings.std.StorageManager {
  /* CompleteClass */
  override def estimate(): js.Promise[StorageEstimate] = js.native
  /* CompleteClass */
  override def persist(): js.Promise[scala.Boolean] = js.native
  /* CompleteClass */
  override def persisted(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("StorageManager")
@js.native
object StorageManager
  extends Instantiable0[typings.std.StorageManager]


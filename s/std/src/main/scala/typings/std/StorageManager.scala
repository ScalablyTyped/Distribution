package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageManager extends js.Object {
  def estimate(): js.Promise[StorageEstimate]
  def persist(): js.Promise[scala.Boolean]
  def persisted(): js.Promise[scala.Boolean]
}

object StorageManager {
  @scala.inline
  def apply(
    estimate: () => js.Promise[StorageEstimate],
    persist: () => js.Promise[scala.Boolean],
    persisted: () => js.Promise[scala.Boolean]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = js.Any.fromFunction0(estimate), persist = js.Any.fromFunction0(persist), persisted = js.Any.fromFunction0(persisted))
    __obj.asInstanceOf[StorageManager]
  }
}


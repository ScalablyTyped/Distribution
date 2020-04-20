package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStorage extends js.Object {
  val storage: StorageManager
}

object NavigatorStorage {
  @scala.inline
  def apply(storage: StorageManager): NavigatorStorage = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorStorage]
  }
}


package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorStorage extends js.Object {
  val storage: StorageManager
}

object NavigatorStorage {
  @scala.inline
  def apply(storage: StorageManager): NavigatorStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[NavigatorStorage]
  }
}


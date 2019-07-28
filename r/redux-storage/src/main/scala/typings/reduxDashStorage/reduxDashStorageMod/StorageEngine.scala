package typings.reduxDashStorage.reduxDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEngine extends js.Object {
  /**
    * Load
    */
  def load(): js.Thenable[_]
  /**
    * Save
    * @param state
    */
  def save(state: js.Any): js.Thenable[_]
}

object StorageEngine {
  @scala.inline
  def apply(load: () => js.Thenable[_], save: js.Any => js.Thenable[_]): StorageEngine = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), save = js.Any.fromFunction1(save))
  
    __obj.asInstanceOf[StorageEngine]
  }
}


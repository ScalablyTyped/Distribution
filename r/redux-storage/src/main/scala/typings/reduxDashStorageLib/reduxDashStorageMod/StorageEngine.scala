package typings
package reduxDashStorageLib.reduxDashStorageMod

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
  def apply(load: js.Function0[js.Thenable[_]], save: js.Function1[js.Any, js.Thenable[_]]): StorageEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[StorageEngine]
  }
}


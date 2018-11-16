package typings
package reduxDashStorageLib.reduxDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StorageEngine extends js.Object {
  /**
           * Load
           */
  def load(): stdLib.PromiseLike[_]
  /**
           * Save
           * @param state
           */
  def save(state: js.Any): stdLib.PromiseLike[_]
}


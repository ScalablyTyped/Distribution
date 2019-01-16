package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageManager extends js.Object {
  def estimate(): Promise[StorageEstimate]
  def persist(): Promise[scala.Boolean]
  def persisted(): Promise[scala.Boolean]
}

@JSGlobal("StorageManager")
@js.native
object StorageManager
  extends org.scalablytyped.runtime.Instantiable0[StorageManager]


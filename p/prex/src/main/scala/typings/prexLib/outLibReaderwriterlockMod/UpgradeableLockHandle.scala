package typings
package prexLib.outLibReaderwriterlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeableLockHandle extends LockHandle {
  /**
    * Upgrades the lock to a write lock.
    *
    * @param token A CancellationToken used to cancel the request.
    */
  def upgrade(): js.Promise[LockHandle] = js.native
  def upgrade(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[LockHandle] = js.native
}


package typings.prex.outLibReaderwriterlockMod

import typings.atEsfxCancelable.distMod.Cancelable
import typings.prex.outLibCancellationMod.CancellationToken
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
  def upgrade(token: Cancelable): js.Promise[LockHandle] = js.native
  def upgrade(token: CancellationToken): js.Promise[LockHandle] = js.native
}


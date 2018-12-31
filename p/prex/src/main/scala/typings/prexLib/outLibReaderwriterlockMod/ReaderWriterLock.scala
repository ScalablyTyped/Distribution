package typings
package prexLib.outLibReaderwriterlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/readerwriterlock", "ReaderWriterLock")
@js.native
class ReaderWriterLock () extends js.Object {
  var _canTakeReadLock: js.Any = js.native
  var _canTakeUpgradeLock: js.Any = js.native
  var _canTakeUpgradeableReadLock: js.Any = js.native
  var _canTakeWriteLock: js.Any = js.native
  var _count: js.Any = js.native
  var _processLockRequests: js.Any = js.native
  var _processReadLockRequests: js.Any = js.native
  var _processUpgradeRequest: js.Any = js.native
  var _processUpgradeableReadLockRequest: js.Any = js.native
  var _processWriteLockRequest: js.Any = js.native
  var _readers: js.Any = js.native
  var _releaseReadLock: js.Any = js.native
  var _releaseUpgradeLock: js.Any = js.native
  var _releaseUpgradeableReadLock: js.Any = js.native
  var _releaseWriteLock: js.Any = js.native
  var _takeReadLock: js.Any = js.native
  var _takeUpgradeLock: js.Any = js.native
  var _takeUpgradeableReadLock: js.Any = js.native
  var _takeWriteLock: js.Any = js.native
  var _upgrade: js.Any = js.native
  var _upgradeable: js.Any = js.native
  var _upgradeables: js.Any = js.native
  var _upgraded: js.Any = js.native
  var _upgrades: js.Any = js.native
  var _writers: js.Any = js.native
  /**
    * Asynchronously waits for and takes a read lock on a resource.
    *
    * @param token A CancellationToken used to cancel the request.
    */
  def read(): js.Promise[LockHandle] = js.native
  def read(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[LockHandle] = js.native
  /**
    * Asynchronously waits for and takes a read lock on a resource
    * that can later be upgraded to a write lock.
    *
    * @param token A CancellationToken used to cancel the request.
    */
  def upgradeableRead(): js.Promise[UpgradeableLockHandle] = js.native
  def upgradeableRead(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[UpgradeableLockHandle] = js.native
  /**
    * Asynchronously waits for and takes a write lock on a resource.
    *
    * @param token A CancellationToken used to cancel the request.
    */
  def write(): js.Promise[LockHandle] = js.native
  def write(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[LockHandle] = js.native
}


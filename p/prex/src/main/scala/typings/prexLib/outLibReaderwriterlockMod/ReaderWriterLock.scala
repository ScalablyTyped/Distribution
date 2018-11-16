package typings
package prexLib.outLibReaderwriterlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/readerwriterlock", "ReaderWriterLock")
@js.native
class ReaderWriterLock () extends js.Object {
  var _count: js.Any = js.native
  var _readers: js.Any = js.native
  var _upgradeable: js.Any = js.native
  var _upgradeables: js.Any = js.native
  var _upgraded: js.Any = js.native
  var _upgrades: js.Any = js.native
  var _writers: js.Any = js.native
  /* private */ def _canTakeReadLock(): js.Any = js.native
  /* private */ def _canTakeUpgradeLock(): js.Any = js.native
  /* private */ def _canTakeUpgradeableReadLock(): js.Any = js.native
  /* private */ def _canTakeWriteLock(): js.Any = js.native
  /* private */ def _processLockRequests(): js.Any = js.native
  /* private */ def _processReadLockRequests(): js.Any = js.native
  /* private */ def _processUpgradeRequest(): js.Any = js.native
  /* private */ def _processUpgradeableReadLockRequest(): js.Any = js.native
  /* private */ def _processWriteLockRequest(): js.Any = js.native
  /* private */ def _releaseReadLock(): js.Any = js.native
  /* private */ def _releaseUpgradeLock(): js.Any = js.native
  /* private */ def _releaseUpgradeableReadLock(): js.Any = js.native
  /* private */ def _releaseWriteLock(): js.Any = js.native
  /* private */ def _takeReadLock(): js.Any = js.native
  /* private */ def _takeUpgradeLock(): js.Any = js.native
  /* private */ def _takeUpgradeableReadLock(): js.Any = js.native
  /* private */ def _takeWriteLock(): js.Any = js.native
  /* private */ def _upgrade(): js.Any = js.native
  /* private */ def _upgrade(token: js.Any): js.Any = js.native
  /**
       * Asynchronously waits for and takes a read lock on a resource.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def read(): stdLib.Promise[LockHandle] = js.native
  /**
       * Asynchronously waits for and takes a read lock on a resource.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def read(token: prexLib.outLibCancellationMod.CancellationToken): stdLib.Promise[LockHandle] = js.native
  /**
       * Asynchronously waits for and takes a read lock on a resource
       * that can later be upgraded to a write lock.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def upgradeableRead(): stdLib.Promise[UpgradeableLockHandle] = js.native
  /**
       * Asynchronously waits for and takes a read lock on a resource
       * that can later be upgraded to a write lock.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def upgradeableRead(token: prexLib.outLibCancellationMod.CancellationToken): stdLib.Promise[UpgradeableLockHandle] = js.native
  /**
       * Asynchronously waits for and takes a write lock on a resource.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def write(): stdLib.Promise[LockHandle] = js.native
  /**
       * Asynchronously waits for and takes a write lock on a resource.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def write(token: prexLib.outLibCancellationMod.CancellationToken): stdLib.Promise[LockHandle] = js.native
}


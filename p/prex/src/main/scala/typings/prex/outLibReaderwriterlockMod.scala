package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.esfxDisposable.distTypesDisposableMod.Disposable
import typings.prex.outLibCancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLibReaderwriterlockMod {
  
  @JSImport("prex/out/lib/readerwriterlock", "ReaderWriterLock")
  @js.native
  open class ReaderWriterLock () extends StObject {
    
    /* private */ var _canTakeReadLock: Any = js.native
    
    /* private */ var _canTakeUpgradeLock: Any = js.native
    
    /* private */ var _canTakeUpgradeableReadLock: Any = js.native
    
    /* private */ var _canTakeWriteLock: Any = js.native
    
    /* private */ var _count: Any = js.native
    
    /* private */ var _processLockRequests: Any = js.native
    
    /* private */ var _processReadLockRequests: Any = js.native
    
    /* private */ var _processUpgradeRequest: Any = js.native
    
    /* private */ var _processUpgradeableReadLockRequest: Any = js.native
    
    /* private */ var _processWriteLockRequest: Any = js.native
    
    /* private */ var _readers: Any = js.native
    
    /* private */ var _releaseReadLock: Any = js.native
    
    /* private */ var _releaseUpgradeLock: Any = js.native
    
    /* private */ var _releaseUpgradeableReadLock: Any = js.native
    
    /* private */ var _releaseWriteLock: Any = js.native
    
    /* private */ var _takeReadLock: Any = js.native
    
    /* private */ var _takeUpgradeLock: Any = js.native
    
    /* private */ var _takeUpgradeableReadLock: Any = js.native
    
    /* private */ var _takeWriteLock: Any = js.native
    
    /* private */ var _upgrade: Any = js.native
    
    /* private */ var _upgradeable: Any = js.native
    
    /* private */ var _upgradeables: Any = js.native
    
    /* private */ var _upgraded: Any = js.native
    
    /* private */ var _upgrades: Any = js.native
    
    /* private */ var _writers: Any = js.native
    
    /**
      * Asynchronously waits for and takes a read lock on a resource.
      *
      * @param token A CancellationToken used to cancel the request.
      */
    def read(): js.Promise[LockHandle] = js.native
    def read(token: Cancelable): js.Promise[LockHandle] = js.native
    def read(token: CancellationToken): js.Promise[LockHandle] = js.native
    
    /**
      * Asynchronously waits for and takes a read lock on a resource
      * that can later be upgraded to a write lock.
      *
      * @param token A CancellationToken used to cancel the request.
      */
    def upgradeableRead(): js.Promise[UpgradeableLockHandle] = js.native
    def upgradeableRead(token: Cancelable): js.Promise[UpgradeableLockHandle] = js.native
    def upgradeableRead(token: CancellationToken): js.Promise[UpgradeableLockHandle] = js.native
    
    /**
      * Asynchronously waits for and takes a write lock on a resource.
      *
      * @param token A CancellationToken used to cancel the request.
      */
    def write(): js.Promise[LockHandle] = js.native
    def write(token: Cancelable): js.Promise[LockHandle] = js.native
    def write(token: CancellationToken): js.Promise[LockHandle] = js.native
  }
  
  @js.native
  trait LockHandle extends Disposable {
    
    /**
      * Releases the lock.
      */
    def release(): Unit = js.native
  }
  
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
}

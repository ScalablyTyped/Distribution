package typings.properLockfile

import typings.retry.mod.OperationOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proper-lockfile", "check")
  @js.native
  def check(file: String): js.Promise[Boolean] = js.native
  @JSImport("proper-lockfile", "check")
  @js.native
  def check(file: String, options: CheckOptions): js.Promise[Boolean] = js.native
  
  @JSImport("proper-lockfile", "checkSync")
  @js.native
  def checkSync(file: String): Boolean = js.native
  @JSImport("proper-lockfile", "checkSync")
  @js.native
  def checkSync(file: String, options: CheckOptions): Boolean = js.native
  
  @JSImport("proper-lockfile", "lock")
  @js.native
  def lock(file: String): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  @JSImport("proper-lockfile", "lock")
  @js.native
  def lock(file: String, options: LockOptions): js.Promise[js.Function0[js.Promise[Unit]]] = js.native
  
  @JSImport("proper-lockfile", "lockSync")
  @js.native
  def lockSync(file: String): js.Function0[Unit] = js.native
  @JSImport("proper-lockfile", "lockSync")
  @js.native
  def lockSync(file: String, options: LockOptions): js.Function0[Unit] = js.native
  
  @JSImport("proper-lockfile", "unlock")
  @js.native
  def unlock(file: String): js.Promise[Unit] = js.native
  @JSImport("proper-lockfile", "unlock")
  @js.native
  def unlock(file: String, options: UnlockOptions): js.Promise[Unit] = js.native
  
  @JSImport("proper-lockfile", "unlockSync")
  @js.native
  def unlockSync(file: String): Unit = js.native
  @JSImport("proper-lockfile", "unlockSync")
  @js.native
  def unlockSync(file: String, options: UnlockOptions): Unit = js.native
  
  @js.native
  trait CheckOptions extends StObject {
    
    // default: true
    var fs: js.UndefOr[js.Any] = js.native
    
    // default: graceful-fs
    var lockfilePath: js.UndefOr[String] = js.native
    
    // default: 10000
    var realpath: js.UndefOr[Boolean] = js.native
    
    var stale: js.UndefOr[Double] = js.native
  }
  object CheckOptions {
    
    @scala.inline
    def apply(): CheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckOptions]
    }
    
    @scala.inline
    implicit class CheckOptionsMutableBuilder[Self <: CheckOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockfilePathUndefined: Self = StObject.set(x, "lockfilePath", js.undefined)
      
      @scala.inline
      def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      @scala.inline
      def setStale(value: Double): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    }
  }
  
  @js.native
  trait LockOptions extends StObject {
    
    // default: true
    var fs: js.UndefOr[js.Any] = js.native
    
    // default: (err) => throw err
    var lockfilePath: js.UndefOr[String] = js.native
    
    // default: graceful-fs
    var onCompromised: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
    
    // default: 0
    var realpath: js.UndefOr[Boolean] = js.native
    
    // default: stale/2
    var retries: js.UndefOr[Double | OperationOptions] = js.native
    
    var stale: js.UndefOr[Double] = js.native
    
    // default: 10000
    var update: js.UndefOr[Double] = js.native
  }
  object LockOptions {
    
    @scala.inline
    def apply(): LockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockOptions]
    }
    
    @scala.inline
    implicit class LockOptionsMutableBuilder[Self <: LockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockfilePathUndefined: Self = StObject.set(x, "lockfilePath", js.undefined)
      
      @scala.inline
      def setOnCompromised(value: /* err */ Error => _): Self = StObject.set(x, "onCompromised", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompromisedUndefined: Self = StObject.set(x, "onCompromised", js.undefined)
      
      @scala.inline
      def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      @scala.inline
      def setRetries(value: Double | OperationOptions): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setStale(value: Double): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      @scala.inline
      def setUpdate(value: Double): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait UnlockOptions extends StObject {
    
    // default: true
    var fs: js.UndefOr[js.Any] = js.native
    
    // default: graceful-fs
    var lockfilePath: js.UndefOr[String] = js.native
    
    var realpath: js.UndefOr[Boolean] = js.native
  }
  object UnlockOptions {
    
    @scala.inline
    def apply(): UnlockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlockOptions]
    }
    
    @scala.inline
    implicit class UnlockOptionsMutableBuilder[Self <: UnlockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockfilePathUndefined: Self = StObject.set(x, "lockfilePath", js.undefined)
      
      @scala.inline
      def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    }
  }
}

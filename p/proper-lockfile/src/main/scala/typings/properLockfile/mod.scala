package typings.properLockfile

import typings.retry.mod.OperationOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proper-lockfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def check(file: String, options: CheckOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def checkSync(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def checkSync(file: String, options: CheckOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lock(file: String): js.Promise[js.Function0[js.Promise[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Function0[js.Promise[Unit]]]]
  inline def lock(file: String, options: LockOptions): js.Promise[js.Function0[js.Promise[Unit]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Function0[js.Promise[Unit]]]]
  
  inline def lockSync(file: String): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("lockSync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def lockSync(file: String, options: LockOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lockSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def unlock(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def unlock(file: String, options: UnlockOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def unlockSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlockSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unlockSync(file: String, options: UnlockOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlockSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CheckOptions extends StObject {
    
    // default: true
    var fs: js.UndefOr[js.Any] = js.undefined
    
    // default: graceful-fs
    var lockfilePath: js.UndefOr[String] = js.undefined
    
    // default: 10000
    var realpath: js.UndefOr[Boolean] = js.undefined
    
    var stale: js.UndefOr[Double] = js.undefined
  }
  object CheckOptions {
    
    inline def apply(): CheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckOptions]
    }
    
    extension [Self <: CheckOptions](x: Self) {
      
      inline def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      inline def setLockfilePathUndefined: Self = StObject.set(x, "lockfilePath", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setStale(value: Double): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    }
  }
  
  trait LockOptions extends StObject {
    
    // default: true
    var fs: js.UndefOr[js.Any] = js.undefined
    
    // default: (err) => throw err
    var lockfilePath: js.UndefOr[String] = js.undefined
    
    // default: graceful-fs
    var onCompromised: js.UndefOr[js.Function1[/* err */ Error, js.Any]] = js.undefined
    
    // default: 0
    var realpath: js.UndefOr[Boolean] = js.undefined
    
    // default: stale/2
    var retries: js.UndefOr[Double | OperationOptions] = js.undefined
    
    var stale: js.UndefOr[Double] = js.undefined
    
    // default: 10000
    var update: js.UndefOr[Double] = js.undefined
  }
  object LockOptions {
    
    inline def apply(): LockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockOptions]
    }
    
    extension [Self <: LockOptions](x: Self) {
      
      inline def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      inline def setLockfilePathUndefined: Self = StObject.set(x, "lockfilePath", js.undefined)
      
      inline def setOnCompromised(value: /* err */ Error => js.Any): Self = StObject.set(x, "onCompromised", js.Any.fromFunction1(value))
      
      inline def setOnCompromisedUndefined: Self = StObject.set(x, "onCompromised", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setRetries(value: Double | OperationOptions): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setStale(value: Double): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      inline def setUpdate(value: Double): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait UnlockOptions extends StObject {
    
    // default: true
    var fs: js.UndefOr[js.Any] = js.undefined
    
    // default: graceful-fs
    var lockfilePath: js.UndefOr[String] = js.undefined
    
    var realpath: js.UndefOr[Boolean] = js.undefined
  }
  object UnlockOptions {
    
    inline def apply(): UnlockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlockOptions]
    }
    
    extension [Self <: UnlockOptions](x: Self) {
      
      inline def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setLockfilePath(value: String): Self = StObject.set(x, "lockfilePath", value.asInstanceOf[js.Any])
      
      inline def setLockfilePathUndefined: Self = StObject.set(x, "lockfilePath", js.undefined)
      
      inline def setRealpath(value: Boolean): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    }
  }
}

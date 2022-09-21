package typings.shelljs

import typings.node.nodeUrlMod.URL
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.shelljs.shelljsBooleans.`false`
import typings.shelljs.shelljsBooleans.`true`
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined shelljs.shelljs.ExecOptions & {  async :false | undefined} */
  trait ExecOptionsasyncfalseunde extends StObject {
    
    /**
      * Asynchronous execution.
      *
      * If a callback is provided, it will be set to `true`, regardless of the passed value.
      *
      * @default false
      */
    var async: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
      * Character encoding to use.
      *
      * Affects the values returned by `stdout` and `stderr`,
      * and what is written to `stdout` and `stderr` when not in silent mode
      *
      * @default "utf8"
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    /**
      * Exit when command return code is non-zero.
      *
      * @default false
      */
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    var maxBuffer: js.UndefOr[Double] = js.undefined
    
    var shell: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Do not echo program output to the console.
      *
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 0
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    /**
      * @default true
      */
    var windowsHide: js.UndefOr[Boolean] = js.undefined
  }
  object ExecOptionsasyncfalseunde {
    
    inline def apply(async: js.UndefOr[Boolean] & js.UndefOr[`false`]): ExecOptionsasyncfalseunde = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecOptionsasyncfalseunde]
    }
    
    extension [Self <: ExecOptionsasyncfalseunde](x: Self) {
      
      inline def setAsync(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined shelljs.shelljs.ExecOptions & {  async :true} */
  trait ExecOptionsasynctrue extends StObject {
    
    /**
      * Asynchronous execution.
      *
      * If a callback is provided, it will be set to `true`, regardless of the passed value.
      *
      * @default false
      */
    var async: js.UndefOr[Boolean] & `true`
    
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
      * Character encoding to use.
      *
      * Affects the values returned by `stdout` and `stderr`,
      * and what is written to `stdout` and `stderr` when not in silent mode
      *
      * @default "utf8"
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
    
    /**
      * Exit when command return code is non-zero.
      *
      * @default false
      */
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var killSignal: js.UndefOr[Signals | Double] = js.undefined
    
    var maxBuffer: js.UndefOr[Double] = js.undefined
    
    var shell: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Do not echo program output to the console.
      *
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 0
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    /**
      * @default true
      */
    var windowsHide: js.UndefOr[Boolean] = js.undefined
  }
  object ExecOptionsasynctrue {
    
    inline def apply(async: js.UndefOr[Boolean] & `true`): ExecOptionsasynctrue = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecOptionsasynctrue]
    }
    
    extension [Self <: ExecOptionsasynctrue](x: Self) {
      
      inline def setAsync(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
}

package typings.shelljs

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.shelljs.shelljsBooleans.`false`
import typings.shelljs.shelljsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined shelljs.shelljs.ExecOptions & {  async :false | undefined} */
  @js.native
  trait ExecOptionsasyncfalseunde extends StObject {
    
    /**
      * Asynchronous execution.
      *
      * If a callback is provided, it will be set to `true`, regardless of the passed value.
      *
      * @default false
      */
    var async: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Character encoding to use.
      *
      * Affects the values returned by `stdout` and `stderr`,
      * and what is written to `stdout` and `stderr` when not in silent mode
      *
      * @default "utf8"
      */
    var encoding: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    /**
      * Exit when command return code is non-zero.
      *
      * @default false
      */
    var fatal: js.UndefOr[Boolean] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var killSignal: js.UndefOr[Signals | Double] = js.native
    
    var maxBuffer: js.UndefOr[Double] = js.native
    
    var shell: js.UndefOr[String] = js.native
    
    /**
      * Do not echo program output to the console.
      *
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.native
    
    /**
      * @default 0
      */
    var timeout: js.UndefOr[Double] = js.native
    
    var uid: js.UndefOr[Double] = js.native
    
    /**
      * @default true
      */
    var windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ExecOptionsasyncfalseunde {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] with js.UndefOr[`false`]): ExecOptionsasyncfalseunde = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecOptionsasyncfalseunde]
    }
    
    @scala.inline
    implicit class ExecOptionsasyncfalseundeMutableBuilder[Self <: ExecOptionsasyncfalseunde] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
  
  /* Inlined shelljs.shelljs.ExecOptions & {  async :true} */
  @js.native
  trait ExecOptionsasynctrue extends StObject {
    
    /**
      * Asynchronous execution.
      *
      * If a callback is provided, it will be set to `true`, regardless of the passed value.
      *
      * @default false
      */
    var async: js.UndefOr[Boolean] with `true` = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Character encoding to use.
      *
      * Affects the values returned by `stdout` and `stderr`,
      * and what is written to `stdout` and `stderr` when not in silent mode
      *
      * @default "utf8"
      */
    var encoding: js.UndefOr[String] = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    /**
      * Exit when command return code is non-zero.
      *
      * @default false
      */
    var fatal: js.UndefOr[Boolean] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var killSignal: js.UndefOr[Signals | Double] = js.native
    
    var maxBuffer: js.UndefOr[Double] = js.native
    
    var shell: js.UndefOr[String] = js.native
    
    /**
      * Do not echo program output to the console.
      *
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.native
    
    /**
      * @default 0
      */
    var timeout: js.UndefOr[Double] = js.native
    
    var uid: js.UndefOr[Double] = js.native
    
    /**
      * @default true
      */
    var windowsHide: js.UndefOr[Boolean] = js.native
  }
  object ExecOptionsasynctrue {
    
    @scala.inline
    def apply(async: js.UndefOr[Boolean] with `true`): ExecOptionsasynctrue = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecOptionsasynctrue]
    }
    
    @scala.inline
    implicit class ExecOptionsasynctrueMutableBuilder[Self <: ExecOptionsasynctrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
    }
  }
}

package typings.shipitCli

import typings.node.childProcessMod.ExecOptions
import typings.shipitCli.anon.Typeofshipit
import typings.shipitCli.mod.EmptyCallback
import typings.shipitCli.mod.ShipitLocal
import typings.shipitCli.mod.Tasks_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object shipit {
    
    @JSGlobal("shipit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def blTask(name: String, depsOrFn: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def blTask(name: String, depsOrFn: EmptyCallback): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSGlobal("shipit.domain")
    @js.native
    val domain: js.Any = js.native
    
    @JSGlobal("shipit.doneCallback")
    @js.native
    val doneCallback: js.Any = js.native
    
    inline def emit(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSGlobal("shipit.environment")
    @js.native
    val environment: String = js.native
    
    inline def initConfig(config: js.Object): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
    
    @JSGlobal("shipit.isRunning")
    @js.native
    val isRunning: Boolean = js.native
    
    inline def local(command: String): js.Thenable[ShipitLocal] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def local(
      command: String,
      options: Unit,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def local(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def local(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    
    inline def log(log: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(log.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def log(log: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(log.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def on(name: String, callback: js.Function1[/* e */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def remote(command: String): js.Thenable[ShipitLocal] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def remote(
      command: String,
      options: Unit,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def remote(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def remote(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    
    inline def remoteCopy(src: String, dest: String): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def remoteCopy(
      src: String,
      dest: String,
      options: Unit,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def remoteCopy(src: String, dest: String, options: ExecOptions): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    inline def remoteCopy(
      src: String,
      dest: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
    
    @JSGlobal("shipit.seq")
    @js.native
    val seq: js.Array[js.Any] = js.native
    
    inline def start(tasks: String*): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
    inline def start(tasks: String): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
    inline def start(tasks: js.Array[String]): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
    
    inline def task(name: String, depsOrFn: js.Array[String]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
    inline def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
    inline def task(name: String, depsOrFn: EmptyCallback): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
    inline def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
    
    @JSGlobal("shipit.tasks")
    @js.native
    val tasks: Tasks_ = js.native
  }
}

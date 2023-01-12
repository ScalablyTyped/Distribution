package typings.shipitCli

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecOptions
import typings.node.fsMod.WriteStream
import typings.shipitCli.anon.Typeofshipit
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shipit-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blTask(name: String, depsOrFn: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def blTask(name: String, depsOrFn: EmptyCallback): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def copyFromRemote(src: String, dest: String): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromRemote")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def copyFromRemote(src: String, dest: String, options: ExecOptions): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFromRemote")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  
  inline def copyToRemote(src: String, dest: String): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyToRemote")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def copyToRemote(src: String, dest: String, options: ExecOptions): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyToRemote")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  
  @JSImport("shipit-cli", "domain")
  @js.native
  val domain: Any = js.native
  
  @JSImport("shipit-cli", "doneCallback")
  @js.native
  val doneCallback: Any = js.native
  
  inline def emit(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("shipit-cli", "environment")
  @js.native
  val environment: String = js.native
  
  inline def initConfig(config: js.Object): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  
  @JSImport("shipit-cli", "isRunning")
  @js.native
  val isRunning: Boolean = js.native
  
  inline def local(command: String): PromiseLike[ShipitLocal] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def local(
    command: String,
    options: Unit,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def local(command: String, options: ExecOptions): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def local(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  
  inline def log(log: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(log.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  inline def log(log: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(log.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def on(name: String, callback: js.Function1[/* e */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def remote(command: String): PromiseLike[ShipitLocal] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def remote(
    command: String,
    options: Unit,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def remote(command: String, options: ExecOptions): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def remote(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  
  inline def remoteCopy(src: String, dest: String): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def remoteCopy(
    src: String,
    dest: String,
    options: Unit,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def remoteCopy(src: String, dest: String, options: ExecOptions): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  inline def remoteCopy(
    src: String,
    dest: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
  ): PromiseLike[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[ShipitLocal]]
  
  @JSImport("shipit-cli", "seq")
  @js.native
  val seq: js.Array[Any] = js.native
  
  inline def start(tasks: String*): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Typeofshipit]
  inline def start(tasks: String): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  inline def start(tasks: js.Array[String]): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  
  inline def task(name: String, depsOrFn: js.Array[String]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  inline def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  inline def task(name: String, depsOrFn: EmptyCallback): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  inline def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  
  @JSImport("shipit-cli", "tasks")
  @js.native
  val tasks: Tasks_ = js.native
  
  type EmptyCallback = js.Function0[Unit]
  
  type LocalOrRemoteCommand = js.Function3[
    /* command */ String, 
    /* options */ js.UndefOr[ExecOptions], 
    /* callback */ js.UndefOr[
      js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
    ], 
    PromiseLike[ShipitLocal]
  ]
  
  trait Options extends StObject {
    
    var environment: String
    
    var stderr: WriteStream
    
    var stdout: WriteStream
  }
  object Options {
    
    inline def apply(environment: String, stderr: WriteStream, stdout: WriteStream): Options = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShipitLocal extends StObject {
    
    var child: ChildProcess
    
    var stderr: WriteStream
    
    var stdout: WriteStream
  }
  object ShipitLocal {
    
    inline def apply(child: ChildProcess, stderr: WriteStream, stdout: WriteStream): ShipitLocal = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShipitLocal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShipitLocal] (val x: Self) extends AnyVal {
      
      inline def setChild(value: ChildProcess): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskExecution = js.Function3[
    /* name */ String, 
    /* depsOrFn */ js.Array[String] | EmptyCallback, 
    /* fn */ js.Function0[Unit], 
    Any
  ]
  
  trait Task_ extends StObject {
    
    var blocking: Boolean
    
    var dep: js.Array[String]
    
    def fn(): Unit
    
    var name: String
  }
  object Task_ {
    
    inline def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task_ = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], dep = dep.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Task_] (val x: Self) extends AnyVal {
      
      inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      inline def setDep(value: js.Array[String]): Self = StObject.set(x, "dep", value.asInstanceOf[js.Any])
      
      inline def setDepVarargs(value: String*): Self = StObject.set(x, "dep", js.Array(value*))
      
      inline def setFn(value: () => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Tasks_ = StringDictionary[Task_]
}

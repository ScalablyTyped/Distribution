package typings.shipitCli

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecOptions
import typings.node.fsMod.WriteStream
import typings.shipitCli.anon.Typeofshipit
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shipit-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def blTask(name: String, depsOrFn: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def blTask(name: String, depsOrFn: EmptyCallback): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("blTask")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("shipit-cli", "domain")
  @js.native
  val domain: js.Any = js.native
  
  @JSImport("shipit-cli", "doneCallback")
  @js.native
  val doneCallback: js.Any = js.native
  
  @scala.inline
  def emit(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("shipit-cli", "environment")
  @js.native
  val environment: String = js.native
  
  @scala.inline
  def initConfig(config: js.Object): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  
  @JSImport("shipit-cli", "isRunning")
  @js.native
  val isRunning: Boolean = js.native
  
  @scala.inline
  def local(command: String): js.Thenable[ShipitLocal] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def local(
    command: String,
    options: Unit,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def local(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def local(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("local")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  
  @scala.inline
  def log(log: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(log.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def log(log: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(log.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def on(name: String, callback: js.Function1[/* e */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def remote(command: String): js.Thenable[ShipitLocal] = ^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def remote(
    command: String,
    options: Unit,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def remote(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def remote(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remote")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  
  @scala.inline
  def remoteCopy(src: String, dest: String): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def remoteCopy(
    src: String,
    dest: String,
    options: Unit,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def remoteCopy(src: String, dest: String, options: ExecOptions): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  @scala.inline
  def remoteCopy(
    src: String,
    dest: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteCopy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[ShipitLocal]]
  
  @JSImport("shipit-cli", "seq")
  @js.native
  val seq: js.Array[js.Any] = js.native
  
  @scala.inline
  def start(tasks: String*): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  @scala.inline
  def start(tasks: String): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  @scala.inline
  def start(tasks: js.Array[String]): Typeofshipit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(tasks.asInstanceOf[js.Any]).asInstanceOf[Typeofshipit]
  
  @scala.inline
  def task(name: String, depsOrFn: js.Array[String]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  @scala.inline
  def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  @scala.inline
  def task(name: String, depsOrFn: EmptyCallback): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  @scala.inline
  def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Typeofshipit = (^.asInstanceOf[js.Dynamic].applyDynamic("task")(name.asInstanceOf[js.Any], depsOrFn.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Typeofshipit]
  
  @JSImport("shipit-cli", "tasks")
  @js.native
  val tasks: Tasks_ = js.native
  
  type EmptyCallback = js.Function0[Unit]
  
  type LocalOrRemoteCommand = js.Function3[
    /* command */ String, 
    /* options */ js.UndefOr[ExecOptions], 
    /* callback */ js.UndefOr[js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]], 
    js.Thenable[ShipitLocal]
  ]
  
  trait Options extends StObject {
    
    var environment: String
    
    var stderr: WriteStream
    
    var stdout: WriteStream
  }
  object Options {
    
    @scala.inline
    def apply(environment: String, stderr: WriteStream, stdout: WriteStream): Options = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShipitLocal extends StObject {
    
    var child: ChildProcess
    
    var stderr: WriteStream
    
    var stdout: WriteStream
  }
  object ShipitLocal {
    
    @scala.inline
    def apply(child: ChildProcess, stderr: WriteStream, stdout: WriteStream): ShipitLocal = {
      val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShipitLocal]
    }
    
    @scala.inline
    implicit class ShipitLocalMutableBuilder[Self <: ShipitLocal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: ChildProcess): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskExecution = js.Function3[
    /* name */ String, 
    /* depsOrFn */ js.Array[String] | EmptyCallback, 
    /* fn */ js.Function0[Unit], 
    js.Any
  ]
  
  trait Task_ extends StObject {
    
    var blocking: Boolean
    
    var dep: js.Array[String]
    
    def fn(): Unit
    
    var name: String
  }
  object Task_ {
    
    @scala.inline
    def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task_ = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], dep = dep.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task_]
    }
    
    @scala.inline
    implicit class Task_MutableBuilder[Self <: Task_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDep(value: js.Array[String]): Self = StObject.set(x, "dep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepVarargs(value: String*): Self = StObject.set(x, "dep", js.Array(value :_*))
      
      @scala.inline
      def setFn(value: () => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Tasks_ = StringDictionary[Task_]
}

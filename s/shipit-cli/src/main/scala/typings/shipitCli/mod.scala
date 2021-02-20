package typings.shipitCli

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecOptions
import typings.node.fsMod.WriteStream
import typings.shipitCli.anon.Typeofshipit
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shipit-cli", "blTask")
  @js.native
  def blTask(name: String, depsOrFn: js.Array[String]): js.Any = js.native
  @JSImport("shipit-cli", "blTask")
  @js.native
  def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): js.Any = js.native
  @JSImport("shipit-cli", "blTask")
  @js.native
  def blTask(name: String, depsOrFn: EmptyCallback): js.Any = js.native
  @JSImport("shipit-cli", "blTask")
  @js.native
  def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): js.Any = js.native
  
  @JSImport("shipit-cli", "domain")
  @js.native
  val domain: js.Any = js.native
  
  @JSImport("shipit-cli", "doneCallback")
  @js.native
  val doneCallback: js.Any = js.native
  
  @JSImport("shipit-cli", "emit")
  @js.native
  def emit(name: String): js.Any = js.native
  
  @JSImport("shipit-cli", "environment")
  @js.native
  val environment: String = js.native
  
  @JSImport("shipit-cli", "initConfig")
  @js.native
  def initConfig(config: js.Object): Typeofshipit = js.native
  
  @JSImport("shipit-cli", "isRunning")
  @js.native
  val isRunning: Boolean = js.native
  
  @JSImport("shipit-cli", "local")
  @js.native
  def local(command: String): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "local")
  @js.native
  def local(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "local")
  @js.native
  def local(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "local")
  @js.native
  def local(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  
  @JSImport("shipit-cli", "log")
  @js.native
  def log(log: js.Any*): Unit = js.native
  @JSImport("shipit-cli", "log")
  @js.native
  def log(log: js.Any): Unit = js.native
  
  @JSImport("shipit-cli", "on")
  @js.native
  def on(name: String, callback: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
  
  @JSImport("shipit-cli", "remote")
  @js.native
  def remote(command: String): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "remote")
  @js.native
  def remote(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "remote")
  @js.native
  def remote(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "remote")
  @js.native
  def remote(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  
  @JSImport("shipit-cli", "remoteCopy")
  @js.native
  def remoteCopy(src: String, dest: String): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "remoteCopy")
  @js.native
  def remoteCopy(
    src: String,
    dest: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "remoteCopy")
  @js.native
  def remoteCopy(src: String, dest: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
  @JSImport("shipit-cli", "remoteCopy")
  @js.native
  def remoteCopy(
    src: String,
    dest: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
  ): js.Thenable[ShipitLocal] = js.native
  
  @JSImport("shipit-cli", "seq")
  @js.native
  val seq: js.Array[js.Any] = js.native
  
  @JSImport("shipit-cli", "start")
  @js.native
  def start(tasks: String*): Typeofshipit = js.native
  @JSImport("shipit-cli", "start")
  @js.native
  def start(tasks: String): Typeofshipit = js.native
  @JSImport("shipit-cli", "start")
  @js.native
  def start(tasks: js.Array[String]): Typeofshipit = js.native
  
  @JSImport("shipit-cli", "task")
  @js.native
  def task(name: String, depsOrFn: js.Array[String]): Typeofshipit = js.native
  @JSImport("shipit-cli", "task")
  @js.native
  def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): Typeofshipit = js.native
  @JSImport("shipit-cli", "task")
  @js.native
  def task(name: String, depsOrFn: EmptyCallback): Typeofshipit = js.native
  @JSImport("shipit-cli", "task")
  @js.native
  def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): Typeofshipit = js.native
  
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
  
  @js.native
  trait Options extends StObject {
    
    var environment: String = js.native
    
    var stderr: WriteStream = js.native
    
    var stdout: WriteStream = js.native
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
  
  @js.native
  trait ShipitLocal extends StObject {
    
    var child: ChildProcess = js.native
    
    var stderr: WriteStream = js.native
    
    var stdout: WriteStream = js.native
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
  
  @js.native
  trait Task_ extends StObject {
    
    var blocking: Boolean = js.native
    
    var dep: js.Array[String] = js.native
    
    def fn(): Unit = js.native
    
    var name: String = js.native
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

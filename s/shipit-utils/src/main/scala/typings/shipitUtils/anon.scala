package typings.shipitUtils

import typings.node.childProcessMod.ExecOptions
import typings.shipitCli.mod.EmptyCallback
import typings.shipitCli.mod.ShipitLocal
import typings.shipitCli.mod.Tasks_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Typeofshipit extends js.Object {
    val domain: js.Any = js.native
    val doneCallback: js.Any = js.native
    val environment: String = js.native
    val isRunning: Boolean = js.native
    val seq: js.Array[_] = js.native
    val tasks: Tasks_ = js.native
    def blTask(name: String, depsOrFn: js.Array[String]): js.Any = js.native
    def blTask(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): js.Any = js.native
    def blTask(name: String, depsOrFn: EmptyCallback): js.Any = js.native
    def blTask(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): js.Any = js.native
    def emit(name: String): js.Any = js.native
    def initConfig(config: js.Object): typings.shipitCli.anon.Typeofshipit = js.native
    def local(command: String): js.Thenable[ShipitLocal] = js.native
    def local(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
    def local(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = js.native
    def log(log: js.Any*): Unit = js.native
    def log(log: js.Any): Unit = js.native
    def on(name: String, callback: js.Function1[/* e */ js.Any, Unit]): js.Any = js.native
    def remote(command: String): js.Thenable[ShipitLocal] = js.native
    def remote(command: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
    def remote(
      command: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = js.native
    def remoteCopy(src: String, dest: String): js.Thenable[ShipitLocal] = js.native
    def remoteCopy(src: String, dest: String, options: ExecOptions): js.Thenable[ShipitLocal] = js.native
    def remoteCopy(
      src: String,
      dest: String,
      options: ExecOptions,
      callback: js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
    ): js.Thenable[ShipitLocal] = js.native
    def start(tasks: String*): typings.shipitCli.anon.Typeofshipit = js.native
    def start(tasks: String): typings.shipitCli.anon.Typeofshipit = js.native
    def start(tasks: js.Array[String]): typings.shipitCli.anon.Typeofshipit = js.native
    def task(name: String, depsOrFn: js.Array[String]): typings.shipitCli.anon.Typeofshipit = js.native
    def task(name: String, depsOrFn: js.Array[String], fn: js.Function0[Unit]): typings.shipitCli.anon.Typeofshipit = js.native
    def task(name: String, depsOrFn: EmptyCallback): typings.shipitCli.anon.Typeofshipit = js.native
    def task(name: String, depsOrFn: EmptyCallback, fn: js.Function0[Unit]): typings.shipitCli.anon.Typeofshipit = js.native
  }
  
}


package typings
package shipitDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofshipit extends js.Object {
  val domain: js.Any = js.native
  val doneCallback: js.Any = js.native
  val environment: java.lang.String = js.native
  val isRunning: scala.Boolean = js.native
  val seq: js.Array[_] = js.native
  val tasks: shipitDashCliLib.shipitDashCliMod.Tasks = js.native
  def blTask(name: java.lang.String, depsOrFn: js.Array[java.lang.String]): js.Any = js.native
  def blTask(name: java.lang.String, depsOrFn: js.Array[java.lang.String], fn: js.Function0[scala.Unit]): js.Any = js.native
  def blTask(name: java.lang.String, depsOrFn: shipitDashCliLib.shipitDashCliMod.EmptyCallback): js.Any = js.native
  def blTask(
    name: java.lang.String,
    depsOrFn: shipitDashCliLib.shipitDashCliMod.EmptyCallback,
    fn: js.Function0[scala.Unit]
  ): js.Any = js.native
  def emit(name: java.lang.String): js.Any = js.native
  def initConfig(config: js.Object): shipitDashCliLib.Typeofshipit = js.native
  def local(command: java.lang.String): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def local(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def local(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def log(log: js.Any*): scala.Unit = js.native
  def log(log: js.Any): scala.Unit = js.native
  def on(name: java.lang.String, callback: js.Function1[/* e */ js.Any, scala.Unit]): js.Any = js.native
  def remote(command: java.lang.String): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def remote(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def remote(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def remoteCopy(src: java.lang.String, dest: java.lang.String): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def remoteCopy(
    src: java.lang.String,
    dest: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions
  ): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def remoteCopy(
    src: java.lang.String,
    dest: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ stdLib.Error, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): js.Thenable[shipitDashCliLib.shipitDashCliMod.ShipitLocal] = js.native
  def start(tasks: java.lang.String*): shipitDashCliLib.Typeofshipit = js.native
  def start(tasks: java.lang.String): shipitDashCliLib.Typeofshipit = js.native
  def start(tasks: js.Array[java.lang.String]): shipitDashCliLib.Typeofshipit = js.native
  def task(name: java.lang.String, depsOrFn: js.Array[java.lang.String]): shipitDashCliLib.Typeofshipit = js.native
  def task(name: java.lang.String, depsOrFn: js.Array[java.lang.String], fn: js.Function0[scala.Unit]): shipitDashCliLib.Typeofshipit = js.native
  def task(name: java.lang.String, depsOrFn: shipitDashCliLib.shipitDashCliMod.EmptyCallback): shipitDashCliLib.Typeofshipit = js.native
  def task(
    name: java.lang.String,
    depsOrFn: shipitDashCliLib.shipitDashCliMod.EmptyCallback,
    fn: js.Function0[scala.Unit]
  ): shipitDashCliLib.Typeofshipit = js.native
}

